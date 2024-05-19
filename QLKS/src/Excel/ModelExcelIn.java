/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excel;

/**
 *
 * @author TuiLaZit
 */
public class ModelExcelIn {
    private String RType;//loai phong
    private String RNum;//so phong
    private int RPrice;//gia

    public ModelExcelIn() {
    }

    public ModelExcelIn(String RType, String RNum, int RPrice) {
        this.RType = RType;
        this.RNum = RNum;
        this.RPrice = RPrice;
    }

    public String getRType() {
        return RType;
    }

    public void setRType(String RType) {
        this.RType = RType;
    }

    public String getRNum() {
        return RNum;
    }

    public void setRNum(String RNum) {
        this.RNum = RNum;
    }

    public int getRPrice() {
        return RPrice;
    }

    public void setRPrice(int RPrice) {
        this.RPrice = RPrice;
    }
}
