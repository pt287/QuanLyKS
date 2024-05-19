/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUICHART.ClientPerServiceAndRoom;

import GUICHART.MoneyPerMonth.*;
import GUICHART.ClientPerMonth.*;
import java.awt.Color;
import BUS.HoaDonBUS;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import GUICHART.barchart.ModelChart;
import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TuiLaZit
 */
public class CPSAR extends javax.swing.JPanel {

    /**
     * Creates new form CPMChart
     */
    CardLayout layout;
    public CPSAR() {
        initComponents();
        CPSARchart.setFont(new java.awt.Font("sansserif",0,14));
        CPSARchart.addLegend("Dịch Vụ", Color.decode("#C46B51"));
        CPSARchart.addLegend("Phòng", Color.decode("#4E7566"));
        DataChart();
        DataTable();
        layout=new CardLayout();
    }
    
    private ArrayList setData(){
        ArrayList<ModelDataCPSAR> list= new ArrayList<>();
        HoaDonBUS hd = new HoaDonBUS();
        int[][] arr = hd.CPSAR();
        for(int i=0;i<12;i++){
            list.add(new ModelDataCPSAR(i+1,arr[i][0] ,arr[i][1]));
        }
        return list;
    }
    
    private void DataTable(){
        ArrayList<ModelDataCPSAR> list = setData();
        //initComponents();
        DefaultTableModel table = new DefaultTableModel();
        CPSARtable.setModel(table);
        table.addColumn("Tháng");
        table.addColumn("Lượng Dịch Vụ");
        table.addColumn("Lượng Phòng");
        for(int i=0;i<=list.size()-1;i++){
            ModelDataCPSAR d= list.get(i);
            table.addRow(new Object[]{d.getMonth(),d.getCountsv(),d.getCountroom()});
        }
    }
    
    
    private void DataChart(){
        ArrayList<ModelDataCPSAR> list = setData();
        for(int i=0;i<=list.size()-1;i++){
            ModelDataCPSAR d = list.get(i);
            String name = "Tháng " + d.getMonth();
            CPSARchart.addData(new ModelChart(name, new double[]{(double)d.getCountsv(),(double)d.getCountroom()}));
        }
        CPSARchart.start();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        CPSARtable = new javax.swing.JTable();
        CPSARchart = new GUICHART.barchart.Chart();
        Refresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(220, 242, 197));
        setPreferredSize(new java.awt.Dimension(1720, 1020));

        CPSARtable.setBackground(new java.awt.Color(220, 242, 197));
        CPSARtable.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        CPSARtable.setForeground(new java.awt.Color(0, 16, 31));
        CPSARtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Tháng", "Lượng Dịch Vụ", "Lượng Phòng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CPSARtable.setRowHeight(57);
        jScrollPane2.setViewportView(CPSARtable);
        if (CPSARtable.getColumnModel().getColumnCount() > 0) {
            CPSARtable.getColumnModel().getColumn(0).setResizable(false);
            CPSARtable.getColumnModel().getColumn(1).setResizable(false);
            CPSARtable.getColumnModel().getColumn(2).setResizable(false);
        }

        CPSARchart.setBackground(new java.awt.Color(220, 242, 197));
        CPSARchart.setForeground(new java.awt.Color(0, 16, 31));

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Refresh)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CPSARchart, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Refresh)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CPSARchart, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
        CPSARchart.clear();
        DataTable();
        DataChart();
    }//GEN-LAST:event_RefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUICHART.barchart.Chart CPSARchart;
    private javax.swing.JTable CPSARtable;
    private javax.swing.JButton Refresh;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
