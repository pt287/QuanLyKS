/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import DTO.DichVuDTO;

/**
 *
 * @author TuiLaZit
 */
public class DichVuDAO {
    Connection con = ConnectionProvider.getCon();
    Statement st = null;
    ResultSet rs = null;
    public void them(DichVuDTO dv){
        try{
            st=con.createStatement();
            st.executeUpdate("Set Foreign_key_checks = 0");
            String qry = "Insert into DichVu Values(";
            qry = qry + "'" + dv.getMaDichVu()+"',";
            qry= qry + "'" + dv.getTen() + "',";
            qry = qry + dv.getGia() +")";
            st.executeUpdate(qry);
            st.executeUpdate("Set Foreign_key_checks = 1");
        }
        catch (SQLException ex){
            //báo lỗi
        }
    }
    
    public ArrayList docDV(){
        ArrayList dsdv = new ArrayList<DichVuDTO>();
        try{
            st= con.createStatement();
            rs= st.executeQuery("Select * from DichVu");
            while(rs.next()){
                DichVuDTO dv = new DichVuDTO();
                dv.setMaDichVu(rs.getString(1));
                dv.setTen(rs.getString(2));
                dv.setGia(rs.getInt(3));
                dsdv.add(dv);
            }
        }
        catch(SQLException ex){
            //báo lỗi
        }
        return dsdv;
    }
    
    public void xoa(String MaDV){
        try{
            st=con.createStatement();
            st.executeUpdate("Set Foreign_key_checks = 0");
            String qry="Delete from dichvu where SvcID = ";
            qry = qry + "'"+MaDV +"'";
            st.executeUpdate(qry);
            st.executeUpdate("Set Foreign_key_checks = 1");
        }
        catch(SQLException ex){
            //báo lỗi
        }
    }
    
    public void sua(String MaDV, int GiaTien){
        try{
            st=con.createStatement();
            String qry="Update dichvu set SvcPrice = " + GiaTien +" Where SvcID = '" + MaDV + "'";
            st.executeUpdate(qry);
        }
        catch(SQLException ex){
            //báo lỗi
        }
    }
}
