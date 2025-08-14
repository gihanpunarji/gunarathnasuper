package GUI;

import dao.ProductDAO;
import database.Database;
import dto.Product;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.JTextComponent;
import javax.swing.text.NumberFormatter;

public class BillDashboard extends javax.swing.JPanel {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        barcodeInput = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jFormattedTextField7 = new javax.swing.JFormattedTextField();
        jFormattedTextField8 = new javax.swing.JFormattedTextField();
        jFormattedTextField9 = new javax.swing.JFormattedTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jFormattedTextField10 = new javax.swing.JFormattedTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        creditBalanceLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setPreferredSize(new java.awt.Dimension(1226, 748));
        setLayout(new java.awt.BorderLayout());

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "අයිතම න​ම", "ප්‍රමාණය", "වෙළඳපල මි​ල", "අපේ මිල ", "මුලු මුදල "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setShowGrid(true);
        jTable2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable2KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel10.setFont(new java.awt.Font("Iskoola Pota", 1, 24)); // NOI18N
        jLabel10.setText("බිල් අයිතම");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Cascadia Code", 0, 18)); // NOI18N
        jLabel5.setText("BarCode");

        barcodeInput.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        barcodeInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barcodeInputActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
        jLabel6.setText("නිෂ්පාදනය");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
        jLabel7.setText("ප්‍රමාණය");

        jLabel8.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
        jLabel8.setText("වෙලදපල මිල");

        jLabel9.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
        jLabel9.setText("අපේ මිල");

        jButton3.setBackground(new java.awt.Color(0, 153, 102));
        jButton3.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("අයිතමය එකතු කරන්න");
        jButton3.setBorderPainted(false);
        jButton3.setMaximumSize(new java.awt.Dimension(112, 22));
        jButton3.setMinimumSize(new java.awt.Dimension(112, 22));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Iskoola Pota", 1, 24)); // NOI18N
        jLabel11.setText("නිෂ්පාදන ඇතුලත් කිරීම");

