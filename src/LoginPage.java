
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
public class LoginPage extends javax.swing.JFrame {
    

    public LoginPage() {
      initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogin1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnRegister = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();

        btnLogin1.setText("Login");
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Username");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Password");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        btnRegister.setBackground(new java.awt.Color(153, 255, 255));
        btnRegister.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        btnRegister.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnRegisterKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("LOGIN ");

        btnLogin.setBackground(new java.awt.Color(153, 255, 255));
        btnLogin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        btnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnLoginKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/kirk.png"))); // NOI18N
        image.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                        .addComponent(txtPassword)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogin1ActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
    
        String username = txtUsername.getText();
        String password = new String(txtPassword.getText());

        if(!username.isEmpty() || !password.isEmpty()){
           if(username.equals("admin") && password.equals("admin")){
                   JOptionPane.showMessageDialog(rootPane, "Welcome Admin.");
                   adminStock AdminStock = new adminStock();
                   AdminStock.setVisible(true);
                   AdminStock.setLocationRelativeTo(null);
                   this.dispose();
               }
           else if(database.isInputInDB(username, password)){
               JOptionPane.showMessageDialog(rootPane, "Login Succesful");
               userBuying userbuy = new userBuying();
               userbuy.setVisible(true);
               userbuy.setLocationRelativeTo(null);
               this.dispose();     
        }else{
               JOptionPane.showMessageDialog(rootPane, "Wrong email/password.\nTry Again.", "Error", 
               JOptionPane.PLAIN_MESSAGE);
           }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "You cannot leave field blank","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnLoginActionPerformed
    
    // POLYMORPHISM
    class register {
            public void buttonClicked() {
                userRegister uregister = new userRegister();
                uregister.setLocationRelativeTo(null);
                uregister.setVisible(true);
                dispose();
            }
        }
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        register reg = new register();
        reg.buttonClicked();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnRegisterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnRegisterKeyPressed
        
        
    }//GEN-LAST:event_btnRegisterKeyPressed

    private void btnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnLoginKeyPressed
        
    }//GEN-LAST:event_btnLoginKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        String username = txtUsername.getText();
        String password = new String(txtPassword.getText());

        if(!username.isEmpty() || !password.isEmpty()){
           if(username.equals("admin") && password.equals("admin")){
                   JOptionPane.showMessageDialog(rootPane, "Welcome Admin.");
                   adminStock AdminStock = new adminStock();
                   AdminStock.setVisible(true);
                   AdminStock.setLocationRelativeTo(null);
                   this.dispose();
               }
           else if(database.isInputInDB(username, password)){
               JOptionPane.showMessageDialog(rootPane, "Login Succesful");
               userBuying userbuy = new userBuying();
               userbuy.setVisible(true);
               userbuy.setLocationRelativeTo(null);
               this.dispose();     
        }else{
               JOptionPane.showMessageDialog(rootPane, "Wrong email/password.\nTry Again.", "Error", 
               JOptionPane.PLAIN_MESSAGE);
           }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "You cannot leave field blank","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
        String username = txtUsername.getText();
        String password = new String(txtPassword.getText());

        if(!username.isEmpty() || !password.isEmpty()){
           if(username.equals("admin") && password.equals("admin")){
                   JOptionPane.showMessageDialog(rootPane, "Welcome Admin.");
                   adminStock AdminStock = new adminStock();
                   AdminStock.setVisible(true);
                   AdminStock.setLocationRelativeTo(null);
                   this.dispose();
               }
           else if(database.isInputInDB(username, password)){
               JOptionPane.showMessageDialog(rootPane, "Login Succesful");
               userBuying userbuy = new userBuying();
               userbuy.setVisible(true);
               userbuy.setLocationRelativeTo(null);
               this.dispose();     
        }else{
               JOptionPane.showMessageDialog(rootPane, "Wrong email/password.\nTry Again.", "Error", 
               JOptionPane.PLAIN_MESSAGE);
           }
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "You cannot leave field blank","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtUsernameKeyPressed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {
    @Override
    public void run() {
        
    }
});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogin1;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
