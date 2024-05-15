package DTO.Phong;


public class PhongVipDTO extends PhongDTO{
    private String MaPhongAn;

    public PhongVipDTO(String MaPhong, String SoPhong, String TinhTrang, String GhiChu,
            int DonGia) {
        super(MaPhong, SoPhong,  TinhTrang, GhiChu, DonGia);
    }

    public PhongVipDTO(String MaPhong, String SoPhong, String TinhTrang, String GhiChu, int DonGia, String maPhongAn) {
        super(MaPhong, SoPhong, TinhTrang, GhiChu, DonGia);
        MaPhongAn = maPhongAn;
    }

    public PhongVipDTO(String maPhongAn) {
        MaPhongAn = maPhongAn;
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
