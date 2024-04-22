/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {
    CardLayout layout;
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        layout = new CardLayout();
        MenuUI.setLayout(layout);
        MenuUI.add("dsPhong", new DSPhong());
        MenuUI.add("HoaDon",new HoaDon());
        MenuUI.add("DatPhong",new DatPhong());
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
        DatPhong = new javax.swing.JMenuItem();
        DSPhong = new javax.swing.JMenuItem();
        HoaDon = new javax.swing.JMenuItem();
        QuanLyMenu = new javax.swing.JPopupMenu();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        LeTanPopupMenu = new javax.swing.JLabel();
        QuanLyPopupMenu = new javax.swing.JLabel();
        DichVu = new javax.swing.JLabel();
        ThongKe = new javax.swing.JLabel();
        MenuUI = new javax.swing.JPanel();

        LeTanMenu.setBackground(new java.awt.Color(0, 16, 31));
        LeTanMenu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LeTanMenu.setForeground(new java.awt.Color(0, 0, 0));

        DatPhong.setBackground(new java.awt.Color(0, 16, 31));
        DatPhong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DatPhong.setForeground(new java.awt.Color(0, 0, 0));
        DatPhong.setText("Đặt Phòng");
        DatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatPhongActionPerformed(evt);
            }
        });
        LeTanMenu.add(DatPhong);

        DSPhong.setBackground(new java.awt.Color(0, 16, 31));
        DSPhong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DSPhong.setForeground(new java.awt.Color(0, 0, 0));
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
        HoaDon.setForeground(new java.awt.Color(0, 0, 0));
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jPanel2.setBackground(new java.awt.Color(0, 16, 31));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/img/1.jpg"))); // NOI18N

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

        DichVu.setBackground(new java.awt.Color(0, 16, 31));
        DichVu.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        DichVu.setForeground(new java.awt.Color(220, 242, 197));
        DichVu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DichVu.setText("Dịch Vụ");

        ThongKe.setBackground(new java.awt.Color(0, 16, 31));
        ThongKe.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        ThongKe.setForeground(new java.awt.Color(220, 242, 197));
        ThongKe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ThongKe.setText("Thống Kê");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DichVu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(QuanLyPopupMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LeTanPopupMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(640, Short.MAX_VALUE))
        );

        MenuUI.setBackground(new java.awt.Color(220, 242, 197));
        MenuUI.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout MenuUILayout = new javax.swing.GroupLayout(MenuUI);
        MenuUI.setLayout(MenuUILayout);
        MenuUILayout.setHorizontalGroup(
            MenuUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 713, Short.MAX_VALUE)
        );
        MenuUILayout.setVerticalGroup(
            MenuUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(MenuUI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LeTanPopupMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LeTanPopupMenuMouseClicked
        // TODO add your handling code here:
        LeTanMenu.show(LeTanPopupMenu, WIDTH+30, WIDTH+30);
        
    }//GEN-LAST:event_LeTanPopupMenuMouseClicked

    private void DatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatPhongActionPerformed
        // TODO add your handling code here:
        layout.show(MenuUI,"DatPhong");
    }//GEN-LAST:event_DatPhongActionPerformed

    private void DSPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DSPhongActionPerformed
        // TODO add your handling code here:
        layout.show(MenuUI, "dsPhong");
    }//GEN-LAST:event_DSPhongActionPerformed

    private void HoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoaDonActionPerformed
        // TODO add your handling code here:
        layout.show(MenuUI,"HoaDon");
    }//GEN-LAST:event_HoaDonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem DSPhong;
    private javax.swing.JMenuItem DatPhong;
    private javax.swing.JLabel DichVu;
    private javax.swing.JMenuItem HoaDon;
    private javax.swing.JPopupMenu LeTanMenu;
    private javax.swing.JLabel LeTanPopupMenu;
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel MenuUI;
    private javax.swing.JPopupMenu QuanLyMenu;
    private javax.swing.JLabel QuanLyPopupMenu;
    private javax.swing.JLabel ThongKe;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
