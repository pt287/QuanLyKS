/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import BUS.NguoiDungBUS;
import DTO.NguoiDung.NguoiDungDTO;
import DTO.NguoiDung.NhanVienDTO;
import DTO.NguoiDung.QuanLyDTO;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author capij
 */
public class QuanLy extends javax.swing.JPanel {
    NguoiDungBUS nd=new NguoiDungBUS();
    ArrayList<NguoiDungDTO> dsnd;
    QuanLyDTO Ql=new QuanLyDTO();
    int sl=0;
    String TaiKhoan="";
    String luumanv="";
    /**
     * Creates new form QuanLy
     */
    public QuanLy(String b) {
        TaiKhoan=b;       
        dsnd= nd.docDSND();
        initComponents();       
        for (NguoiDungDTO a:dsnd)
            if(a.getMaNguoiDung().equals(b)) Ql=(QuanLyDTO)a; 
        TaoBang(TaiKhoan);
        
    }
    public void TaoBang(String b){
        sl=0;
        DefaultTableModel table=new DefaultTableModel();
        Bang.setModel(table);
        table.addColumn("Mã nhân viên");
        table.addColumn( "Họ và tên");
        table.addColumn("Số điện thoại");
        table.addColumn("Chức vụ");
        if (b.contains("QL")) {
            for(NguoiDungDTO p:dsnd){
                if (p.getMaNguoiDung().contains("NV") && p.getTrangThai()==1) {
                    NhanVienDTO a=(NhanVienDTO) p;
                    if (a.getMaQuanLy().equals(Ql.getMaQuanLy())) {
                        table.addRow(new Object[]{a.getMaNguoiDung(),a.getTen(),a.getSDT(),a.getVaiTro()});                                    
                        sl++;
                    }
                }
            }            
        }else{
            jLabel4.setText("Mã quản lý:");
            for(NguoiDungDTO p:dsnd){
                if (p.getTrangThai()==1) {
                    if (p.getMaNguoiDung().contains("NV")) {
                        NhanVienDTO a=(NhanVienDTO) p;
                        table.addRow(new Object[]{a.getMaNguoiDung(),a.getTen(),a.getSDT(),a.getVaiTro()});                                    
                    }else{
                        table.addRow(new Object[]{p.getMaNguoiDung(),p.getTen(),p.getSDT(),"Quản lý"});
                    }
                    sl++;                    
                }
            }   
        }
        SLNV.setText("Số lượng nhân viên: "+sl);
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
        SLNV = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Xoabutton = new javax.swing.JButton();
        Suabutton = new javax.swing.JButton();
        Thembutton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        HoTen = new javax.swing.JTextField();
        MaNhanVien = new javax.swing.JTextField();
        CCCD = new javax.swing.JTextField();
        SDT = new javax.swing.JTextField();
        tk = new javax.swing.JTextField();
        mk = new javax.swing.JTextField();
        VaiTro = new javax.swing.JTextField();
        MaNguoiDung = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        LamMoi = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Bang = new javax.swing.JTable();

        setBackground(new java.awt.Color(220, 242, 197));
        setPreferredSize(new java.awt.Dimension(1710, 1080));

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setPreferredSize(new java.awt.Dimension(360, 40));

        SLNV.setText("Nhân Viên Quản Lý: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(526, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SLNV, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("THÔNG TIN NHÂN VIÊN");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Họ & tên:");
        jLabel3.setPreferredSize(new java.awt.Dimension(70, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Mã nhân viên:");
        jLabel4.setPreferredSize(new java.awt.Dimension(70, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("CCCD:");
        jLabel5.setPreferredSize(new java.awt.Dimension(70, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("SDT:");
        jLabel6.setPreferredSize(new java.awt.Dimension(70, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Tài khoản:");
        jLabel7.setPreferredSize(new java.awt.Dimension(70, 30));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Mật khẩu:");
        jLabel9.setPreferredSize(new java.awt.Dimension(70, 30));

        Xoabutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Xoabutton.setText("Xóa");
        Xoabutton.setPreferredSize(new java.awt.Dimension(72, 40));
        Xoabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XoabuttonActionPerformed(evt);
            }
        });

        Suabutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Suabutton.setText("Sửa");
        Suabutton.setPreferredSize(new java.awt.Dimension(72, 40));
        Suabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuabuttonActionPerformed(evt);
            }
        });

        Thembutton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Thembutton.setText("Thêm");
        Thembutton.setPreferredSize(new java.awt.Dimension(78, 40));
        Thembutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThembuttonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Vai trò:");
        jLabel10.setPreferredSize(new java.awt.Dimension(70, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Mã người dùng:");
        jLabel11.setPreferredSize(new java.awt.Dimension(70, 30));

        HoTen.setPreferredSize(new java.awt.Dimension(71, 30));

        MaNhanVien.setToolTipText("");
        MaNhanVien.setPreferredSize(new java.awt.Dimension(71, 30));

        CCCD.setPreferredSize(new java.awt.Dimension(71, 30));

        SDT.setPreferredSize(new java.awt.Dimension(71, 30));

        tk.setPreferredSize(new java.awt.Dimension(71, 30));

        mk.setPreferredSize(new java.awt.Dimension(71, 30));

        VaiTro.setPreferredSize(new java.awt.Dimension(71, 30));

        MaNguoiDung.setPreferredSize(new java.awt.Dimension(71, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 155, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HoTen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MaNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CCCD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SDT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VaiTro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MaNguoiDung, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(Suabutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(Thembutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Xoabutton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CCCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SDT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VaiTro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MaNguoiDung, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Suabutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Xoabutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Thembutton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DANH SÁCH NHÂN VIÊN");

        LamMoi.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        LamMoi.setText("Làm mới");
        LamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LamMoiActionPerformed(evt);
            }
        });

        Bang.setModel(new javax.swing.table.DefaultTableModel(
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
        Bang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Bang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LamMoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(471, 471, 471))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LamMoi))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(477, 477, 477))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SuabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuabuttonActionPerformed
        NguoiDungDTO a = null;
        if (Bang.getSelectedRow() >= 0) {
            String maNguoiDung = MaNguoiDung.getText();
            String taiKhoan = tk.getText();
            String matKhau = mk.getText();
            String hoTen = HoTen.getText();
            String cccd = CCCD.getText();
            String sdt = SDT.getText();
            String maNhanVien = MaNhanVien.getText();
            String vaiTro = VaiTro.getText();
            if (TaiKhoan.contains("QL")) {
                if (maNguoiDung.contains("NV") && maNguoiDung.length() == 8 && maNhanVien.length() == 8) {
                    if (!nd.kiemTraMaNhanVien(maNhanVien) && luumanv.equals(maNhanVien)) {
                        if (cccd.length() < 13) {
                            if (sdt.length() < 11) {
                                a = new NhanVienDTO(maNguoiDung, taiKhoan, matKhau, hoTen, cccd, sdt, 1, maNhanVien, Ql.getMaQuanLy(), vaiTro);
                            } else {
                                showErrorMessage("SDT không được quá 10 kí tự!");
                            }
                        } else {
                            showErrorMessage("CCCD không được quá 12 kí tự!");
                        }                        
                    }else{
                        showErrorMessage("Mã nhân viên bị trùng!!!");
                    }
                } else {
                    showErrorMessage("Mã nhân viên/người dùng phải có 8 kí tự!");
                }
            } else {
                if (maNguoiDung.contains("QL") && maNguoiDung.length() == 8 && maNhanVien.length() == 8) {
                    if (!nd.kiemTraMaQuanLy(maNhanVien) && luumanv.equals(maNhanVien)) {
                        if (cccd.length() < 13) {
                            if (sdt.length() < 11) {
                                a = new QuanLyDTO(maNguoiDung, taiKhoan, matKhau, hoTen, cccd, sdt, 1, maNhanVien, 0);
                            } else {
                                showErrorMessage("SDT không được quá 10 kí tự!");
                            }
                        } else {
                            showErrorMessage("CCCD không được quá 12 kí tự!");
                        }                       
                    }else{
                        showErrorMessage("Mã quản lý bị trùng!!!");
                    }
                } else {
                    showErrorMessage("Mã quản lý/người dùng phải có 8 kí tự!");
                }
            }
    
            if (a != null) {
                try {
                    nd.Sua(Bang.getValueAt(Bang.getSelectedRow(), 0).toString(), a);
                    JOptionPane.showMessageDialog(this, "Sửa thành công <3", "Success", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception ex) {
                    showErrorMessage("Có lỗi xảy ra trong quá trình sửa: " + ex.getMessage());
                }
            }
        } else {
            showErrorMessage("Không có hàng nào được chọn!");
        }
        TaoBang(TaiKhoan);
    }//GEN-LAST:event_SuabuttonActionPerformed
    
    private void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    
    private void ThembuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThembuttonActionPerformed
        // TODO add your handling code here:
        
        for (NguoiDungDTO b:dsnd){
            if (b.getMaNguoiDung().equals(MaNguoiDung.getText())) {
                showErrorMessage("Mã người dùng bị trùng!!!");
                return;
            }
        }
        try {
            if (TaiKhoan.contains("QL")) {
                if (MaNguoiDung.getText().contains("NV") && MaNguoiDung.getText().length() == 8 && MaNhanVien.getText().length() == 8) {
                    if (!nd.kiemTraMaNhanVien(MaNhanVien.getText())) {
                        if (CCCD.getText().length() < 13) {
                            if (SDT.getText().length() < 11) {
                                nd.them(new NhanVienDTO(
                                        MaNguoiDung.getText(),
                                        tk.getText(),
                                        mk.getText(),
                                        HoTen.getText(),
                                        CCCD.getText(),
                                        SDT.getText(),
                                        1,
                                        MaNhanVien.getText(),
                                        Ql.getMaQuanLy(),
                                        VaiTro.getText()));
                                JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                showErrorMessage("SDT không được quá 10 kí tự!");
                            }
                        } else {
                            showErrorMessage("CCCD không được quá 12 kí tự!");
                        }                        
                    }else{
                        showErrorMessage("Mã nhân viên bị trùng!!!");
                    }
                } else {
                    showErrorMessage("Mã nhân viên/người dùng phải có 8 kí tự!");
                }
            } else {
                if (MaNguoiDung.getText().contains("QL") && MaNguoiDung.getText().length() == 8 && MaNhanVien.getText().length() == 8) {
                    if (!nd.kiemTraMaQuanLy(MaNhanVien.getText())) {
                        if (CCCD.getText().length() < 13) {
                            if (SDT.getText().length() < 11) {
                                nd.them(new QuanLyDTO(
                                        MaNguoiDung.getText(),
                                        tk.getText(),
                                        mk.getText(),
                                        HoTen.getText(),
                                        CCCD.getText(),
                                        SDT.getText(),
                                        1,
                                        MaNhanVien.getText(),
                                        0));
                                JOptionPane.showMessageDialog(this, "Thêm quản lý thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                showErrorMessage("SDT không được quá 10 kí tự!");
                            }
                        } else {
                            showErrorMessage("CCCD không được quá 12 kí tự!");
                        }  
                    }else{
                        showErrorMessage("Mã quản lý bị trùng!!!!");
                    }
                } else {
                    showErrorMessage("Mã quản lý/người dùng phải có 8 kí tự!");
                }
            }
        } catch (Exception ex) {
            showErrorMessage("Có lỗi xảy ra: " + ex.getMessage());
        }
        TaoBang(TaiKhoan);
    }//GEN-LAST:event_ThembuttonActionPerformed
    

    private void LamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LamMoiActionPerformed
        // TODO add your handling code here:
        TaoBang(TaiKhoan);
        HoTen.setText("");
        MaNhanVien.setText("");
        CCCD.setText("");
        SDT.setText("");
        tk.setText("");
        mk.setText("");
        VaiTro.setText("");
        MaNguoiDung.setText("");
    }//GEN-LAST:event_LamMoiActionPerformed

    private void XoabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XoabuttonActionPerformed
        // TODO add your handling code here:
        nd.Xoa(Bang.getValueAt(Bang.getSelectedRow(), 0).toString());
        TaoBang(TaiKhoan);
    }//GEN-LAST:event_XoabuttonActionPerformed

    private void BangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BangMouseClicked
        // TODO add your handling code here:
        for(NguoiDungDTO a:dsnd){
            if(a.getMaNguoiDung().equals(Bang.getValueAt(Bang.getSelectedRow(), 0).toString())){
                if(a.getMaNguoiDung().contains("NV")){
                    NhanVienDTO nv=(NhanVienDTO)a;
                    HoTen.setText(nv.getTen());
                    jLabel4.setText("Mã nhân viên:");
                    MaNhanVien.setText(nv.getMaNhanVien());
                    CCCD.setText(nv.getCCCD());
                    SDT.setText(nv.getSDT());
                    tk.setText(nv.getTaiKhoan());
                    mk.setText(nv.getMatKhau());
                    VaiTro.setText(nv.getVaiTro());
                    MaNguoiDung.setText(nv.getMaNguoiDung());
                    luumanv=nv.getMaNhanVien();
                }else{
                    QuanLyDTO ql=(QuanLyDTO)a;
                    HoTen.setText(ql.getTen());
                    jLabel4.setText("Mã quản lý:");
                    MaNhanVien.setText(ql.getMaQuanLy());
                    CCCD.setText(ql.getCCCD());
                    SDT.setText(ql.getSDT());
                    tk.setText(ql.getTaiKhoan());
                    mk.setText(ql.getMatKhau());
                    VaiTro.setText("Quản lý");
                    MaNguoiDung.setText(ql.getMaNguoiDung());
                    luumanv=ql.getMaQuanLy();
                }
            }
        }

    }//GEN-LAST:event_BangMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Bang;
    private javax.swing.JTextField CCCD;
    private javax.swing.JTextField HoTen;
    private javax.swing.JButton LamMoi;
    private javax.swing.JTextField MaNguoiDung;
    private javax.swing.JTextField MaNhanVien;
    private javax.swing.JTextField SDT;
    private javax.swing.JLabel SLNV;
    private javax.swing.JButton Suabutton;
    private javax.swing.JButton Thembutton;
    private javax.swing.JTextField VaiTro;
    private javax.swing.JButton Xoabutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mk;
    private javax.swing.JTextField tk;
    // End of variables declaration//GEN-END:variables
}
