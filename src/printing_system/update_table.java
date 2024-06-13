/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package printing_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class update_table extends javax.swing.JFrame {
        
        // connection variables
        private static final String username = "root";
        private static final String password = "PHW#84#jeor";
        private static final String dataConn = "jdbc:mysql://localhost:3306/printing_db";
        private static PreparedStatement pst = null;
        private static ResultSet rs = null;
        private static java.sql.Connection sqlConn = null;
        
        
    public update_table() throws SQLException {
        initComponents();
        showTable();
        date();
        autoGmail();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public void date(){
        Date thisDate = new Date();
        SimpleDateFormat dateformat = new SimpleDateFormat("MM/dd/YYYY");
        txtdate.setText(dateformat.format(thisDate));
        txtdate.setEditable(false); // you can't edit this code because its set as false.
    }
    
    public void showTable() throws SQLException{
        try {
            Connection conn = DriverManager.getConnection(dataConn, username, password);
            pst = conn.prepareStatement("SELECT * FROM genarate_tbl");
            rs = pst.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int n = rsmd.getColumnCount();
            
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            
            while(rs.next()){
                Vector show = new Vector();
                for(int i = 1; i<=n; i++){
                    show.add(rs.getString("card_id"));
                    show.add(rs.getString("first_name"));
                    show.add(rs.getString("last_name"));
                    show.add(rs.getString("username"));
                    show.add(rs.getString("address"));
                    show.add(rs.getString("mobile_number"));
                    show.add(rs.getString("gender"));
                    show.add(rs.getString("register_date"));
                    show.add(rs.getString("category"));
                }
                    dtm.addRow(show);
            }
        } catch (SQLException e) {
                System.out.println(e.getMessage());
        }
    }
    
    public void autoGmail(){
        txtusername.setText("@gmail.com");
        txtusername.setEditable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtcard_number = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtfirstname = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtlastname = new javax.swing.JTextField();
        combocategory = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        combogender = new javax.swing.JComboBox<>();
        txtusername = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtmobilenumber = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtcard_number.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtcard_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcard_numberActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel16.setText("Gender");

        txtfirstname.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel17.setText("Register date:");

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel11.setText("Firstname:");

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel18.setText("Category:");

        txtlastname.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        combocategory.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        combocategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student", "Senior", "PWD", "Citizens" }));
        combocategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combocategoryActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel12.setText("Lastname:");

        combogender.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        combogender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        combogender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combogenderActionPerformed(evt);
            }
        });

        txtusername.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        txtdate.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel13.setText("Username:");

        txtaddress.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(78, 76, 126));

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Update identification");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel14.setText("Address:");

        txtmobilenumber.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtmobilenumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmobilenumberActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(78, 76, 126));
        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel10.setText("Card ID:");

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel15.setText("Mobile number:");

        jTable1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Card ID", "Firstname", "Lastname", "Username", "Address", "Mobile Number", "Gender", "Register Date", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setGridColor(new java.awt.Color(102, 102, 102));
        jTable1.setShowGrid(false);
        jTable1.setShowVerticalLines(true);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(txtfirstname)
                            .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12)
                            .addComponent(txtlastname)
                            .addComponent(jLabel10)
                            .addComponent(txtcard_number, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combogender, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18)
                            .addComponent(combocategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(txtmobilenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtmobilenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(combogender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combocategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcard_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtlastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtcard_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcard_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcard_numberActionPerformed

    private void combocategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combocategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combocategoryActionPerformed

    private void combogenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combogenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combogenderActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        // Gather data from input fields
        String cardNumber = txtcard_number.getText();
        String firstname = txtfirstname.getText();
        String lastname = txtlastname.getText();
        String username = txtusername.getText();
        String address = txtaddress.getText();
        String mobileNumber = txtmobilenumber.getText();
        String gender = combogender.getSelectedItem().toString();
        String registerDate = txtdate.getText();
        String category = combocategory.getSelectedItem().toString();

        // Check if any field is empty or invalid
        if (cardNumber.isEmpty() || firstname.isEmpty() || lastname.isEmpty() ||
                username.isEmpty() || address.isEmpty() || mobileNumber.isEmpty() ||
                gender.equals("-Select Gender-") || registerDate.isEmpty() || category.equals("-Select Category-")) {
            JOptionPane.showMessageDialog(this, "Cannot leave the fields empty", "Warning", JOptionPane.WARNING_MESSAGE);
            return; // Exit the method if validation fails
        }

        // Ensure a row is selected
        int row = jTable1.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Exit the method if no row is selected
        }

        try {
            // Establish a connection to the database
            Connection conn = DriverManager.getConnection(dataConn, "root", password);

            // Get the value of the primary key (card_id) from the selected row
            String value = jTable1.getModel().getValueAt(row, 0).toString();

            // SQL UPDATE query to update the row in the database
            String query = "UPDATE genarate_tbl SET first_name = ?, last_name = ?, username = ?, address = ?, mobile_number = ?, gender = ?, register_date = ?, category = ? WHERE card_id = ?";

            // Prepare the statement and set the values for the placeholders
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setString(1, firstname);
            pst.setString(2, lastname);
            pst.setString(3, username);
            pst.setString(4, address);
            pst.setString(5, mobileNumber);
            pst.setString(6, gender);
            pst.setString(7, registerDate);
            pst.setString(8, category);
            pst.setString(9, value);

            // Execute the UPDATE statement
            pst.executeUpdate();

            // Close the prepared statement and connection
            pst.close();
            conn.close();

            // Refresh the table model to reflect the changes
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0); // Clear the table
            showTable(); // Reload the table data
            JOptionPane.showMessageDialog(null, "Updated Successfully");

        } catch (SQLException e) {
            // Show error message if there is an exception
            JOptionPane.showMessageDialog(null, e.getMessage(), "SQL Error", JOptionPane.ERROR_MESSAGE);
        }


        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtmobilenumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmobilenumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmobilenumberActionPerformed

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
            java.util.logging.Logger.getLogger(update_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(update_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(update_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(update_table.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new update_table().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(update_table.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combocategory;
    private javax.swing.JComboBox<String> combogender;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtcard_number;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JTextField txtlastname;
    private javax.swing.JTextField txtmobilenumber;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
