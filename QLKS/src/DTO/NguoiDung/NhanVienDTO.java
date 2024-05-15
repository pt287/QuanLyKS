package DTO.NguoiDung;



public class NhanVienDTO extends NguoiDungDTO{
    private String MaNhanVien;
    private String MaQuanLy;
    private String VaiTro;

    public NhanVienDTO(String maNguoiDung, String taiKhoan, String matKhau, String ten, String cCCD, String sDT,
            int trangThai, String maNhanVien, String maQuanLy, String vaiTro) {
        super(maNguoiDung, taiKhoan, matKhau, ten, cCCD, sDT, trangThai);
        MaNhanVien = maNhanVien;
        MaQuanLy = maQuanLy;
        VaiTro = vaiTro;
    }
    

    public NhanVienDTO(String maNguoiDung, String taiKhoan, String matKhau, String ten, String cCCD, String sDT,
            int trangThai) {
        super(maNguoiDung, taiKhoan, matKhau, ten, cCCD, sDT, trangThai);
    }


    public NhanVienDTO(String maNhanVien, String maQuanLy, String vaiTro) {
        MaNhanVien = maNhanVien;
        MaQuanLy = maQuanLy;
        VaiTro = vaiTro;
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
