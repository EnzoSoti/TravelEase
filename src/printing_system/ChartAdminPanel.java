
package printing_system;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane; 
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.statistics.HistogramDataset;


public final class ChartAdminPanel extends javax.swing.JFrame {
    
        private static final String username = "root";
        private static final String password = "PHW#84#jeor";
        private static final String dataConn = "jdbc:mysql://localhost:3306/printing_db";

        private static PreparedStatement pst = null;
        private static ResultSet rs = null;
        private static Connection sqlConn = null;
        
        ChartAdminPanel() {
        initComponents();
        Font poppinsFont = loadFont("C:\\Users\\Administrator\\Documents\\NetBeansProjects\\LoginSystem\\src\\printing_system\\Poppins-Bold.ttf", 14f);
        setFontToComponents(poppinsFont);
        showPieChart();
        showLineChart();
        showBarChart();
        showHistogram();
        this.setExtendedState(ChartAdminPanel.MAXIMIZED_BOTH);
    }
        
        public Font loadFont(String path, float size) {
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
        
        public void setFontToComponents(Font font) {
        jLabel1.setFont(font);
        jLabel2.setFont(font);
        jLabel3.setFont(font);
        jLabel4.setFont(font);
        jLabel5.setFont(font);
        jButton2.setFont(font);
        jButton5.setFont(font);
        jButton9.setFont(font);
        btn_genidcard.setFont(font);
        
    }
    
    public void showPieChart(){
      
      try{
      Connection conn = DriverManager.getConnection(dataConn, username, password);
      pst = conn.prepareStatement("SELECT category, COUNT(*) as count FROM genarate_tbl GROUP BY category");
      rs = pst.executeQuery();
          
      //create dataset
      DefaultPieDataset barDataset = new DefaultPieDataset();
      
            while (rs.next()) {
                  String category = rs.getString("category");
                  int count = rs.getInt("count");
                  barDataset.setValue(category, count);
              }

              // Create chart
              JFreeChart pieChart = ChartFactory.createPieChart("Category", barDataset, true, true, false);

              // Configure plot
              PiePlot piePlot = (PiePlot) pieChart.getPlot();

              // Optional: Change the colors of the sections if needed
              piePlot.setSectionPaint("PWD", new Color(255, 255, 102));
              piePlot.setSectionPaint("Students", new Color(102, 255, 102));
              piePlot.setSectionPaint("Citizens", new Color(255, 102, 153));
              piePlot.setSectionPaint("Seniors", new Color(0, 204, 204));

              piePlot.setBackgroundPaint(Color.white);

              // Create chart panel to display chart
              ChartPanel pieChartPanel = new ChartPanel(pieChart);
              panelBarChart.removeAll();
              panelBarChart.add(pieChartPanel, BorderLayout.CENTER);
              panelBarChart.validate();

          } catch (SQLException e) {
              e.printStackTrace();
          }
      }
    
    public void showLineChart() {
    
    double totalAmount = 0;
    DefaultCategoryDataset dataset = new DefaultCategoryDataset();

    try {
        Connection conn = DriverManager.getConnection(dataConn, username, password);
        PreparedStatement pst = conn.prepareStatement("SELECT amount FROM top_up_new");
        ResultSet rs = pst.executeQuery();
        
        int index = 1;  // This will act as a category for each entry in the dataset
        while (rs.next()) {
            double amount = rs.getDouble("amount");
            dataset.setValue(amount, "Amount", String.valueOf(index));
            totalAmount += amount;
            index++;
        }
        
        conn.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    
    // Create chart
    JFreeChart linechart = ChartFactory.createLineChart(
        "", "Entry", "Amount", 
        dataset, PlotOrientation.VERTICAL, false, true, false
    );
    
    // Create plot object
    CategoryPlot lineCategoryPlot = linechart.getCategoryPlot();
    lineCategoryPlot.setBackgroundPaint(Color.white);
    
    // Create render object to modify the line properties like color
    LineAndShapeRenderer lineRenderer = (LineAndShapeRenderer) lineCategoryPlot.getRenderer();
    Color lineChartColor = new Color(204, 0, 51);
    lineRenderer.setSeriesPaint(0, lineChartColor);
    
    // Create chartPanel to display chart (graph)
    ChartPanel lineChartPanel = new ChartPanel(linechart);
    
    // Create a label to display the total amount
    JLabel totalAmountLabel = new JLabel("Total Amount: " + totalAmount);
    
    // Create a panel to hold the chart and the label
    JPanel chartContainer = new JPanel(new BorderLayout());
    chartContainer.add(lineChartPanel, BorderLayout.CENTER);
    chartContainer.add(totalAmountLabel, BorderLayout.SOUTH);
    
    // Display the chart container in the panel
    panelLineChart.removeAll();
    panelLineChart.add(chartContainer, BorderLayout.CENTER);
    panelLineChart.validate();
}

    
    public void showBarChart(){
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(200, "Amount", "january");
        dataset.setValue(150, "Amount", "february");
        dataset.setValue(18, "Amount", "march");
        dataset.setValue(100, "Amount", "april");
        dataset.setValue(80, "Amount", "may");
        dataset.setValue(250, "Amount", "june");
        
        JFreeChart chart = ChartFactory.createBarChart("","Monthly","Amount", 
                dataset, PlotOrientation.VERTICAL, false,true,false);
        
        CategoryPlot categoryPlot = chart.getCategoryPlot();
        //categoryPlot.setRangeGridlinePaint(Color.BLUE);
        categoryPlot.setBackgroundPaint(Color.WHITE);
        BarRenderer renderer = (BarRenderer) categoryPlot.getRenderer();
        Color clr3 = new Color(204,0,51);
        renderer.setSeriesPaint(0, clr3);
        
        ChartPanel barpChartPanel = new ChartPanel(chart);
        BarChart.removeAll();
        BarChart.add(barpChartPanel, BorderLayout.CENTER);
        BarChart.validate();
       
    }
     
    public void showHistogram(){
        
         double[] values = { 95, 49, 14, 59, 50, 66, 47, 40, 1, 67,
                            12, 58, 28, 63, 14, 9, 31, 17, 94, 71,
                            49, 64, 73, 97, 15, 63, 10, 12, 31, 62,
                            93, 49, 74, 90, 59, 14, 15, 88, 26, 57,
                            77, 44, 58, 91, 10, 67, 57, 19, 88, 84                                
                          };
 
        HistogramDataset dataset = new HistogramDataset();
        dataset.addSeries("key", values, 20);
        
         JFreeChart chart = ChartFactory.createHistogram("","Data", "Frequency", dataset,PlotOrientation.VERTICAL, false,true,false);
            XYPlot plot= chart.getXYPlot();
        plot.setBackgroundPaint(Color.WHITE);

        ChartPanel barpChartPanel2 = new ChartPanel(chart);
        HistoryChart.removeAll();
        HistoryChart.add(barpChartPanel2, BorderLayout.CENTER);
        HistoryChart.validate();
    }

     
    public void close(){
         WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
         Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
     }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        btn_genidcard = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        dashboardpanel = new javax.swing.JPanel();
        HistoryChart = new javax.swing.JPanel();
        panelLineChart = new javax.swing.JPanel();
        BarChart = new javax.swing.JPanel();
        panelBarChart = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_menu_48px_1.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/group_message_26px.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bell_26px.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/male_user_50px.png"))); // NOI18N
        jLabel5.setText("Hello, Admin");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/433436488_1474283606766486_3121416896064137661_n.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 904, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addGap(91, 91, 91))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2))
                                    .addGap(10, 10, 10)))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, -1, 60));

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(0, 0, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("EXIT");
        jButton2.setBorder(null);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 190, 70));

        btn_genidcard.setBackground(new java.awt.Color(0, 0, 204));
        btn_genidcard.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btn_genidcard.setForeground(new java.awt.Color(255, 255, 255));
        btn_genidcard.setText("GENARATE ID CARD");
        btn_genidcard.setBorder(null);
        btn_genidcard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_genidcardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_genidcardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_genidcardMouseExited(evt);
            }
        });
        btn_genidcard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_genidcardActionPerformed(evt);
            }
        });
        jPanel2.add(btn_genidcard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 70));

        jButton9.setBackground(new java.awt.Color(0, 0, 204));
        jButton9.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("VIEW TABLE");
        jButton9.setBorder(null);
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton9MouseExited(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 190, 70));

        jButton5.setBackground(new java.awt.Color(0, 0, 204));
        jButton5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("TOP UP");
        jButton5.setBorder(null);
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 190, 70));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 190, 780));

        dashboardpanel.setBackground(new java.awt.Color(255, 255, 255));
        dashboardpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HistoryChart.setLayout(new java.awt.BorderLayout());
        dashboardpanel.add(HistoryChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 350, 580, 340));

        panelLineChart.setLayout(new java.awt.BorderLayout());
        dashboardpanel.add(panelLineChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 690, 340));

        BarChart.setLayout(new java.awt.BorderLayout());
        dashboardpanel.add(BarChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 690, 340));

        panelBarChart.setLayout(new java.awt.BorderLayout());
        dashboardpanel.add(panelBarChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 580, 340));

        getContentPane().add(dashboardpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 1420, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        
        
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5MouseClicked

    private void btn_genidcardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_genidcardMouseClicked
        
        genarate_id_page genarate_id = new genarate_id_page();
        genarate_id.setLocationRelativeTo(null);
        genarate_id.setVisible(true);
        
        
    }//GEN-LAST:event_btn_genidcardMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    int choice = JOptionPane.showConfirmDialog(this, "Are you sure you want to Exit?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    if(choice == JOptionPane.YES_OPTION){
        user_select login = new user_select();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
        System.out.println("Yes is clicked successful.");
    }else{
        // if the user click no, do nothing or handle accordingly.
        System.out.println("No button is clicked");
         }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_genidcardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_genidcardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_genidcardActionPerformed

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        try {
            view_table viewtbl = new view_table();
            viewtbl.setLocationRelativeTo(null);
            viewtbl.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(ChartAdminPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        top_up tp = new top_up();
        tp.setLocationRelativeTo(null);
        tp.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_genidcardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_genidcardMouseEntered
        btn_genidcard.setBackground(Color.red);
    }//GEN-LAST:event_btn_genidcardMouseEntered

    private void btn_genidcardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_genidcardMouseExited
        btn_genidcard.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_btn_genidcardMouseExited

    private void jButton9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseEntered
        jButton9.setBackground(Color.red);
    }//GEN-LAST:event_jButton9MouseEntered

    private void jButton9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseExited
        jButton9.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jButton9MouseExited

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        jButton5.setBackground(Color.red);
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        jButton5.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setBackground(Color.red);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_jButton2MouseExited

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
            java.util.logging.Logger.getLogger(ChartAdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChartAdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChartAdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChartAdminPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChartAdminPanel chart = new ChartAdminPanel();
                chart.setLocationRelativeTo(null);
                chart.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BarChart;
    private javax.swing.JPanel HistoryChart;
    private javax.swing.JButton btn_genidcard;
    private javax.swing.JPanel dashboardpanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel panelBarChart;
    private javax.swing.JPanel panelLineChart;
    // End of variables declaration//GEN-END:variables
}
