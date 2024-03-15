package NguoiDung;

import java.util.Scanner;

public abstract class NguoiDung {
    private int MaNguoiDung;
    private String TenDangNhap;
    private String MatKhau;
    private String SDT;
    private int TrangThai;//1 or 0
    
    Scanner sc = new Scanner(System.in);

    public NguoiDung(int maNguoiDung, String tenDangNhap, String matKhau, String sDT, int trangThai) {
        this.MaNguoiDung = maNguoiDung;
        this.TenDangNhap = tenDangNhap;
        this.MatKhau = matKhau;
        this.SDT = sDT;
        this.TrangThai = trangThai;
    }

    public NguoiDung(){}

    public int getMaNguoiDung() {
        return MaNguoiDung;
    }

    public void setMaNguoiDung(int maNguoiDung) {
        this.MaNguoiDung = maNguoiDung;
    }

    public String getTenDangNhap() {
        return TenDangNhap;
    }

    public void setTenDangNhap(String tenDangNhap) {
        this.TenDangNhap = tenDangNhap;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String matKhau) {
        this.MatKhau = matKhau;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String sDT) {
        this.SDT = sDT;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int trangThai) {
        this.TrangThai = trangThai;
    }

    //method

}

