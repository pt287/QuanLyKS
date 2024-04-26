/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BUS;

import DTO.NguoiDung.NguoiDungDTO;
import DTO.Phong.PhongDTO;

import java.util.ArrayList;

import DAO.NguoiDungDAO;

/**
 *
 * @author capij
 */
public class NguoiDungBUS {
    static ArrayList<NguoiDungDTO> dsnd;
    public NguoiDungBUS(){}
    public void docDSPhong(){
        NguoiDungDAO data=new NguoiDungDAO();
        if(dsnd!=null) dsnd=new ArrayList<NguoiDungDTO>();
        dsnd=data.docDSND();
    }
    public void them(NguoiDungDTO nd){
        NguoiDungDAO data=new NguoiDungDAO();
        data.them(nd);
        dsnd.add(nd);
    }
    public String dangnhap(String tk,String mk){
        NguoiDungDAO data=new NguoiDungDAO();
        return data.dangnhap(tk, mk);
    }
    //public abstract void SuaThongTin();
}
