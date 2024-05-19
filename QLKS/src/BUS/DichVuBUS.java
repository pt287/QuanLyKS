/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.DichVuDAO;
import DTO.DichVuDTO;
import java.util.ArrayList;

/**
 *
 * @author TuiLaZit
 */
public class DichVuBUS {
    static ArrayList<DichVuDTO> dsdv;
    public DichVuBUS(){}
    DichVuDAO data = new DichVuDAO();
    public ArrayList<DichVuDTO> docDSDV(){
        if(dsdv!=null) dsdv = new ArrayList<DichVuDTO>();
        dsdv=data.docDV();
        return dsdv;
    }
    public void them (DichVuDTO dv){
        data.them(dv);
        dsdv.add(dv);
    }
    public void xoa (String MaDV){
        data.xoa(MaDV);
    }
    public void sua(DichVuDTO a){
        data.sua(a);
        for (int i=0;i<dsdv.size();i++){
            DichVuDTO dv=dsdv.get(i);
            if (dv.getMaDichVu().equals(a.getMaDichVu())) {
                dsdv.set(i, a);
                return;
                
            }
        }
    }
    public DichVuDTO docdichvu (String MaDichVu){
        DichVuDTO dichvu = data.docdichvu(MaDichVu);
        return dichvu;
    }
}
