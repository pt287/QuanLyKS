package DAO.NguoiDung;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import DTO.NguoiDung.NguoiDungDTO;
import DTO.NguoiDung.QuanLyDTO;
import java.util.ArrayList;
public class NguoiDungDAO {
    private static String user="root";
    private static String password="Bin020304";
    private static String url="jdbc:mysql://localhost:3306/qlks";
    Connection conn = null;
    Statement st = null;
    ResultSet rs=null;
    public NguoiDungDAO() throws SQLException
    {
        if(conn==null)
        {
            try
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn= DriverManager.getConnection(url,user,password);
            }
            catch(Exception e)
            {
                System.out.println("Lỗi kết nối: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
    public void them(NguoiDungDTO nd)
    {
        try {
            String qry="Insert into NguoiDung Values(";
            qry=qry+"'"+nd.getMaNguoiDung()+"',";
            qry=qry+"'"+nd.getTaiKhoan()+"',";
            qry=qry+"'"+nd.getMatKhau()+"',";
            qry=qry+nd.getSDT()+",1)";
            st=conn.createStatement();
            st.executeUpdate(qry);
        }
        catch(SQLException ex){
            //JOPtionPane.ShowMessageDialog(null,"Lỗi ghi thông tin người dùng!");
            System.out.println("Lỗi ghi thông tin người dùng");
        }
    }
    public ArrayList docDSND(){
        ArrayList dsnd=new ArrayList<NguoiDungDTO>();
        try{
            String qry="select * from nguoidung";
            st=conn.createStatement();
            rs=st.executeQuery(qry);
            while(rs.next()){
                NguoiDungDTO nd=new QuanLyDTO();
                nd.setMaNguoiDung(rs.getString(1));
                nd.setTaiKhoan(rs.getString(2));
                nd.setMatKhau(rs.getString(3));
                nd.setSDT(rs.getString(4));
                nd.setTrangThai(rs.getInt(5));
            }
        }
        catch(SQLException ex){
            //JOptionPane.ShowMessageDialog(null,"Lỗi đọc thông tin Sinh Viên!");
        }
        return dsnd;
    }
}
