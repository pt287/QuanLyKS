package DTO;


public class ChiTietHoaDonDTO {
    private int MaHoaDon;
    private String UuDai;
    private String Tien;

    public ChiTietHoaDonDTO(int MaHoaDon, String UuDai, String Tien) {
        this.MaHoaDon = MaHoaDon;
        this.UuDai = UuDai;
        this.Tien = Tien;
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

    public String getTien() {
        return Tien;
    }

    public void setTien(String Tien) {
        this.Tien = Tien;
    }
    
    
}
