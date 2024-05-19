/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.ChiTietHoaDonBUS;
import BUS.DichVuBUS;
import BUS.HoaDonBUS;
import DTO.ChiTietHoaDonInDTO;
import DTO.DichVuDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Phat
 */
public class DichVu extends javax.swing.JPanel {
    Menu menu;
    ArrayList<DichVuDTO> dsdv=new ArrayList<>();
    ArrayList<DichVuDTO> dvdd=new ArrayList<>();
    DichVuBUS datadv=new DichVuBUS();
    HoaDonBUS dataBill=new HoaDonBUS();
    ChiTietHoaDonBUS dataBD=new ChiTietHoaDonBUS();
    /**
     * Creates new form DichVu
     */
    public DichVu(Menu menu) {
        
        initComponents();
        this.menu=menu;
        CheckDV();
        
    }
    
    public void CheckDV(){
        dsdv=datadv.docDSDV();
        DefaultTableModel table=new DefaultTableModel();
        BangDichVu.setModel(table);
        table.addColumn("Mã Dich Vụ");
        table.addColumn("Tên Dịch Vụ");
        table.addColumn("Giá");
        BangDichVu.getTableHeader().setResizingAllowed(false);
        BangDichVu.setColumnSelectionAllowed(false);
        for(int i=0;i<=dsdv.size()-1;i++){
            DichVuDTO p=dsdv.get(i);
            table.addRow(new Object[]{p.getMaDichVu(),p.getTen(),p.getGia()});
        }
    }
    
    public void DichVuDD(){
        DefaultTableModel table=new DefaultTableModel();
        BangDVDD.setModel(table);
        table.addColumn("Mã Dịch Vụ");
        table.addColumn("Tên Dịch Vụ");
        table.addColumn("Giá");
        BangDVDD.getTableHeader().setResizingAllowed(false);
        BangDVDD.setColumnSelectionAllowed(false);
        for(int i=0;i<=dvdd.size()-1;i++){
            DichVuDTO p=dvdd.get(i);
            table.addRow(new Object[]{p.getMaDichVu(),p.getTen(),p.getGia()});
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DichVuPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BangDichVu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ButtonThem = new javax.swing.JButton();
        DVDaDat = new javax.swing.JLabel();
        ButtonXacNhan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        BangDVDD = new javax.swing.JTable();
        ButtonXoa = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1720, 1080));

        DichVuPanel.setBackground(new java.awt.Color(220, 242, 197));
        DichVuPanel.setMinimumSize(new java.awt.Dimension(1000, 1000));
        DichVuPanel.setPreferredSize(new java.awt.Dimension(1720, 1080));

