package DAO;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import DTO.HoaDonDTO;
import java.time.LocalDate;
public class HoaDonDAO {
    Connection con = ConnectionProvider.getCon();
    Statement st = null;
    ResultSet rs=null;
    public void them(HoaDonDTO hd)
    {
        try {
            st=con.createStatement();
            st.executeUpdate("Set Foreign_key_checks = 0");
            String qry="Insert into HoaDon (WkID,ClientID,DateIn,DateOut,BillTotal) Values(";
            qry = qry +"'" + hd.getMaNhanVien()+"',";
            qry = qry +"'" + hd.getMaKhachHang()+"',";
            qry = qry +"'" + hd.getNgayNhan() + "',";
            qry = qry +"'" + hd.getNgayTra() +"',";
            qry = qry + "null)";
            st.executeUpdate(qry);
            st.executeUpdate("Set Foreign_key_checks = 1");
        }
        catch(SQLException ex){
            //JOPtionPane.ShowMessageDialog(null,"Lỗi ghi thông tin người dùng!");
            System.out.println("Lỗi ghi thông tin người dùng");
        }
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
        }
        catch(SQLException ex){
            //JOptionPane.ShowMessageDialog(null,"Lỗi đọc thông tin Sinh Viên!");
        }
        return dshd;
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
