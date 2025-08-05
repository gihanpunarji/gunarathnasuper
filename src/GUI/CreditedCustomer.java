package GUI;

import database.Database;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class CreditedCustomer extends javax.swing.JPanel {

    private DecimalFormat decimalFormat = new DecimalFormat("0.00");
    private double originalValue = 0.0;
    private int editingRow = -1;

    public CreditedCustomer() {
        initComponents();
        loadCreditedCustomersData();
        loadCreditedCustomersTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel1.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("මුළු ණය");

        jLabel35.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 153, 0));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("0.00");

        jLabel36.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 153, 0));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("රු.");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/green line.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel35)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel2.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("ණය ගණුදෙනුකරුවන්");

        jLabel28.setFont(new java.awt.Font("Iskoola Pota", 1, 24)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("5");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel28)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel3.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("සාමාන්‍ය ණය");

        jLabel33.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 153, 0));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("රු.");

        jLabel34.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 153, 0));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("0.00");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/org line.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel33)
                        .addComponent(jLabel34))
                    .addComponent(jLabel8))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        add(jPanel6, java.awt.BorderLayout.PAGE_START);

        jLabel9.setFont(new java.awt.Font("Iskoola Pota", 1, 22)); // NOI18N
        jLabel9.setText("ණය ගණුදෙනුකරුවන්");

        jTextField4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Iskoola Pota", 0, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/search1.png"))); // NOI18N

        jButton5.setBackground(new java.awt.Color(116, 141, 174));
        jButton5.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("+ නව ගණුදෙනුකරුවකු එකතු කරන්න");
        jButton5.setBorderPainted(false);
        jButton5.setMaximumSize(new java.awt.Dimension(112, 22));
        jButton5.setMinimumSize(new java.awt.Dimension(112, 22));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "අංකය", "පාරිභොගික නම", "දිනය", "ගෙවීමට ඇති මුදල"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(1022, Short.MAX_VALUE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        add(jPanel12, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AddCreditedCustomer addCreditedCus = new AddCreditedCustomer(this);
        addCreditedCus.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        searchCreditedCustomers();

    }//GEN-LAST:event_jTextField4KeyReleased

    private void loadCreditedCustomersData() {
        try (Connection conn = Database.getInstace().getConnection()) {
            if (conn == null) {
                System.err.println("Database connection is null");
                return;
            }

            try (PreparedStatement pstmt = conn.prepareStatement(
                    "SELECT COUNT(*) as count, COALESCE(SUM(total_debt), 0) as total FROM creditors"); ResultSet rs = pstmt.executeQuery()) {

                if (rs.next()) {
                    int count = rs.getInt("count");
                    double totalDebt = rs.getDouble("total");
                    double averageDebt = count > 0 ? totalDebt / count : 0.0;

                    jLabel35.setText(decimalFormat.format(totalDebt));
                    jLabel28.setText(String.valueOf(count));
                    jLabel34.setText(decimalFormat.format(averageDebt));
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(CreditedCustomer.class.getName()).log(Level.SEVERE, "Error loading data", ex);
            JOptionPane.showMessageDialog(CreditedCustomer.this,
                    "දත්ත පූරණය කිරීමේ දෝෂය: " + ex.getMessage(),
                    "දෝෂයකි",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadCreditedCustomersTable() {
        try (Connection conn = Database.getInstace().getConnection()) {
            if (conn == null) {
                System.err.println("Database connection is null");
                return;
            }

            ensureLastCreditDateColumn(conn);

            String query = "SELECT c.id, c.name, "
                    + "COALESCE(c.last_credit_date, 'N/A') as last_credit_date, "
                    + "COALESCE(c.total_debt, 0.0) as total_debt "
                    + "FROM creditors c "
                    + "ORDER BY c.last_credit_date DESC";

            try (PreparedStatement pstmt = conn.prepareStatement(query); ResultSet rs = pstmt.executeQuery()) {

                DefaultTableModel model = new DefaultTableModel(new String[]{"අනු අංකය", "නම", "අවසාන දිනය", "මුළු ණය"}, 0) {
                    @Override
                    public boolean isCellEditable(int row, int column) {
                        return column == 3;
                    }

                    @Override
                    public Class<?> getColumnClass(int columnIndex) {
                        if (columnIndex == 0) {
                            return Integer.class;
                        }
                        if (columnIndex == 3) {
                            return Double.class;
                        }
                        return String.class;
                    }
                };

                while (rs.next()) {
                    String lastCreditDate = rs.getString("last_credit_date");
                    if (lastCreditDate != null && !lastCreditDate.equals("N/A") && lastCreditDate.contains(" ")) {
                        lastCreditDate = lastCreditDate.split(" ")[0];
                    }

                    Object[] row = {
                        rs.getInt("id"),
                        rs.getString("name"),
                        lastCreditDate != null ? lastCreditDate : "N/A",
                        rs.getDouble("total_debt")
                    };
                    model.addRow(row);
                }

                jTable3.setModel(model);
                jTable3.getTableHeader().setReorderingAllowed(false);
                jTable3.setFont(new Font("SansSerif", Font.PLAIN, 19));
                addDebtEditListener();

                JTableHeader header = jTable3.getTableHeader();
                if (header != null) {
                    header.setBackground(new Color(204, 127, 84));
                    header.setForeground(Color.WHITE);
                    header.setFont(new Font("SansSerif", Font.BOLD, 20));
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(CreditedCustomer.class.getName()).log(Level.SEVERE, "Error loading table", ex);
            JOptionPane.showMessageDialog(CreditedCustomer.this,
                    "වගුව පූරණය කිරීමේ දෝෂය: " + ex.getMessage(),
                    "දෝෂයකි",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addDebtEditListener() {
        jTable3.getModel().addTableModelListener(e -> {
            if (e.getType() == TableModelEvent.UPDATE && e.getColumn() == 3) {
                int row = e.getFirstRow();
                DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
                int customerId = (int) model.getValueAt(row, 0);
                String customerName = (String) model.getValueAt(row, 1);
                Object value = model.getValueAt(row, 3);

                if (value instanceof Number) {
                    double newAmount = ((Number) value).doubleValue();
                    int confirm = JOptionPane.showConfirmDialog(this,
                            "ඔබට '" + customerName + "' හි වට්ටම් මුදල " + value + newAmount + " ලෙස යාවත්කාලීන කිරීමට අවශ්‍යද?",
                            "තහවුරු කිරීම", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) {
                        if (updateCreditedAmount(customerId, newAmount)) {
                            refreshData();
                        }
                    } else {
                        refreshData(); // cancel = reset table value
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "වලංගු ද්‍රව්‍යම මුදලක් ඇතුළත් කරන්න!", "දෝෂයකි", JOptionPane.ERROR_MESSAGE);
                    refreshData();
                }
            }
        });
    }

    private void searchCreditedCustomers() {
        String keyword = jTextField4.getText().trim();

        try (Connection conn = Database.getInstace().getConnection()) {
            if (conn == null) {
                System.err.println("Database connection is null");
                return;
            }

            String query;
            PreparedStatement pstmt;

            if (keyword.isEmpty()) {
                loadCreditedCustomersTable();
                return;
            }

            query = "SELECT c.id, c.name, "
                    + "COALESCE(c.last_credit_date, 'N/A') as last_credit_date, "
                    + "COALESCE(c.total_debt, 0.0) as total_debt "
                    + "FROM creditors c "
                    + "WHERE CAST(c.id AS TEXT) LIKE ? OR c.name LIKE ? "
                    + "ORDER BY c.total_debt DESC";

            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, "%" + keyword + "%");
            pstmt.setString(2, "%" + keyword + "%");

            try (ResultSet rs = pstmt.executeQuery()) {
                DefaultTableModel model = (DefaultTableModel) jTable3.getModel();
                model.setRowCount(0);

                while (rs.next()) {
                    String lastCreditDate = rs.getString("last_credit_date");
                    if (lastCreditDate != null && !lastCreditDate.equals("N/A") && lastCreditDate.contains(" ")) {
                        lastCreditDate = lastCreditDate.split(" ")[0];
                    }

                    Object[] row = {
                        rs.getInt("id"),
                        rs.getString("name"),
                        lastCreditDate != null ? lastCreditDate : "N/A",
                        rs.getDouble("total_debt")
                    };
                    model.addRow(row);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreditedCustomer.class.getName()).log(Level.SEVERE, "Error searching", ex);
            JOptionPane.showMessageDialog(this,
                    "සොයන්නේ දී දෝෂයක් සිදු විය: " + ex.getMessage(),
                    "සෙවුම් දෝෂය",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void refreshData() {
        loadCreditedCustomersData();
        loadCreditedCustomersTable();
    }

    private void ensureLastCreditDateColumn(Connection conn) {
        try (Statement stmt = conn.createStatement()) {
            ResultSet tables = conn.getMetaData().getTables(null, null, "creditors", null);
            if (!tables.next()) {
                String createTableQuery = """
                    CREATE TABLE IF NOT EXISTS creditors (
                        id INTEGER PRIMARY KEY AUTOINCREMENT,
                        name TEXT NOT NULL,
                        total_debt REAL DEFAULT 0.0,
                        last_credit_date TEXT DEFAULT NULL
                    )
                """;
                stmt.execute(createTableQuery);
                System.out.println("Created creditors table");
                return;
            }

            ResultSet rs = stmt.executeQuery("PRAGMA table_info(creditors)");
            boolean hasColumn = false;
            while (rs.next()) {
                if ("last_credit_date".equals(rs.getString("name"))) {
                    hasColumn = true;
                    break;
                }
            }

            if (!hasColumn) {
                stmt.execute("ALTER TABLE creditors ADD COLUMN last_credit_date TEXT");
                stmt.execute("UPDATE creditors SET last_credit_date = datetime('now', 'localtime') WHERE last_credit_date IS NULL");
                System.out.println("Added last_credit_date column and updated existing records");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CreditedCustomer.class.getName()).log(Level.WARNING, "Could not ensure table structure", ex);
        }
    }

    private boolean updateCreditedAmount(int customerId, double newAmount) {
        try (Connection conn = Database.getInstace().getConnection()) {
            if (conn == null) {
                JOptionPane.showMessageDialog(this,
                        "දත්ත ගබඩාවට සම්බන්ධ වීමට නොහැකි විය!",
                        "දෝෂයකි",
                        JOptionPane.ERROR_MESSAGE);
                return false;
            }

            String updateQuery = "UPDATE creditors SET total_debt = ?, last_credit_date = datetime('now', 'localtime') WHERE id = ?";

            try (PreparedStatement pstmt = conn.prepareStatement(updateQuery)) {
                pstmt.setDouble(1, newAmount);
                pstmt.setInt(2, customerId);

                int rowsAffected = pstmt.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this,
                            "ගෙවීමට ඇති මුදල සාර්ථකව යාවත්කාලීන කරන ලදී!",
                            "සාර්ථකයි",
                            JOptionPane.INFORMATION_MESSAGE);
                    return true;
                } else {
                    JOptionPane.showMessageDialog(this,
                            "ගෙවීමට ඇති මුදල යාවත්කාලීන කිරීමට අසමත් විය!",
                            "දෝෂයකි",
                            JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(CreditedCustomer.class.getName()).log(Level.SEVERE, "Database error", ex);
            JOptionPane.showMessageDialog(this,
                    "දත්ත ගබඩා දෝෂය: " + ex.getMessage(),
                    "දෝෂයකි",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
