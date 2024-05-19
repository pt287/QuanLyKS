/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUICHART.RoomRatio;

/**
 *
 * @author TuiLaZit
 */
public class RoomRatioModel {
    private String RType;
    private int RCount;

    public String getRType() {
        return RType;
    }

    public void setRType(String RType) {
        this.RType = RType;
    }

    public int getRCount() {
        return RCount;
    }

    public void setRCount(int RCount) {
        this.RCount = RCount;
    }

    public RoomRatioModel() {
    }

    public RoomRatioModel(String RType, int RCount) {
        this.RType = RType;
        this.RCount = RCount;
    }
}
