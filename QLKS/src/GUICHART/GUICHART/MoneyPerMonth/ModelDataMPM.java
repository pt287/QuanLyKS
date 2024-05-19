/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUICHART.MoneyPerMonth;

import GUICHART.ClientPerMonth.*;
import GUICHART.raven.curvechart.ModelChart;

/**
 *
 * @author TuiLaZit
 */
public class ModelDataMPM{

    public ModelDataMPM() {
    }

    public ModelDataMPM(int month, int money) {
        this.month = month;
        this.money = money;
    }

    int month;
    int money;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }


}
