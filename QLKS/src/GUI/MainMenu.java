/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;

import java.awt.Image;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Phat
 */
public final class MainMenu extends javax.swing.JPanel {

    /**
     * Creates new form StartUpMenu
     */
    public MainMenu() {
        initComponents();
        show(position);
    }
    int position=0;
    
    public String[] takeimage(){
        File f=new File(getClass().getResource("/GUI.slideimg").getFile());
        String[] Images=f.list();
        return Images;
    }
    
    public void show(int index){
        String[] Images=takeimage();
        String img=Images[index];
        ImageIcon icon=new ImageIcon(getClass().getResource("/GUI.slideimg/"+ img));
        Image image=icon.getImage().getScaledInstance(Slide.getWidth(), Slide.getHeight(), Image.SCALE_SMOOTH);
        Slide.setIcon(new ImageIcon(image));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Slide = new javax.swing.JLabel();
        Next = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1720, 1080));

        jPanel1.setBackground(new java.awt.Color(220, 242, 197));
        jPanel1.setPreferredSize(new java.awt.Dimension(1720, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 16, 31));
        jLabel1.setText("ỨNG DỤNG QUẢN LÝ KHÁCH SẠN");
        jLabel1.setPreferredSize(new java.awt.Dimension(17, 17));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 75, 900, 150));

        Slide.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(Slide, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 850, 320));

        Next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/img/icons8-next-50.png"))); // NOI18N
        Next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NextMousePressed(evt);
            }
        });
        jPanel1.add(Next, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 370, -1, -1));

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/img/icons8-back-50.png"))); // NOI18N
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMousePressed
        // TODO add your handling code here:
        new Thread();
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        int p=this.Slide.getX();
        
        if(p>-1){
            Animacion.Animacion.mover_izquierda(900, 200, 1, 2, Slide);
        }
        position=position+1;
        if(position>takeimage().length){
            position=takeimage().length-1;
        }
        show(position);
    }//GEN-LAST:event_NextMousePressed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Next;
    private javax.swing.JLabel Slide;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
