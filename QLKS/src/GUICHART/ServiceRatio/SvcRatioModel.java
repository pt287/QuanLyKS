/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUICHART.ServiceRatio;

/**
 *
 * @author TuiLaZit
 */
public class SvcRatioModel {
    private String name;
    private int Scount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScount() {
        return Scount;
    }

    public void setScount(int Scount) {
        this.Scount = Scount;
    }

    public SvcRatioModel() {
    }

    public SvcRatioModel(String name, int Scount) {
        this.name = name;
        this.Scount = Scount;
    }
}
