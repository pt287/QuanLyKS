/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import GUICHART.ClientPerMonth.CPMChart;
import GUICHART.ClientPerServiceAndRoom.CPSAR;
import GUICHART.MoneyPerMonth.MPMChart;
import GUICHART.RoomRatio.RR;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import BUS.NguoiDungBUS;
import GUICHART.ServiceRatio.SR;
import java.util.ArrayList;
import java.util.Date;

public class Menu extends javax.swing.JFrame {
    CardLayout layout;
    String TaiKhoan="";
    NguoiDungBUS nd=new NguoiDungBUS();
    Date datein=new Date();
    Date dateout=new Date();
    ArrayList<String> maphong;

    public ArrayList<String> getMaphong() {
        return maphong;
    }

    public void setMaphong(ArrayList<String> maphong) {
        this.maphong = maphong;
    }

    
    public Date getDatein() {
        return datein;
    }

    public void setDatein(Date datein) {
        this.datein = datein;
    }

    public Date getDateout() {
        return dateout;
    }

    public void setDateout(Date dateout) {
        this.dateout = dateout;
    }
    /**
     * Creates new form Menu
     */
    public Menu(String a) {
        initComponents();
        layout = new CardLayout();
        MenuUI.setLayout(layout);
        MenuUI.add("StartUp",new MainMenu());
        MenuUI.add("dsPhong", new DSPhong());
        MenuUI.add("HoaDon",new HoaDon(this));
        MenuUI.add("DatPhong",new DatPhong(this));
        MenuUI.add("QuanLy", new QuanLy(a));
        MenuUI.add("DichVu",new DichVu(this));
        MenuUI.add("CPM",new CPMChart());
        MenuUI.add("MPM",new MPMChart());
        MenuUI.add("CPSAR",new CPSAR());
        MenuUI.add("RR",new RR());
        MenuUI.add("SR",new SR());
        TenND.setText(nd.Ten(a));
        TaiKhoan=a;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LeTanMenu = new javax.swing.JPopupMenu();
        DSPhong = new javax.swing.JMenuItem();
        HoaDon = new javax.swing.JMenuItem();
        QuanLyMenu = new javax.swing.JPopupMenu();
        jPanel3 = new javax.swing.JPanel();
        ThongKeMenu = new javax.swing.JPopupMenu();
        ThuNhap = new javax.swing.JMenu();
        CPM = new javax.swing.JMenuItem();
        MPM = new javax.swing.JMenuItem();
        CPSAR = new javax.swing.JMenuItem();
        NhuCau = new javax.swing.JMenu();
        RR = new javax.swing.JMenuItem();
        SR = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        LeTanPopupMenu = new javax.swing.JLabel();
        QuanLyPopupMenu = new javax.swing.JLabel();
        DichVu = new javax.swing.JLabel();
        ThongKe = new javax.swing.JLabel();
        DangXuat = new javax.swing.JButton();
        TenND = new javax.swing.JLabel();
        MenuUI = new javax.swing.JPanel();

        LeTanMenu.setBackground(new java.awt.Color(0, 16, 31));
        LeTanMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        DSPhong.setBackground(new java.awt.Color(0, 16, 31));
        DSPhong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DSPhong.setText("Danh Sách Phòng");
        DSPhong.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        DSPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DSPhongActionPerformed(evt);
            }
        });
        LeTanMenu.add(DSPhong);

        HoaDon.setBackground(new java.awt.Color(0, 16, 31));
        HoaDon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        HoaDon.setText("Hóa Đơn");
        HoaDon.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        HoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoaDonActionPerformed(evt);
            }
        });
        LeTanMenu.add(HoaDon);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 747, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ThuNhap.setText("Thu Nhập");

        CPM.setText("CPM");
        CPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPMActionPerformed(evt);
            }
        });
        ThuNhap.add(CPM);

        MPM.setText("MPM");
        MPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPMActionPerformed(evt);
            }
        });
        ThuNhap.add(MPM);

        CPSAR.setText("CPSAR");
        CPSAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPSARActionPerformed(evt);
            }
        });
        ThuNhap.add(CPSAR);

        ThongKeMenu.add(ThuNhap);

        NhuCau.setText("Nhu Cầu Khách Hàng");

        RR.setText("Tỉ Lệ Đặt Phòng");
        RR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RRActionPerformed(evt);
            }
        });
        NhuCau.add(RR);

        SR.setText("Tỉ Lệ Sử Dụng DỊch Vụ");
        SR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SRActionPerformed(evt);
            }
        });
        NhuCau.add(SR);

        ThongKeMenu.add(NhuCau);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel2.setBackground(new java.awt.Color(0, 16, 31));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 1080));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/img/1.jpg"))); // NOI18N
        Logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoMouseClicked(evt);
            }
        });

        LeTanPopupMenu.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        LeTanPopupMenu.setForeground(new java.awt.Color(255, 255, 204));
        LeTanPopupMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LeTanPopupMenu.setText("Lễ Tân");
        LeTanPopupMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LeTanPopupMenuMouseClicked(evt);
            }
        });

        QuanLyPopupMenu.setBackground(new java.awt.Color(0, 16, 31));
        QuanLyPopupMenu.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        QuanLyPopupMenu.setForeground(new java.awt.Color(220, 242, 197));
        QuanLyPopupMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuanLyPopupMenu.setText("Quản Lý");
        QuanLyPopupMenu.setToolTipText("");
        QuanLyPopupMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuanLyPopupMenuMouseClicked(evt);
            }
        });

        DichVu.setBackground(new java.awt.Color(0, 16, 31));
        DichVu.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        DichVu.setForeground(new java.awt.Color(220, 242, 197));
        DichVu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DichVu.setText("Dịch Vụ");
        DichVu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DichVuMouseClicked(evt);
            }
        });

        ThongKe.setBackground(new java.awt.Color(0, 16, 31));
        ThongKe.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        ThongKe.setForeground(new java.awt.Color(220, 242, 197));
        ThongKe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ThongKe.setText("Thống Kê");
        ThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ThongKeMouseClicked(evt);
            }
        });

        DangXuat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DangXuat.setText("Đăng xuất");
        DangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DangXuatActionPerformed(evt);
            }
        });

        TenND.setBackground(new java.awt.Color(0, 16, 31));
        TenND.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        TenND.setForeground(new java.awt.Color(220, 242, 197));
        TenND.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DichVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(QuanLyPopupMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LeTanPopupMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(DangXuat)
                .addGap(42, 42, 42))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TenND, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LeTanPopupMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(QuanLyPopupMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DichVu, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264)
                .addComponent(TenND, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DangXuat)
                .addContainerGap(356, Short.MAX_VALUE))
        );

        MenuUI.setBackground(new java.awt.Color(220, 242, 197));
        MenuUI.setForeground(new java.awt.Color(255, 255, 255));
        MenuUI.setMinimumSize(new java.awt.Dimension(1720, 1080));
        MenuUI.setPreferredSize(new java.awt.Dimension(1720, 1080));

        javax.swing.GroupLayout MenuUILayout = new javax.swing.GroupLayout(MenuUI);
        MenuUI.setLayout(MenuUILayout);
        MenuUILayout.setHorizontalGroup(
            MenuUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1720, Short.MAX_VALUE)
        );
        MenuUILayout.setVerticalGroup(
            MenuUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MenuUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(MenuUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LeTanPopupMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeTanPopupMenuMouseClicked
        // TODO add your handling code here:
        LeTanMenu.show(LeTanPopupMenu, WIDTH+30, WIDTH+30);
        
    }//GEN-LAST:event_LeTanPopupMenuMouseClicked

    private void DSPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DSPhongActionPerformed
        // TODO add your handling code here:
        layout.show(MenuUI, "dsPhong");
    }//GEN-LAST:event_DSPhongActionPerformed

    private void HoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoaDonActionPerformed
        // TODO add your handling code here:
        layout.show(MenuUI,"HoaDon");
    }//GEN-LAST:event_HoaDonActionPerformed

    private void ThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ThongKeMouseClicked
        // TODO add your handling code here:
        ThongKeMenu.show(ThongKe, WIDTH+50, WIDTH+30);
    }//GEN-LAST:event_ThongKeMouseClicked

    private void CPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPMActionPerformed
        // TODO add your handling code here:
        layout.show(MenuUI, "CPM");
    }//GEN-LAST:event_CPMActionPerformed

    private void MPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPMActionPerformed
        // TODO add your handling code here:
        layout.show(MenuUI,"MPM");
    }//GEN-LAST:event_MPMActionPerformed

    private void CPSARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPSARActionPerformed
        // TODO add your handling code here:
        layout.show(MenuUI,"CPSAR");
    }//GEN-LAST:event_CPSARActionPerformed

    private void RRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RRActionPerformed
        // TODO add your handling code here:
        layout.show(MenuUI,"RR");
    }//GEN-LAST:event_RRActionPerformed

    private void SRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SRActionPerformed
        // TODO add your handling code here:
        layout.show(MenuUI,"SR");
    }//GEN-LAST:event_SRActionPerformed

    private void DangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DangXuatActionPerformed
        // TODO add your handling code here:
        dispose();
        DangNhap.main(null);
    }//GEN-LAST:event_DangXuatActionPerformed

    private void QuanLyPopupMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuanLyPopupMenuMouseClicked
        // TODO add your handling code here:
        if (TaiKhoan.contains("NV")) {
            JOptionPane.showMessageDialog(this, "Không đủ quyền hạn!!!","Lỗi",JOptionPane.ERROR_MESSAGE);
        }else{
            layout.show(MenuUI, "QuanLy");
        }
    }//GEN-LAST:event_QuanLyPopupMenuMouseClicked

    private void DichVuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DichVuMouseClicked
        // TODO add your handling code here:
        layout.show(MenuUI,"DichVu");
    }//GEN-LAST:event_DichVuMouseClicked

    private void LogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoMouseClicked
        // TODO add your handling code here:
        layout.show(MenuUI,"StartUp");
    }//GEN-LAST:event_LogoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String a) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu(a).setVisible(true);
                new MainMenu().setVisible(true);
            }
        });
    }
    public void addDichVu(){
        layout.show(MenuUI, "DichVu");
    }
    
    public void ThoatDichVu(){
        layout.show(MenuUI, "HoaDon");
    }
    
    public void addPhong(){
        layout.show(MenuUI,"DatPhong");
    }
    
    public void ThoatDatPhong(){
        layout.show(MenuUI,"HoaDon");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CPM;
    private javax.swing.JMenuItem CPSAR;
    private javax.swing.JMenuItem DSPhong;
    private javax.swing.JButton DangXuat;
    private javax.swing.JLabel DichVu;
    private javax.swing.JMenuItem HoaDon;
    private javax.swing.JPopupMenu LeTanMenu;
    private javax.swing.JLabel LeTanPopupMenu;
    private javax.swing.JLabel Logo;
    private javax.swing.JMenuItem MPM;
    private javax.swing.JPanel MenuUI;
    private javax.swing.JMenu NhuCau;
    private javax.swing.JPopupMenu QuanLyMenu;
    private javax.swing.JLabel QuanLyPopupMenu;
    private javax.swing.JMenuItem RR;
    private javax.swing.JMenuItem SR;
    private javax.swing.JLabel TenND;
    private javax.swing.JLabel ThongKe;
    private javax.swing.JPopupMenu ThongKeMenu;
    private javax.swing.JMenu ThuNhap;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
