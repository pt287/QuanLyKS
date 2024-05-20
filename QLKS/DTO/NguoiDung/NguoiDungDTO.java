package DTO.NguoiDung;

public abstract class NguoiDungDTO {
    private String MaNguoiDung;
    private String TaiKhoan;
    private String MatKhau;
    private String Ten;
    private String CCCD;
    private String SDT;
    private int TrangThai;

    
    
    public NguoiDungDTO(String maNguoiDung, String taiKhoan, String matKhau, String ten, String cCCD, String sDT,
            int trangThai) {
        MaNguoiDung = maNguoiDung;
        TaiKhoan = taiKhoan;
        MatKhau = matKhau;
        Ten = ten;
        CCCD = cCCD;
        SDT = sDT;
        TrangThai = trangThai;
    }

    public NguoiDungDTO(){}

    public String getMaNguoiDung() {
        return MaNguoiDung;
    }

    public void setMaNguoiDung(String maNguoiDung) {
        MaNguoiDung = maNguoiDung;
    }

    public String getTaiKhoan() {
        return TaiKhoan;
    }

    public void setTaiKhoan(String taiKhoan) {
        TaiKhoan = taiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String matKhau) {
        MatKhau = matKhau;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String cCCD) {
        CCCD = cCCD;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String sDT) {
        SDT = sDT;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int trangThai) {
        TrangThai = trangThai;
    }

    

}
