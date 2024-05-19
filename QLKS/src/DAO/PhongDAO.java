package DAO;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DTO.Phong.PhongDTO;
import java.util.ArrayList;
import DTO.Phong.PhongVipDTO;
import DTO.Phong.PhongThuongDTO;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
public class PhongDAO {
    Connection con = ConnectionProvider.getCon();
    Statement st = null;
    ResultSet rs=null;
    public void them(PhongDTO p)
    {
        try {
            st=con.createStatement();
            st.executeUpdate("Set Foreign_key_checks = 0");
            String qry="Insert into Phong Values(";
            qry=qry+"'"+p.getMaPhong()+"',";
            qry=qry+"'"+p.getSoPhong()+"',";
            if (!p.getMaPhong().equals("VIP")) {
                PhongThuongDTO pt=(PhongThuongDTO)p;
                qry=qry+"'"+pt.getKieuPhong()+"',";
            }else{
                qry=qry+"'VIP',";
            }
            qry=qry+"'"+p.getTinhTrang()+"',";
            qry=qry+"'"+p.getGhiChu()+"',";
            qry=qry+p.getDonGia()+",";
            if(p.getMaPhong().equals("VIP")){
                PhongVipDTO pv= (PhongVipDTO) p;
                qry=qry+"'"+pv.getMaPhongAn()+"')";
            } else {
                qry=qry+"NULL)";
            }
            st.executeUpdate(qry);
            st.executeUpdate("Set Foreign_key_checks = 1");
            rs.close();
            st.close();
        }
        catch(SQLException ex){
        }
    }
    public ArrayList<PhongDTO> docDSP(){
        ArrayList<PhongDTO> dsp=new ArrayList<PhongDTO>();
        try{
            String qry="select * from Phong";
            st=con.createStatement();
            rs=st.executeQuery(qry);
            while(rs.next()){
                String RoomID = rs.getString(1);
                String RoomNum = rs.getString(2);
                String RoomType =rs.getString(3);
	            String RoomSTT =rs.getString(4);
                String RoomNote =rs.getString(5);
                int RoomPrice =rs.getInt(6);
                String RoomDRID =rs.getString(7);
                if (RoomID.substring(0,3).equals("VIP")) {
                    PhongVipDTO pv=new PhongVipDTO(RoomID,RoomNum,RoomSTT,RoomNote,RoomPrice,RoomDRID);
                    dsp.add(pv);
                }else{
                    PhongThuongDTO pt=new PhongThuongDTO(RoomID, RoomNum, RoomSTT, RoomNote, RoomPrice,RoomType);
                    dsp.add(pt);
                }
            }
            rs.close();
            st.close();
        }
        catch(SQLException ex){
            //JOptionPane.ShowMessageDialog(null,"Lỗi đọc thông tin Sinh Viên!");
        }
        return dsp;
    }
    public void Sua(String mp,PhongDTO p){
        try {
            st = con.createStatement();
            st.executeUpdate("SET FOREIGN_KEY_CHECKS = 0");
            String qry = "UPDATE Phong SET " +
                "RoomPrice = " + p.getDonGia() + ", " +
                "RoomNum = '" + p.getSoPhong() + "', " +
                "RoomSTT = '" + p.getTinhTrang() + "', " +
                "RoomNote = '" + p.getGhiChu() + "', ";
            if (p instanceof PhongVipDTO a) {
                qry = qry + "RoomDRID = '" + a.getMaPhongAn() + "' ";
            }else{
                qry = qry + "RoomDRID = NULL ";
            }    
            qry = qry + "WHERE RoomID = '" + p.getMaPhong() + "'";
            st.executeUpdate(qry);
            st.executeUpdate("SET FOREIGN_KEY_CHECKS = 1");
            st.close();
        } catch (SQLException ex) {
            // Xử lý ngoại lệ
            ex.printStackTrace(); // In lỗi ra console hoặc ghi log
        }
    }
    public ArrayList DatPhong(LocalDate in, LocalDate out){
        ArrayList<PhongDTO> list = new ArrayList<>();
        String DateIn = in.toString();
        String DateOut = out.toString();
        try{
            String qry = "SELECT R.RoomID, R.RoomPrice, R.RoomType, R.RoomNum,R.RoomSTT FROM Phong AS R WHERE R.RoomID NOT IN (SELECT BD.RoomID FROM ChiTietHoaDon AS BD INNER JOIN HoaDon AS B ON BD.BillID = B.BillID WHERE (B.DateIn BETWEEN '"+DateIn+"' AND '"+DateOut+"') OR (B.DateOUT BETWEEN '"+DateIn+"' AND '"+DateOut+"') OR (B.DateIN < '"+DateIn+"' AND B.DateOUT > '"+DateOut+"'))";
            st = con.createStatement();
            rs= st.executeQuery(qry);
            while (rs.next()){
                PhongDTO d = new PhongDTO();
                d.setMaPhong(rs.getString(1));
                d.setDonGia(rs.getInt(2));
                d.setSoPhong(rs.getString(4));
                d.setTinhTrang(rs.getString(5));
                list.add(d);
                rs.close();
                st.close();
            }
        }
        catch(SQLException ex){
            //báo lỗi
        }
        
        return list;
    }
    
    public PhongDTO docphong(String MaPhong){
        PhongDTO phong = new PhongDTO();
        String qry = "SELECT * FROM Phong WHERE RoomID = '" + MaPhong + "'";
        try {
            st = con.createStatement();
            rs = st.executeQuery(qry);
        
            if (rs.next()) {
                phong.setMaPhong(rs.getString("RoomID"));
                phong.setSoPhong(rs.getString("RoomNum"));
                phong.setDonGia(rs.getInt("RoomPrice"));
        }
        rs.close();
        st.close();
    }
        catch(SQLException ex){
            //báo lỗi
            System.out.println("loi");
        }
        return phong;
    }
}
