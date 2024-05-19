/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUICHART.ServiceRatio;
import BUS.ChiTietHoaDonBUS;
import GUICHART.piechart.ModelPieChart;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author TuiLaZit
 */
public class SR extends javax.swing.JPanel {

    /**
     * Creates new form SR
     */
    CardLayout layout;
    public SR() {
        initComponents();
        DataTable();
        DataChart();
        layout = new CardLayout();
    }

    private ArrayList setData(){
        ChiTietHoaDonBUS data= new ChiTietHoaDonBUS();
        ArrayList<SvcRatioModel> list = data.SvcRatio();
        return list;
    }
    
    private void DataTable(){
        ArrayList<SvcRatioModel> list = setData();
        DefaultTableModel table = new DefaultTableModel();
        SRTable.setModel(table);
        table.addColumn("Loại Phòng");
        table.addColumn("Lượng Khách");
        for(int i=0;i<=list.size()-1;i++){
            SvcRatioModel d = list.get(i);
            table.addRow(new Object[]{d.getName(),d.getScount()});
        }
    }
    
    private void DataChart(){
        List<SvcRatioModel> list = setData();
        int index = 0;
        for(int i=0;i<=list.size()-1;i++){
            if (index == 9) index = 0;
            SvcRatioModel d = list.get(i);
            SRchart.addData(new ModelPieChart(d.getName(), d.getScount(), getColor(index++)));
        }
    }
    
    private Color getColor(int index){
        Color[] color = new Color[]{new Color(196,107,81),new Color(78,117,102),new Color(108,70,117),new Color(211,110,112),new Color(93,155,155),new Color(96,111,140),new Color(161,35,18),new Color(236,124,38),new Color(100,36,36)};
        return color[index];
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SRchart = new GUICHART.piechart.PieChart();
        jScrollPane1 = new javax.swing.JScrollPane();
        SRTable = new javax.swing.JTable();
        Refresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(220, 242, 197));
        setForeground(new java.awt.Color(0, 0, 0));

        SRTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(SRTable);

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
                        .addComponent(SRchart, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Refresh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SRchart, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        // TODO add your handling code here:
        SRchart.clearData();
        DataTable();
        DataChart();
    }//GEN-LAST:event_RefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Refresh;
    private javax.swing.JTable SRTable;
    private GUICHART.piechart.PieChart SRchart;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}