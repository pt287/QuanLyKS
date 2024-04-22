package DTO;


public class HoaDonDTO {
    private String MaHoaDon;
    private String MaNhanVien;
    private String NgayNhan;
    private String NgayTra;
    private String TongTien;
    private ChiTietHoaDonDTO[] dscthd;

    public HoaDonDTO(String MaHoaDon,String MaNhanVien, String NgayNhan, String NgayTra, String TongTien, ChiTietHoaDonDTO[] dscthd) {
        this.MaHoaDon = MaHoaDon;
        this.MaNhanVien = MaNhanVien;
        this.NgayNhan = NgayNhan;
        this.NgayTra = NgayTra;
        this.TongTien = TongTien;
        this.dscthd = dscthd;
    }

    public HoaDonDTO(){}
    
    public ChiTietHoaDonDTO[] getDscthd() {
        return dscthd;
    }

    public void setDscthd(ChiTietHoaDonDTO[] dscthd) {
        this.dscthd = dscthd;
    }

    public String getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(String MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public String getNgayNhan() {
        return NgayNhan;
    }

    public void setNgayNhan(String NgayNhan) {
        this.NgayNhan = NgayNhan;
    }

    public String getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(String NgayTra) {
        this.NgayTra = NgayTra;
    }

    public String getTongTien() {
        return TongTien;
    }

    public void setTongTien(String TongTien) {
        this.TongTien = TongTien;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        MaNhanVien = maNhanVien;
    }    
}
