/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUICHART.ClientPerMonth;

import GUICHART.raven.curvechart.ModelChart;

/**
 *
 * @author TuiLaZit
 */
public class ModelDataCPM{

    public ModelDataCPM() {
    }

    public ModelDataCPM(int month, int count) {
        this.month = month;
        this.count = count;
    }

    int month;
    int count;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


}
