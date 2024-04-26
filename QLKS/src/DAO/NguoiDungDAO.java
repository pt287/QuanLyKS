package DAO;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DTO.NguoiDung.NguoiDungDTO;
import DTO.NguoiDung.QuanLyDTO;
import DTO.NguoiDung.NhanVienDTO;
import java.util.ArrayList;
public class NguoiDungDAO {
    Connection con = ConnectionProvider.getCon();
    Statement st = null;
    ResultSet rs=null;
    public void them(NguoiDungDTO nd)
    {
        try {
            st=con.createStatement();
            st.executeUpdate("Set Foreign_key_checks = 0");
            String qry="Insert into NguoiDung Values(";
            qry=qry+"'"+nd.getMaNguoiDung()+"',";
            qry=qry+"'"+nd.getTaiKhoan()+"',";
            qry=qry+"'"+nd.getMatKhau()+"',";
            qry=qry+nd.getSDT()+",1)";
            st.executeUpdate(qry);
            st.executeUpdate("Set Foreign_key_checks = 1");
        }
        catch(SQLException ex){
            //JOPtionPane.ShowMessageDialog(null,"Lỗi ghi thông tin người dùng!");
            System.out.println("Lỗi ghi thông tin người dùng");
        }
    }
    public ArrayList<NguoiDungDTO> docDSND(){
        ArrayList<NguoiDungDTO> dsnd=new ArrayList<NguoiDungDTO>();
        try{
            String qry="select * from nguoidung";
            st=con.createStatement();
            rs=st.executeQuery(qry);
            while(rs.next()){
                if(rs.getString(1).substring(0,2).equals("QL")){
                    NguoiDungDTO ql=new QuanLyDTO();
                    ql.setMaNguoiDung(rs.getString(1));
                    ql.setTaiKhoan(rs.getString(2));
                    ql.setMatKhau(rs.getString(3));
                    ql.setSDT(rs.getString(4));
                    ql.setTrangThai(rs.getInt(5));
                } else {
                    NguoiDungDTO nv=new NhanVienDTO();
                    nv.setMaNguoiDung(rs.getString(1));
                    nv.setTaiKhoan(rs.getString(2));
                    nv.setMatKhau(rs.getString(3));
                    nv.setSDT(rs.getString(4));
                    nv.setTrangThai(rs.getInt(5));
                }
                
            }
        }
        catch(SQLException ex){
            //JOptionPane.ShowMessageDialog(null,"Lỗi đọc thông tin Sinh Viên!");
        }
        return dsnd;
    }
    public String dangnhap(String tk, String mk){
        try{
            st=con.createStatement();
            rs=st.executeQuery("SELECT UserID,UserName,UserPass FROM NguoiDung");
            while(rs.next()){
                if(tk.equals(rs.getString(2))&&mk.equals(rs.getString(3))){
                    return rs.getString(1);
                }
            }
        }  
        catch(SQLException ex){
        //báo lỗi
        }
        return null;
    }
}
