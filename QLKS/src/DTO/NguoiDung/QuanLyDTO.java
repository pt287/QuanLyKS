package DTO.NguoiDung;



public class QuanLyDTO extends NguoiDungDTO {
    private String MaQuanLy;
    private int SoLuong;

    public QuanLyDTO(String maNguoiDung, String taiKhoan, String matKhau, String ten, String cCCD, String sDT,
            int trangThai) {
        super(maNguoiDung, taiKhoan, matKhau, ten, cCCD, sDT, trangThai);
    }

    public QuanLyDTO() {}

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
