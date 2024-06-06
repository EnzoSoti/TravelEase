
// 
// ENCAPSULATION 
// MAIN TO RUN 
public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                LoginPage loginPage = new LoginPage();
                loginPage.setLocationRelativeTo(null);
                loginPage.setVisible(true);
            }
        });
    }
    
    