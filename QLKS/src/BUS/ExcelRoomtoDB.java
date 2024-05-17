/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DAO.PhongDAO;
import DTO.Phong.PhongDTO;
import DTO.Phong.PhongThuongDTO;
import DTO.Phong.PhongVipDTO;
import Excel.ExcelIn;
import Excel.ModelExcelIn;
import java.util.ArrayList;
/**
 *
 * @author TuiLaZit
 */
public class ExcelRoomtoDB {
    
    public ArrayList fromEx(){
        ExcelIn ex = new ExcelIn();
        ArrayList<ModelExcelIn> modelex = ex.NhapPhong();
        return modelex;
    }
    
    public void toDB(){
        ArrayList<ModelExcelIn> modelex = fromEx();
        PhongDAO data = new PhongDAO();
        for(int i=0;i<=modelex.size()-1;i++){
            ModelExcelIn mf = modelex.get(i);
            if(mf.getRType().equals("VIP")){
                PhongVipDTO mt = new PhongVipDTO();
                String maPhong = "VIP" + mf.getRNum();
                mt.setMaPhong(maPhong);
                mt.setSoPhong(mf.getRNum());
                mt.setTinhTrang("R");
                mt.setDonGia(mf.getRPrice());
                String floor = mf.getRNum().substring(0, 2);
                if(Integer.parseInt(floor)<=14){
                    mt.setMaPhongAn("DN1");
                }else{
                    mt.setMaPhongAn("DN2");
                }
                data.them(mt);
            } else {
                PhongThuongDTO mt = new PhongThuongDTO();
                String maPhong = mf.getRType() + mf.getRNum();
                mt.setMaPhong(maPhong);
                mt.setSoPhong(mf.getRNum());
                mt.setTinhTrang("R");
                mt.setDonGia(mf.getRPrice());
                mt.setKieuPhong(mf.getRType());
                data.them(mt);
            }
        }
    }
}
