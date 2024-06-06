
package printing_system;

import com.formdev.flatlaf.util.Animator;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import raven.toast.Notifications.Type;
import raven.toast.util.ShadowRenderer;


public class Notification extends javax.swing.JComponent {
    
    private JDialog dialog;
    private Animator animator;
    private final Frame fram;
    private boolean showing;
    private Thread thread;
    private int animate = 10;
    private BufferedImage imageShadow;
    private int shadowSize = 6;
    private Type type;
    private location location;

    public Notification(Frame fram, Type type, location location, String message) {
        this.fram = fram;
        this.type = type;
        this.location = location;
        initComponents();
        init(message);
        initAnimation();
    }

    private void init(String message){
        setBackground(Color.WHITE);
        dialog = new JDialog(fram);
        dialog.setUndecorated(true);
        dialog.setFocusableWindowState(false);
        dialog.setBackground(new Color(0, 0, 0, 0));
        dialog.add(this);
        dialog.setSize(getPreferredSize());

        URL successURL = getClass().getResource("/images/success.png");
        URL infoURL = getClass().getResource("/images/info.png");
        URL warningURL = getClass().getResource("/images/warning.png");

        if (type == Type.SUCCESS && successURL != null) {
            lblcon.setIcon(new ImageIcon(successURL));
            lbMessage.setText("Success");
        } else if (type == Type.INFO && infoURL != null) {
            lblcon.setIcon(new ImageIcon(infoURL));
            lbMessage.setText("Info");
        } else if (type == Type.WARNING && warningURL != null) {
            lblcon.setIcon(new ImageIcon(warningURL));
            lbMessage.setText("Warning");
        } else {
            lbMessage.setText("Notification");
            lbMessageText.setText("Image resource not found");
        }

        lbMessageText.setText(message);
    }

    private void initAnimation() {
        animator = new Animator(500, new Animator.TimingTarget() {
            private int x;
            private int top;
            private boolean top_to_bot;

            @Override
            public void timingEvent(float fraction) {
                if (showing) {
                    float alpha = 1f - fraction;
                    int y = (int) ((1f - fraction) * animate);
                    if (top_to_bot) {
                        dialog.setLocation(x, top + y);
                    } else {
                        dialog.setLocation(x, top + y);
                    }
                    dialog.setOpacity(alpha);
                } else {
                    float alpha = fraction;
                    int y = (int) (fraction * animate);
                    if (top_to_bot) {
                        dialog.setLocation(x, top + y);
                    } else {
                        dialog.setLocation(x, top + y);
                    }
                    dialog.setOpacity(alpha);
                }
                repaint();
            }

            @Override
            public void begin() {
                if (!showing) {
                    dialog.setOpacity(0f);
                    int margin = 10;
                    int y = 0;
                    if (location == location.TOP_CENTER) {
                        x = fram.getX() + ((fram.getWidth() - dialog.getWidth()) / 2);
                        y = fram.getY();
                        top_to_bot = true;
                    }else if (location == location.TOP_ROGHT){
                        x = fram.getX() + fram.getWidth()-dialog.getWidth()- margin;
                        y = fram.getY();
                        top_to_bot = true;
                    }else if (location == location.TOP_LEFT){
                        x = fram.getX() + margin;
                        y = fram.getY();
                        top_to_bot = true;
                    }else if (location == location.TOP_CENTER){
                        x = fram.getX() + ((fram.getWidth() - dialog.getWidth()) / 2);
                        y = fram .getY() + fram.getHeight() - dialog.getHeight();
                        top_to_bot = false;
                    }else if (location == location.BOTTOM_RIGHT){
                        
                    }else if (location == location.BOTTOM_LEFT){
                        
                    }else{
                        
                    }
                    top = y;
                    dialog.setLocation(x, y);
                    dialog.setVisible(true);
                }
            }

            @Override
            public void end() {
                showing = !showing;
                if (showing) {
                    thread = new Thread(() -> {
                        sleep();
                        closeNotification();
                    });
                    thread.start();
                } else {
                    dialog.dispose();
                }
            }
        });
        animator.setResolution(5);
    }

    public void showNotification() {
        animator.start();
    }

    private void closeNotification() {
        if (thread != null && thread.isAlive()) {
            thread.interrupt();
        }
        if (animator.isRunning()) {
            if (!showing) {
                animator.stop();
                showing = true;
                animator.start();
            }
        } else {
            showing = true;
            animator.start();
        }
    }

    private void sleep() {
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            // Handle exception
        }
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.drawImage(imageShadow, 0, 0, null);
        int x = shadowSize;
        int y = shadowSize;
        int width = getWidth() - shadowSize * 2;
        int height = getHeight() - shadowSize * 2;
        g2.fillRect(x, y, width, height);

        if(type == Type.SUCCESS){
            g2.setColor(new Color(18,163, 24));
        }else if(type == Type.INFO){
            g2.setColor(new Color(28,139, 206));
        }else{
            g2.setColor(new Color(241,196, 15));
        }

        g2.fillRect(6, 5, 5, getHeight() - shadowSize * 2 + 1);
        g2.dispose();
        super.paint(g);
    }

    @Override
    public void setBounds(int x, int y, int width, int height) {
        super.setBounds(x, y, width, height);
        createImageShadow();
    }

    private void createImageShadow() {
        imageShadow = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = imageShadow.createGraphics();
        g2.drawImage(createShadow(), 0, 0, null);
        g2.dispose();
    }

    private BufferedImage createShadow() {
        BufferedImage img = new BufferedImage(getWidth() - shadowSize * 2, getHeight() - shadowSize * 2, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        g2.fillRect(0, 0, img.getWidth(), img.getHeight());
        g2.dispose();
        return new ShadowRenderer(shadowSize, 0.3f, new Color(100, 100, 100)).createShadow(img);
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblcon = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        cmdClose = new javax.swing.JButton();
        lbMessage = new javax.swing.JLabel();
        lbMessageText = new javax.swing.JLabel();

        lblcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sucess.png"))); // NOI18N

        panel.setOpaque(false);

        cmdClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        cmdClose.setBorder(null);
        cmdClose.setContentAreaFilled(false);
        cmdClose.setFocusable(false);
        cmdClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCloseActionPerformed(evt);
            }
        });

        lbMessage.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbMessage.setForeground(new java.awt.Color(38, 38, 38));
        lbMessage.setText("Message");

        lbMessageText.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lbMessageText.setForeground(new java.awt.Color(127, 127, 127));
        lbMessageText.setText("Message text");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbMessage)
                    .addComponent(lbMessageText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 230, Short.MAX_VALUE)
                .addComponent(cmdClose)
                .addGap(15, 15, 15))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cmdClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbMessage)
                .addGap(3, 3, 3)
                .addComponent(lbMessageText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblcon)
                .addGap(10, 10, 10)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCloseActionPerformed
        closeNotification();
    }//GEN-LAST:event_cmdCloseActionPerformed

    public static enum type{
        SUCCESS, INFO, WARNING
    }
    public static enum location{
        TOP_CENTER, TOP_ROGHT, TOP_LEFT, BOTTOM_CENTER, BOTTOM_RIGHT, BOTTOM_LEFT, CENTER
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdClose;
    private javax.swing.JLabel lbMessage;
    private javax.swing.JLabel lbMessageText;
    private javax.swing.JLabel lblcon;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
