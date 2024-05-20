/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import BUS.PhongBUS;
import DTO.Phong.PhongDTO;
import DTO.Phong.PhongThuongDTO;
import DTO.Phong.PhongVipDTO;
import Excel.ExcelIn;
import Excel.ExcelOut;
import Excel.ModelExcelIn;
/**
 *
 * @author Phat
 */
public class DSPhong extends javax.swing.JPanel {
    boolean DangSua=false;
    PhongBUS phong=new PhongBUS();
    ArrayList<PhongDTO> dsphong;
    /**
     * Creates new form DSPhong
     */
    public DSPhong() {
        initComponents();
        dsphong= phong.docDSPhong();
        initComponents();
        TaoBang();
    }
    public void TaoBang(){
        DefaultTableModel table=new DefaultTableModel();
        BangDSPhong.setModel(table);
        table.addColumn("Mã Phòng");
        table.addColumn( "Số Phòng");
        table.addColumn("Loại Phòng");
        table.addColumn("Tình Trạng");
        table.addColumn("Giá");
        for(PhongDTO p:dsphong){
            if (p.getMaPhong().substring(0, 3).equals("VIP")) {
                PhongVipDTO pv=(PhongVipDTO)p;
                table.addRow(new Object[]{pv.getMaPhong(),pv.getSoPhong(),"VIP",pv.getTinhTrang(),pv.getDonGia()});
            }else{
                PhongThuongDTO pt=(PhongThuongDTO)p;
                table.addRow(new Object[]{pt.getMaPhong(),pt.getSoPhong(),pt.getKieuPhong(),pt.getTinhTrang(),pt.getDonGia()});
            }
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
        jScrollPane2 = new javax.swing.JScrollPane();
        BangDSPhong = new javax.swing.JTable();
        TextDSP = new javax.swing.JLabel();
        PanelChinhSua = new javax.swing.JPanel();
        TextMaPhongAn = new javax.swing.JLabel();
        TextGia = new javax.swing.JLabel();
        TextTinhTrang = new javax.swing.JLabel();
        TextGhiChu = new javax.swing.JLabel();
        TextSoPhong = new javax.swing.JLabel();
        MaPhongAn = new javax.swing.JTextField();
        SoPhong = new javax.swing.JTextField();
        GhiChu = new javax.swing.JTextField();
        Gia = new javax.swing.JTextField();
        ButtonChinhSua = new javax.swing.JButton();
        ButtonXacNhan = new javax.swing.JButton();
        TinhTrang = new javax.swing.JComboBox<>();
        JLabel007 = new javax.swing.JLabel();
        XuatExcel = new javax.swing.JButton();
        NhapExcel = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1720, 1080));

        jPanel1.setBackground(new java.awt.Color(220, 242, 197));

