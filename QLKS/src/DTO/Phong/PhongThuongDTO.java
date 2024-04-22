package DTO.Phong;

public class PhongThuongDTO extends PhongDTO{
    private DichVuDTO DichVu;

    public PhongThuongDTO(String MaPhong, String SoPhong, String LoaiPhong, String TinhTrang, String GhiChu,
            int DonGia) {
        super(MaPhong, SoPhong, LoaiPhong, TinhTrang, GhiChu, DonGia);
    }

    public PhongThuongDTO() {
    }

    public DichVuDTO getDichVu() {
        return DichVu;
    }

    public void setDichVu(DichVuDTO dichVu) {
        DichVu = dichVu;
    }

    
    
}
