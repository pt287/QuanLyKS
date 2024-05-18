package BUS;

import java.time.LocalDate;
import java.util.ArrayList;
import DTO.Phong.PhongDTO;
import DAO.PhongDAO;
import java.util.Date;

public class PhongBUS {
    static ArrayList<PhongDTO> dsphong;
    PhongDAO data=new PhongDAO();
    public PhongBUS(){}
    public ArrayList<PhongDTO> docDSPhong(){  
        if(dsphong!=null) dsphong=new ArrayList<PhongDTO>();
        dsphong=data.docDSP();
        return dsphong;
    }
    public void them(PhongDTO nd){
        data.them(nd);
        dsphong.add(nd);
    }
    public void Sua(String mp,PhongDTO p){
        data.Sua(mp, p);
        for(int i=0;i<dsphong.size();i++){
            PhongDTO a=dsphong.get(i);
            if (a.getMaPhong().equals(mp)) {
                dsphong.set(i, p);
                break;
            }
        }
    }
    public ArrayList DatPhong (LocalDate in, LocalDate out){
        ArrayList<PhongDTO> list = data.DatPhong(in, out);
        return list;
    }
    public PhongDTO docphong (String MaPhong){
        PhongDTO phong = data.docphong(MaPhong);
        return phong;
    }
}
