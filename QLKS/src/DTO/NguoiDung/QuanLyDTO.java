package DTO.NguoiDung;



public class QuanLyDTO extends NguoiDungDTO {
    private String MaQuanLy;

    public QuanLyDTO (String MaQuanLy, String MaNguoiDung, String TenDangNhap, String MatKhau, String SDT, int TrangThai) {
        super(MaNguoiDung, TenDangNhap, MatKhau, SDT, TrangThai);
        this.MaQuanLy = MaQuanLy;
    }
    
    public QuanLyDTO(){}

    public String getMaQuanLy() {
        return MaQuanLy;
    }

    public void setMaQuanLy(String MaQuanLy) {
        this.MaQuanLy = MaQuanLy;
    }
    
}
