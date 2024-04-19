package DTO;

public class LichSu {
    private String NgayThang;
    private String Tien;

    public LichSu(String NgayThang, String Tien) {
        this.NgayThang = NgayThang;
        this.Tien = Tien;
    }

    public LichSu(){}

    public String getNgayThang() {
        return NgayThang;
    }

    public void setNgayThang(String NgayThang) {
        this.NgayThang = NgayThang;
    }

    public String getTien() {
        return Tien;
    }

    public void setTien(String Tien) {
        this.Tien = Tien;
    }
    
    
}
