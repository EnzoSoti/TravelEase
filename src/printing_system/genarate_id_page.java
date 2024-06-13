
package printing_system;

import java.sql.Connection;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import raven.toast.Notifications;

public class genarate_id_page extends javax.swing.JFrame {
    
        private static final String username = "root";
        private static final String password = "PHW#84#jeor";
        private static final String dataConn = "jdbc:mysql://localhost:3306/printing_db";
        private static PreparedStatement pst = null;
        private static ResultSet rs = null;
        private static java.sql.Connection sqlConn = null;
    
    public genarate_id_page() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        //Font poppinsFont = loadFont("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\LoginSystem\\src\\printing_system\\Poppins-Bold.ttf", 14f);
        //setFontToComponents(poppinsFont);
        randomnumber();
        autoGmail();
        date();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //Did not close the entire screen.
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
    
    }
    
    
    // auto date format
    public void date(){
        Date thisDate = new Date();
        SimpleDateFormat dateformat = new SimpleDateFormat("MM/dd/YYYY");
        txtdate.setText(dateformat.format(thisDate));
        txtdate.setEditable(false); // you can't edit this code because its set as false.
    }
    
    // auto gmail.com 
    public void autoGmail(){
        txtusername.setText("@gmail.com");
        txtusername.setEditable(true);
    }
    
    
    
   // random id card number 
   public void randomnumber(){
       try {
           txtcard_number.setEditable(false);
           Connection con = (Connection) DriverManager.getConnection(dataConn, username, password);
           String query = "SELECT card_id FROM genarate_tbl ORDER BY card_id DESC LIMIT 1";
           PreparedStatement pst = con.prepareStatement(query);
           ResultSet rs = pst.executeQuery();
           
           if(rs.next()){
               int id = rs.getInt(1);
               int n = id+1;
               txtcard_number.setText(Integer.toString(n));
           }
           
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
       }
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        txtcard_number = new javax.swing.JTextField();
        txtfirstname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtlastname = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtmobilenumber = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        combocategory = new javax.swing.JComboBox<>();
        combogender = new javax.swing.JComboBox<>();
        txtdate = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel10.setText("Card ID:");

        txtcard_number.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtcard_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcard_numberActionPerformed(evt);
            }
        });

        txtfirstname.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel11.setText("Firstname:");

        txtlastname.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel12.setText("Lastname:");

        txtusername.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel13.setText("Username:");

        txtaddress.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel14.setText("Address:");

        txtmobilenumber.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel15.setText("Mobile number:");

        jLabel16.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel16.setText("Gender");

        jLabel17.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel17.setText("Register date:");

        jLabel18.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel18.setText("Category:");

        combocategory.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        combocategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select Category-", "Student", "Senior", "PWD", "Citizens" }));
        combocategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combocategoryActionPerformed(evt);
            }
        });

        combogender.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        combogender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select Gender-", "Male", "Female" }));
        combogender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combogenderActionPerformed(evt);
            }
        });

        txtdate.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N

        jButton1.setBackground(new java.awt.Color(78, 76, 126));
        jButton1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Register ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(78, 76, 126));

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Add identification");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
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
                    .addComponent(jLabel15)
                    .addComponent(txtmobilenumber, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addComponent(txtlastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(combogender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combocategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtcard_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcard_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcard_numberActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String cardNumber = txtcard_number.getText();
        String firstname = txtfirstname.getText();
        String lastname = txtlastname.getText();
        String username = txtusername.getText();
        String address = txtaddress.getText();
        String mobileNumber = txtmobilenumber.getText();
        String gender = combogender.getSelectedItem().toString();
        String registerDate = txtdate.getText();
        String category = combocategory.getSelectedItem().toString();
        
        if(cardNumber.isEmpty() || firstname.isEmpty() || lastname.isEmpty() || username.isEmpty() || address.isEmpty() || mobileNumber.isEmpty() 
                || gender.equalsIgnoreCase("-Select Gender-") || registerDate == null || category.equals("-Select Category-")){
                JOptionPane.showMessageDialog(this, "Please fill in all required fields.");
        }else{
            System.out.println("Insert here");
            try{
            try (java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/printing_db", "root", "PHW#84#jeor")) {
                
                String query = "INSERT INTO genarate_tbl VALUES('" + cardNumber + "','" + firstname + "','" + lastname 
                + "','" + username + "','" + address + "','" + mobileNumber + "','" + gender + "','" + registerDate + "','" + category + "')";
                
                Statement statement = connection.createStatement();
                int check = statement.executeUpdate(query);
                

                if (check == 0) {
                    JOptionPane.showMessageDialog(jButton1, "This is already exist");
                } else {
                    Notification noti = new Notification(this, Notifications.Type.SUCCESS, Notification.location.TOP_CENTER, "Account Created.");
                    noti.showNotification();
                }
            }
        }catch (SQLException exception) {
            exception.printStackTrace(); // For debugging purposes
            JOptionPane.showMessageDialog(jButton1, "An error occurred. Please try again.");
            }
        }  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void combogenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combogenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combogenderActionPerformed

    private void combocategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combocategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combocategoryActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            genarate_id_page genid = new genarate_id_page();
            genid.setLocationRelativeTo(null);
            genid.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combocategory;
    private javax.swing.JComboBox<String> combogender;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtcard_number;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtfirstname;
    private javax.swing.JTextField txtlastname;
    private javax.swing.JTextField txtmobilenumber;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
