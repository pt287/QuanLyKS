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
        Refresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(220, 242, 197));
        setMaximumSize(null);
        setMinimumSize(null);
        setPreferredSize(new java.awt.Dimension(1720, 1020));

        CPMchart.setForeground(new java.awt.Color(0, 16, 31));

        CPMTable.setBackground(new java.awt.Color(220, 242, 197));
        CPMTable.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
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
        CPMTable.setRowHeight(57);
        jScrollPane1.setViewportView(CPMTable);
        CPMTable.getAccessibleContext().setAccessibleName("800");
        CPMTable.getAccessibleContext().setAccessibleDescription("700");

        Refresh.setBackground(new java.awt.Color(0, 16, 31));
        Refresh.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Refresh.setForeground(new java.awt.Color(220, 242, 197));
        Refresh.setText("Làm Mới");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(CPMchart, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CPMchart, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
        CPMchart.clear();
        DataTable();
        DataChart();
    }//GEN-LAST:event_RefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CPMTable;
    private GUICHART.raven.curvechart.CurveLineChart CPMchart;
    private javax.swing.JButton Refresh;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
