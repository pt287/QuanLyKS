/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.time.LocalDate;

/**
 *
 * @author TuiLaZit
 */
public class HoaDonInDTO {
    private String MaKhachHang;
    private String MaNhanVien;
    private LocalDate NgayNhan;
    private LocalDate NgayTra;

    public String getMaKhachHang() {
        return MaKhachHang;
    }

    public void setMaKhachHang(String MaKhachHang) {
        this.MaKhachHang = MaKhachHang;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public LocalDate getNgayNhan() {
        return NgayNhan;
    }

    public void setNgayNhan(LocalDate NgayNhan) {
        this.NgayNhan = NgayNhan;
    }

    public LocalDate getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(LocalDate NgayTra) {
        this.NgayTra = NgayTra;
    }

    public HoaDonInDTO(String MaKhachHang, String MaNhanVien, LocalDate NgayNhan, LocalDate NgayTra) {
        this.MaKhachHang = MaKhachHang;
        this.MaNhanVien = MaNhanVien;
        this.NgayNhan = NgayNhan;
        this.NgayTra = NgayTra;
    }

    public HoaDonInDTO() {
    }
}
