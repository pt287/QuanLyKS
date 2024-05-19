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
    public ArrayList<KhachHangDTO> docDSKH(){
        ArrayList<KhachHangDTO> dskh=new ArrayList<KhachHangDTO>();
        try{
            String qry="select * from KhachHang";
            st=con.createStatement();
            rs=st.executeQuery(qry);
            while (rs.next()) {
                KhachHangDTO kh = new KhachHangDTO();
                kh.setMaKhachHang(rs.getString(1));
                kh.setTen(rs.getString(2));
                kh.setSoDienThoai(rs.getString(3));
                kh.setCCCD(rs.getString(4));
                dskh.add(kh);               
            }
        }
        catch(SQLException ex){
            System.out.println("fuck");
        }
        return dskh;
    }
    public void Sua(KhachHangDTO a){
        try {
            st = con.createStatement();
            st.executeUpdate("SET FOREIGN_KEY_CHECKS = 0");
    
            String qry = "UPDATE KhachHang SET " +
                "ClientName = '" + a.getTen() + "', " +
                "ClientPhoneNum = '" + a.getSoDienThoai() + "', " +
                "ClientCID = '" + a.getCCCD() + "' " +
                "WHERE ClientID = '" + a.getMaKhachHang() + "';";
            st.executeUpdate(qry);
            st.executeUpdate("SET FOREIGN_KEY_CHECKS = 1");
        } catch (SQLException ex) {
            // Xử lý ngoại lệ
            ex.printStackTrace(); // In lỗi ra console hoặc ghi log
        }
    }
}
