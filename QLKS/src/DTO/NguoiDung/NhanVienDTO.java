package DTO.NguoiDung;



public class NhanVienDTO extends NguoiDungDTO{
    private String MaNhanVien;

    public NhanVienDTO(String MaNhanVien, String MaNguoiDung, String TenDangNhap, String MatKhau, String SDT, int TrangThai) {
        super(MaNguoiDung, TenDangNhap, MatKhau, SDT, TrangThai);
        this.MaNhanVien = MaNhanVien;
    }
    
    public NhanVienDTO(){}

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    
    
}
