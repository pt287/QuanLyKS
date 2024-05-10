/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author capij
 */
public class DichVu {
    private String MaDichVu;
    private String Ten;
    private int Gia;

    
    public DichVu(String maDichVu, String ten, int gia) {
        MaDichVu = maDichVu;
        Ten = ten;
        Gia = gia;
    }
    public String getMaDichVu() {
        return MaDichVu;
    }
    public void setMaDichVu(String maDichVu) {
        MaDichVu = maDichVu;
    }
    public String getTen() {
        return Ten;
    }
    public void setTen(String ten) {
        Ten = ten;
    }
    public int getGia() {
        return Gia;
    }
    public void setGia(int gia) {
        Gia = gia;
    }
    
}
