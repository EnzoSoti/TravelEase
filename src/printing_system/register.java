
package printing_system;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class register extends javax.swing.JFrame {

    
    public register() {
        initComponents();
        Font poppinsFont = loadFont("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\LoginSystem\\src\\printing_system\\Poppins-SemiBold.ttf", 14f);
        setFontToComponents(poppinsFont);
        autoGmail();
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
    jLabel1.setFont(font);
    jLabel10.setFont(font);
    jLabel11.setFont(font);
    jLabel12.setFont(font);
    jLabel13.setFont(font);
    jLabel14.setFont(font);
    jLabel15.setFont(font);
    jLabel16.setFont(font);
    jLabel7.setFont(font);
    jLabel8.setFont(font);
    jLabel9.setFont(font);
    Username.setFont(font);
    Firstname.setFont(font);
    Lastname.setFont(font);
    Email_address.setFont(font);
    Password.setFont(font);
    Confirm_password.setFont(font);
    Address.setFont(font);
    combobox_age.setFont(font);
    combobox_gender.setFont(font);
    combobox_what_are_you.setFont(font);
    jButton1.setFont(font);
}
    
    public void autoGmail(){
        Email_address.setText("@gmail.com");
        Email_address.setEditable(true);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Confirm_password = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        combobox_gender = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        combobox_what_are_you = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        combobox_age = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        Address = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Firstname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Lastname = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Email_address = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setText("Sign Up");

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel9.setText("Address");

        Confirm_password.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Confirm_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Confirm_passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Confirm_passwordFocusLost(evt);
            }
        });
        Confirm_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Confirm_passwordActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel12.setText("Confirm password");

        combobox_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        combobox_gender.setPreferredSize(new java.awt.Dimension(64, 22));
        combobox_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_genderActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel11.setText("Gender");

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel7.setText("Password");

        combobox_what_are_you.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PWD", "CITIZENS", "STUDENTS", "SENIORS" }));
        combobox_what_are_you.setPreferredSize(new java.awt.Dimension(64, 22));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel13.setText("What are you?");

        combobox_age.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));
        combobox_age.setPreferredSize(new java.awt.Dimension(64, 22));
        combobox_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_ageActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel14.setText("Age");

        Address.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Address.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                AddressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                AddressFocusLost(evt);
            }
        });
        Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddressActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel8.setText("Username");

        Firstname.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Firstname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FirstnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                FirstnameFocusLost(evt);
            }
        });
        Firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstnameActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel10.setText("Firstname");

        Username.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernameFocusLost(evt);
            }
        });
        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel15.setText("Lastname");

        Lastname.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Lastname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LastnameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LastnameFocusLost(evt);
            }
        });
        Lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastnameActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel16.setText("Email address");

        jButton1.setBackground(new java.awt.Color(102, 40, 158));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sign Up");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Email_address.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Email_address.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Email_addressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Email_addressFocusLost(evt);
            }
        });
        Email_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Email_addressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel16)
                        .addComponent(jLabel14)
                        .addComponent(combobox_age, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel15)
                                .addComponent(Lastname)))
                        .addComponent(Email_address)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(261, 261, 261))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Address)
                            .addComponent(jLabel9)
                            .addComponent(Confirm_password)
                            .addComponent(jLabel12)
                            .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(combobox_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11)
                        .addComponent(combobox_what_are_you, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Email_address, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Confirm_password, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combobox_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combobox_what_are_you, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combobox_age, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Confirm_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Confirm_passwordFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_Confirm_passwordFocusGained

    private void Confirm_passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Confirm_passwordFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_Confirm_passwordFocusLost

    private void Confirm_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Confirm_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Confirm_passwordActionPerformed

    private void combobox_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_ageActionPerformed

    }//GEN-LAST:event_combobox_ageActionPerformed

    private void AddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AddressFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressFocusGained

    private void AddressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_AddressFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressFocusLost

    private void AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddressActionPerformed

    private void FirstnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FirstnameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstnameFocusGained

    private void FirstnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FirstnameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstnameFocusLost

    private void FirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstnameActionPerformed

    private void UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameFocusGained

    private void UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameFocusLost

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    private void LastnameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LastnameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_LastnameFocusGained

    private void LastnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LastnameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_LastnameFocusLost

    private void LastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastnameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String Email_Address = Email_address.getText();
        String UserName = Username.getText();
        String FirstName = Firstname.getText();
        String password = Password.getText();
        String LastName = Lastname.getText();
        String confirm_password = Confirm_password.getText();
        String address = Address.getText();
        String gender = combobox_gender.getSelectedItem().toString();
        String what_are_you = combobox_what_are_you.getSelectedItem().toString();
        String age = combobox_age.getSelectedItem().toString();

        if(UserName.isEmpty() || FirstName.isEmpty() || LastName.isEmpty() || Email_Address.isEmpty() || confirm_password.isEmpty() || address.isEmpty() 
                || gender == null || what_are_you == null || age == null){
                JOptionPane.showMessageDialog(jButton1, "Please fill in all required fields.");
        }

        try{
            try (java.sql.Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/printing_db", "root", "PHW#84#jeor")) {
                
                String query = "INSERT INTO login VALUES('" + Email_Address + "','" + FirstName + "','" + LastName + "','" +
                UserName + "','" + password + "','" + confirm_password + "','" + address + "','" + gender + "','" + what_are_you + "','" + age + "')";
                
                Statement statement = connection.createStatement();
                int check = statement.executeUpdate(query);

                if (check == 0) {
                    JOptionPane.showMessageDialog(jButton1, "This is already exist");
                } else {
                    JOptionPane.showMessageDialog(jButton1,
                        "Welcome, " + " Your account is successfully created");
                    dispose();
                    user_select loginFrame = new user_select();
                    loginFrame.setVisible(true);
                    loginFrame.setLocationRelativeTo(null);
                }
            }
        }catch (SQLException exception) { // For debugging purposes
            // For debugging purposes
            JOptionPane.showMessageDialog(jButton1, "An error occurred. Please try again.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Email_addressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Email_addressFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_Email_addressFocusGained

    private void Email_addressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Email_addressFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_Email_addressFocusLost

    private void Email_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Email_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Email_addressActionPerformed

    private void combobox_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_genderActionPerformed
        
    }//GEN-LAST:event_combobox_genderActionPerformed

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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Address;
    private javax.swing.JTextField Confirm_password;
    private javax.swing.JTextField Email_address;
    private javax.swing.JTextField Firstname;
    private javax.swing.JTextField Lastname;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Username;
    private javax.swing.JComboBox<String> combobox_age;
    private javax.swing.JComboBox<String> combobox_gender;
    private javax.swing.JComboBox<String> combobox_what_are_you;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
