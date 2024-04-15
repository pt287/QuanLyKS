package com.KhachHang;

public class KhachHang {
    private String MaKhachHang;
    private String TenKhachHang;
    private String SDT;
    private String CCCD;

    public KhachHang(String MaKhachHang, String TenKhachHang, String SDT, String CCCD) {
        this.MaKhachHang = MaKhachHang;
        this.TenKhachHang = TenKhachHang;
        this.SDT = SDT;
        this.CCCD = CCCD;
    }
    
    public KhachHang(){}

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public String getTenKhachHang() {
        return TenKhachHang;
    }

    public void setTenKhachHang(String TenKhachHang) {
        this.TenKhachHang = TenKhachHang;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }
    
    
}
