package DAO;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DTO.KhachHangDTO;
import java.util.ArrayList;
public class KhachHangDAO {
    Connection con = ConnectionProvider.getCon();
    Statement st = null;
    ResultSet rs=null;
    public void them(KhachHangDTO kh)
    {
        try {
            st=con.createStatement();
            st.executeUpdate("Set Foreign_key_checks = 0");
            String qry="Insert into KhachHang Values(";
            qry = qry +"'"+kh.getMaKhachHang()+"',";
            qry = qry + "'" + kh.getTen() + "',";
            qry = qry + "'" + kh.getSoDienThoai() +"',";
            qry = qry + "'" + kh.getCCCD() + "')";
            st.executeUpdate(qry);
            st.executeUpdate("Set Foreign_key_checks = 1");
        }
        catch(SQLException ex){
            //JOPtionPane.ShowMessageDialog(null,"Lỗi ghi thông tin người dùng!");
            System.out.println("Lỗi ghi thông tin người dùng");
        }
    }
    public ArrayList docDSKH(){
        ArrayList dsnd=new ArrayList<KhachHangDTO>();
        try{
            String qry="select * from khachhang";
            st=con.createStatement();
            rs=st.executeQuery(qry);
            KhachHangDTO kh = new KhachHangDTO();
            kh.setMaKhachHang(rs.getString(1));
            kh.setTen(rs.getString(2));
            kh.setSoDienThoai(rs.getString(3));
            kh.setCCCD(rs.getString(4));
        }
        catch(SQLException ex){
            //JOptionPane.ShowMessageDialog(null,"Lỗi đọc thông tin Sinh Viên!");
        }
        return dsnd;
    }
}
