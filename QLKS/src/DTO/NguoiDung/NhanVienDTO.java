package DTO.NguoiDung;



public class NhanVienDTO extends NguoiDungDTO{
    private String MaNhanVien;
    private String MaQuanLy;
    private String VaiTro;
     
    
    public NhanVienDTO(String MaNguoiDung, String TaiKhoan, String MatKhau, String SDT, int TrangThai) {
        super(MaNguoiDung, TaiKhoan, MatKhau, SDT, TrangThai);
    }

    public NhanVienDTO(){}

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getMaQuanLy() {
        return MaQuanLy;
    }

    public void setMaQuanLy(String maQuanLy) {
        MaQuanLy = maQuanLy;
    }

    public String getVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(String vaiTro) {
        VaiTro = vaiTro;
    }

    
    
}
