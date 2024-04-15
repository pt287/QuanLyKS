package com.ChiTietHoaDon;

import com.HoaDon.HoaDon;
import com.Phong.Phong;

public class ChiTietHoaDon extends Phong{
    private String UuDai;
    private String Tien;

    public ChiTietHoaDon(String UuDai, String Tien, String MaPhong, String SoPhong, String MaLoaiPhong, String TinhTrang, String GhiChu, String DonGia) {
        super(MaPhong, SoPhong, MaLoaiPhong, TinhTrang, GhiChu, DonGia);
        this.UuDai = UuDai;
        this.Tien = Tien;
    }

    public ChiTietHoaDon(){}

    public String getUuDai() {
        return UuDai;
    }

    public void setUuDai(String UuDai) {
        this.UuDai = UuDai;
    }

    public String getTien() {
        return Tien;
    }

    public void setTien(String Tien) {
        this.Tien = Tien;
    }
    
    
}
