package DTO.NguoiDung;



public class QuanLyDTO extends NguoiDungDTO {
    private String MaQuanLy;
    private int SoLuong;

    
    public QuanLyDTO(String MaNguoiDung, String TaiKhoan, String MatKhau, String SDT, int TrangThai) {
        super(MaNguoiDung, TaiKhoan, MatKhau, SDT, TrangThai);
    }

    public QuanLyDTO(){}

    public String getMaQuanLy() {
        return MaQuanLy;
    }

    public void setMaQuanLy(String MaQuanLy) {
        this.MaQuanLy = MaQuanLy;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }
    
}
