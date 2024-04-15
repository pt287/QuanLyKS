package com.QuanLy;

import com.NguoiDung.NguoiDung;

public class QuanLy extends NguoiDung {
    private String MaQuanLy;

    public QuanLy(String MaQuanLy, String MaNguoiDung, String TenDangNhap, String MatKhau, String SDT, int TrangThai) {
        super(MaNguoiDung, TenDangNhap, MatKhau, SDT, TrangThai);
        this.MaQuanLy = MaQuanLy;
    }
    
    public QuanLy(){}

    public String getMaQuanLy() {
        return MaQuanLy;
    }

    public void setMaQuanLy(String MaQuanLy) {
        this.MaQuanLy = MaQuanLy;
    }
    
    
    //methods
}
