package DTO;


public class HoaDon {
    private String MaHoaDon;
    private String NgayNhan;
    private String NgayTra;
    private String TongTien;

    public HoaDon(String MaHoaDon, String NgayNhan, String NgayTra, String TongTien) {
        this.MaHoaDon = MaHoaDon;
        this.NgayNhan = NgayNhan;
        this.NgayTra = NgayTra;
        this.TongTien = TongTien;
    }

    public HoaDon(){}

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
}
