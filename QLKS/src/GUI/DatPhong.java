/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import java.util.Date;
import BUS.PhongBUS;
import DTO.Phong.PhongDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DatPhong extends javax.swing.JPanel {
    ArrayList<PhongDTO> p = new ArrayList<>();
    PhongBUS data = new PhongBUS();
    Menu menu;
     /**
     * Creates new form DatPhong
     */
    public DatPhong(Menu m) {
        initComponents();        
        this.menu=m;
        if(menu.getDatein()!=null && menu.getDateout()!=null){
            DateIn.setDate(menu.getDatein());
            DateOut.setDate(menu.getDateout());
        }
        
   }

    public void CheckPhong(Date in, Date out,String type){
        ArrayList<PhongDTO> list = data.DatPhong(in, out);
        DefaultTableModel table = new DefaultTableModel();
        KQPhong.setModel(table);
        table.addColumn("Loại Phòng");
        table.addColumn("Mã phòng");
        table.addColumn("Số Phòng");
        table.addColumn("Giá Tiền");
        for(int i=0;i<=list.size()-1;i++){
            PhongDTO d = list.get(i);
            String LPhong = d.getMaPhong().substring(0, 3);
            if(LPhong.equals(type)&&d.getTinhTrang().equals("R")){
                table.addRow(new Object[]{LPhong,d.getMaPhong(),d.getSoPhong(),d.getDonGia()});
            }
        }
    }
    
    public void DatPhong(){
        DefaultTableModel table = new DefaultTableModel();
        PhongDaDat.setModel(table);
        table.addColumn("Loại Phòng");
        table.addColumn("Mã phòng");
        table.addColumn("Số Phòng");
        table.addColumn("Giá Tiền");
        for(int i=0;i<=p.size()-1;i++){
            PhongDTO d = p.get(i);
            String LPhong = d.getMaPhong().substring(0, 3);
            table.addRow(new Object[]{LPhong,d.getMaPhong(),d.getSoPhong(),d.getDonGia()});
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

        jPanel1 = new javax.swing.JPanel();
        LoaiPhong = new javax.swing.JLabel();
        NgayNhan = new javax.swing.JLabel();
        NgayTra = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        KQPhong = new javax.swing.JTable();
        BangPhong = new javax.swing.JComboBox<>();
        Add = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        PhongDaDat = new javax.swing.JTable();
        DSPhongDaDat = new javax.swing.JLabel();
        DateIn = new com.toedter.calendar.JDateChooser();
        DateOut = new com.toedter.calendar.JDateChooser();
        Search = new javax.swing.JButton();
        Sub = new javax.swing.JButton();
        Confirm = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1720, 1080));

        jPanel1.setBackground(new java.awt.Color(220, 242, 197));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 860));

        LoaiPhong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LoaiPhong.setForeground(new java.awt.Color(0, 16, 31));
        LoaiPhong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoaiPhong.setText("Loại Phòng");
        LoaiPhong.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 16, 31))); // NOI18N

        NgayNhan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NgayNhan.setForeground(new java.awt.Color(0, 16, 31));
        NgayNhan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NgayNhan.setText("Ngày Nhận");
        NgayNhan.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 16, 31))); // NOI18N

        NgayTra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NgayTra.setForeground(new java.awt.Color(0, 16, 31));
        NgayTra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NgayTra.setText("Ngày Trả");
        NgayTra.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 16, 31))); // NOI18N

        KQPhong.setBackground(new java.awt.Color(220, 242, 197));
        KQPhong.setForeground(new java.awt.Color(0, 16, 31));
        KQPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loại Phòng", "Mã Phòng", "Số Phòng", "Giá Tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        KQPhong.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(KQPhong);
        if (KQPhong.getColumnModel().getColumnCount() > 0) {
            KQPhong.getColumnModel().getColumn(0).setResizable(false);
            KQPhong.getColumnModel().getColumn(0).setPreferredWidth(10);
            KQPhong.getColumnModel().getColumn(1).setResizable(false);
            KQPhong.getColumnModel().getColumn(2).setResizable(false);
            KQPhong.getColumnModel().getColumn(3).setResizable(false);
        }

        BangPhong.setBackground(new java.awt.Color(220, 242, 197));
        BangPhong.setEditable(true);
        BangPhong.setForeground(new java.awt.Color(0, 16, 31));
        BangPhong.setMaximumRowCount(6);
        BangPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PSD", "VIP", "1SB", "2SB", "1DB", "2DB" }));

        Add.setBackground(new java.awt.Color(220, 242, 197));
        Add.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Add.setForeground(new java.awt.Color(0, 1, 15));
        Add.setText("Thêm");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        PhongDaDat.setBackground(new java.awt.Color(220, 242, 197));
        PhongDaDat.setForeground(new java.awt.Color(0, 16, 31));
        PhongDaDat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loại Phòng", "Mã Phòng", "Số Phòng", "Giá Tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PhongDaDat.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(PhongDaDat);
        if (PhongDaDat.getColumnModel().getColumnCount() > 0) {
            PhongDaDat.getColumnModel().getColumn(0).setResizable(false);
            PhongDaDat.getColumnModel().getColumn(1).setResizable(false);
            PhongDaDat.getColumnModel().getColumn(2).setResizable(false);
            PhongDaDat.getColumnModel().getColumn(3).setResizable(false);
        }

        DSPhongDaDat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DSPhongDaDat.setForeground(new java.awt.Color(0, 16, 31));
        DSPhongDaDat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DSPhongDaDat.setText("Danh Sách Phòng Đã Đặt");
        DSPhongDaDat.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 16, 31))); // NOI18N

        DateOut.setEnabled(false);

        Search.setText("Tìm Kiếm");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        Sub.setBackground(new java.awt.Color(220, 242, 197));
        Sub.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Sub.setForeground(new java.awt.Color(0, 1, 15));
        Sub.setText("Xóa");
        Sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubActionPerformed(evt);
            }
        });

        Confirm.setBackground(new java.awt.Color(220, 242, 197));
        Confirm.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Confirm.setForeground(new java.awt.Color(0, 1, 15));
        Confirm.setText("Hoàn Thành");
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(426, 426, 426)
                        .addComponent(Sub, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BangPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(75, 75, 75)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(NgayNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DateIn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(67, 67, 67)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(NgayTra, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DateOut, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DSPhongDaDat, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(645, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NgayTra)
                            .addComponent(NgayNhan)
                            .addComponent(LoaiPhong))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BangPhong)
                            .addComponent(DateIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DateOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(DSPhongDaDat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sub, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 220, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        // TODO add your handling code here:
        String LPhong = (String)BangPhong.getSelectedItem();
        Date in = DateIn.getDate();
        Date out = DateOut.getDate();
        CheckPhong(in, out, LPhong);
    }//GEN-LAST:event_SearchActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        int a = KQPhong.getSelectedRow();
        if(a==-1){
            JOptionPane.showMessageDialog(this,"Chưa chọn phòng!","Lỗi",JOptionPane.ERROR_MESSAGE);
        }
        else{
            String mp = KQPhong.getValueAt(a, 0).toString();
            p.add(data.docphong(mp));
        }
        DatPhong();
    }//GEN-LAST:event_AddActionPerformed

    private void SubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubActionPerformed
        // TODO add your handling code here:
        int a = PhongDaDat.getSelectedRow();
        if(a==-1){
            JOptionPane.showMessageDialog(this,"Chưa chọn phòng!","Lỗi",JOptionPane.ERROR_MESSAGE);
        }
        else{
            String mp = KQPhong.getValueAt(a, 0).toString();
            p.remove(a);
        }
        DatPhong();
    }//GEN-LAST:event_SubActionPerformed

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
        // TODO add your handling code here:
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i<PhongDaDat.getRowCount();i++){
            list.add(PhongDaDat.getValueAt(i, 0).toString());
        }
        menu.setMaphong(list);
        menu.ThoatDatPhong();
    }//GEN-LAST:event_ConfirmActionPerformed
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JComboBox<String> BangPhong;
    private javax.swing.JButton Confirm;
    private javax.swing.JLabel DSPhongDaDat;
    private com.toedter.calendar.JDateChooser DateIn;
    private com.toedter.calendar.JDateChooser DateOut;
    private javax.swing.JTable KQPhong;
    private javax.swing.JLabel LoaiPhong;
    private javax.swing.JLabel NgayNhan;
    private javax.swing.JLabel NgayTra;
    private javax.swing.JTable PhongDaDat;
    private javax.swing.JButton Search;
    private javax.swing.JButton Sub;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
