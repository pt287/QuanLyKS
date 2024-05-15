/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;
import DTO.HoaDonDTO;
import DAO.HoaDonDAO;
import java.util.ArrayList;

public class HoaDonBUS {
    static ArrayList<HoaDonDTO> dshd;
    public HoaDonBUS(){}
    HoaDonDAO data=new HoaDonDAO();
    public void docDSPhong(){
        if(dshd!=null) dshd=new ArrayList<HoaDonDTO>();
        dshd=data.docDSHD();
    }
    public void them(HoaDonDTO hd){
        data.them(hd);
        dshd.add(hd);
    }
    public int[] CPMBUS(){
        return data.ClientPerMonth();
    }
    public int[] MPMBUS(){
        return data.MoneyPerMonth();
    }
    public int[][] CPSAR(){
        return data.CPSAR();
    }
}