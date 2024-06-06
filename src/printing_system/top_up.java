package printing_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import raven.toast.Notifications;

public class top_up extends javax.swing.JFrame {
    
    private static final String username = "root";
    private static final String password = "PHW#84#jeor";
    private static final String dataConn = "jdbc:mysql://localhost:3306/printing_db";
    
    private static PreparedStatement pst = null;
    private static ResultSet rs = null;
    private static Connection sqlConn = null;
    
    public top_up() {
        initComponents();
        Font poppinsFont = loadFont("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\LoginSystem\\src\\printing_system\\Poppins-SemiBold.ttf", 14f);
        setFontToComponents(poppinsFont);
        addPlaceHolderStyle(txt_id);
        addPlaceHolderStyle(txt_amount);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    
    
    private Font loadFont(String path, float size) {
        try {
            // Create the font from the file
            Font font = Font.createFont(Font.TRUETYPE_FONT, new File(path));
            // Derive the font at the specified size
            return font.deriveFont(size);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
            // Fall back to a default font in case of error
            return new JLabel().getFont().deriveFont(size);
        }
    }
    
    private void setFontToComponents(Font font) {
        jLabel5.setFont(font);
        jButton3.setFont(font);
        
        txt_reciept.setFont(font);
        receipt_btn.setFont(font);
    }
    
    public void addPlaceHolderStyle(JTextField textField) {
        Font font = textField.getFont();
        textField.setFont(font);
        textField.setForeground(Color.gray); //font color
    }
    
    public void removePlaceHolderStyle(JTextField textField) {
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN | Font.BOLD);
        textField.setFont(font);
        textField.setForeground(Color.black); //font color
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txt_id = new javax.swing.JTextField();
        txt_amount = new javax.swing.JTextField();
        receipt_btn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_reciept = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jButton3.setBackground(new java.awt.Color(78, 76, 126));
        jButton3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Confirm");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txt_id.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_id.setText("ID CARD");
        txt_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_idFocusLost(evt);
            }
        });
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        txt_amount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_amount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_amount.setText("AMOUNT");
        txt_amount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt_amount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_amountFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_amountFocusLost(evt);
            }
        });

        receipt_btn.setBackground(new java.awt.Color(78, 76, 126));
        receipt_btn.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        receipt_btn.setForeground(new java.awt.Color(255, 255, 255));
        receipt_btn.setText("Get receipt");
        receipt_btn.setBorder(null);
        receipt_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receipt_btnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(78, 76, 126));

        jLabel19.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account_balance_wallet_20dp_FILL0_wght400_GRAD0_opsz20.png"))); // NOI18N
        jLabel19.setText("Top-up");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txt_reciept.setColumns(20);
        txt_reciept.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        txt_reciept.setRows(5);
        txt_reciept.setAutoscrolls(false);
        txt_reciept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(txt_reciept);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addComponent(txt_amount, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_id))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addComponent(receipt_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(249, 249, 249))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(receipt_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String id_card = txt_id.getText().trim();
        String amount = txt_amount.getText().trim();

        // Check if both fields are not empty
        if (id_card.isEmpty() || amount.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter both the card ID and the amount before proceeding.", "Missing Information", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Validate if id_card contains only numeric characters
        if (!id_card.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Please enter a valid card ID.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Converted to Int and Double
        int card_id = Integer.parseInt(id_card);
        double Amount = Double.parseDouble(amount);

        try {            
            Connection con = DriverManager.getConnection(dataConn, username, password);
            Statement stm = con.createStatement();
            String query = "INSERT INTO top_up_new VALUES(" + card_id + ", '" + Amount + "')";
            stm.execute(query);
            Notification noti = new Notification(this, Notifications.Type.SUCCESS, Notification.location.TOP_CENTER, "Successful.");
            noti.showNotification();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jButton3, "This ID is not REGISTERED!");
            Notification noti = new Notification(this, Notifications.Type.ERROR, Notification.location.TOP_CENTER, "Not registered.");
            noti.showNotification();
            e.printStackTrace();
        }

        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void receipt_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receipt_btnActionPerformed
        
        try {
            
            txt_reciept.setEditable(false);
            Connection con = DriverManager.getConnection(dataConn, username, password);
            Statement stm = con.createStatement();
            
            BigDecimal find_card = new BigDecimal(txt_id.getText());
            BigDecimal find_amount = new BigDecimal(txt_amount.getText());
            
            String query = "SELECT tu.card_id, tu.Amount, p.first_name, p.last_name, p.address "
                         + "FROM top_up_new tu "
                         + "JOIN genarate_tbl p ON tu.card_id = p.card_id "
                         + "WHERE tu.card_id = " + find_card + " AND tu.Amount = " + find_amount;
            
            
            ResultSet rs = stm.executeQuery(query);
            
            
            txt_reciept.setText("");
            
            txt_reciept.append("                                70 Regalado Avenue, North Fairview\n");
            txt_reciept.append("                                      Quezon City, 1121 Metro Manila\n");
            txt_reciept.append("                                     09454305799, 0440-2984-2210\n");
            txt_reciept.append("                                                                        \n");
            txt_reciept.append("                                        TravelEase Transport Service\n");
            txt_reciept.append("                                                                        \n");
            
            if (rs.next()) {
                int card_id = rs.getInt("card_id");
                double Amount = rs.getDouble("Amount");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                String address = rs.getString("address");

                // Customer pays
                String receiptLine = String.format("Contract Account No : %d \nAmount: %.2f\n", card_id, Amount);
                txt_reciept.append(receiptLine);

                // Customer details
                String customerDetails = String.format("Customer Name: %s %s\nAddress: %s\n", firstName, lastName, address);
                txt_reciept.append(customerDetails);
            }else{
                txt_reciept.append("No data found for card ID: ");
            }
            
            txt_reciept.append("  ------------------------------------------------------\n");
            txt_reciept.append("                                        Thank you for your business!\n");
            
            // get the current data today.
            LocalDate currentDate = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            String formattedDate = currentDate.format(formatter);
            
            // Add the date to the txt_receipt which is the textfield.
            txt_reciept.append("                                                             " + formattedDate);
            
            con.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_receipt_btnActionPerformed

    private void txt_idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_idFocusGained
        
        if (txt_id.getText().equals("ID CARD")) {
            txt_id.setText(null);
            txt_id.requestFocus();
            // remove placeholder style
            removePlaceHolderStyle(txt_id);
        }
        
    }//GEN-LAST:event_txt_idFocusGained

    private void txt_amountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_amountFocusGained
        if (txt_amount.getText().equals("AMOUNT")) {
            txt_amount.setText(null);
            txt_amount.requestFocus();
            // remove placeholder style
            removePlaceHolderStyle(txt_amount);
        }
    }//GEN-LAST:event_txt_amountFocusGained

    private void txt_idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_idFocusLost
        
        if (txt_id.getText().length() == 0) {
            //add placeholder style 
            addPlaceHolderStyle(txt_id);
            txt_id.setText("ID CARD");
        }
        
    }//GEN-LAST:event_txt_idFocusLost

    private void txt_amountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_amountFocusLost
        if (txt_amount.getText().length() == 0) {
            //add placeholder style 
            addPlaceHolderStyle(txt_amount);
            txt_amount.setText("AMOUNT");
        }
    }//GEN-LAST:event_txt_amountFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new top_up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton receipt_btn;
    private javax.swing.JTextField txt_amount;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextArea txt_reciept;
    // End of variables declaration//GEN-END:variables
}
