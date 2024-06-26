/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;
import DTO.ChiTietHoaDonDTO;
import DAO.ChiTietHoaDonDAO;
import DTO.ChiTietHoaDonInDTO;
import java.util.ArrayList;
/**
 *
 * @author TuiLaZit
 */
public class ChiTietHoaDonBUS {
    static ArrayList<ChiTietHoaDonDTO> dscthd;
    public ChiTietHoaDonBUS(){}
    ChiTietHoaDonDAO data = new ChiTietHoaDonDAO();
    
    public ArrayList<ChiTietHoaDonDTO> docDSCTHD(String str){
        if(dscthd!=null) dscthd = new ArrayList<ChiTietHoaDonDTO>();
        dscthd=data.docDSCTHD(str);
        return dscthd;
    }
    
    public void them(ChiTietHoaDonInDTO cthdi){
        if(dscthd==null) dscthd = new ArrayList<ChiTietHoaDonDTO>();
        ChiTietHoaDonDTO cthdo = data.them(cthdi);
        dscthd.add(cthdo);
    }
    
    public ArrayList RoomRatio(){
        return data.RoomRatio();
    }
    
    public ArrayList SvcRatio(){
        return data.SvcRatio();
    }
    public void Xoa(String mhd){
        data.Xoa(mhd);
    }
    public void UpdateMoney(int i){
        data.UpdateMoney(i);
    }
}