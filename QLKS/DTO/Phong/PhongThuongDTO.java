package DTO.Phong;

public class PhongThuongDTO extends PhongDTO{
    private String KieuPhong;

    public PhongThuongDTO(String MaPhong, String SoPhong, String TinhTrang, String GhiChu, int DonGia,
            String kieuPhong) {
        super(MaPhong, SoPhong, TinhTrang, GhiChu, DonGia);
        KieuPhong = kieuPhong;
    }

    public PhongThuongDTO() {
    }

    public String getKieuPhong() {
        return KieuPhong;
    }

    public void setKieuPhong(String kieuPhong) {
        KieuPhong = kieuPhong;
    }
}
