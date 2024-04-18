package DTO.Phong;

public class Phong {
    private String MaPhong;
    private String SoPhong;
    private String MaLoaiPhong;
    private String TinhTrang;
    private String GhiChu;
    private String DonGia;

    public Phong(String MaPhong, String SoPhong, String MaLoaiPhong, String TinhTrang, String GhiChu, String DonGia) {
        this.MaPhong = MaPhong;
        this.SoPhong = SoPhong;
        this.MaLoaiPhong = MaLoaiPhong;
        this.TinhTrang = TinhTrang;
        this.GhiChu = GhiChu;
        this.DonGia = DonGia;
    }
    
    public Phong(){}

    public String getMaPhong() {
        return MaPhong;
    }

    public void setMaPhong(String MaPhong) {
        this.MaPhong = MaPhong;
    }

    public String getSoPhong() {
        return SoPhong;
    }

    public void setSoPhong(String SoPhong) {
        this.SoPhong = SoPhong;
    }

    public String getMaLoaiPhong() {
        return MaLoaiPhong;
    }

    public void setMaLoaiPhong(String MaLoaiPhong) {
        this.MaLoaiPhong = MaLoaiPhong;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public String getDonGia() {
        return DonGia;
    }

    public void setDonGia(String DonGia) {
        this.DonGia = DonGia;
    }
    
    
}
