package com.QuanLy;

import com.NguoiDung.NguoiDung;
import java.util.Scanner;

public class QuanLy extends NguoiDung {
    Scanner sc = new Scanner(System.in);
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
    
    
    @Override
    public void NhapThongTin() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void LayThongTin() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void DangNhap() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void DangXuat() {
        throw new UnsupportedOperationException();
    }

    /*@Override
    public void SuaThongTin() {
        throw new UnsupportedOperationException();
    }*/
}
