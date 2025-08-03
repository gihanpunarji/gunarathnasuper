package GUI;

import database.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AddCreditedCustomer extends javax.swing.JFrame {

    private CreditedCustomer parentPanel;

    public AddCreditedCustomer() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public AddCreditedCustomer(CreditedCustomer parent) {
        initComponents();
        this.parentPanel = parent;
        setLocationRelativeTo(parent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setResizable(false);

        jLabel4.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jLabel4.setText("නව ණය ගණුදෙනුකරුවකු එකතු කරන්න");

        jLabel6.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        jLabel6.setText("නම");

        jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Iskoola Pota", 0, 14)); // NOI18N
        jLabel9.setText("ගෙවීමට ඇති මුදල");

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton3.setBackground(new java.awt.Color(85, 88, 121));
        jButton3.setFont(new java.awt.Font("Iskoola Pota", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText(" එකතු කරන්න");
        jButton3.setBorderPainted(false);
        jButton3.setMaximumSize(new java.awt.Dimension(112, 22));
        jButton3.setMinimumSize(new java.awt.Dimension(112, 22));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        jTextField5.requestFocus();

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        addCreditedCustomer();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {
        // Add customer when Enter is pressed in debt amount field
        addCreditedCustomer();

    }

    private void addCreditedCustomer() {
        try {
            // Validate input fields
            String name = jTextField2.getText().trim();
            String debtAmountText = jTextField5.getText().trim();

            // Check if name is empty
            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "⚠️ කරුණාකර ගණුදෙනුකරුවගේ නම ඇතුළත් කරන්න!",
                        "Validation Error",
                        JOptionPane.WARNING_MESSAGE);
                jTextField2.requestFocus();
                return;
            }

            // Check if name is too long
            if (name.length() > 255) {
                JOptionPane.showMessageDialog(this,
                        "⚠️ නම අකුරු 255ට වඩා කුඩා විය යුතුය!",
                        "Validation Error",
                        JOptionPane.WARNING_MESSAGE);
                jTextField2.requestFocus();
                return;
            }

            // Validate debt amount
            double debtAmount = 0.0;
            if (!debtAmountText.isEmpty()) {
                try {
                    debtAmount = Double.parseDouble(debtAmountText);
                    if (debtAmount < 0) {
                        JOptionPane.showMessageDialog(this,
                                "⚠️ ණය මුදල සෘණ විය නොහැක!",
                                "Validation Error",
                                JOptionPane.WARNING_MESSAGE);
                        jTextField5.requestFocus();
                        return;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this,
                            "⚠️ කරුණාකර වලංගු ණය මුදලක් ඇතුළත් කරන්න!",
                            "Validation Error",
                            JOptionPane.WARNING_MESSAGE);
                    jTextField5.requestFocus();
                    return;
                }
            }

            // Insert into database
            boolean success = insertCreditedCustomer(name, debtAmount);

            if (success) {
                JOptionPane.showMessageDialog(this,
                        "✅ ණය ගණුදෙනුකරුවා සාර්ථකව එකතු කරන ලදී!\n"
                        + "නම: " + name + "\n"
                        + "ණය මුදල: රු. " + String.format("%.2f", debtAmount),
                        "Success",
                        JOptionPane.INFORMATION_MESSAGE);

                // Clear fields for next entry
                clearFields();

                // Refresh parent panel if exists
                if (parentPanel != null) {
                    parentPanel.refreshData();
                }

                this.dispose();

            } else {
                JOptionPane.showMessageDialog(this,
                        "❌ ණය ගණුදෙනුකරුවා එකතු කිරීමේදී දෝෂයක් ඇතිවිය!",
                        "Database Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception ex) {
            Logger.getLogger(AddCreditedCustomer.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,
                    "❌ අනපේක්ෂිත දෝෂයක්: " + ex.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean insertCreditedCustomer(String name, double totalDebt) {
        String sql = "INSERT INTO creditors (name, total_debt, last_credit_date) VALUES (?, ?, datetime('now', 'localtime'))";

        try (Connection conn = Database.getInstace().getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.setDouble(2, totalDebt);

            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException ex) {
            Logger.getLogger(AddCreditedCustomer.class.getName()).log(Level.SEVERE, null, ex);

            // Check for specific error types
            if (ex.getMessage().contains("UNIQUE constraint failed")) {
                JOptionPane.showMessageDialog(this,
                        "⚠️ මෙම නමින් ගණුදෙනුකරුවකු දැනටමත් පවතී!",
                        "Duplicate Entry",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "❌ දත්ත ගබඩාව දෝෂය: " + ex.getMessage(),
                        "Database Error",
                        JOptionPane.ERROR_MESSAGE);
            }
            return false;
        }
    }

    private void clearFields() {
        jTextField2.setText("");
        jTextField5.setText("");
        jTextField2.requestFocus();
    }

    // Method to check if customer name already exists (optional feature)
    private boolean customerExists(String name) {
        String sql = "SELECT COUNT(*) FROM creditors WHERE LOWER(name) = LOWER(?)";

        try (Connection conn = Database.getInstace().getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, name);
            var rs = pstmt.executeQuery();

            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddCreditedCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    // Override dispose to refresh parent panel
    @Override
    public void dispose() {
        if (parentPanel != null) {
            parentPanel.refreshData();
        }
        super.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
