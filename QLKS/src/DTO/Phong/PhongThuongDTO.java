package DTO.Phong;

public class PhongThuongDTO extends PhongDTO{
    private String MaDichVu;

    public PhongThuongDTO(String MaPhong, String SoPhong, String MaLoaiPhong, String TinhTrang, String GhiChu,
            String DonGia) {
        super(MaPhong, SoPhong, MaLoaiPhong, TinhTrang, GhiChu, DonGia);
    }

    public PhongThuongDTO() {
    }

    public String getMaDichVu() {
        return MaDichVu;
    }

    public void setMaDichVu(String maDichVu) {
        MaDichVu = maDichVu;
    }
    
}
