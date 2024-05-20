package DTO;

import java.time.LocalDate;


public class HoaDonDTO {
    private int MaHoaDon;
    private String MaNhanVien;
    private String MaKhachHang;
    private LocalDate NgayNhan;
    private LocalDate NgayTra;
    private int TongTien;
    private ChiTietHoaDonDTO[] dscthd;

    public HoaDonDTO(int MaHoaDon,String MaNhanVien,String MaKhachHang, LocalDate NgayNhan, LocalDate NgayTra, int TongTien, ChiTietHoaDonDTO[] dscthd) {
        this.MaHoaDon = MaHoaDon;
        this.MaNhanVien = MaNhanVien;
        this.MaKhachHang = MaKhachHang;
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

    public int getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(int MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public LocalDate getNgayNhan() {
        return NgayNhan;
    }

    public void setNgayNhan(LocalDate NgayNhan) {
        this.NgayNhan = NgayNhan;
    }

    public LocalDate getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(LocalDate NgayTra) {
        this.NgayTra = NgayTra;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        MaNhanVien = maNhanVien;
    }

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        MaKhachHang = maKhachHang;
    }    
}
