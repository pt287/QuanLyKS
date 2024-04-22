package DTO.Phong;

public class DichVuDTO {
    private String MaDichVu;
    private String TenDichVu;
    private int Gia;
    
    public DichVuDTO(String maDichVu, String tenDichVu, int gia) {
        MaDichVu = maDichVu;
        TenDichVu = tenDichVu;
        Gia = gia;
    }
    public DichVuDTO(){}
    
    public String getMaDichVu() {
        return MaDichVu;
    }
    public void setMaDichVu(String maDichVu) {
        MaDichVu = maDichVu;
    }
    public String getTenDichVu() {
        return TenDichVu;
    }
    public void setTenDichVu(String tenDichVu) {
        TenDichVu = tenDichVu;
    }
    public int getGia() {
        return Gia;
    }
    public void setGia(int gia) {
        Gia = gia;
    }
    
}
