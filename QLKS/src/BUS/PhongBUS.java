package BUS;

import java.time.LocalDate;
import java.util.ArrayList;

import DTO.KhachHangDTO;
import DTO.Phong.PhongDTO;
import DTO.Phong.PhongThuongDTO;
import DTO.Phong.PhongVipDTO;
import Excel.ModelExcelIn;
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
    public void DocExcel(ArrayList<ModelExcelIn> a){
        int dem=1;
        for(ModelExcelIn p:a){
            if(p.getRType().contains("VIP")){
                PhongVipDTO pv=new PhongVipDTO(p.getRType() + p.getRNum(), p.getRNum(), "R", "", p.getRPrice(),"");
                data.them(pv);
                dsphong.add(pv);
            }else{
                PhongThuongDTO pt=new PhongThuongDTO(p.getRType() +p.getRNum(), p.getRNum(), "R", "", p.getRPrice(), p.getRType());
                data.them(pt);
                dsphong.add(pt);
            }
            dem++;
        }
    }
    public ArrayList<PhongDTO> TimKiem(String mp, String sp, String lp, String tt, int gt, int gd){
        ArrayList<PhongDTO> arr=new ArrayList<>();
        for (PhongDTO a:dsphong){
            if ((a.getMaPhong().substring(0, 3).toLowerCase().contains(lp) || lp==null) && 
                (a.getMaPhong().toLowerCase().contains(mp) || mp==null) && 
                (a.getSoPhong().toLowerCase().contains(sp) || sp==null) &&
                (a.getTinhTrang().toLowerCase().contains(tt) || tt==null) &&
                (a.getDonGia()>=gt && (a.getDonGia()<= gd || gd==-1))) {
                arr.add(a);
            }
        }
        return arr;
    }
}
