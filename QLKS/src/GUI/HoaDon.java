/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import GUI.DichVu;
import DTO.HoaDonDTO;
import DTO.HoaDonInDTO;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import BUS.HoaDonBUS;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Phat
 */
public class HoaDon extends javax.swing.JPanel {
    Menu menu;
    HoaDonBUS hd=new HoaDonBUS();
    ArrayList<HoaDonDTO> dshd;
    public LocalDate DateInFHD;
    public LocalDate DateOutFHD;
    /**
     * Creates new form HoaDon
     */
    public HoaDon(Menu menu) {
        initComponents();
        dshd= hd.docDSHD();
        this.menu = menu;
        TaoBangHd();
        TaoBangcthd();

        

        
    }
    public void TaoBangHd(){
        DefaultTableModel table= new DefaultTableModel();
        BangHoaDon.setModel(table);
        table.addColumn("Mã hóa đơn");
        table.addColumn("Mã khách hàng");
        table.addColumn("Mã nhân viên");
        table.addColumn("Ngày nhận");
        table.addColumn("Ngày trả");
        BangHoaDon.getTableHeader().setResizingAllowed(false);
        BangHoaDon.setColumnSelectionAllowed(false);
        for(HoaDonDTO p:dshd){
            table.addRow(new Object[]{p.getMaHoaDon(),p.getMaKhachHang(),p.getMaNhanVien(),p.getNgayNhan(),p.getNgayTra()});
        }

    }
    public void TaoBangcthd(){
        DefaultTableModel table=new DefaultTableModel();
        BangCTHD.setModel(table);
        table.addColumn("Mã Phòng");
        table.addColumn("Mã Dich Vụ");
        table.addColumn("Giá");
        BangCTHD.getTableHeader().setResizingAllowed(false);
        BangCTHD.setColumnSelectionAllowed(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HoaDonPanel = new javax.swing.JPanel();
        LabelCTHD = new javax.swing.JLabel();
        LabelTKHD = new javax.swing.JLabel();
        NhapTimKiem = new javax.swing.JTextField();
        ButtonChinhSuaHD = new javax.swing.JButton();
        Button = new javax.swing.JButton();
        ButtonXuatHD = new javax.swing.JButton();
        ButtonThemDV = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BangCTHD = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        BangHoaDon = new javax.swing.JTable();
        NhapTimKiem1 = new javax.swing.JTextField();
        NhapTimKiem2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        LabelDatPhong = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        MaKhachHang = new javax.swing.JTextField();
        MaNhanVien = new javax.swing.JTextField();
        NhapNgayNhan = new javax.swing.JTextField();
        NhapNgayTra = new javax.swing.JTextField();
        NhapThangNhan = new javax.swing.JTextField();
        NhapThangTra = new javax.swing.JTextField();
        NhapNamNhan = new javax.swing.JTextField();
        NhapNamTra = new javax.swing.JTextField();
        ButtonThemPhong = new javax.swing.JButton();
        ButtonTaoHD = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1720, 1080));

        HoaDonPanel.setBackground(new java.awt.Color(220, 242, 197));
        HoaDonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        HoaDonPanel.setMaximumSize(new java.awt.Dimension(1720, 1080));
        HoaDonPanel.setMinimumSize(new java.awt.Dimension(1720, 1080));
        HoaDonPanel.setPreferredSize(new java.awt.Dimension(1720, 860));

        LabelCTHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelCTHD.setForeground(new java.awt.Color(0, 16, 31));
        LabelCTHD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelCTHD.setText("Chi Tiết Hóa Đơn");
        LabelCTHD.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 16, 31))); // NOI18N

        LabelTKHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelTKHD.setForeground(new java.awt.Color(0, 16, 31));
        LabelTKHD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTKHD.setText("Tìm Kiếm Hóa Đơn");
        LabelTKHD.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 16, 31))); // NOI18N

        NhapTimKiem.setBackground(new java.awt.Color(220, 242, 197));
        NhapTimKiem.setForeground(new java.awt.Color(0, 16, 31));
        NhapTimKiem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 16, 31), 2));
        NhapTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NhapTimKiemKeyReleased(evt);
            }
        });

        ButtonChinhSuaHD.setBackground(new java.awt.Color(220, 242, 197));
        ButtonChinhSuaHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonChinhSuaHD.setForeground(new java.awt.Color(0, 16, 31));
        ButtonChinhSuaHD.setText("Chỉnh Sửa Hóa Đơn");
        ButtonChinhSuaHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonChinhSuaHDActionPerformed(evt);
            }
        });

        Button.setBackground(new java.awt.Color(220, 242, 197));
        Button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Button.setForeground(new java.awt.Color(0, 16, 31));
        Button.setText("♥");
        Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActionPerformed(evt);
            }
        });

        ButtonXuatHD.setBackground(new java.awt.Color(220, 242, 197));
        ButtonXuatHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonXuatHD.setForeground(new java.awt.Color(0, 16, 31));
        ButtonXuatHD.setText("Xuất Hóa Đơn");

        ButtonThemDV.setBackground(new java.awt.Color(220, 242, 197));
        ButtonThemDV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonThemDV.setForeground(new java.awt.Color(0, 16, 31));
        ButtonThemDV.setText("Thêm Dịch Vụ");
        ButtonThemDV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonThemDVActionPerformed(evt);
            }
        });

        BangCTHD.setBackground(new java.awt.Color(220, 242, 197));
        BangCTHD.setForeground(new java.awt.Color(0, 16, 31));
        BangCTHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Phòng", "Mã Dịch Vụ", "Giá "
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
        jScrollPane1.setViewportView(BangCTHD);
        if (BangCTHD.getColumnModel().getColumnCount() > 0) {
            BangCTHD.getColumnModel().getColumn(0).setResizable(false);
            BangCTHD.getColumnModel().getColumn(1).setResizable(false);
            BangCTHD.getColumnModel().getColumn(2).setResizable(false);
        }

        BangHoaDon.setBackground(new java.awt.Color(220, 242, 197));
        BangHoaDon.setForeground(new java.awt.Color(0, 16, 31));
        BangHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Hóa Đơn", "Mã Khách Hàng", "Mã Nhân Viên", "null", "Title 5"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        BangHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BangHoaDonMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(BangHoaDon);

        NhapTimKiem1.setBackground(new java.awt.Color(220, 242, 197));
        NhapTimKiem1.setForeground(new java.awt.Color(0, 16, 31));
        NhapTimKiem1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 16, 31), 2));
        NhapTimKiem1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NhapTimKiem1KeyReleased(evt);
            }
        });

        NhapTimKiem2.setBackground(new java.awt.Color(220, 242, 197));
        NhapTimKiem2.setForeground(new java.awt.Color(0, 16, 31));
        NhapTimKiem2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 16, 31), 2));
        NhapTimKiem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NhapTimKiem2ActionPerformed(evt);
            }
        });
        NhapTimKiem2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NhapTimKiem2KeyReleased(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(220, 242, 197));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LabelDatPhong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelDatPhong.setForeground(new java.awt.Color(0, 16, 31));
        LabelDatPhong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelDatPhong.setText("Thêm Hóa Đơn");
        LabelDatPhong.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 16, 31))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 16, 31));
        jLabel1.setText("Mã khách hàng:");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel1.setPreferredSize(new java.awt.Dimension(90, 32));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 16, 31));
        jLabel2.setText("Mã nhân viên:");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel2.setPreferredSize(new java.awt.Dimension(90, 32));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 16, 31));
        jLabel3.setText("Ngày nhận:");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel3.setPreferredSize(new java.awt.Dimension(90, 32));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 16, 31));
        jLabel4.setText("Ngày trả:");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel4.setPreferredSize(new java.awt.Dimension(90, 32));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addComponent(LabelDatPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(151, 151, 151))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NhapNgayNhan, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                            .addComponent(NhapNgayTra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NhapThangNhan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NhapThangTra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NhapNamNhan, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(NhapNamTra)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MaNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(MaKhachHang))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelDatPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MaKhachHang)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(MaNhanVien)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NhapNgayNhan, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                    .addComponent(NhapNamNhan)
                    .addComponent(NhapThangNhan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(NhapNgayTra, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                    .addComponent(NhapNamTra)
                    .addComponent(NhapThangTra))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        ButtonThemPhong.setBackground(new java.awt.Color(220, 242, 197));
        ButtonThemPhong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonThemPhong.setForeground(new java.awt.Color(0, 16, 31));
        ButtonThemPhong.setText("Thêm Phòng");
        ButtonThemPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonThemPhongActionPerformed(evt);
            }
        });

        ButtonTaoHD.setBackground(new java.awt.Color(220, 242, 197));
        ButtonTaoHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonTaoHD.setForeground(new java.awt.Color(0, 16, 31));
        ButtonTaoHD.setText("Tạo Hóa Đơn");
        ButtonTaoHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonTaoHDActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout HoaDonPanelLayout = new javax.swing.GroupLayout(HoaDonPanel);
        HoaDonPanel.setLayout(HoaDonPanelLayout);
        HoaDonPanelLayout.setHorizontalGroup(
            HoaDonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoaDonPanelLayout.createSequentialGroup()
                .addGroup(HoaDonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HoaDonPanelLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addGroup(HoaDonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HoaDonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(HoaDonPanelLayout.createSequentialGroup()
                                    .addGap(7, 7, 7)
                                    .addGroup(HoaDonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ButtonChinhSuaHD)
                                        .addComponent(ButtonTaoHD, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(HoaDonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ButtonThemPhong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Button, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                    .addGap(12, 12, 12)
                                    .addGroup(HoaDonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ButtonThemDV, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ButtonXuatHD, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane3))
                            .addGroup(HoaDonPanelLayout.createSequentialGroup()
                                .addComponent(NhapTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(NhapTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(NhapTimKiem2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(HoaDonPanelLayout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(LabelCTHD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(403, 403, 403)
                        .addComponent(LabelTKHD, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(529, Short.MAX_VALUE))
        );
        HoaDonPanelLayout.setVerticalGroup(
            HoaDonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoaDonPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(HoaDonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCTHD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelTKHD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(HoaDonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HoaDonPanelLayout.createSequentialGroup()
                        .addGroup(HoaDonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NhapTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NhapTimKiem1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NhapTimKiem2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(HoaDonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonChinhSuaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonXuatHD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(HoaDonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonThemDV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonThemPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ButtonTaoHD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HoaDonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HoaDonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 220, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonThemDVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonThemDVActionPerformed
        // TODO add your handling code here:
        menu.addDichVu();
    }//GEN-LAST:event_ButtonThemDVActionPerformed

    private void NhapTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NhapTimKiemKeyReleased
        // TODO add your handling code here:
        int text;
        try{
            text=Integer.parseInt(NhapTimKiem.getText());
        }catch(NumberFormatException e){
            text=0;
        }
        hd.TimKiem(text, NhapTimKiem2.getText().toLowerCase(), NhapTimKiem1.getText().toLowerCase());
    }//GEN-LAST:event_NhapTimKiemKeyReleased

    private void NhapTimKiem1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NhapTimKiem1KeyReleased
        // TODO add your handling code here:
        int text;
        try{
            text=Integer.parseInt(NhapTimKiem.getText());
        }catch(NumberFormatException e){
            text=0;
        }
        hd.TimKiem(text, NhapTimKiem2.getText().toLowerCase(), NhapTimKiem1.getText().toLowerCase());
    }//GEN-LAST:event_NhapTimKiem1KeyReleased

    private void NhapTimKiem2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NhapTimKiem2KeyReleased
        // TODO add your handling code here:
        int text;
        try{
            text=Integer.parseInt(NhapTimKiem.getText());
        }catch(NumberFormatException e){
            text=0;
        }
        hd.TimKiem(text, NhapTimKiem2.getText().toLowerCase(), NhapTimKiem1.getText().toLowerCase());
    }//GEN-LAST:event_NhapTimKiem2KeyReleased

    private void ButtonThemPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonThemPhongActionPerformed
        // TODO add your handling code here:
        menu.addPhong();
    }//GEN-LAST:event_ButtonThemPhongActionPerformed

    private void ButtonTaoHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonTaoHDActionPerformed
        // TODO add your handling code here:
        LocalDate ngaynhan=LocalDate.of(Integer.parseInt(NhapNamNhan.getText()),Integer.parseInt(NhapThangNhan.getText()),Integer.parseInt(NhapNgayNhan.getText()));
        LocalDate ngaytra=LocalDate.of(Integer.parseInt(NhapNamTra.getText()),Integer.parseInt(NhapThangTra.getText()),Integer.parseInt(NhapNgayTra.getText()));
        boolean isAfter = ngaytra.isAfter(ngaynhan);
        try{
             if(MaKhachHang.getText().length() == 8){
                 if(MaNhanVien.getText().length() == 8){
                     if(isAfter){
                        hd.them(new HoaDonInDTO(MaKhachHang.getText(),MaNhanVien.getText(),ngaynhan,ngaytra));
                   
                    }else{
                 JOptionPane.showMessageDialog(this, "Ngày trả phải sau ngày nhận", "Lỗi", JOptionPane.ERROR_MESSAGE);
             }
                }else{
                 JOptionPane.showMessageDialog(this, "Mã nhân viên phải đủ 8 ký tự", "Lỗi", JOptionPane.ERROR_MESSAGE);
             }
                     
             }else{
                 JOptionPane.showMessageDialog(this, "Mã khách hàng phải đủ 8 ký tự", "Lỗi", JOptionPane.ERROR_MESSAGE);
             }   
        }catch(Exception ex) {
            ex.printStackTrace();
        }
//        DateInFHD=ngaynhan;
//        DateOutFHD=ngaytra;
        dshd = hd.docDSHD();
        TaoBangHd();
    }//GEN-LAST:event_ButtonTaoHDActionPerformed

    private void NhapTimKiem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NhapTimKiem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NhapTimKiem2ActionPerformed

    private void ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ButtonActionPerformed

    private void ButtonChinhSuaHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonChinhSuaHDActionPerformed
        // TODO add your handling code here:
//        if(BangHoaDon.getSelectedRow()>=0){
//            boolean isAfter = NgayTra.getDate().after(NgayNhan.getDate());
//            try{
//                 if(MaKhachHang.getText().length() == 8){
//                     if(MaNhanVien.getText().length() == 8){
//                         if(isAfter){
//                            hd.sua(,new HoaDonDTO(
//                                 0,
//                                 MaKhachHang.getText(),
//                                 MaNhanVien.getText(),
//                                 NgayNhan.getDate(),
//                                 NgayTra.getDate(),
//                                 0,
//                                 null
//                         ));
//                        }else{
//                     JOptionPane.showMessageDialog(this, "Ngày trả phải sau ngày nhận", "Lỗi", JOptionPane.ERROR_MESSAGE);
//                 }
//                    }else{
//                     JOptionPane.showMessageDialog(this, "Mã nhân viên phải đủ 8 ký tự", "Lỗi", JOptionPane.ERROR_MESSAGE);
//                 }
//
//                 }else{
//                     JOptionPane.showMessageDialog(this, "Mã khách hàng phải đủ 8 ký tự", "Lỗi", JOptionPane.ERROR_MESSAGE);
//                 }   
//            }catch(Exception ex) {
//                ex.printStackTrace();
//            }
//        }else{
//                     JOptionPane.showMessageDialog(this, "Không có hóa đơn nào được chọn", "Lỗi", JOptionPane.ERROR_MESSAGE);
//                 }
//        TaoBangHd();
    }//GEN-LAST:event_ButtonChinhSuaHDActionPerformed

    private void BangHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BangHoaDonMouseClicked
         //TODO add your handling code here:
        int a = BangHoaDon.getSelectedRow();
        if(a>=0){
            NhapTimKiem.setText(BangHoaDon.getValueAt(a, 0).toString());
            NhapTimKiem1.setText(BangHoaDon.getValueAt(a, 1).toString());
            NhapTimKiem2.setText(BangHoaDon.getValueAt(a, 2).toString());
            DateInFHD = LocalDate.parse(BangHoaDon.getValueAt(a, 3).toString());
            DateOutFHD = LocalDate.parse(BangHoaDon.getValueAt(a, 4).toString());
        }
    }//GEN-LAST:event_BangHoaDonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BangCTHD;
    private javax.swing.JTable BangHoaDon;
    private javax.swing.JButton Button;
    private javax.swing.JButton ButtonChinhSuaHD;
    private javax.swing.JButton ButtonTaoHD;
    private javax.swing.JButton ButtonThemDV;
    private javax.swing.JButton ButtonThemPhong;
    private javax.swing.JButton ButtonXuatHD;
    private javax.swing.JPanel HoaDonPanel;
    private javax.swing.JLabel LabelCTHD;
    private javax.swing.JLabel LabelDatPhong;
    private javax.swing.JLabel LabelTKHD;
    private javax.swing.JTextField MaKhachHang;
    private javax.swing.JTextField MaNhanVien;
    private javax.swing.JTextField NhapNamNhan;
    private javax.swing.JTextField NhapNamTra;
    private javax.swing.JTextField NhapNgayNhan;
    private javax.swing.JTextField NhapNgayTra;
    private javax.swing.JTextField NhapThangNhan;
    private javax.swing.JTextField NhapThangTra;
    private javax.swing.JTextField NhapTimKiem;
    private javax.swing.JTextField NhapTimKiem1;
    private javax.swing.JTextField NhapTimKiem2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
