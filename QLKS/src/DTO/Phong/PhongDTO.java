package DTO.Phong;

public class PhongDTO {
    private String MaPhong;
    private String SoPhong;
    private String LoaiPhong;
    private String TinhTrang;
    private String GhiChu;
    private int DonGia;

    public PhongDTO(String MaPhong, String SoPhong, String LoaiPhong, String TinhTrang, String GhiChu, int DonGia) {
        this.MaPhong = MaPhong;
        this.SoPhong = SoPhong;
        this.LoaiPhong = LoaiPhong;
        this.TinhTrang = TinhTrang;
        this.GhiChu = GhiChu;
        this.DonGia = DonGia;
    }
    
    public PhongDTO(){}

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

    public String getLoaiPhong() {
        return LoaiPhong;
    }

    public void setLoaiPhong(String LoaiPhong) {
        this.LoaiPhong = LoaiPhong;
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

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }
    
    
}
