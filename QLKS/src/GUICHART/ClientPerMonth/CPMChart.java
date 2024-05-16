/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUICHART.ClientPerMonth;

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
public class CPMChart extends javax.swing.JPanel {

    /**
     * Creates new form CPMChart
     */
    CardLayout layout;
    public CPMChart() {
        initComponents();
        DataTable();
        DataChart();
        layout=new CardLayout();
    }
    
    private ArrayList setData(){
        ArrayList<ModelDataCPM> list = new ArrayList<>();
        HoaDonBUS hd = new HoaDonBUS();
        int[] arr = hd.CPMBUS();
        for (int i=0;i<12;i++){
            list.add(new ModelDataCPM(i+1,arr[i]));
        }
        return list;
    }
    
    private void DataTable(){
        ArrayList<ModelDataCPM> list = setData();
        initComponents();
        DefaultTableModel table = new DefaultTableModel();
        CPMTable.setModel(table);
        table.addColumn("Tháng");
        table.addColumn("Số Lượng Khách");
        for(int i=0;i<=list.size()-1;i++){
            ModelDataCPM d= list.get(i);
            table.addRow(new Object[]{d.getMonth(),d.getCount()});
        }
    }
    
    private void DataChart(){
        CPMchart.setTitle("Lượng hóa đơn trên tháng");
        CPMchart.addLegend("hóa đơn", Color.decode("#C46B51"), Color.decode("#C46B51"));
        ArrayList<ModelDataCPM> list = setData();
        for(int i=0;i<=list.size()-1;i++){
            ModelDataCPM d= list.get(i);
            String name = "Tháng " + d.getMonth();
            CPMchart.addData(new ModelChart(name, new double[]{d.getCount()}));
        }
        CPMchart.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CPMchart = new GUICHART.raven.curvechart.CurveLineChart();
        jScrollPane1 = new javax.swing.JScrollPane();
        CPMTable = new javax.swing.JTable();

        setBackground(new java.awt.Color(220, 242, 197));
        setPreferredSize(new java.awt.Dimension(1720, 1020));

        CPMchart.setForeground(new java.awt.Color(0, 16, 31));

        CPMTable.setBackground(new java.awt.Color(220, 242, 197));
        CPMTable.setFont(new java.awt.Font("Segoe UI", 0, 26)); // NOI18N
        CPMTable.setForeground(new java.awt.Color(0, 16, 31));
        CPMTable.setModel(new javax.swing.table.DefaultTableModel(
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
        CPMTable.setRowHeight(76);
        jScrollPane1.setViewportView(CPMTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CPMchart, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CPMchart, javax.swing.GroupLayout.PREFERRED_SIZE, 937, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 937, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CPMTable;
    private GUICHART.raven.curvechart.CurveLineChart CPMchart;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
