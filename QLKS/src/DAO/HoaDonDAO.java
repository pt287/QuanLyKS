
package DAO;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.time.LocalDate;
import DTO.HoaDonDTO;
import DTO.HoaDonInDTO;
import java.util.logging.Level;
import java.util.logging.Logger;
public class HoaDonDAO {
    Connection con = ConnectionProvider.getCon();
    Statement st = null;
    ResultSet rs=null;
    public HoaDonDTO them(HoaDonInDTO hdi)
    {
        HoaDonDTO hdo = new HoaDonDTO();
        try {
            st=con.createStatement();
            st.executeUpdate("Set Foreign_key_checks = 0");
            String qry="Insert into HoaDon (WkID,ClientID,DateIn,DateOut,BillTotal) Values(";
            qry = qry +"'" + hdi.getMaNhanVien()+"',";
            qry = qry +"'" + hdi.getMaKhachHang()+"',";
            qry = qry +"'" + hdi.getNgayNhan() + "',";
            qry = qry +"'" + hdi.getNgayTra() +"',";
            qry = qry + "null)";
            st.executeUpdate(qry);
            st.executeUpdate("Set Foreign_key_checks = 1");
            rs = st.executeQuery("Count(*) from Hoadon");
            hdo.setMaHoaDon(rs.getInt(1));
            hdo.setMaKhachHang(hdi.getMaKhachHang());
            hdo.setMaNhanVien(hdi.getMaNhanVien());
            hdo.setNgayNhan(hdi.getNgayNhan());
            hdo.setNgayTra(hdi.getNgayTra());
        }
        catch(SQLException ex){
            //JOPtionPane.ShowMessageDialog(null,"Lỗi ghi thông tin người dùng!");
            System.out.println("Lỗi ghi thông tin người dùng");
        }
        return hdo;
    }
    public ArrayList docDSHD(){
        ArrayList dshd=new ArrayList<HoaDonDTO>();
        try{
            String qry="select * from HoaDon";
            st=con.createStatement();
            rs=st.executeQuery(qry);
            while(rs.next()){
                HoaDonDTO hd = new HoaDonDTO();
                hd.setMaHoaDon(rs.getInt(1));
                hd.setMaNhanVien(rs.getString(2));
                hd.setMaKhachHang(rs.getString(3));
                hd.setNgayNhan(LocalDate.parse(rs.getString(4)));
                hd.setNgayTra(LocalDate.parse(rs.getString(5)));
                hd.setTongTien(rs.getInt(6));
                dshd.add(hd);
            }
        }catch(SQLException ex){
            //JOptionPane.ShowMessageDialog(null,"Lỗi đọc thông tin Sinh Viên!");
        }
        //báo lỗi
        return dshd;
    }
    
    public void sua(String MaHD,HoaDonDTO hd){
        try {
            st=con.createStatement();
            String qry = "Update HoaDon set ClientID = '";
            qry = qry + hd.getMaKhachHang() + "', WkID='";
            qry = qry + hd.getMaNhanVien() + "' where BillID =";
            qry = qry + MaHD;
        } catch (SQLException ex) {
            //báo lỗi
        }
    }
    
    public int[] ClientPerMonth(){
        int [] arr = new int[12];
        try{
            st=con.createStatement();
            rs=st.executeQuery("select month(DateIn)as month ,count(month(DateIn)) as SoBill from hoadon group by month(DateIn)");
            while(rs.next()){
                arr[rs.getInt(1)-1] = rs.getInt(2);
            }
        }
        catch(SQLException ex){
            //báo lỗi
        }
        return arr;
    }
    
    public int[] MoneyPerMonth(){
        int [] arr = new int [12];
        try{
            st= con.createStatement();
            rs=st.executeQuery("select month(DateIN) as month, sum(BillTotal) as TongTien from hoadon group by month(DateIn)");
            while(rs.next()){
                arr[rs.getInt(1)-1] = rs.getInt(2);
            }
        }
        catch(SQLException ex){
            //báo lỗi
        }
        return arr;
    }
    public int[][] CPSAR(){
        int[][] arr = new int [12][2];
        try{
            st = con.createStatement();
            rs = st.executeQuery("select month(DateIn) as month, count(SVCID) as SV, count(RoomID) as Room from ChiTietHoaDon, HoaDon Where HoaDon.BillID=chitiethoadon.BillID Group by month(DateIn);");
            while(rs.next()){
                arr[rs.getInt(1)-1][0]=rs.getInt(2);
                arr[rs.getInt(1)-1][1]=rs.getInt(3);
            }
        }
        catch(SQLException ex){
            
        }
        return arr;
    }
}