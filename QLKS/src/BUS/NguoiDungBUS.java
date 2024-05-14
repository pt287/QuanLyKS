/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DTO.NguoiDung.NguoiDungDTO;

import java.util.ArrayList;

import DAO.NguoiDungDAO;

/**
 *
 * @author capij
 */
public class NguoiDungBUS {
    static ArrayList<NguoiDungDTO> dsnd;
    NguoiDungDAO data=new NguoiDungDAO();
    private String TK="";

    public String gettk() {
        return TK;
    }

    public void settk(String tk) {
        this.TK=tk;
    }

    public NguoiDungBUS(){}

    public ArrayList<NguoiDungDTO> docDSND(){
        if(dsnd!=null) dsnd=new ArrayList<NguoiDungDTO>();
        dsnd=data.docDSND();
        return dsnd;
    }
    public void them(NguoiDungDTO nd){
        data.them(nd);
        dsnd.add(nd);
    }
    public String dangnhap(String tk,String mk){
        TK=data.dangnhap(tk, mk);
        return data.dangnhap(tk, mk);
    }
    public void Xoa(String Mnd){
        data.xoa(Mnd);
        for (int i = 0; i < dsnd.size(); i++) {
            NguoiDungDTO b = dsnd.get(i);
            if (Mnd.equals(b.getMaNguoiDung())) {
                b.setTrangThai(0);
                dsnd.set(i, b);
                break;
            }
        }
    }
    public void Sua(String mnd,NguoiDungDTO a){
        data.Sua(mnd, a);
        for (int i = 0; i < dsnd.size(); i++) {
            NguoiDungDTO b = dsnd.get(i);
            if (mnd.equals(b.getMaNguoiDung())) {
                dsnd.set(i, a);
                break;
            }
        }
    }
    public boolean kiemTraMaNhanVien(String maNhanVien) {
        if (data.kiemTraMaNhanVien(maNhanVien)){
            return true;
        }
        return false;
    }
    public boolean kiemTraMaQuanLy(String maquanly) {
        if (data.kiemTraMaQuanLy(maquanly)){
            return true;
        }
        return false;
    }
    public String Ten(String a){
        return data.Ten(a);
    }
}
