package DAO;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DTO.Phong.PhongDTO;
import java.util.ArrayList;
import DTO.Phong.PhongVipDTO;
import DTO.Phong.PhongThuongDTO;
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
            qry=qry+"'"+p.getLoaiPhong()+"',";
            qry=qry+"'"+p.getTinhTrang()+"',";
            qry=qry+"'"+p.getGhiChu()+"',";
            qry=qry+p.getDonGia()+",";
            if(p.getLoaiPhong().equals("VIP")||p.getLoaiPhong().equals("PSD")){
                PhongVipDTO pv= (PhongVipDTO) p;
                qry=qry+"'"+pv.getMaPhongAn()+"')";
            } else {
                qry=qry+"NULL)";
            }
            st.executeUpdate(qry);
            st.executeUpdate("Set Foreign_key_checks = 1");
        }
        catch(SQLException ex){
            //JOPtionPane.ShowMessageDialog(null,"Lỗi ghi thông tin người dùng!");
            System.out.println("Lỗi ghi thông tin người dùng");
        }
    }
    public ArrayList<PhongDTO> docDSP(){
        ArrayList<PhongDTO> dsp=new ArrayList<PhongDTO>();
        try{
            String qry="select * from Phong";
            st=con.createStatement();
            rs=st.executeQuery(qry);
            while(rs.next()){
                PhongDTO p = new PhongDTO();
                p.setMaPhong(rs.getString(1));
                p.setSoPhong(rs.getString(2));
                p.setLoaiPhong(rs.getString(3));
                p.setTinhTrang(rs.getString(4));
                p.setGhiChu(rs.getString(5));
                p.setDonGia(rs.getInt(6));
                dsp.add(p);
            }
        }
        catch(SQLException ex){
            //JOptionPane.ShowMessageDialog(null,"Lỗi đọc thông tin Sinh Viên!");
        }
        return dsp;
    }
}