        jFormattedTextField7.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));
        jFormattedTextField7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jFormattedTextField7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jFormattedTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField7ActionPerformed(evt);
            }
        });

        jFormattedTextField8.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jFormattedTextField8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jFormattedTextField8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jFormattedTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField8ActionPerformed(evt);
            }
        });

        jFormattedTextField9.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        jFormattedTextField9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jFormattedTextField9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jFormattedTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(barcodeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(200, 200, 200))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jFormattedTextField8)
                                        .addGap(27, 27, 27)))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jFormattedTextField9))))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 225, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFormattedTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(barcodeInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(32, 32, 32)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );

        jLabel1.setFont(new java.awt.Font("Iskoola Pota", 1, 24)); // NOI18N
        jLabel1.setText("බිල් සාරාංශය");

        jLabel12.setFont(new java.awt.Font("Iskoola Pota", 0, 16)); // NOI18N
        jLabel12.setText("උප එකතුව :");

        jLabel13.setFont(new java.awt.Font("Iskoola Pota", 0, 16)); // NOI18N
        jLabel13.setText("මුළු ඉතුරුම  :");

        jLabel14.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jLabel14.setText("මුළු මුදල    :");

        jLabel15.setFont(new java.awt.Font("Iskoola Pota", 0, 16)); // NOI18N
        jLabel15.setText("රු.");

        jLabel16.setFont(new java.awt.Font("Iskoola Pota", 0, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 153, 51));
        jLabel16.setText("රු.");

        jLabel17.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 204));
        jLabel17.setText("රු.");

        jLabel18.setFont(new java.awt.Font("Iskoola Pota", 0, 16)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel18.setText("0.00");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel19.setFont(new java.awt.Font("Iskoola Pota", 0, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 153, 51));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("0.00");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel20.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 204));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("0.00");
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(104, 104, 104)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(99, 99, 99)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel16)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel17)
                    .addComponent(jLabel20))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jLabel21.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jLabel21.setText("ගෙවීම්");

        jLabel24.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
        jLabel24.setText("ශේෂය");

        jLabel25.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jLabel25.setText("රු.");

        jLabel39.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText("0.00");

        jFormattedTextField10.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        jFormattedTextField10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jFormattedTextField10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jFormattedTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField10ActionPerformed(evt);
            }
        });
        jFormattedTextField10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jFormattedTextField10KeyReleased(evt);
            }
        });

        jLabel26.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
        jLabel26.setText("ගෙවිය යුතු මුදල");

        jLabel27.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jLabel27.setText("රු.");

        jLabel40.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel40.setText("0.00");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jFormattedTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27)
                        .addComponent(jLabel40))
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel39)
                    .addComponent(jLabel25))
                .addGap(16, 16, 16))
        );

        jButton4.setBackground(new java.awt.Color(0, 153, 0));
        jButton4.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Print Bill");
        jButton4.setBorderPainted(false);
        jButton4.setMaximumSize(new java.awt.Dimension(112, 22));
        jButton4.setMinimumSize(new java.awt.Dimension(112, 22));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(100, 100, 100));
        jButton5.setFont(new java.awt.Font("Cascadia Code", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Clear");
        jButton5.setBorderPainted(false);
        jButton5.setMaximumSize(new java.awt.Dimension(112, 22));
        jButton5.setMinimumSize(new java.awt.Dimension(112, 22));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Iskoola Pota", 1, 24)); // NOI18N
        jLabel4.setText("පාරිභෝගික තොරතුරු");

        jLabel2.setFont(new java.awt.Font("Iskoola Pota", 0, 16)); // NOI18N
        jLabel2.setText("පාරිභෝගික නම");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        creditBalanceLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        creditBalanceLabel.setForeground(new java.awt.Color(255, 0, 0));
        creditBalanceLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        creditBalanceLabel.setText("0.00");

        jLabel3.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jLabel3.setText("පෙර ණය : ");

        jLabel22.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 0));
        jLabel22.setText("රු.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(creditBalanceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(creditBalanceLabel)
                        .addComponent(jLabel22))
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jCheckBox1.setFont(new java.awt.Font("Iskoola Pota", 0, 16)); // NOI18N
        jCheckBox1.setText("නව ණය ගණුදෙනුකරුවෙකි.");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jCheckBox1))
                .addGap(10, 10, 10))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        add(jPanel9, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private final Map<String, Integer> barcodeRowMap = new HashMap<>();
    private final Map<Integer, Double> originalPrices = new HashMap<>();
    private int selectedCustomerId = -1;
    private double creditBalance = 0.0;

    public BillDashboard() {
        initComponents();

        jTextField1.setEnabled(false);

        updatetotal();

        initializeCustomerComboBox();
        SwingUtilities.invokeLater(() -> {
            barcodeInput.requestFocus();
        });
        setupBarcodeSpacebarRedirect();

        jTextField2.setEditable(false);
        setupNumberFields();
        setupTableAppearance(jTable2);

        setupDeleteAction(jTable2);
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        resetForm();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (jFormattedTextField10.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "කරුණාකර ගෙවන මුදල ඇතුළත් කරන්න.",
                    "Payment Required", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            double payment = Double.parseDouble(jFormattedTextField10.getText());
            if (payment <= 0.0) {
                JOptionPane.showMessageDialog(this, "කරුණාකර වලංගු ගෙවීමක් ඇතුළත් කරන්න.",
                        "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }

            double currentBill = Double.parseDouble(jLabel20.getText());
            double totalAmountDue = Double.parseDouble(jLabel40.getText());
            double balance = payment - totalAmountDue;
            String selectedCustomer = getSelectedCustomer();

            if (!selectedCustomer.isEmpty() && selectedCustomerId > 0) {
                // EXISTING CREDIT CUSTOMER
                handleExistingCreditCustomerSimplified(payment, currentBill, totalAmountDue, balance);
            } else if (balance < 0) {
                // NEW CREDIT CUSTOMER
                handleNewCreditCustomer(Math.abs(balance));
            } else {
                // NORMAL CUSTOMER
                printBillWithTransaction();
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "කරුණාකර වලංගු සංඛ්‍යා ඇතුළත් කරන්න.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void handleExistingCreditCustomerSimplified(double payment, double currentBill, double totalAmountDue, double balance) {
        try {
            if (balance >= 0) {
                // CUSTOMER PAID FULL OR MORE
                if (balance > 0) {
                    JOptionPane.showMessageDialog(this,
                            String.format("✅ සම්පූර්ණ ගෙවීම!\n💵 ආපසු දිය යුතු මුදල: රු.%.2f", balance),
                            "Payment Complete", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "✅ සම්පූර්ණ ගෙවීම!",
                            "Payment Complete", JOptionPane.INFORMATION_MESSAGE);
                }

                // DELETE customer from creditors table (debt fully settled)
                deleteCustomerFromCreditors(selectedCustomerId);
                printBillWithTransaction();

            } else {
                // CUSTOMER PAID PARTIAL - Still has remaining debt
                double remainingDebt = Math.abs(balance); // Remove minus sign as you requested

                String message = String.format(
                        "💳 අර්ධ ගෙවීම\n\n"
                        + "💰 ගෙවන ලද මුදල: රු.%.2f\n"
                        + "💳 ඉතිරි ණය ශේෂය: රු.%.2f\n\n"
                        + "දිගටම කරගෙන යන්නද?",
                        payment, remainingDebt
                );

                int response = JOptionPane.showConfirmDialog(this, message,
                        "Partial Payment", JOptionPane.YES_NO_OPTION);

                if (response == JOptionPane.YES_OPTION) {
                    // UPDATE creditors table with remaining debt (no minus sign)
                    updateCustomerCreditWithTransaction(selectedCustomerId, remainingDebt,
                            String.format("Partial payment: %.2f, remaining debt: %.2f", payment, remainingDebt));

                    resetForm();
                    printBillWithTransaction();
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "දෝෂයක්: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private void deleteCustomerFromCreditors(int customerId) throws SQLException {
        Connection conn = null;
        try {
            conn = Database.getInstace().getConnection();
            conn.setAutoCommit(false);

            String deleteSql = "DELETE FROM creditors WHERE id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(deleteSql)) {
                pstmt.setInt(1, customerId);
                int rowsAffected = pstmt.executeUpdate();

                if (rowsAffected > 0) {
                    conn.commit();

                    selectedCustomerId = -1;
                    creditBalanceLabel.setText("0.00");
                    clearSelection();
                } else {
                    conn.rollback();
                    throw new SQLException("Failed to delete customer");
                }
            }

        } catch (SQLException e) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            throw e;
        } finally {
            if (conn != null) {
                try {
                    conn.setAutoCommit(true);
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void handleNewCreditCustomer(double debtAmount) {
        JOptionPane.showMessageDialog(
                this,
                "💳 අවවාදයයි.\n📋 මුලු මුදලම ගෙවා නැත, කරුණාකර ගනුදෙනුකරුගේ නම ඇතුළත් කරන්න.",
                "Credit Customer",
                JOptionPane.WARNING_MESSAGE
        );

        jTextField1.setEnabled(true);
        jTextField1.requestFocus();

        JOptionPane.showMessageDialog(
                this,
                "✏️ කරුණාකර ගනුදෙනුකරුගේ නම ඇතුළත් කර ⏎ Enter ඔබන්න.",
                "Enter Customer Name",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    private void updateCustomerCreditWithTransaction(int customerId, double newCreditAmount, String reason) throws SQLException {
        Connection conn = null;
        try {
            conn = Database.getInstace().getConnection();
            conn.setAutoCommit(false); // Start transaction

            String updateSql = "UPDATE creditors SET total_debt = ?, last_credit_date = ? WHERE id = ?";
            try (PreparedStatement pstmt = conn.prepareStatement(updateSql)) {
                pstmt.setDouble(1, newCreditAmount);
                pstmt.setString(2, java.time.LocalDateTime.now().toString());
                pstmt.setInt(3, customerId);

                int rowsAffected = pstmt.executeUpdate();
                if (rowsAffected == 0) {
                    throw new SQLException("Failed to update customer credit - customer not found");
                }

                conn.commit(); // Commit transaction

                creditBalance = newCreditAmount;
                creditBalanceLabel.setText(String.format("%.2f", newCreditAmount));

            }

        } catch (SQLException e) {
            if (conn != null) {
                try {
                    conn.rollback(); // Rollback on error
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            throw e; // Re-throw to be handled by caller
        } finally {
            if (conn != null) {
                try {
                    conn.setAutoCommit(true); // Reset auto-commit
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void printBillWithTransaction() {
        try {

            printBill();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "බිල්පත මුද්‍රණයේ දෝෂයක්: " + e.getMessage(),
                    "Print Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private void jFormattedTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField9ActionPerformed

    }//GEN-LAST:event_jFormattedTextField9ActionPerformed

    private void jFormattedTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField8ActionPerformed

    }//GEN-LAST:event_jFormattedTextField8ActionPerformed

    private void jFormattedTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField7ActionPerformed
        addItem(jTable2);
    }//GEN-LAST:event_jFormattedTextField7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        addItem(jTable2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        jFormattedTextField7.requestFocus();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void barcodeInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barcodeInputActionPerformed

        if (barcodeInput.getText().trim().isEmpty()) {
            return;
        }

        String barcode = barcodeInput.getText().trim();

        ProductDAO productDAO = new ProductDAO();
        try {
            Product product = productDAO.searchByBarcode(barcode);

            if (product != null) {
                jTextField2.setText(product.getEnName());
                jFormattedTextField8.setValue(product.getWeladapalaMila());
                jFormattedTextField9.setValue(product.getApeMila());
                jFormattedTextField7.requestFocus();
            } else {
                clearProductFields();
                barcodeInput.selectAll();
                barcodeInput.requestFocus();
            }

        } catch (SQLException ex) {
            Logger.getLogger(BillDashboard.class.getName()).log(Level.SEVERE,
                    "Database error while searching products", ex);
            JOptionPane.showMessageDialog(this, "Database error occurred. Please try again.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            clearProductFields();
            barcodeInput.selectAll();
            barcodeInput.requestFocus();
        }
    }//GEN-LAST:event_barcodeInputActionPerformed

    private void jTable2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyPressed

    }//GEN-LAST:event_jTable2KeyPressed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        String customerName = jTextField1.getText().trim();

        if (customerName.isEmpty()) {
            JOptionPane.showMessageDialog(
                    this,
                    "කරුණාකර වලංගු ගනුදෙනුකරු නමක් ඇතුළත් කරන්න.",
                    "Invalid Name",
                    JOptionPane.WARNING_MESSAGE
            );
            jTextField1.requestFocus();
            return;
        }

        try {
            // Get the debt amount (absolute value of negative balance)
            double debtAmount = Math.abs(Double.parseDouble(jLabel39.getText()));

            // CHANGED: Insert or update customer with transaction handling
            insertOrUpdateCreditorWithTransaction(customerName, debtAmount);

            // Disable text field after successful entry
            jTextField1.setEnabled(false);
            jTextField1.setText("");

            // CHANGED: Print bill after ensuring database is updated
            printBillWithTransaction();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "ගනුදෙනුකරු තොරතුරු සුරැකීමේ දෝෂයක්: " + e.getMessage(),
                    "Database Error",
                    JOptionPane.ERROR_MESSAGE
            );
            jTextField1.requestFocus();
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged

    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jFormattedTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField10ActionPerformed
        jButton4.doClick();

// TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField10ActionPerformed

    private void jFormattedTextField10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextField10KeyReleased
        if (!jFormattedTextField10.getText().trim().isEmpty()) {
            try {
                double payment = Double.parseDouble(jFormattedTextField10.getText());
                double totalAmountDue = Double.parseDouble(jLabel40.getText());
                double balance = payment - totalAmountDue;
                jLabel39.setText(String.format("%.2f", balance));
            } catch (NumberFormatException e) {
                jLabel39.setText("0.00");
            }
        } else {
            // FIXED: When payment field is empty, show negative total amount due
            double totalAmountDue = Double.parseDouble(jLabel40.getText());
            jLabel39.setText(String.format("%.2f", -totalAmountDue));
        }
    }//GEN-LAST:event_jFormattedTextField10KeyReleased

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void clearProductFields() {
        jTextField2.setText("");
        jFormattedTextField8.setValue(0.0);
        jFormattedTextField9.setValue(0.0);
    }

    private ArrayList<String> allCustomers;
    private boolean isUpdating = false;

    private void initializeCustomerComboBox() {
        jComboBox2.setEditable(true);
        loadAllCustomers();
        setupComboBoxListener();
    }

    private void loadAllCustomers() {
        allCustomers = new ArrayList<>();
        try (Connection conn = Database.getInstace().getConnection()) {
            if (conn == null) {
                return;
            }

            String query = "SELECT c.name FROM creditors c WHERE c.name IS NOT NULL AND TRIM(c.name) != '' ORDER BY c.name ASC";
            try (PreparedStatement pstmt = conn.prepareStatement(query); ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    String name = rs.getString("name");
                    if (name != null && !name.trim().isEmpty()) {
                        allCustomers.add(name.trim());
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        updateComboBoxModel("");
    }

    private void setupComboBoxListener() {
        JTextComponent editor = (JTextComponent) jComboBox2.getEditor().getEditorComponent();

        editor.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if (!isUpdating) {
                    SwingUtilities.invokeLater(() -> filterComboBox());
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if (!isUpdating) {
                    SwingUtilities.invokeLater(() -> filterComboBox());
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                if (!isUpdating) {
                    SwingUtilities.invokeLater(() -> filterComboBox());
                }
            }
        });

        jComboBox2.addActionListener(e -> {
            if (!isUpdating && jComboBox2.getSelectedItem() != null) {
                String selected = jComboBox2.getSelectedItem().toString();
                if (!selected.equals("Select customer") && !selected.equals("No matches found")) {
                    isUpdating = true;
                    editor.setText(selected);
                    editor.setCaretPosition(selected.length());
                    isUpdating = false;
                    jComboBox2.hidePopup();

                    // Show credit info after selection
                    showSelectedCustomerCredit();
                }
            }
        });
    }

    private void setupBarcodeSpacebarRedirect() {
        barcodeInput.addKeyListener(new KeyAdapter() {
            private long lastSpaceTime = 0;
            private static final long DOUBLE_SPACE_DELAY = 500;

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    long currentTime = System.currentTimeMillis();

                    if (currentTime - lastSpaceTime < DOUBLE_SPACE_DELAY) {
                        e.consume();
                        jFormattedTextField10.requestFocus();
                        jFormattedTextField10.selectAll();
                    }

                    lastSpaceTime = currentTime;
                }
            }
        });
    }

    private void filterComboBox() {
        JTextComponent editor = (JTextComponent) jComboBox2.getEditor().getEditorComponent();
        String text = editor.getText();

        if (text == null) {
            text = "";
        }

        String searchText = text.toLowerCase().trim();

        isUpdating = true;

        jComboBox2.removeAllItems();

        if (searchText.isEmpty()) {
            jComboBox2.addItem("Select customer");
            for (String customer : allCustomers) {
                jComboBox2.addItem(customer);
            }
        } else {
            boolean hasMatches = false;
            for (String customer : allCustomers) {
                if (customer.toLowerCase().contains(searchText)) {
                    jComboBox2.addItem(customer);
                    hasMatches = true;
                }
            }
            if (!hasMatches) {
                jComboBox2.addItem("No matches found");
            }
        }

        editor.setText(text);
        editor.setCaretPosition(text.length());

        isUpdating = false;

        if (jComboBox2.getItemCount() > 0) {
            jComboBox2.showPopup();
        }
    }

    public void clearSelection() {
        isUpdating = true;
        jComboBox2.setSelectedItem("Select customer");
        JTextComponent editor = (JTextComponent) jComboBox2.getEditor().getEditorComponent();
        editor.setText("");

        selectedCustomerId = -1;
        creditBalanceLabel.setText("0.00");

        isUpdating = false;
    }

    public void refreshCreditDisplay() {
        showSelectedCustomerCredit();
    }

    private void updateComboBoxModel(String filter) {
        isUpdating = true;
        jComboBox2.removeAllItems();

        jComboBox2.addItem("Select customer");

        if (filter == null || filter.isEmpty()) {
            for (String customer : allCustomers) {

                jComboBox2.addItem(customer);
            }
        } else {
            for (String customer : allCustomers) {
                if (customer.toLowerCase().contains(filter.toLowerCase())) {
                    jComboBox2.addItem(customer);
                }
            }
        }
        isUpdating = false;
    }

    public String getSelectedCustomer() {
        if (jComboBox2.getSelectedItem() != null) {
            String selected = jComboBox2.getSelectedItem().toString().trim();
            if (selected.equals("Select customer")
                    || selected.equals("No matches found")
                    || selected.isEmpty()) {
                return "";
            }
            return selected;
        }
        return "";
    }

    public void refreshCustomerList() {
        loadAllCustomers();
    }

    private void showSelectedCustomerCredit() {
        String selectedCustomer = getSelectedCustomer();

        // Reset values first
        selectedCustomerId = -1;
        creditBalanceLabel.setText("0.00");
        jLabel40.setText("0.00");

        if (selectedCustomer == null || selectedCustomer.trim().isEmpty()
                || selectedCustomer.equals("Select customer") || selectedCustomer.equals("No matches found")) {
            // CHANGED: When no customer selected, jLabel40 shows only current bill
            double currentBill = Double.parseDouble(jLabel20.getText());
            jLabel40.setText(String.format("%.2f", currentBill));

            // ADDED: Update balance when customer selection changes
            updateBalanceDisplay();
            return;
        }

        try (Connection conn = Database.getInstace().getConnection()) {
            String sql = "SELECT id, total_debt FROM creditors WHERE LOWER(TRIM(name)) = LOWER(TRIM(?))";
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, selectedCustomer.trim());
                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        selectedCustomerId = rs.getInt("id");
                        double debt = rs.getDouble("total_debt");
                        creditBalance = debt;
                        creditBalanceLabel.setText(String.format("%.2f", debt));

                        // NEW: Calculate and show total amount due (current bill + previous debt)
                        double currentBill = Double.parseDouble(jLabel20.getText());
                        double totalAmountDue = currentBill + debt;
                        jLabel40.setText(String.format("%.2f", totalAmountDue));

                    } else {
                        // NEW: If customer not found in creditors table, just show current bill
                        double currentBill = Double.parseDouble(jLabel20.getText());
                        jLabel40.setText(String.format("%.2f", currentBill));
                    }

                    // ADDED: Update balance after customer data is loaded
                    updateBalanceDisplay();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "Error loading customer credit: " + e.getMessage(),
                    "Database Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void setupTableAppearance(JTable table) {
        table.setFont(new Font("SansSerif", Font.PLAIN, 20));
        table.setRowHeight(28);

        JTableHeader header = table.getTableHeader();
        if (header != null) {
            header.setBackground(new Color(225, 176, 154));
            header.setForeground(Color.WHITE);
            header.setFont(new Font("SansSerif", Font.BOLD, 24));
        }
    }

    private void updateBalanceDisplay() {
        if (jFormattedTextField10.getText().trim().isEmpty()) {
            // No payment entered - show negative total due
            double totalAmountDue = Double.parseDouble(jLabel40.getText());
            jLabel39.setText(String.format("%.2f", -totalAmountDue));
        } else {
            // Payment entered - calculate proper balance
            try {
                double payment = Double.parseDouble(jFormattedTextField10.getText());
                double totalAmountDue = Double.parseDouble(jLabel40.getText());
                double balance = payment - totalAmountDue;
                jLabel39.setText(String.format("%.2f", balance));
            } catch (NumberFormatException e) {
                double totalAmountDue = Double.parseDouble(jLabel40.getText());
                jLabel39.setText(String.format("%.2f", -totalAmountDue));
            }
        }
    }

    private void updatetotal() {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();

        // Add checkbox listener for toggle functionality
        jCheckBox1.addActionListener(e -> {
            if (jCheckBox1.isSelected()) {
                // Store original prices and set 4th index to 3rd index value (remove discounts)
                originalPrices.clear(); // Clear any previous stored values
                for (int i = 0; i < model.getRowCount(); i++) {
                    // Store original discounted price
                    double originalDiscountedPrice = Double.parseDouble(model.getValueAt(i, 4).toString());
                    originalPrices.put(i, originalDiscountedPrice);

                    // Set to original price (no discount)
                    double originalPrice = Double.parseDouble(model.getValueAt(i, 3).toString());
                    model.setValueAt(String.format("%.2f", originalPrice), i, 4);
                }
            } else {
                // Restore original discounted prices
                for (int i = 0; i < model.getRowCount(); i++) {
                    if (originalPrices.containsKey(i)) {
                        model.setValueAt(String.format("%.2f", originalPrices.get(i)), i, 4);
                    }
                }
            }
            // Recalculate totals after checkbox change
            recalculateAllTotals(model);

            // ADDED: Update total due and balance when checkbox changes
            updateTotalAmountDue();
        });

        model.addTableModelListener(e -> {
            int row = e.getFirstRow();
            int column = e.getColumn();
            if (column == 4) {
                // If checkbox is selected, don't allow manual editing of prices
                if (jCheckBox1.isSelected()) {
                    return; // Exit early to prevent manual price changes when checkbox is selected
                }

                double apeMila = Double.parseDouble(model.getValueAt(row, 4).toString());
                double quantity = Double.parseDouble(model.getValueAt(row, 2).toString());
                double total = apeMila * quantity;
                model.setValueAt((String.format("%.2f", total)), row, 5);

                // Recalculate total savings
                recalculateAllTotals(model);

                // ADDED: Update total due and balance when table changes
                updateTotalAmountDue();
            }
        });
    }

    private void recalculateAllTotals(DefaultTableModel model) {
        // First update all row totals (column 5) based on current prices
        for (int i = 0; i < model.getRowCount(); i++) {
            double apeMila = Double.parseDouble(model.getValueAt(i, 4).toString());
            double quantity = Double.parseDouble(model.getValueAt(i, 2).toString());
            double total = apeMila * quantity;
            model.setValueAt((String.format("%.2f", total)), i, 5);
        }

        // Calculate total savings
        double saving = 0.0;
        for (int i = 0; i < model.getRowCount(); i++) {
            double weladapalaMilaOfRow = Double.parseDouble(model.getValueAt(i, 3).toString());
            double qtyOfRow = Double.parseDouble(model.getValueAt(i, 2).toString());

            double totalPrice = weladapalaMilaOfRow * qtyOfRow;

            double apeMilaOfRow = Double.parseDouble(model.getValueAt(i, 5).toString());
            saving += totalPrice - apeMilaOfRow;
        }
        jLabel19.setText(String.format("%.2f", saving));
        double subTotal = Double.parseDouble(jLabel18.getText());
        double totalSaving = Double.parseDouble(jLabel19.getText());

        jLabel20.setText(String.format("%.2f", (subTotal - totalSaving)));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barcodeInput;
    private javax.swing.JLabel creditBalanceLabel;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFormattedTextField jFormattedTextField10;
    private javax.swing.JFormattedTextField jFormattedTextField7;
    private javax.swing.JFormattedTextField jFormattedTextField8;
    private javax.swing.JFormattedTextField jFormattedTextField9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private void clearInputFields() {
        barcodeInput.setText("");
        jTextField2.setText("");
        jFormattedTextField7.setValue(0.0);
        jFormattedTextField8.setValue(0.0);
        jFormattedTextField9.setValue(0.0);
        barcodeInput.requestFocus();
    }

    private void setupNumberFields() {

        DecimalFormat decimalFormat = new DecimalFormat("#0.00");
        NumberFormatter formatter = new NumberFormatter(decimalFormat);
        formatter
                .setValueClass(Double.class
                );
        formatter.setAllowsInvalid(false);
        formatter.setMinimum(0.0);

        jFormattedTextField7.setFormatterFactory(new DefaultFormatterFactory(formatter));
        jFormattedTextField8.setFormatterFactory(new DefaultFormatterFactory(formatter));
        jFormattedTextField9.setFormatterFactory(new DefaultFormatterFactory(formatter));
    }

    private void addItem(JTable table) {

        DefaultTableModel model = (DefaultTableModel) table.getModel();

        String barcode = barcodeInput.getText().trim(); // Barcode input field
        String itemName = jTextField2.getText().trim();

        if (barcode.isEmpty() || itemName.isEmpty()) {
            return;
        }

        double quantity, weladapolaMila, apeMila;
        try {
            quantity = Double.parseDouble(jFormattedTextField7.getValue().toString());
            weladapolaMila = Double.parseDouble(jFormattedTextField8.getValue().toString());
            apeMila = Double.parseDouble(jFormattedTextField9.getValue().toString());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers",
                    "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (barcodeRowMap.containsKey(barcode)) {
            int rowIndex = barcodeRowMap.get(barcode);
            double currentQty = (double) model.getValueAt(rowIndex, 2);
            double newQty = currentQty + quantity;

            model.setValueAt(newQty, rowIndex, 2);
            model.setValueAt(newQty * apeMila, rowIndex, 5);

            updateSubTotalPrice();
            updateTotalSaving();
            calculateTotal();
        } else {
            double total = quantity * apeMila;
            int rowNumber = model.getRowCount() + 1;

            model.addRow(new Object[]{
                rowNumber,
                itemName,
                quantity,
                weladapolaMila,
                apeMila,
                total
            });
            updateSubTotalPrice();
            updateTotalSaving();
            calculateTotal();

            barcodeRowMap.put(barcode, model.getRowCount() - 1);
        }

        clearInputFields();
    }

    private void setupDeleteAction(JTable table) {
        try {
            table.getInputMap(JComponent.WHEN_FOCUSED).remove(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
            table.getInputMap(JComponent.WHEN_FOCUSED).remove(KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SPACE, 0));

            table.getInputMap(JComponent.WHEN_FOCUSED)
                    .put(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0), "deleteRow");
            table.getInputMap(JComponent.WHEN_FOCUSED)
                    .put(KeyStroke.getKeyStroke(KeyEvent.VK_BACK_SPACE, 0), "deleteRow");

            table.getActionMap().put("deleteRow", new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        int selectedRow = table.getSelectedRow();
                        if (selectedRow == -1) {
                            JOptionPane.showMessageDialog(table, "⚠️ Please select a product to delete.");
                            return;
                        }
                        if (table.getRowCount() == 0) {
                            return;
                        }

                        DefaultTableModel model = (DefaultTableModel) table.getModel();
                        model.removeRow(selectedRow);
                        updateSubTotalPrice();
                        updateTotalSaving();
                        calculateTotal();

                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(table,
                                "❌ Error deleting product: " + ex.getMessage(),
                                "Delete Error",
                                JOptionPane.ERROR_MESSAGE);
                        ex.printStackTrace();
                    }
                }
            });

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(table,
                    "❌ Error setting up delete functionality: " + ex.getMessage(),
                    "Setup Error",
                    JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }

    }

    private void updateSubTotalPrice() {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        double total = 0.0;

        for (int i = 0; i < model.getRowCount(); i++) {
            Object qtyObj = model.getValueAt(i, 2);
            Object priceObj = model.getValueAt(i, 3);

            if (qtyObj != null && priceObj != null) {
                try {
                    double qty = Double.parseDouble(qtyObj.toString());
                    double price = Double.parseDouble(priceObj.toString());
                    total += qty * price;
                } catch (NumberFormatException e) {
                    System.err.println("Invalid number format in row " + i);
                }
            }
        }

        jLabel18.setText(String.format("%.2f", total));
    }

    private void updateTotalSaving() {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        double totalsaving = 0.0;

        for (int i = 0; i < model.getRowCount(); i++) {
            Object weladapalaMilaObj = model.getValueAt(i, 3);
            Object qtyObj = model.getValueAt(i, 2);

            Object apeMilaTotalObj = model.getValueAt(i, 5);

            if (weladapalaMilaObj != null && apeMilaTotalObj != null && qtyObj != null) {
                try {
                    double totalWeladapalaMila = Double.parseDouble(weladapalaMilaObj.toString()) * Double.parseDouble(qtyObj.toString());
                    double apeMila = Double.parseDouble(apeMilaTotalObj.toString());
                    totalsaving += totalWeladapalaMila - apeMila;
                } catch (NumberFormatException e) {
                    System.err.println("Invalid number format in row " + i);
                }
            }
        }

        jLabel19.setText(String.format("%.2f", totalsaving));
    }

    private void calculateTotal() {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        double totalAmount = 0.0;

        for (int i = 0; i < model.getRowCount(); i++) {
            Object total = model.getValueAt(i, 5);
            if (total != null) {
                try {
                    totalAmount += Double.parseDouble(total.toString());
                } catch (NumberFormatException e) {
                    System.err.println("Invalid number format in row " + i);
                }
            }
        }

        jLabel20.setText(String.format("%.2f", totalAmount));

        // NEW: Update total amount due when bill total changes
        updateTotalAmountDue();
    }

    private void updateTotalAmountDue() {
        double currentBill = Double.parseDouble(jLabel20.getText());
        double previousCredit = Double.parseDouble(creditBalanceLabel.getText());
        double totalAmountDue = currentBill + previousCredit;
        jLabel40.setText(String.format("%.2f", totalAmountDue));

        // ADDED: Update balance immediately when total due changes
        if (jFormattedTextField10.getText().trim().isEmpty()) {
            // No payment entered - show negative total due
            jLabel39.setText(String.format("%.2f", -totalAmountDue));
        } else {
            // Payment entered - calculate proper balance
            try {
                double payment = Double.parseDouble(jFormattedTextField10.getText());
                double balance = payment - totalAmountDue;
                jLabel39.setText(String.format("%.2f", balance));
            } catch (NumberFormatException e) {
                jLabel39.setText(String.format("%.2f", -totalAmountDue));
            }
        }
    }

    private void updateBalance() {
        try {
            double total = Double.parseDouble(jLabel20.getText());

            String input = jFormattedTextField10.getText().trim();
            if (!input.isEmpty()) {
                double given = Double.parseDouble(input);

                double balance = given - total;

                jLabel39.setText(String.format("%.2f", balance));
            } else {
                jLabel39.setText("0.00");
            }
        } catch (NumberFormatException e) {
            jLabel39.setText("0.00");
        }
    }

    private void printBill() {

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        barcodeRowMap.clear();
        resetForm();
    }

    private void insertOrUpdateCreditorWithTransaction(String customerName, double debtAmount) throws SQLException {
        Connection conn = null;
        try {
            conn = Database.getInstace().getConnection();
            conn.setAutoCommit(false);

            // Check if customer already exists
            String checkSql = "SELECT id, total_debt FROM creditors WHERE LOWER(TRIM(name)) = LOWER(TRIM(?))";
            try (PreparedStatement checkStmt = conn.prepareStatement(checkSql)) {
                checkStmt.setString(1, customerName);
                try (ResultSet rs = checkStmt.executeQuery()) {
                    String currentDate = java.time.LocalDateTime.now().toString();

                    if (rs.next()) {
                        // Customer exists, update debt
                        double existingDebt = rs.getDouble("total_debt");
                        double newTotalDebt = existingDebt + debtAmount;

                        String updateSql = "UPDATE creditors SET total_debt = ?, last_credit_date = ? WHERE LOWER(TRIM(name)) = LOWER(TRIM(?))";
                        try (PreparedStatement updateStmt = conn.prepareStatement(updateSql)) {
                            updateStmt.setDouble(1, newTotalDebt);
                            updateStmt.setString(2, currentDate);
                            updateStmt.setString(3, customerName);
                            updateStmt.executeUpdate();
                        }

                        JOptionPane.showMessageDialog(
                                this,
                                String.format("ගනුදෙනුකරු '%s' හි ණය යාවත්කාලීන කරන ලදී.\nනව මුළු ණය: රු.%.2f",
                                        customerName, newTotalDebt),
                                "Customer Updated",
                                JOptionPane.INFORMATION_MESSAGE
                        );
                    } else {
                        // New customer, insert
                        String insertSql = "INSERT INTO creditors (name, total_debt, last_credit_date) VALUES (?, ?, ?)";
                        try (PreparedStatement insertStmt = conn.prepareStatement(insertSql)) {
                            insertStmt.setString(1, customerName);
                            insertStmt.setDouble(2, debtAmount);
                            insertStmt.setString(3, currentDate);
                            insertStmt.executeUpdate();
                        }

                        JOptionPane.showMessageDialog(
                                this,
                                String.format("නව ණය ගනුදෙනුකරු '%s' එකතු කරන ලදී.\nණය මුදල: රු.%.2f",
                                        customerName, debtAmount),
                                "Customer Added",
                                JOptionPane.INFORMATION_MESSAGE
                        );
                    }

                    conn.commit();
                }
            }
        } catch (SQLException e) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            throw e;
        } finally {
            if (conn != null) {
                try {
                    conn.setAutoCommit(true);
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void resetForm() {
        jLabel18.setText("0.00");
        jLabel19.setText("0.00");
        jLabel20.setText("0.00");
        jLabel39.setText("0.00");
        jLabel40.setText("0.00");

        jComboBox2.setSelectedIndex(0);
        creditBalanceLabel.setText("0.00");

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);

        jTextField1.setText("");
        jFormattedTextField10.setValue(null);
        jTextField1.setEnabled(false);
        jCheckBox1.setSelected(false);
        jComboBox2.setSelectedIndex(0);
        originalPrices.clear();

        selectedCustomerId = -1;
        clearSelection();
        barcodeInput.requestFocusInWindow();

    }

    private void updateCredit() {
        if (selectedCustomerId <= 0) {
            JOptionPane.showMessageDialog(this,
                    "කරුණාකර පළමුව ගනුදෙනුකරුවෙකු තෝරන්න.",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            String paymentText = "";
            if (paymentText.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "කරුණාකර ගෙවීමේ මුදල ඇතුළත් කරන්න.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double payableDebt = Double.parseDouble(paymentText);
            if (payableDebt < 0) {
                JOptionPane.showMessageDialog(this,
                        "කරුණාකර වලංගු ධන මුදලක් ඇතුළත් කරන්න.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (payableDebt > creditBalance) {
                JOptionPane.showMessageDialog(this,
                        String.format("ගෙවීමේ මුදල (රු.%.2f) ණය ශේෂයට (රු.%.2f) වඩා වැඩි විය නොහැක.",
                                payableDebt, creditBalance),
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double newDebt = creditBalance - payableDebt;

            // CHANGED: Use transaction method for consistency
            updateCustomerCreditWithTransaction(selectedCustomerId, newDebt,
                    String.format("Manual credit payment: %.2f", payableDebt));

            JOptionPane.showMessageDialog(this,
                    String.format("ණය ශේෂය සාර්ථකව යාවත්කාලීන කරන ලදී ✅\nනව ශේෂය: රු.%.2f", newDebt),
                    "Success", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "කරුණාකර වලංගු සංඛ්‍යාවක් ඇතුළත් කරන්න.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "දත්ත සමුදාය දෝෂයක් සිදුවී ඇත: " + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
