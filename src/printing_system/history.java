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
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class history extends javax.swing.JFrame {

        private static final String username = "root";
        private static final String password = "PHW#84#jeor";
        private static final String dataConn = "jdbc:mysql://localhost:3306/printing_db";

        private static PreparedStatement pst = null;
        private static ResultSet rs = null;
        private static Connection sqlConn = null;
        
    public history() {
        initComponents();
        showTable();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    public void showTable(){
        
        try {
            Connection conn = DriverManager.getConnection(dataConn, username, password);
            pst = conn.prepareStatement("select card_id, amount from top_up_new order by amount asc");
            rs = pst.executeQuery();
            ResultSetMetaData rsmd = rs.getMetaData();
            int n = rsmd.getColumnCount();
            
            DefaultTableModel dtm = (DefaultTableModel) historytbl.getModel();
            dtm.setRowCount(0);
            
            while(rs.next()){
                Vector show = new Vector();
                for(int i = 1; i<=n; i++){
                    show.add(rs.getString("card_id"));
                    show.add(rs.getString("amount"));
                }
                    dtm.addRow(show);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        historytbl = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(78, 76, 126));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        historytbl.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        historytbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Card ID", "Top UP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        historytbl.setGridColor(new java.awt.Color(78, 76, 126));
        historytbl.setOpaque(false);
        historytbl.setSelectionForeground(new java.awt.Color(78, 76, 126));
        jScrollPane2.setViewportView(historytbl);
        if (historytbl.getColumnModel().getColumnCount() > 0) {
            historytbl.getColumnModel().getColumn(0).setResizable(false);
            historytbl.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 720, 480));

        jLabel19.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("History ");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, 30));

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
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(history.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new history().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable historytbl;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
