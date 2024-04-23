package DTO.Phong;

public class PhongThuongDTO extends PhongDTO{
    private DichVuDTO[] DichVu;

    

    public PhongThuongDTO(String MaPhong, String SoPhong, String LoaiPhong, String TinhTrang, String GhiChu, int DonGia,
            DichVuDTO[] dichVu) {
        super(MaPhong, SoPhong, LoaiPhong, TinhTrang, GhiChu, DonGia);
        DichVu = dichVu;
    }

    public PhongThuongDTO(DichVuDTO[] dichVu) {
        DichVu = dichVu;
    }

    public PhongThuongDTO() {
    }

    public DichVuDTO[] getDichVu() {
        return DichVu;
    }

    public void setDichVu(DichVuDTO[] dichVu) {
        DichVu = dichVu;
    }
    
}
