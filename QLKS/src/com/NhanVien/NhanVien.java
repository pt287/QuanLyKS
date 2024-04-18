package com.NhanVien;

import com.NguoiDung.NguoiDung;
import com.QuanLy.QuanLy;
import java.util.Scanner;

public class NhanVien extends NguoiDung{
    Scanner sc = new Scanner(System.in);
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
    
    @Override
    public void NhapThongTin() {
        System.out.println("Nhap Thong Tin Nhan Vien:");;
    }

    @Override
    public void LayThongTin() {
        System.out.println("Lay Thong Tin Nhan Vien");;
    }

    /*@Override
    public void SuaThongTin() {
        System.out.println("");;
    }*/
    
    @Override
    public void DangNhap() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void DangXuat() {
        throw new UnsupportedOperationException();
    }

    
    
}
