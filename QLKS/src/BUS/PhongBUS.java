package BUS;

import java.util.ArrayList;
import DTO.Phong.PhongDTO;
import DAO.PhongDAO;

public class PhongBUS {
    static ArrayList<PhongDTO> dsphong;
    public PhongBUS(){}
    public ArrayList<PhongDTO> docDSPhong(){
        PhongDAO data=new PhongDAO();
        if(dsphong!=null) dsphong=new ArrayList<PhongDTO>();
        dsphong=data.docDSP();
        return dsphong;
    }
    public void them(PhongDTO nd){
        PhongDAO data=new PhongDAO();
        data.them(nd);
        dsphong.add(nd);
    }
    public void TimKiem_mp(String tk){
        for(PhongDTO p:dsphong){

        }
    }
}
