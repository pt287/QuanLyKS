package DTO.Phong;


public class PhongVipDTO extends PhongDTO{
    private String MaPhongAn;

    public PhongVipDTO(String MaPhong, String SoPhong, String MaLoaiPhong, String TinhTrang, String GhiChu,
            int DonGia) {
        super(MaPhong, SoPhong, MaLoaiPhong, TinhTrang, GhiChu, DonGia);
    }

    public PhongVipDTO() {
    }

    public String getMaPhongAn() {
        return MaPhongAn;
    }

    public void setMaPhongAn(String maPhongAn) {
        MaPhongAn = maPhongAn;
    }
    
}
