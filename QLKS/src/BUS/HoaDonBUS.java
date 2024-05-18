/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;
import DTO.HoaDonDTO;
import DAO.HoaDonDAO;
import DTO.HoaDonInDTO;
import java.util.ArrayList;

public class HoaDonBUS {
    static ArrayList<HoaDonDTO> dshd;
    public HoaDonBUS(){}
    HoaDonDAO data=new HoaDonDAO();
    public ArrayList docDSHD(){
        if(dshd!=null) dshd=new ArrayList<HoaDonDTO>();
        dshd=data.docDSHD();
        return dshd;
    }
    public void them(HoaDonInDTO hdi){
        HoaDonDTO hdo = data.them(hdi);
        dshd.add(hdo);
        //return hdo;
    }
    public void sua(String MaHD,HoaDonDTO hd){
        data.sua(MaHD, hd);
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
    public ArrayList<HoaDonDTO> TimKiem(int mhd,String mnv,String mkh){
        ArrayList<HoaDonDTO> hd=new ArrayList<HoaDonDTO>();
        for (HoaDonDTO a:dshd){
            if ((a.getMaHoaDon()==mhd || mhd==0) && 
                (a.getMaKhachHang().contains(mkh) || mkh==null) && 
                (a.getMaNhanVien().contains(mnv) || mnv==null)) {
                hd.add(a);
            }
        }
        return hd;
    }
}