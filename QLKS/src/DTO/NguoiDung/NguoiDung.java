package DTO.NguoiDung;

public abstract class NguoiDung {
    private String MaNguoiDung;
    private String TaiKhoan;
    private String MatKhau;
    private String SDT;
    private int TrangThai;

    public NguoiDung(String MaNguoiDung, String TaiKhoan, String MatKhau, String SDT, int TrangThai) {
        this.MaNguoiDung = MaNguoiDung;
        this.TaiKhoan = TaiKhoan;
        this.MatKhau = MatKhau;
        this.SDT = SDT;
        this.TrangThai = 1;
    }
    
    public NguoiDung(){}

    public String getMaNguoiDung() {
        return MaNguoiDung;
    }

    public void setMaNguoiDung(String MaNguoiDung) {
        this.MaNguoiDung = MaNguoiDung;
    }

    public String getTaiKhoan() {
        return TaiKhoan;
    }

    public void setTaiKhoan(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }
    
    //methods
    public abstract void DangNhap();
    
    public abstract void DangXuat();
    
    public abstract void NhapThongTin();
    
    public abstract void LayThongTin();
    
    //public abstract void SuaThongTin();
}
