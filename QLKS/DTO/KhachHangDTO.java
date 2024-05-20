package DTO;

public class KhachHangDTO {
    private String MaKhachHang;
    private String Ten;
    private String SoDienThoai;
    private String CCCD;
    public KhachHangDTO(String maKhachHang, String ten, String soDienThoai, String cCCD) {
        MaKhachHang = maKhachHang;
        Ten = ten;
        SoDienThoai = soDienThoai;
        CCCD = cCCD;
    }
    public KhachHangDTO() {
    }
    public String getMaKhachHang() {
        return MaKhachHang;
    }
    public void setMaKhachHang(String maKhachHang) {
        MaKhachHang = maKhachHang;
    }
    public String getTen() {
        return Ten;
    }
    public void setTen(String ten) {
        Ten = ten;
    }
    public String getSoDienThoai() {
        return SoDienThoai;
    }
    public void setSoDienThoai(String soDienThoai) {
        SoDienThoai = soDienThoai;
    }
    public String getCCCD() {
        return CCCD;
    }
    public void setCCCD(String cCCD) {
        CCCD = cCCD;
    }

    
}
