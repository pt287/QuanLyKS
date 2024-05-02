package DAO;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import DTO.ChiTietHoaDonDTO;
public class ChiTietHoaDonDAO {
    Connection con = ConnectionProvider.getCon();
    Statement st = null;
    ResultSet rs=null;
    public void UpdateMoney(int mhd){
        try{
            st=con.createStatement();
            rs=st.executeQuery("select SUM(BDPrice) from chitiethoadon Where BillID = " + mhd);
            st.executeUpdate("update hoadon set BillTotal = " + rs.getInt(1)+ " where BillID = " + mhd);
        } catch(SQLException ex){
            //báo lỗi
        }
    }
    public void them(ChiTietHoaDonDTO cthd)
    {
        try {
            st=con.createStatement();
            st.executeUpdate("Set Foreign_key_checks = 0");
            int giatien = 0;
            String qry="Insert into ChiTietHoaDon Values(";
            qry= qry + "'"+cthd.getMaChiTietHoaDon()+"',";
            qry = qry + "'" + cthd.getMaHoaDon() + "',";
            if(cthd.getMaDichVu()==null){
                qry = qry + "null,";
            } else {
                qry = qry + "'" + cthd.getMaDichVu() + "',";
                rs=st.executeQuery("Select SvcPrice From Dichvu Where SvcID = '" + cthd.getMaDichVu() + "';");
                giatien = giatien + rs.getInt(1);
            }
            if(cthd.getMaPhong()==null){
                qry = qry + "null,";
            } else {
                qry = qry + "'" + cthd.getMaPhong() + "',";
                rs=st.executeQuery("Select RoomPrice From Phong Where RoomID = '" + cthd.getMaPhong() + "';");
                giatien = giatien + rs.getInt(1);
            }
            qry= qry + giatien +")";
            st.executeUpdate(qry);
            st.executeUpdate("Set Foreign_key_checks = 1");
            UpdateMoney(cthd.getMaHoaDon());
        }
        catch(SQLException ex){
            //JOPtionPane.ShowMessageDialog(null,"Lỗi ghi thông tin người dùng!");
            System.out.println("Lỗi ghi thông tin người dùng");
        }
    }
    public ArrayList docDSHD(){
        ArrayList dscthd=new ArrayList<ChiTietHoaDonDTO>();
        try{
            String qry="select * from ChiTietHoaDon";
            st=con.createStatement();
            rs=st.executeQuery(qry);
            while(rs.next()){
                ChiTietHoaDonDTO cthd = new ChiTietHoaDonDTO();
                cthd.setMaChiTietHoaDon(rs.getInt(1));
                cthd.setMaHoaDon(rs.getInt(2));
                cthd.setMaDichVu(rs.getString(3));
                cthd.setMaPhong(rs.getString(4));
                cthd.setTien(rs.getInt(5));
                dscthd.add(cthd);
            }
        }
        catch(SQLException ex){
            //JOptionPane.ShowMessageDialog(null,"Lỗi đọc thông tin Sinh Viên!");
        }
        return dscthd;
    }
}
