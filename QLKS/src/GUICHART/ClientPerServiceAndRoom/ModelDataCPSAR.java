/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUICHART.ClientPerServiceAndRoom;

/**
 *
 * @author TuiLaZit
 */
public class ModelDataCPSAR {
    int month;
    int countsv;
    int countroom;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getCountsv() {
        return countsv;
    }

    public void setCountsv(int countsv) {
        this.countsv = countsv;
    }

    public int getCountroom() {
        return countroom;
    }

    public void setCountroom(int countroom) {
        this.countroom = countroom;
    }

    public ModelDataCPSAR() {
    }

    public ModelDataCPSAR(int month, int countsv, int countroom) {
        this.month = month;
        this.countsv = countsv;
        this.countroom = countroom;
    }
    
}
