package DAO;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DTO.NguoiDung.NguoiDungDTO;
import DTO.NguoiDung.QuanLyDTO;
import DTO.NguoiDung.NhanVienDTO;
import java.util.ArrayList;
public class NguoiDungDAO {
    Connection con = ConnectionProvider.getCon();
    Statement st = null;
    ResultSet rs=null;
    public void updateCountManager(String mql){
        try{
            st=con.createStatement();
            ResultSet rsc = st.executeQuery("select Count(*) from nhanvien where MngID = '" + mql+"'");
            String upql = "update quanly set MngCount = " + rsc.getInt(1) + " Where MngID = '" + mql +"';";
            st.executeUpdate(upql);
        }catch(SQLException ex){
            //báo lỗi
        }
    }
    public void them(NguoiDungDTO nd)
    {
        try {
            st=con.createStatement();
            st.executeUpdate("Set Foreign_key_checks = 0");
            String qry="Insert into NguoiDung Values(";
            qry=qry+"'"+nd.getMaNguoiDung()+"',";
            qry=qry+"'"+nd.getTaiKhoan()+"',";
            qry=qry+"'"+nd.getMatKhau()+"',";
            qry=qry+"'"+nd.getTen()+"',";
            qry=qry+"'"+nd.getCCCD()+"',";
            qry=qry+nd.getSDT()+",1)";
            st.executeUpdate(qry);
            if(nd.getMaNguoiDung().substring(0, 2).equals("QL")){
                QuanLyDTO ql = (QuanLyDTO) nd;
                String qryql = "Insert into QuanLy Values(";
                qryql = qryql + "'" + ql.getMaQuanLy() + "',";
                ResultSet rsc = st.executeQuery("select Count(*) from nhanvien where Mng = '" + ql.getMaQuanLy()+"'");
                qryql = qryql + rsc.getInt(1) +",";
                qryql =qryql + "'" + ql.getMaNguoiDung() + "')";
                st.executeUpdate(qryql);
            } else if (nd.getMaNguoiDung().substring(0, 2).equals("NV")){
                NhanVienDTO nv = (NhanVienDTO) nd;
                String qrynv = "Insert into NhanVien Values(";
                qrynv = qrynv + "'" + nv.getMaNhanVien() + "',";
                qrynv = qrynv + "'" + nv.getMaQuanLy() + "',";
                qrynv = qrynv + "'" + nv.getMaNguoiDung() + "',";
                qrynv = qrynv + "'" + nv.getVaiTro() + "')";
                st.executeUpdate(qrynv);
                updateCountManager(nv.getMaQuanLy());
            }
            st.executeUpdate("Set Foreign_key_checks = 1");
        }
        catch(SQLException ex){
            //báo lỗi
        }
    }
    public ArrayList docDSND(){
        ArrayList dsnd=new ArrayList<NguoiDungDTO>();
        try{
            String qry="select * from nguoidung";
            st=con.createStatement();
            rs=st.executeQuery(qry);
            while(rs.next()){
                if(rs.getString(1).substring(0,2).equals("QL")){
                    NguoiDungDTO ql=new QuanLyDTO();
                    ql.setMaNguoiDung(rs.getString(1));
                    ql.setTaiKhoan(rs.getString(2));
                    ql.setMatKhau(rs.getString(3));
                    ql.setTen(rs.getString(4));
                    ql.setCCCD(rs.getString(5));
                    ql.setSDT(rs.getString(6));
                    ql.setTrangThai(rs.getInt(7));
                    dsnd.add(ql);
                } else {
                    NguoiDungDTO nv=new NhanVienDTO();
                    nv.setMaNguoiDung(rs.getString(1));
                    nv.setTaiKhoan(rs.getString(2));
                    nv.setMatKhau(rs.getString(3));
                    nv.setTen(rs.getString(4));
                    nv.setCCCD(rs.getString(5));
                    nv.setSDT(rs.getString(6));
                    nv.setTrangThai(rs.getInt(7));
                    dsnd.add(nv);
                }
                
            }
        }
        catch(SQLException ex){
            //báo lỗi
        }
        return dsnd;
    }
    public String dangnhap(String tk, String mk){
        try{
            st=con.createStatement();
            rs=st.executeQuery("SELECT UserID,UserName,UserPass FROM NguoiDung");
            while(rs.next()){
                if(tk.toLowerCase().equals((rs.getString(2).toLowerCase()))&&mk.equals(rs.getString(3))){
                    return rs.getString(1);
                }
            }
        }  
        catch(SQLException ex){
        //báo lỗi
        }
        return null;
    }
    public void xoa(String mnd){
        try{
            st=con.createStatement();
            st.executeUpdate("Set Foreign_key_checks = 0");
            String qry="Update nguoidung set UserSTT = 0 WHERE UserID = ";
            qry = qry + "'"+mnd +"'";
            st.executeUpdate(qry);
            st.executeUpdate("Set Foreign_key_checks = 1");
        }
        catch(SQLException ex){
            //báo lỗi
        }
}
