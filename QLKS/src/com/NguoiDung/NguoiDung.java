
package com.NguoiDung;


public asbtract class NguoiDung {
    private String MaNguoiDung;
    private String TenDangNhap;
    private String MatKhau;
    private String SDT;
    private int TrangThai;

    public NguoiDung(String MaNguoiDung, String TenDangNhap, String MatKhau, String SDT, int TrangThai) {
        this.MaNguoiDung = MaNguoiDung;
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
        this.SDT = SDT;
        this.TrangThai = TrangThai;
    }
    
    public NguoiDung(){}

    public String getMaNguoiDung() {
        return MaNguoiDung;
    }

    public void setMaNguoiDung(String MaNguoiDung) {
        this.MaNguoiDung = MaNguoiDung;
    }

    public String getTenDangNhap() {
        return TenDangNhap;
    }

    public void setTenDangNhap(String TenDangNhap) {
        this.TenDangNhap = TenDangNhap;
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
}
