package DTO;

import java.util.ArrayList;
import java.util.Date;

public class TGDTO {
    private Date Datein;
    private Date DateOut;
    private ArrayList<String> MaPhong;
    
    public TGDTO(Date datein, Date dateOut, ArrayList<String> maPhong) {
        Datein = datein;
        DateOut = dateOut;
        MaPhong = maPhong;
    }
    
    public TGDTO() {
    }

    public Date getDatein() {
        return Datein;
    }
    public void setDatein(Date date) {
        Datein = date;
    }
    public Date getDateOut() {
        return DateOut;
    }
    public void setDateOut(Date date) {
        DateOut = date;
    }
    public ArrayList<String> getMaPhong() {
        return MaPhong;
    }
    public void setMaPhong(ArrayList<String> maPhong) {
        MaPhong = maPhong;
    }
    
}
