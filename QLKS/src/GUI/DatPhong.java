/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI;


public class DatPhong extends javax.swing.JPanel {

    /**
     * Creates new form DatPhong
     */
    public DatPhong() {
        initComponents();
        
        
        
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        LoaiPhong = new javax.swing.JLabel();
        NgayNhan = new javax.swing.JLabel();
        NgayTra = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        KQPhong = new javax.swing.JTable();
        BangPhong = new javax.swing.JComboBox<>();
        NgayNhanChooser = new com.toedter.calendar.JDateChooser();
        NgayTraChooser = new com.toedter.calendar.JDateChooser();
        XacNhanDatPhong = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        DSPhongDaDat = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1720, 1080));

        jPanel1.setBackground(new java.awt.Color(220, 242, 197));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 860));

        LoaiPhong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LoaiPhong.setForeground(new java.awt.Color(0, 16, 31));
        LoaiPhong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoaiPhong.setText("Loại Phòng");
        LoaiPhong.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        NgayNhan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NgayNhan.setForeground(new java.awt.Color(0, 16, 31));
        NgayNhan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NgayNhan.setText("Ngày Nhận");
        NgayNhan.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        NgayTra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NgayTra.setForeground(new java.awt.Color(0, 16, 31));
        NgayTra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NgayTra.setText("Ngày Trả");
        NgayTra.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        KQPhong.setBackground(new java.awt.Color(220, 242, 197));
        KQPhong.setForeground(new java.awt.Color(0, 16, 31));
        KQPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Đặt", "Mã Phòng", "Số Phòng", "Giá Tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
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
        BangPhong.setForeground(new java.awt.Color(220, 242, 197));

        NgayNhanChooser.setBackground(new java.awt.Color(220, 242, 197));
        NgayNhanChooser.setForeground(new java.awt.Color(220, 242, 197));

        NgayTraChooser.setBackground(new java.awt.Color(220, 242, 197));
        NgayTraChooser.setForeground(new java.awt.Color(220, 242, 197));

        XacNhanDatPhong.setBackground(new java.awt.Color(220, 242, 197));
        XacNhanDatPhong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        XacNhanDatPhong.setForeground(new java.awt.Color(0, 1, 15));
        XacNhanDatPhong.setText("Xác Nhận");

        jTable1.setBackground(new java.awt.Color(220, 242, 197));
        jTable1.setForeground(new java.awt.Color(0, 16, 31));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Phòng", "Tên Khách Hàng", "Ngày Nhận", "Ngày Trả", "Giá Tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        DSPhongDaDat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        DSPhongDaDat.setForeground(new java.awt.Color(0, 16, 31));
        DSPhongDaDat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        DSPhongDaDat.setText("Danh Sách Phòng Đã Đặt");
        DSPhongDaDat.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BangPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(142, 142, 142)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NgayNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NgayNhanChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(170, 170, 170)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NgayTraChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NgayTra, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DSPhongDaDat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(XacNhanDatPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(605, Short.MAX_VALUE))
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
                            .addComponent(NgayNhanChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NgayTraChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BangPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(DSPhongDaDat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(38, 38, 38)
                .addComponent(XacNhanDatPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    }// </editor-fold>                        

        

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> BangPhong;
    private javax.swing.JLabel DSPhongDaDat;
    private javax.swing.JTable KQPhong;
    private javax.swing.JLabel LoaiPhong;
    private javax.swing.JLabel NgayNhan;
    private com.toedter.calendar.JDateChooser NgayNhanChooser;
    private javax.swing.JLabel NgayTra;
    private com.toedter.calendar.JDateChooser NgayTraChooser;
    private javax.swing.JButton XacNhanDatPhong;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration                   
}