        BangDSPhong.setBackground(new java.awt.Color(220, 242, 197));
        BangDSPhong.setForeground(new java.awt.Color(0, 16, 31));
        BangDSPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, null, null, null},
                {"", null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Phòng", "Số Phòng", "Loại Phòng", "Tình Trạng", "Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BangDSPhong.setToolTipText("");
        BangDSPhong.setAutoscrolls(false);
        BangDSPhong.setMinimumSize(new java.awt.Dimension(1720, 1020));
        BangDSPhong.setPreferredSize(new java.awt.Dimension(1720, 1020));
        BangDSPhong.getTableHeader().setReorderingAllowed(false);
        BangDSPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BangDSPhongMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(BangDSPhong);
        if (BangDSPhong.getColumnModel().getColumnCount() > 0) {
            BangDSPhong.getColumnModel().getColumn(0).setResizable(false);
            BangDSPhong.getColumnModel().getColumn(1).setResizable(false);
            BangDSPhong.getColumnModel().getColumn(2).setResizable(false);
            BangDSPhong.getColumnModel().getColumn(3).setResizable(false);
            BangDSPhong.getColumnModel().getColumn(4).setResizable(false);
        }

        TextDSP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TextDSP.setForeground(new java.awt.Color(0, 16, 31));
        TextDSP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextDSP.setText("Danh Sách Phòng");
        TextDSP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 16, 31))); // NOI18N

        PanelChinhSua.setBackground(new java.awt.Color(220, 242, 197));
        PanelChinhSua.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        TextMaPhongAn.setForeground(new java.awt.Color(0, 16, 31));
        TextMaPhongAn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextMaPhongAn.setText("Mã Phòng Ăn");
        TextMaPhongAn.setToolTipText("");
        TextMaPhongAn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TextGia.setForeground(new java.awt.Color(0, 16, 31));
        TextGia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextGia.setText("Giá");
        TextGia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TextTinhTrang.setForeground(new java.awt.Color(0, 16, 31));
        TextTinhTrang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextTinhTrang.setText("Tình Trạng");
        TextTinhTrang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TextGhiChu.setForeground(new java.awt.Color(0, 16, 31));
        TextGhiChu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextGhiChu.setText("Ghi chú");
        TextGhiChu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TextSoPhong.setForeground(new java.awt.Color(0, 16, 31));
        TextSoPhong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TextSoPhong.setText("Số Phòng");
        TextSoPhong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        MaPhongAn.setBackground(new java.awt.Color(220, 242, 197));
        MaPhongAn.setForeground(new java.awt.Color(0, 16, 31));

        SoPhong.setBackground(new java.awt.Color(220, 242, 197));
        SoPhong.setForeground(new java.awt.Color(0, 16, 31));

        GhiChu.setBackground(new java.awt.Color(220, 242, 197));
        GhiChu.setForeground(new java.awt.Color(0, 16, 31));

        Gia.setBackground(new java.awt.Color(220, 242, 197));
        Gia.setForeground(new java.awt.Color(0, 16, 31));

        ButtonChinhSua.setBackground(new java.awt.Color(220, 242, 197));
        ButtonChinhSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonChinhSua.setForeground(new java.awt.Color(0, 16, 31));
        ButtonChinhSua.setText("Chỉnh Sửa");
        ButtonChinhSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonChinhSuaActionPerformed(evt);
            }
        });

        ButtonXacNhan.setBackground(new java.awt.Color(220, 242, 197));
        ButtonXacNhan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonXacNhan.setForeground(new java.awt.Color(0, 16, 31));
        ButtonXacNhan.setText("Xác Nhận");
        ButtonXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonXacNhanActionPerformed(evt);
            }
        });

        TinhTrang.setBackground(new java.awt.Color(220, 242, 197));
        TinhTrang.setForeground(new java.awt.Color(0, 16, 31));
        TinhTrang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "R", "C", "F" }));
        TinhTrang.setToolTipText("");
        TinhTrang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TinhTrangActionPerformed(evt);
            }
        });

        JLabel007.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JLabel007.setForeground(new java.awt.Color(0, 16, 31));
        JLabel007.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabel007.setText("Chi Tiết Phòng");
        JLabel007.setToolTipText("");

        javax.swing.GroupLayout PanelChinhSuaLayout = new javax.swing.GroupLayout(PanelChinhSua);
        PanelChinhSua.setLayout(PanelChinhSuaLayout);
        PanelChinhSuaLayout.setHorizontalGroup(
            PanelChinhSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChinhSuaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(PanelChinhSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelChinhSuaLayout.createSequentialGroup()
                        .addComponent(ButtonChinhSua, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(ButtonXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelChinhSuaLayout.createSequentialGroup()
                        .addComponent(TextGia, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(Gia, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelChinhSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelChinhSuaLayout.createSequentialGroup()
                            .addGroup(PanelChinhSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TextGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextTinhTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(26, 26, 26)
                            .addGroup(PanelChinhSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(GhiChu)
                                .addComponent(TinhTrang, 0, 240, Short.MAX_VALUE)))
                        .addGroup(PanelChinhSuaLayout.createSequentialGroup()
                            .addGroup(PanelChinhSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TextMaPhongAn, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextSoPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(26, 26, 26)
                            .addGroup(PanelChinhSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(SoPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(MaPhongAn, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelChinhSuaLayout.createSequentialGroup()
                        .addComponent(JLabel007, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        PanelChinhSuaLayout.setVerticalGroup(
            PanelChinhSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelChinhSuaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(JLabel007, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelChinhSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MaPhongAn, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(TextMaPhongAn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(PanelChinhSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextSoPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SoPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(PanelChinhSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(PanelChinhSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextTinhTrang, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(TinhTrang))
                .addGap(40, 40, 40)
                .addGroup(PanelChinhSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextGia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(PanelChinhSuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonChinhSua, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        XuatExcel.setBackground(new java.awt.Color(220, 242, 197));
        XuatExcel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        XuatExcel.setForeground(new java.awt.Color(0, 16, 31));
        XuatExcel.setText("Xuất");
        XuatExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XuatExcelActionPerformed(evt);
            }
        });

        NhapExcel.setBackground(new java.awt.Color(220, 242, 197));
        NhapExcel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NhapExcel.setForeground(new java.awt.Color(0, 16, 31));
        NhapExcel.setText("Nhập");
        NhapExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NhapExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(TextDSP, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NhapExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(XuatExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addComponent(PanelChinhSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(645, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextDSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(NhapExcel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(XuatExcel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelChinhSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(410, 410, 410))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BangDSPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BangDSPhongMouseClicked
        // TODO add your handling code here:
        DangSua=false;
        JLabel007.setText("Chi Tiết Phòng");
        dsphong=phong.docDSPhong();
        for(PhongDTO p:dsphong){
            if(p.getMaPhong().equals(BangDSPhong.getValueAt(BangDSPhong.getSelectedRow(), 0).toString())){
                SoPhong.setText(p.getSoPhong());
                GhiChu.setText(p.getGhiChu());
                Gia.setText(String.valueOf(p.getDonGia()));
                if (p.getMaPhong().substring(0, 3).equals("VIP")) {
                    PhongVipDTO pv=(PhongVipDTO)p;
                    MaPhongAn.setText(pv.getMaPhongAn());
                }else{
                    MaPhongAn.setText("Không có");
                }
                switch (p.getTinhTrang()) {
                    case "R":
                        TinhTrang.setSelectedIndex(0);;
                        break;
                    case "C":
                        TinhTrang.setSelectedIndex(1);
                        break;
                    case "F":
                        TinhTrang.setSelectedIndex(2);;
                        break;                      
                    default:
                        break;
                }
            }
        }
    }//GEN-LAST:event_BangDSPhongMouseClicked

    private void TinhTrangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TinhTrangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TinhTrangActionPerformed

    private void ButtonChinhSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonChinhSuaActionPerformed
        // TODO add your handling code here:
        if (BangDSPhong.getSelectedRow() >= 0) {
            DangSua=true;
            JLabel007.setText("Cập Nhập Phòng");
        }else{
            JOptionPane.showMessageDialog(this, "Bạn chưa chọn phòng!!",  "lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ButtonChinhSuaActionPerformed

    private void ButtonXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonXacNhanActionPerformed
        // TODO add your handling code here:
        if (DangSua) {
            PhongDTO p=new PhongDTO();
            for(PhongDTO a:dsphong){
                if(a.getMaPhong().equals(BangDSPhong.getValueAt(BangDSPhong.getSelectedRow(), 0).toString())){
                    if (a.getMaPhong().substring(0, 3).equals("VIP")) {
                        PhongVipDTO pv=(PhongVipDTO)a;
                        pv.setDonGia(Integer.parseInt(Gia.getText()));
                        pv.setMaPhongAn(MaPhongAn.getText());
                        pv.setGhiChu(GhiChu.getText());
                        pv.setSoPhong(SoPhong.getText());
                        pv.setTinhTrang((String)TinhTrang.getSelectedItem());
                        p=pv;
                    }else{
                        PhongThuongDTO pt=(PhongThuongDTO)a;
                        pt.setDonGia(Integer.parseInt(Gia.getText()));
                        pt.setGhiChu(GhiChu.getText());
                        pt.setSoPhong(SoPhong.getText());
                        pt.setTinhTrang((String)TinhTrang.getSelectedItem());
                        p=pt;
                    }
                }
            }
            phong.Sua(BangDSPhong.getValueAt(BangDSPhong.getSelectedRow(), 0).toString(), p);
        }else{
            JOptionPane.showMessageDialog(this, "Chỉnh sửa mới có thể xác nhận!", "lỗi", JOptionPane.ERROR_MESSAGE);
        }
        TaoBang();
    }//GEN-LAST:event_ButtonXacNhanActionPerformed

    private void XuatExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XuatExcelActionPerformed
        // TODO add your handling code here:
        ExcelOut ex = new ExcelOut();
        ex.XuatExcel(dsphong);
    }//GEN-LAST:event_XuatExcelActionPerformed

    private void NhapExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NhapExcelActionPerformed
        // TODO add your handling code here:
        ExcelIn ex=new ExcelIn();
        String a="excelRoom.xlsx";
        phong.DocExcel(ex.NhapPhong(a));
        JOptionPane.showMessageDialog(this, "Nhập thành công file <3 " + a);
        TaoBang();
    }//GEN-LAST:event_NhapExcelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BangDSPhong;
    private javax.swing.JButton ButtonChinhSua;
    private javax.swing.JButton ButtonXacNhan;
    private javax.swing.JTextField GhiChu;
    private javax.swing.JTextField Gia;
    private javax.swing.JLabel JLabel007;
    private javax.swing.JTextField MaPhongAn;
    private javax.swing.JButton NhapExcel;
    private javax.swing.JPanel PanelChinhSua;
    private javax.swing.JTextField SoPhong;
    private javax.swing.JLabel TextDSP;
    private javax.swing.JLabel TextGhiChu;
    private javax.swing.JLabel TextGia;
    private javax.swing.JLabel TextMaPhongAn;
    private javax.swing.JLabel TextSoPhong;
    private javax.swing.JLabel TextTinhTrang;
    private javax.swing.JComboBox<String> TinhTrang;
    private javax.swing.JButton XuatExcel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
