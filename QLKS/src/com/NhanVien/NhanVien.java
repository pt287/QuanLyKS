package com.NhanVien;

import com.NguoiDung.NguoiDung;
import com.QuanLy.QuanLy;
public class NhanVien extends NguoiDung{
    private String MaNhanVien;

    public NhanVien(String MaNhanVien, String MaNguoiDung, String TenDangNhap, String MatKhau, String SDT, int TrangThai) {
        super(MaNguoiDung, TenDangNhap, MatKhau, SDT, TrangThai);
        this.MaNhanVien = MaNhanVien;
    }
    
    public NhanVien(){}

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }
    
    //mothods
}
