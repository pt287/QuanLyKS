package DTO;


public class ChiTietHoaDonDTO {
    private int MaHoaDon;
    private int MaChiTietHoaDon;
    private String MaPhong;
    private String UuDai;
    private String Tien;

    public ChiTietHoaDonDTO(int maHoaDon, int maChiTietHoaDon, String maPhong, String uuDai, String tien) {
        MaHoaDon = maHoaDon;
        MaChiTietHoaDon = maChiTietHoaDon;
        MaPhong = maPhong;
        UuDai = uuDai;
        Tien = tien;
    }

    public ChiTietHoaDonDTO(){}
       
    public int getMaHoaDon() {
        return MaHoaDon;
    }

    public void setMaHoaDon(int MaHoaDon) {
        this.MaHoaDon = MaHoaDon;
    }

    public String getUuDai() {
        return UuDai;
    }

    public void setUuDai(String UuDai) {
        this.UuDai = UuDai;
    }

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String maPhong) {
        MaPhong = maPhong;
    }

    public String getTien() {
        return Tien;
    }

    public void setTien(String Tien) {
        this.Tien = Tien;
    }

    public int getMaChiTietHoaDon() {
        return MaChiTietHoaDon;
    }

    public void setMaChiTietHoaDon(int maChiTietHoaDon) {
        MaChiTietHoaDon = maChiTietHoaDon;
    }
    
    
}
