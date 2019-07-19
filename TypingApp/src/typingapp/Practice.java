/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typingapp;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask; 
import javax.swing.JFrame;

/**
 *
 * @author aaxxo
 */
public class Practice extends javax.swing.JFrame {
    public static int counter = 60; 
    private boolean startCount=false;
    private Timer timer;
     TextPractice code;
    class Helper extends TimerTask 
{ 
        private int choice;
    public Helper(int choice)
    {
        this.choice=choice;
    }
    @Override
    public void run() 
    { 
            --counter;
            if(counter == 0)
            {
                JFrame resultForm=new Results();
                resultForm.setVisible(true);
                hideForm();
                timer.cancel();
            }else {
            
            System.out.println(counter);
            Practice_remainingTime.setText(counter+"");
            
            }

        }
    } 
    /**
     * Creates new form Practice
     */
    private void hideForm()
    {
        this.setVisible(false);
    }
    public void showLines()
    {
         ArrayList<String> x=code.getLines(3);
        for( String l : x)
            if(Practice_originCodePane.getText().trim().equals(""))
                        Practice_originCodePane.setText(l);
            else
                        Practice_originCodePane.setText(Practice_originCodePane.getText()+'\n'+l);
        
    }
    public Practice() {
        code =new TextPractice();
        initComponents();
        Practice_languageName.setText(Settings.languageName);
        code.setText(Settings.getLanguageCode());
        showLines();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        Practice_panel = new javax.swing.JPanel();
        Practice_practiceLabel = new javax.swing.JLabel();
        Practice_languageLabel = new javax.swing.JLabel();
        Practice_languageIndecatorLabel = new javax.swing.JLabel();
        Practice_remainingTimeLabel = new javax.swing.JLabel();
        Practice_timeIndecatorLabel = new javax.swing.JLabel();
        Practice_returnToMainMenuButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Practice_originCodePane = new javax.swing.JTextPane();
        Practice_remainingTime = new javax.swing.JLabel();
        Practice_languageName = new javax.swing.JLabel();
        Practice_inputCodeBox = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Practice_practiceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Practice_practiceLabel.setText("Practice !");

        Practice_languageLabel.setText("Language: ");

        Practice_remainingTimeLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Practice_remainingTimeLabel.setText("Time Remaining: ");

        Practice_returnToMainMenuButton.setText("End");
        Practice_returnToMainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Practice_returnToMainMenuButtonActionPerformed(evt);
            }
        });

        Practice_originCodePane.setEditable(false);
        Practice_originCodePane.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        jScrollPane3.setViewportView(Practice_originCodePane);

        Practice_remainingTime.setText("60");

        Practice_languageName.setText("Practice_languageName");

        Practice_inputCodeBox.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        Practice_inputCodeBox.setBorder(new javax.swing.border.MatteBorder(null));
        Practice_inputCodeBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Practice_inputCodeBoxKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout Practice_panelLayout = new javax.swing.GroupLayout(Practice_panel);
        Practice_panel.setLayout(Practice_panelLayout);
        Practice_panelLayout.setHorizontalGroup(
            Practice_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Practice_panelLayout.createSequentialGroup()
                .addGroup(Practice_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Practice_panelLayout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(Practice_practiceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Practice_panelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(Practice_languageIndecatorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Practice_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Practice_inputCodeBox)
                            .addComponent(jScrollPane3)
                            .addGroup(Practice_panelLayout.createSequentialGroup()
                                .addComponent(Practice_languageLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Practice_languageName, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addComponent(Practice_remainingTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Practice_remainingTime, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Practice_timeIndecatorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Practice_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Practice_returnToMainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Practice_panelLayout.setVerticalGroup(
            Practice_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Practice_panelLayout.createSequentialGroup()
                .addGroup(Practice_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Practice_panelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(Practice_languageIndecatorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Practice_panelLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(Practice_timeIndecatorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Practice_practiceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Practice_panelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(Practice_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Practice_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Practice_remainingTimeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Practice_remainingTime))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Practice_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Practice_languageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Practice_languageName)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Practice_inputCodeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(Practice_returnToMainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Practice_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Practice_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Practice_returnToMainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Practice_returnToMainMenuButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_Practice_returnToMainMenuButtonActionPerformed

    private void Practice_inputCodeBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Practice_inputCodeBoxKeyPressed
        int key = evt.getKeyCode();
        if(key == 32 || key == 10)//Space is 32 , Enter is 10
        {
            
            
        }

    }//GEN-LAST:event_Practice_inputCodeBoxKeyPressed

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
            java.util.logging.Logger.getLogger(Practice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practice().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Practice_inputCodeBox;
    private javax.swing.JLabel Practice_languageIndecatorLabel;
    private javax.swing.JLabel Practice_languageLabel;
    private javax.swing.JLabel Practice_languageName;
    private javax.swing.JTextPane Practice_originCodePane;
    private javax.swing.JPanel Practice_panel;
    private javax.swing.JLabel Practice_practiceLabel;
    private javax.swing.JLabel Practice_remainingTime;
    private javax.swing.JLabel Practice_remainingTimeLabel;
    private javax.swing.JButton Practice_returnToMainMenuButton;
    private javax.swing.JLabel Practice_timeIndecatorLabel;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
