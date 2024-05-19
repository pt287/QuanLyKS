
package DAO;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import DTO.ChiTietHoaDonDTO;
import DTO.ChiTietHoaDonInDTO;
import GUICHART.RoomRatio.RoomRatioModel;
import GUICHART.ServiceRatio.SvcRatioModel;
public class ChiTietHoaDonDAO {
    Connection con = ConnectionProvider.getCon();
    Statement st = null;
    ResultSet rs=null;
    public void UpdateMoney(int mhd){
        try{
            st=con.createStatement();
            rs=st.executeQuery("select SUM(BDPrice) from chitiethoadon Where BillID = " + mhd);
            st.executeUpdate("update hoadon set BillTotal = " + rs.getInt(1)+ " where BillID = " + mhd);
            rs.close();
            st.close();
        } catch(SQLException ex){
            //báo lỗi
        }
    }
    public ChiTietHoaDonDTO them(ChiTietHoaDonInDTO cthdin)
    {
        ChiTietHoaDonDTO cthdout = new ChiTietHoaDonDTO();
        try {
            st=con.createStatement();
            st.executeUpdate("Set Foreign_key_checks = 0");
            int giatien = 0;
            String qry="Insert into ChiTietHoaDon(BillID, SvcID, RoomID, BDPRICE) Values(";
            qry = qry + "'" + cthdin.getMaHoaDon() + "',";
            if(cthdin.getMaDichVu().equals("")){
                qry = qry + "null,";
            } else {
                qry = qry + "'" + cthdin.getMaDichVu() + "',";
                rs=st.executeQuery("Select SvcPrice From Dichvu Where SvcID = '" + cthdin.getMaDichVu() + "';");
                while(rs.next())
                    giatien = giatien + rs.getInt(1);
                rs.close();
            }
            if(cthdin.getMaPhong().equals("")){
                qry = qry + "null,";
            } else {
                qry = qry + "'" + cthdin.getMaPhong() + "',";
                rs=st.executeQuery("Select RoomPrice From Phong Where RoomID = '" + cthdin.getMaPhong() + "';");
                while(rs.next())
                    giatien = giatien + rs.getInt(1);
                rs.close();
            }
            qry= qry + giatien +")";
            st.executeUpdate(qry);
            st.executeUpdate("Set Foreign_key_checks = 1");
            rs = st.executeQuery("Select MAX(BILLID) FROM CHITIETHOADON");
            while(rs.next())
                cthdout.setMaHoaDon(rs.getInt(1));
            cthdout.setMaHoaDon(cthdin.getMaHoaDon());
            cthdout.setMaDichVu(cthdin.getMaDichVu());
            cthdout.setMaPhong(cthdin.getMaPhong());
            cthdout.setTien(giatien);
            UpdateMoney(cthdout.getMaHoaDon());
        }
        catch(SQLException ex){
            //JOPtionPane.ShowMessageDialog(null,"Lỗi ghi thông tin người dùng!");
            System.out.println("Lỗi ghi thông tin người dùng");
        }
        return cthdout;
    }
    public ArrayList docDSCTHD(String str){
        ArrayList dscthd=new ArrayList<ChiTietHoaDonDTO>();
        try{
            String qry="select * from ChiTietHoaDon WHERE BillID = '" + str + "'";
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
    public ArrayList RoomRatio(){
        ArrayList RRlist = new ArrayList<RoomRatioModel>();
        try{
            st=con.createStatement();
            rs=st.executeQuery("Select R.RoomType as RType ,Count(BD.RoomID) as Count From Phong as R, chitiethoadon as BD where BD.RoomID=R.RoomID GROUP by R.RoomType; ");
            while(rs.next()){
                RoomRatioModel model = new RoomRatioModel();
                model.setRType(rs.getString(1));
                model.setRCount(rs.getInt(2));
                RRlist.add(model);
            }
        }
        catch(SQLException ex){
            //báo lỗi
        }
        return RRlist;
    }
    public ArrayList SvcRatio(){
        ArrayList SRlist = new ArrayList<SvcRatioModel>();
        try{
            st=con.createStatement();
            rs=st.executeQuery("Select Svc.SvcName as SName ,Count(BD.SvcID) as Count From DichVu as Svc, chitiethoadon as BD where BD.SvcID=Svc.SvcID GROUP by Svc.SvcName; ");
            while(rs.next()){
                SvcRatioModel model = new SvcRatioModel();
                model.setName(rs.getString(1));
                model.setScount(rs.getInt(2));
                SRlist.add(model);
            }
        }
        catch(SQLException ex){
            //báo lỗi
        }
        return SRlist;
    }
    public void Xoa(String mhd){
        try{
            st=con.createStatement();
            st.executeUpdate("Set Foreign_key_checks = 0");
            String qry="Delete from ChiTietHoaDon where BillID = ";
            qry = qry + "'"+mhd +"'";
            st.executeUpdate(qry);
            st.executeUpdate("Set Foreign_key_checks = 1");
        }
        catch(SQLException ex){
            //báo lỗi
        }
    }
}