        BangDichVu.setBackground(new java.awt.Color(220, 242, 197));
        BangDichVu.setForeground(new java.awt.Color(0, 16, 31));
        BangDichVu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Dịch Vụ", "Tên Dịch Vụ", "Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        jScrollPane1.setViewportView(BangDichVu);
        if (BangDichVu.getColumnModel().getColumnCount() > 0) {
            BangDichVu.getColumnModel().getColumn(0).setResizable(false);
            BangDichVu.getColumnModel().getColumn(1).setResizable(false);
            BangDichVu.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setBackground(new java.awt.Color(220, 242, 197));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 16, 31));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bảng Dịch Vụ");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 16, 31))); // NOI18N

        ButtonThem.setBackground(new java.awt.Color(220, 242, 197));
        ButtonThem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonThem.setForeground(new java.awt.Color(0, 16, 31));
        ButtonThem.setText("Thêm");
        ButtonThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonThemActionPerformed(evt);
            }
        });

        DVDaDat.setBackground(new java.awt.Color(220, 242, 197));
        DVDaDat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DVDaDat.setForeground(new java.awt.Color(0, 16, 31));
        DVDaDat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DVDaDat.setText("Dịch Vụ Đã Đặt");
        DVDaDat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 16, 31)));

        ButtonXacNhan.setBackground(new java.awt.Color(220, 242, 197));
        ButtonXacNhan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonXacNhan.setForeground(new java.awt.Color(0, 16, 31));
        ButtonXacNhan.setText("Xác Nhận");
        ButtonXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonXacNhanActionPerformed(evt);
            }
        });

        BangDVDD.setBackground(new java.awt.Color(220, 242, 197));
        BangDVDD.setForeground(new java.awt.Color(0, 16, 31));
        BangDVDD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Dịch Vụ", "Tên Dịch Vụ", "Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane2.setViewportView(BangDVDD);
        if (BangDVDD.getColumnModel().getColumnCount() > 0) {
            BangDVDD.getColumnModel().getColumn(0).setResizable(false);
            BangDVDD.getColumnModel().getColumn(1).setResizable(false);
            BangDVDD.getColumnModel().getColumn(2).setResizable(false);
        }

        ButtonXoa.setBackground(new java.awt.Color(220, 242, 197));
        ButtonXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonXoa.setForeground(new java.awt.Color(0, 16, 31));
        ButtonXoa.setText("Xóa");
        ButtonXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DichVuPanelLayout = new javax.swing.GroupLayout(DichVuPanel);
        DichVuPanel.setLayout(DichVuPanelLayout);
        DichVuPanelLayout.setHorizontalGroup(
            DichVuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DichVuPanelLayout.createSequentialGroup()
                .addGroup(DichVuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DichVuPanelLayout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(358, 358, 358)
                        .addComponent(DVDaDat, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DichVuPanelLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(DichVuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(DichVuPanelLayout.createSequentialGroup()
                                .addComponent(ButtonThem, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(70, 70, 70)
                        .addGroup(DichVuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(594, Short.MAX_VALUE))
        );

        DichVuPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        DichVuPanelLayout.setVerticalGroup(
            DichVuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DichVuPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(DichVuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DVDaDat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(DichVuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DichVuPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(DichVuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonThem, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(DichVuPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(326, Short.MAX_VALUE))
        );

        DichVuPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DichVuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DichVuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonXacNhanActionPerformed
        // TODO add your handling code here:
        for(int i=0;i<dsdv.size();i++){
            DichVuDTO addR = dsdv.get(i);
            ChiTietHoaDonInDTO BDadd = new ChiTietHoaDonInDTO();
            BDadd.setMaPhong("");
            BDadd.setMaHoaDon(dataBill.MaHDmax());
            BDadd.setMaDichVu(addR.getMaDichVu());
            dataBD.them(BDadd);
        }
        menu.ThoatDichVu();
    }//GEN-LAST:event_ButtonXacNhanActionPerformed

    private void ButtonXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonXoaActionPerformed
        // TODO add your handling code here:
        int a = BangDVDD.getSelectedRow();
        if(a==-1){
            JOptionPane.showMessageDialog(this,"Chưa chọn dịch vụ!","Lỗi",JOptionPane.ERROR_MESSAGE);
        }
        else{
            dvdd.remove(a);
            DichVuDD();
        }
    }//GEN-LAST:event_ButtonXoaActionPerformed

    private void ButtonThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonThemActionPerformed
        // TODO add your handling code here:
        int a = BangDichVu.getSelectedRow();
        if(a==-1){
            JOptionPane.showMessageDialog(this,"Chưa chọn dịch vụ!","Lỗi",JOptionPane.ERROR_MESSAGE);
        }
        else{
            String m = BangDichVu.getValueAt(a, 0).toString();  
            boolean checkdup = false;
            for(int i=0;i<dvdd.size();i++){
                DichVuDTO check = dvdd.get(i);
                if(check.getMaDichVu().equals(m)){
                    JOptionPane.showMessageDialog(this,"Dịch vụ này đã chọn này đã chọn!","Lỗi",JOptionPane.ERROR_MESSAGE);
                    checkdup=true;
                    break;
                }
            }
            if(!checkdup){
                for(int i=0;i<dsdv.size();i++){
                    DichVuDTO check = dsdv.get(i);
                    if(check.getMaDichVu().equals(m)){
                        dvdd.add(datadv.docdichvu(m));
                        break;
                    }
                }
            }
            DichVuDD();
        }
    }//GEN-LAST:event_ButtonThemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BangDVDD;
    private javax.swing.JTable BangDichVu;
    private javax.swing.JButton ButtonThem;
    private javax.swing.JButton ButtonXacNhan;
    private javax.swing.JButton ButtonXoa;
    private javax.swing.JLabel DVDaDat;
    private javax.swing.JPanel DichVuPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
