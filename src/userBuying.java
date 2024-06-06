
import java.util.Stack;
import javax.swing.JOptionPane;

public class userBuying extends userDashboard {
    
    int item1 ,item2, item3, item4, item5, item6 = 0;
    double itemPrice1 = 20.50;
    int itemPrice2 = 30;
    int itemPrice3 = 30;
    int itemPrice4 = 30;
    int itemPrice5 = 30;
    int itemPrice6 = 30;
    
    Stack<String> itemStack = new Stack<>();
    
    public userBuying() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        item1Minusbtn = new javax.swing.JButton();
        item1Plusbtn = new javax.swing.JButton();
        item2Plusbtn = new javax.swing.JButton();
        item2Minusbtn = new javax.swing.JButton();
        item3Plusbtn = new javax.swing.JButton();
        item3Minusbtn = new javax.swing.JButton();
        item4Plusbtn = new javax.swing.JButton();
        item4Minusbtn = new javax.swing.JButton();
        item5Plusbtn = new javax.swing.JButton();
        item5Minusbtn = new javax.swing.JButton();
        item6Plusbtn = new javax.swing.JButton();
        item6Minusbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartList = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton3.setText("+");

        jButton4.setText("-");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("PICK YOUR ORDER");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        item1Minusbtn.setBackground(new java.awt.Color(255, 0, 0));
        item1Minusbtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        item1Minusbtn.setForeground(new java.awt.Color(0, 0, 0));
        item1Minusbtn.setText("-");
        item1Minusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item1MinusbtnActionPerformed(evt);
            }
        });

        item1Plusbtn.setBackground(new java.awt.Color(153, 255, 255));
        item1Plusbtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        item1Plusbtn.setForeground(new java.awt.Color(0, 0, 0));
        item1Plusbtn.setText("+");
        item1Plusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item1PlusbtnActionPerformed(evt);
            }
        });

        item2Plusbtn.setBackground(new java.awt.Color(153, 255, 255));
        item2Plusbtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        item2Plusbtn.setForeground(new java.awt.Color(0, 0, 0));
        item2Plusbtn.setText("+");
        item2Plusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item2PlusbtnActionPerformed(evt);
            }
        });

        item2Minusbtn.setBackground(new java.awt.Color(255, 0, 0));
        item2Minusbtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        item2Minusbtn.setForeground(new java.awt.Color(0, 0, 0));
        item2Minusbtn.setText("-");
        item2Minusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item2MinusbtnActionPerformed(evt);
            }
        });

        item3Plusbtn.setBackground(new java.awt.Color(153, 255, 255));
        item3Plusbtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        item3Plusbtn.setForeground(new java.awt.Color(0, 0, 0));
        item3Plusbtn.setText("+");
        item3Plusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item3PlusbtnActionPerformed(evt);
            }
        });

        item3Minusbtn.setBackground(new java.awt.Color(255, 0, 0));
        item3Minusbtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        item3Minusbtn.setForeground(new java.awt.Color(0, 0, 0));
        item3Minusbtn.setText("-");
        item3Minusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item3MinusbtnActionPerformed(evt);
            }
        });

        item4Plusbtn.setBackground(new java.awt.Color(153, 255, 255));
        item4Plusbtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        item4Plusbtn.setForeground(new java.awt.Color(0, 0, 0));
        item4Plusbtn.setText("+");
        item4Plusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item4PlusbtnActionPerformed(evt);
            }
        });

        item4Minusbtn.setBackground(new java.awt.Color(255, 0, 0));
        item4Minusbtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        item4Minusbtn.setForeground(new java.awt.Color(0, 0, 0));
        item4Minusbtn.setText("-");
        item4Minusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item4MinusbtnActionPerformed(evt);
            }
        });

        item5Plusbtn.setBackground(new java.awt.Color(153, 255, 255));
        item5Plusbtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        item5Plusbtn.setForeground(new java.awt.Color(0, 0, 0));
        item5Plusbtn.setText("+");
        item5Plusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item5PlusbtnActionPerformed(evt);
            }
        });

        item5Minusbtn.setBackground(new java.awt.Color(255, 0, 0));
        item5Minusbtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        item5Minusbtn.setForeground(new java.awt.Color(0, 0, 0));
        item5Minusbtn.setText("-");
        item5Minusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item5MinusbtnActionPerformed(evt);
            }
        });

        item6Plusbtn.setBackground(new java.awt.Color(153, 255, 255));
        item6Plusbtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        item6Plusbtn.setForeground(new java.awt.Color(0, 0, 0));
        item6Plusbtn.setText("+");
        item6Plusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item6PlusbtnActionPerformed(evt);
            }
        });

        item6Minusbtn.setBackground(new java.awt.Color(255, 0, 0));
        item6Minusbtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        item6Minusbtn.setForeground(new java.awt.Color(0, 0, 0));
        item6Minusbtn.setText("-");
        item6Minusbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item6MinusbtnActionPerformed(evt);
            }
        });

        cartList.setEditable(false);
        cartList.setBackground(new java.awt.Color(0, 102, 102));
        cartList.setColumns(20);
        cartList.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        cartList.setForeground(new java.awt.Color(255, 255, 255));
        cartList.setRows(5);
        jScrollPane1.setViewportView(cartList);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Item Name");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Quantity");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Price");

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Buy");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(item2Plusbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(item2Minusbtn))))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(item1Plusbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(item1Minusbtn))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(item4Plusbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(item4Minusbtn))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(135, 135, 135)
                        .addComponent(item5Plusbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(item5Minusbtn)))
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(item6Plusbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(item6Minusbtn))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(item3Plusbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(item3Minusbtn)))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(149, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item1Minusbtn)
                    .addComponent(item1Plusbtn)
                    .addComponent(item2Minusbtn)
                    .addComponent(item2Plusbtn)
                    .addComponent(item3Minusbtn)
                    .addComponent(item3Plusbtn))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(item4Minusbtn)
                                .addComponent(item4Plusbtn))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(item5Minusbtn)
                                .addComponent(item5Plusbtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(item6Minusbtn)
                            .addComponent(item6Plusbtn))
                        .addGap(2, 2, 2)))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void item1PlusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item1PlusbtnActionPerformed
        item1++;
        itemStack.add("item1");
        updateCartList();
    }//GEN-LAST:event_item1PlusbtnActionPerformed

    private void item1MinusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item1MinusbtnActionPerformed
            if(item1 > 0){
            item1--;
            itemStack.remove(item1);
            updateCartList();
        }
    }//GEN-LAST:event_item1MinusbtnActionPerformed

    private void item2PlusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item2PlusbtnActionPerformed
        item2++;
        itemStack.add("item2");
        updateCartList();
    }//GEN-LAST:event_item2PlusbtnActionPerformed

    private void item2MinusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item2MinusbtnActionPerformed
        if(item2 > 0){
            item2--;
            itemStack.remove(item2);
            updateCartList();
        }
    }//GEN-LAST:event_item2MinusbtnActionPerformed

    private void item3PlusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item3PlusbtnActionPerformed
        item3++;
        itemStack.add("item3");
        updateCartList();
    }//GEN-LAST:event_item3PlusbtnActionPerformed

    private void item3MinusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item3MinusbtnActionPerformed
        if(item3 > 0){
            item3--;
            itemStack.remove(item3);
            updateCartList();
        }
    }//GEN-LAST:event_item3MinusbtnActionPerformed

    private void item4PlusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item4PlusbtnActionPerformed
        item4++;
        itemStack.add("item4");
        updateCartList();
    }//GEN-LAST:event_item4PlusbtnActionPerformed

    private void item4MinusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item4MinusbtnActionPerformed
        if(item4 > 0){
            item4--;
            itemStack.remove(item4);
            updateCartList();
        }
    }//GEN-LAST:event_item4MinusbtnActionPerformed

    private void item5PlusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item5PlusbtnActionPerformed
        item5++;
        itemStack.add("item5");
        updateCartList();
    }//GEN-LAST:event_item5PlusbtnActionPerformed

    private void item5MinusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item5MinusbtnActionPerformed
        if(item5 > 0){
            item5--;
            itemStack.remove(item5);
            updateCartList();
        }
    }//GEN-LAST:event_item5MinusbtnActionPerformed

    private void item6PlusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item6PlusbtnActionPerformed
        item6++;
        itemStack.add("item6");
        updateCartList();
    }//GEN-LAST:event_item6PlusbtnActionPerformed

    private void item6MinusbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item6MinusbtnActionPerformed
        if(item6 > 0){
            item6--;
            itemStack.remove(item6);
            updateCartList();
        }
    }//GEN-LAST:event_item6MinusbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        item1 = item2 = item3 = item4 = item5 = item6 = 0;
        itemStack.clear();
        updateCartList();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(cartList.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "The cart is empty", "Empty Cart", JOptionPane.INFORMATION_MESSAGE);
        }else{
            int choice = JOptionPane.showConfirmDialog(this, "You want to proceed to delivery?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (choice == JOptionPane.YES_OPTION) {
            userDelivery delivery = new userDelivery();
            delivery.setVisible(true);
            delivery.setLocationRelativeTo(null);
            this.dispose();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void updateCartList(){
        StringBuilder cart = new StringBuilder();
        if(item1 > 0){
            cart.append("Chicken Inasal, ").append(item1).append("PCs,").append(" ").append(item1*itemPrice1).append("$").append("\n");
        }
        if(item2 > 0){
            cart.append("Bac Silog, ").append(item2).append("PCs,").append(" ").append(item2*itemPrice2).append("$").append("\n");
        }
        if(item3 > 0){
            cart.append("Hot Silog, ").append(item3).append("PCs,").append(" ").append(item3*itemPrice3).append("$").append("\n");
        }
        if(item4 > 0){
            cart.append("Lugaw, ").append(item4).append("PCs,").append(" ").append(item4*itemPrice4).append("$").append("\n");
        }
        if(item5 > 0){
            cart.append("Sisig Silog, ").append(item5).append("PCs,").append(" ").append(item5*itemPrice5).append("$").append("\n");
        }
        if(item6 > 0){
            cart.append("Pares Mami, ").append(item6).append("PCs,").append(" ").append(item6*itemPrice6).append("$").append("\n");
        }
        double totalAmount = item1*itemPrice1 + item2*itemPrice2 + item3*itemPrice3 + item4*itemPrice4 + item5*itemPrice5 + item6*itemPrice6;
        cart.append("Total Amount: " + totalAmount + "$");
        cartList.setText(cart.toString());
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                userBuying userbuying = new userBuying();
                userbuying.setLocationRelativeTo(null);
                userbuying.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea cartList;
    private javax.swing.JButton item1Minusbtn;
    private javax.swing.JButton item1Plusbtn;
    private javax.swing.JButton item2Minusbtn;
    private javax.swing.JButton item2Plusbtn;
    private javax.swing.JButton item3Minusbtn;
    private javax.swing.JButton item3Plusbtn;
    private javax.swing.JButton item4Minusbtn;
    private javax.swing.JButton item4Plusbtn;
    private javax.swing.JButton item5Minusbtn;
    private javax.swing.JButton item5Plusbtn;
    private javax.swing.JButton item6Minusbtn;
    private javax.swing.JButton item6Plusbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
