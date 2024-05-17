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
                    "RoomSTT = '" + p.getTinhTrang() + "' " +
                    "RoomNote = '" + p.getGhiChu() + "', " +
                    "WHERE RoomID = '" + p.getMaPhong() + "'";
            st.executeUpdate(qry);
            st.executeUpdate("SET FOREIGN_KEY_CHECKS = 1");
        } catch (SQLException ex) {
            // Xử lý ngoại lệ
            ex.printStackTrace(); // In lỗi ra console hoặc ghi log
        }
    }
    public ArrayList DatPhong(Date in, Date out){
        ArrayList<PhongDTO> list = new ArrayList<>();
        SimpleDateFormat sqlfm = new SimpleDateFormat("yyyy-MM-dd");
        String DateIn = sqlfm.format(in);
        String DateOut = sqlfm.format(out);
        String qry = "Select R.RoomID, R.RoomPrice , R.RoomType, R.RoomNum From Phong as R, ChiTietHoaDon as BD, HoaDon as B Where (B.BillID = BD.BillID AND BD.RoomID = R.RoomID) AND (B.DateIn NOT BETWEEN '";
        qry = qry + DateIn +"'AND'";
        qry = qry + DateOut +"') AND (B.DateOUT NOT BETWEEN '";
        qry = qry + DateIn +"' AND '";
        qry = qry + DateOut + "') AND NOT(DateDIFF(B.DateIN,'";
        qry = qry + DateIn + "')<0 AND DateDIFF(B.DateOUT,'";
        qry = qry + DateOut + "'));";
        return list;
    }
    
    public PhongDTO docphong(String MaPhong){
        PhongDTO phong = new PhongDTO();
        try{
            String qry = "Select * from Phong Where RoomID ='";
            qry = qry + MaPhong +"'";
            st = con.createStatement();
            rs = st.executeQuery(qry);
            phong.setMaPhong(MaPhong);
            phong.setSoPhong(rs.getString(1));
            phong.setGhiChu(null);
            phong.setDonGia(rs.getInt(5));
            phong.setTinhTrang(rs.getString(3));
        }
        catch(SQLException ex){
            //báo lỗi
        }
        return phong;
    }
}
