package GUI;

import dao.ProductDAO;
import database.Database;
import dto.Product;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
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

    private final Map<String, Integer> barcodeRowMap = new HashMap<>();
    private final Map<Integer, Double> originalPrices = new HashMap<>();

    public BillDashboard() {
        initComponents();

        updatetotal();

        initializeCustomerComboBox();
        SwingUtilities.invokeLater(() -> {
            barcodeInput.requestFocus();
        });

        jTextField2.setEditable(false);
        setupNumberFields();
        setupTableAppearance(jTable2);

        setupDeleteAction(jTable2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
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
        jTextField3 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jComboBox2 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

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

        jLabel10.setFont(new java.awt.Font("Iskoola Pota", 1, 24)); // NOI18N
        jLabel10.setText("බිල් අයිතම");

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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(20, 20, 20))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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

        jButton3.setBackground(new java.awt.Color(0, 153, 255));
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

        jFormattedTextField7.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("0.0"))));
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
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jFormattedTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(36, Short.MAX_VALUE))))
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
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
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

        jTextField3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
        jLabel24.setText("ශේෂය");

        jLabel25.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jLabel25.setText("රු.");

        jLabel39.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText("0.00");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addComponent(jTextField3))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel39))
                .addContainerGap(18, Short.MAX_VALUE))
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

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCheckBox1.setFont(new java.awt.Font("Iskoola Pota", 0, 16)); // NOI18N
        jCheckBox1.setText("ණය ගණුදෙනුකරුවකු.");

        jLabel4.setFont(new java.awt.Font("Iskoola Pota", 1, 24)); // NOI18N
        jLabel4.setText("පාරිභෝගික තොරතුරු");

        jLabel2.setFont(new java.awt.Font("Iskoola Pota", 0, 18)); // NOI18N
        jLabel2.setText("පාරිභෝගික නම");

        jButton1.setText("+");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(892, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1))
                        .addComponent(jCheckBox1)
                        .addComponent(jLabel4)
                        .addComponent(jLabel2)
                        .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(340, 340, 340)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addGap(33, 33, 33)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(217, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(150, 150, 150)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        add(jPanel9, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        updateBalance();
    }//GEN-LAST:event_jTextField3KeyReleased

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
        System.out.println("Searching for barcode: " + barcode);

        ProductDAO productDAO = new ProductDAO();
        try {
            Product product = productDAO.searchByBarcode(barcode);

            if (product != null) {
                jTextField2.setText(product.getEnName());
                jFormattedTextField8.setValue(product.getWeladapalaMila());
                jFormattedTextField9.setValue(product.getApeMila());
                jFormattedTextField7.requestFocus();
                System.out.println("Product found: " + product.getEnName());
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
                System.err.println("Database connection is null");
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
                isUpdating = true;
                editor.setText(selected);
                editor.setCaretPosition(selected.length());
                isUpdating = false;
                jComboBox2.hidePopup();
            }
        });
    }

    private void filterComboBox() {
        JTextComponent editor = (JTextComponent) jComboBox2.getEditor().getEditorComponent();
        String text = editor.getText().toLowerCase();

        isUpdating = true;

        jComboBox2.removeAllItems();

        if (text.isEmpty()) {
            for (String customer : allCustomers) {
                jComboBox2.addItem(customer);
            }
        } else {
            boolean hasMatches = false;
            for (String customer : allCustomers) {
                if (customer.toLowerCase().contains(text)) {
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
            String selected = jComboBox2.getSelectedItem().toString();
            return selected.equals("No matches found") ? "" : selected;
        }
        return "";
    }

    public void clearSelection() {
        isUpdating = true;
        jComboBox2.setSelectedIndex(-1);
        JTextComponent editor = (JTextComponent) jComboBox2.getEditor().getEditorComponent();
        editor.setText("");
        isUpdating = false;
    }

    public void refreshCustomerList() {
        loadAllCustomers();
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
            System.out.println("total price " + totalPrice);

            double apeMilaOfRow = Double.parseDouble(model.getValueAt(i, 5).toString());
            System.out.println("ape mila row " + apeMilaOfRow);
            saving += totalPrice - apeMilaOfRow;
            System.out.println("Saving " + saving);
        }
        jLabel19.setText(String.format("%.2f", saving));
        double subTotal = Double.parseDouble(jLabel18.getText());
        double totalSaving = Double.parseDouble(jLabel19.getText());

        jLabel20.setText(String.format("%.2f", (subTotal - totalSaving)));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barcodeInput;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
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
            // Update existing row
            int rowIndex = barcodeRowMap.get(barcode);
            double currentQty = (double) model.getValueAt(rowIndex, 2);
            double newQty = currentQty + quantity;

            model.setValueAt(newQty, rowIndex, 2); // Update quantity
            model.setValueAt(newQty * apeMila, rowIndex, 5); // Update total

            updateSubTotalPrice();
            updateTotalSaving();
            calculateTotal();
        } else {
            // Add new row
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
            System.out.println("qty " + qtyObj);
            Object priceObj = model.getValueAt(i, 3);
            System.out.println("price " + priceObj);

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
    }

    private void updateBalance() {
        try {
            // Get total amount
            double total = Double.parseDouble(jLabel20.getText());

            // Get amount given by customer
            String input = jTextField3.getText().trim();
            if (!input.isEmpty()) {
                double given = Double.parseDouble(input);

                // Calculate balance
                double balance = given - total;

                // Display balance
                jLabel39.setText(String.format("%.2f", balance));
            } else {
                jLabel39.setText("0.00");
            }
        } catch (NumberFormatException e) {
            jLabel39.setText("0.00"); // Invalid input
        }
    }

}
