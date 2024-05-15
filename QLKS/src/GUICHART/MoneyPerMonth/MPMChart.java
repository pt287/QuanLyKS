/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUICHART.MoneyPerMonth;

import GUICHART.ClientPerMonth.*;
import java.awt.Color;
import BUS.HoaDonBUS;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import GUICHART.raven.curvechart.ModelChart;
import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TuiLaZit
 */
public class MPMChart extends javax.swing.JPanel {

    /**
     * Creates new form CPMChart
     */
    CardLayout layout;
    public MPMChart() {
        initComponents();
        DataTable();
        DataChart();
        layout=new CardLayout();
    }
    
    private ArrayList setData(){
        ArrayList<ModelDataMPM> list = new ArrayList<>();
        HoaDonBUS hd = new HoaDonBUS();
        int[] arr = hd.MPMBUS();
        for (int i=0;i<12;i++){
            list.add(new ModelDataMPM(i+1,arr[i]));
        }
        return list;
    }
    
    private void DataTable(){
        ArrayList<ModelDataMPM> list = setData();
        DefaultTableModel table = new DefaultTableModel();
        MPMTable.setModel(table);
        table.addColumn("Tháng ");
        table.addColumn("Thu Nhập");
        for(int i=0;i<=list.size()-1;i++){
            ModelDataMPM d= list.get(i);
            table.addRow(new Object[]{d.getMonth(),d.getMoney()});
        }
    }
    
    private void DataChart(){
        MPMchart.setTitle("Lượng hóa đơn trên tháng");
        MPMchart.addLegend("hóa đơn", Color.decode("#C46B51"), Color.decode("#C46B51"));
        List<ModelDataMPM> list = setData();
        for(int i=0;i<=list.size()-1;i++){
            ModelDataMPM d= list.get(i);
            String name = "Tháng " + d.getMonth();
            MPMchart.addData(new ModelChart(name, new double[]{d.getMoney()}));
        }
        MPMchart.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MPMchart = new GUICHART.raven.curvechart.CurveLineChart();
        jScrollPane1 = new javax.swing.JScrollPane();
        MPMTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(220, 242, 197));
        setPreferredSize(new java.awt.Dimension(1720, 1020));

        MPMchart.setForeground(new java.awt.Color(0, 16, 31));

        MPMTable.setBackground(new java.awt.Color(220, 242, 197));
        MPMTable.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        MPMTable.setForeground(new java.awt.Color(0, 16, 31));
        MPMTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Tháng", "Số lượng khách"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        MPMTable.setRowHeight(76);
        jScrollPane1.setViewportView(MPMTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MPMchart, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {MPMchart, jScrollPane1});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MPMchart, javax.swing.GroupLayout.PREFERRED_SIZE, 937, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 937, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable MPMTable;
    private GUICHART.raven.curvechart.CurveLineChart MPMchart;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
