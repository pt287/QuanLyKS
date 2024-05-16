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
            ResultSet rsc = st.executeQuery("select Count(*) FROM nhanvien WHERE MngID = '" + mql+"'");
            String upql = "update quanly set MngCount = " + rsc.getInt(1) + " WHERE MngID = '" + mql +"';";
            st.executeUpdate(upql);
        }catch(SQLException ex){
            //báo lỗi
        }
    }
    public void them(NguoiDungDTO nd)
    {
        try {
            st = con.createStatement();
            st.executeUpdate("SET FOREIGN_KEY_CHECKS = 0");
    
            String qry = "INSERT INTO NguoiDung VALUES(" +
                    "'" + nd.getMaNguoiDung() + "'," +
                    "'" + nd.getTaiKhoan() + "'," +
                    "'" + nd.getMatKhau() + "'," +
                    "'" + nd.getTen() + "'," +
                    "'" + nd.getCCCD() + "'," +
                    "'" + nd.getSDT() + "'," +
                    "1)";
            st.executeUpdate(qry);
    
            if (nd.getMaNguoiDung().contains("QL")) {
                QuanLyDTO ql = (QuanLyDTO) nd;
                String qryql = "INSERT INTO QuanLy VALUES(" +
                    "'" + ql.getMaQuanLy() + "'," +
                    "0," + // Khởi tạo số lượng quản lý là 0
                    "'" + ql.getMaNguoiDung() + "')";
                st.executeUpdate(qryql);
            } else{
                NhanVienDTO nv = (NhanVienDTO) nd;
                String qrynv = "INSERT INTO NhanVien VALUES(" +
                        "'" + nv.getMaNhanVien() + "'," +
                        "'" + nv.getMaQuanLy() + "'," +
                        "'" + nv.getMaNguoiDung() + "'," +
                        "'" + nv.getVaiTro() + "')";
                st.executeUpdate(qrynv);
                updateCountManager(nv.getMaQuanLy(), st); // Chuyển Statement vào phương thức updateCountManager
            }
    
            st.executeUpdate("SET FOREIGN_KEY_CHECKS = 1");
        } catch (SQLException ex) {
            ex.printStackTrace(); // In lỗi ra console hoặc ghi log
        }
    }
    private void updateCountManager(String maQuanLy, Statement st) throws SQLException {
        String updateQry = "UPDATE QuanLy SET MngCount = (SELECT COUNT(*) FROM NhanVien WHERE MngID = '" + maQuanLy + "') WHERE MngID = '" + maQuanLy + "'";
        st.executeUpdate(updateQry);
    }
    public ArrayList<NguoiDungDTO> docDSND(){
        ArrayList<NguoiDungDTO> dsnd = new ArrayList<NguoiDungDTO>();
        try{
            st = con.createStatement();
            rs = st.executeQuery("SELECT * FROM NguoiDung");
            while(rs.next()){                
                String userID = rs.getString(1);
                String userName = rs.getString(2);
                String userPass = rs.getString(3);
                String userRName = rs.getString(4);
                String userCID = rs.getString(5);
                String userPhoneNum = rs.getString(6);
                int userSTT = rs.getInt(7);
    
                if(userID.substring(0, 2).equals("QL")){    
                    QuanLyDTO ql = new QuanLyDTO(userID, userName, userPass, userRName, userCID, userPhoneNum, userSTT);
                    Statement str=con.createStatement();
                    ResultSet rst = str.executeQuery("SELECT * FROM QuanLy WHERE UserID = '"+userID+"'");
                    if(rst.next()){
                        ql.setMaQuanLy(rst.getString(1));
                        ql.setSoLuong(rst.getInt(2));
                    }
                    dsnd.add(ql);
                } else {
                    NhanVienDTO nv = new NhanVienDTO(userID, userName, userPass, userRName, userCID, userPhoneNum, userSTT);
                    Statement str=con.createStatement();
                    ResultSet rst = str.executeQuery("SELECT * FROM NhanVien WHERE UserID= '"+userID+"'");
                    if(rst.next()){
                        nv.setMaNhanVien(rst.getString(1));
                        nv.setMaQuanLy(rst.getString(2));
                        nv.setVaiTro(rst.getString(4));
                    } 
                    dsnd.add(nv);
                }
            }
        } catch(SQLException ex){
            // Xử lý ngoại lệ
            System.out.println("Không thể truy vấn dữ liệu người dùng");
            ex.printStackTrace();
        } finally {
            try {
                if(rs != null) rs.close();
                if(st != null) st.close();
            } catch(SQLException e) {
                e.printStackTrace();
            }
        }
        return dsnd;
    }
    
    public String dangnhap(String tk, String mk){
        try{
            st=con.createStatement();
            rs=st.executeQuery("SELECT UserID,UserName,UserPass,UserSTT FROM NguoiDung");
            while(rs.next()){
                if(tk.toLowerCase().equals((rs.getString(2).toLowerCase()))&&mk.equals(rs.getString(3))&&rs.getInt(4)==1){
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
    public void Sua(String mnd, NguoiDungDTO a) {
        try {
            st = con.createStatement();
            st.executeUpdate("SET FOREIGN_KEY_CHECKS = 0");
    
            String qry = "UPDATE NguoiDung SET " +
                    "UserName = '" + a.getTaiKhoan() + "', " +
                    "UserPass = '" + a.getMatKhau() + "', " +
                    "UserRName = '" + a.getTen() + "', " +
                    "UserCID = '" + a.getCCCD() + "', " +
                    "UserPhoneNum = '" + a.getSDT() + "' " +
                    "WHERE UserID = '" + mnd + "'";
            st.executeUpdate(qry);
    
            if (a instanceof NhanVienDTO) {
                NhanVienDTO b = (NhanVienDTO) a;
                qry = "UPDATE NhanVien SET " +
                        "WkID = '" + b.getMaNhanVien() + "', " +
                        "WkRole = '" + b.getVaiTro() + "' " +
                        "WHERE UserID = '" + mnd + "'";
                st.executeUpdate(qry);
            } else if (a instanceof QuanLyDTO) {
                QuanLyDTO b = (QuanLyDTO) a;
                qry = "UPDATE QuanLy SET " +
                        "MngID = '" + b.getMaQuanLy() + "', " +
                        "MngCount = '" + b.getSoLuong() + "' " +
                        "WHERE UserID = '" + mnd + "'";
                st.executeUpdate(qry);
            }
    
            st.executeUpdate("SET FOREIGN_KEY_CHECKS = 1");
        } catch (SQLException ex) {
            // Xử lý ngoại lệ
            ex.printStackTrace(); // In lỗi ra console hoặc ghi log
        }
    }
    public boolean kiemTraMaNhanVien(String maNhanVien) {
        try (
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM NhanVien WHERE WkID = '" + maNhanVien + "'");
        ) {
            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0;
            }
        } catch (SQLException ex) {
            ex.printStackTrace(); // Xử lý ngoại lệ
        }
        return false;
    }
    public boolean kiemTraMaQuanLy(String maquanly) {
        try (
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM NhanVien WHERE MngID = '" + maquanly + "'");
        ) {
            if (rs.next()) {
                int count = rs.getInt(1);
                return count > 0;
            }
        } catch (SQLException ex) {
            ex.printStackTrace(); // Xử lý ngoại lệ
        }
        return false;
    }
    public String Ten(String a){
        try (
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM NguoiDung WHERE UserID = '" + a + "'");
        ) {
            if (rs.next()) {
                return rs.getString(4);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(); // Xử lý ngoại lệ
        }
        return "k lay dc";
    }
}