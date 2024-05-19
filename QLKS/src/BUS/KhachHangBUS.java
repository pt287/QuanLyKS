/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import java.util.ArrayList;

import DAO.KhachHangDAO;
import DTO.KhachHangDTO;
import DTO.Phong.PhongDTO;

/**
 *
 * @author capij
 */
public class KhachHangBUS {
    KhachHangDAO data=new KhachHangDAO();
    ArrayList<KhachHangDTO> dskh;
    public void them(KhachHangDTO kh){
        data.them(kh);
        dskh.add(kh);
    }
    public ArrayList<KhachHangDTO> Doc(){
        if(dskh!=null) dskh=new ArrayList<KhachHangDTO>();
        dskh=data.docDSKH();
        return dskh;
    }
    public void Sua(KhachHangDTO a){       
        data.Sua(a);
        for(int i=0;i<dskh.size();i++){
            KhachHangDTO b=dskh.get(i);
            if (b.getMaKhachHang().equals(a.getMaKhachHang())) {
                dskh.set(i, a);
                break;
            }
        }
    }
}
