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
            String qry="Insert into HoaDon Values(";
            qry = qry + hd.getMaHoaDon() +",";
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
    public ArrayList<HoaDonDTO> docDSHD(){
        ArrayList<HoaDonDTO> dsp=new ArrayList<HoaDonDTO>();
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
            }
        }
        catch(SQLException ex){
            //JOptionPane.ShowMessageDialog(null,"Lỗi đọc thông tin Sinh Viên!");
        }
        return dsp;
    }
}
