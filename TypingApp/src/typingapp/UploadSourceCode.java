/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typingapp;

import java.awt.List;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 *
 * @author Relax
 */
public class UploadSourceCode extends javax.swing.JFrame {

    /**
     * Creates new form UploadSourceCode
     */
    public UploadSourceCode() {
        initComponents();
        UploadSourceCode_saveButton.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        UploadSoruceCode_title = new javax.swing.JLabel();
        UploadSoruceCode_language = new javax.swing.JLabel();
        UploadSourceCode_languageIndecatorComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        UploadSourceCode_codeReviewArea = new javax.swing.JTextArea();
        UploadSoruceCode_code = new javax.swing.JLabel();
        UploadSoruceCode_saveButton = new javax.swing.JButton();
        UploadSoruceCode_backButton = new javax.swing.JButton();
        UploadSourceCode_saveButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Upload Source Code");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        UploadSoruceCode_title.setBackground(new java.awt.Color(51, 255, 51));
        UploadSoruceCode_title.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        UploadSoruceCode_title.setForeground(new java.awt.Color(102, 255, 0));
        UploadSoruceCode_title.setText("Upload Source Code ");

        UploadSoruceCode_language.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UploadSoruceCode_language.setText("Language:");

        UploadSourceCode_languageIndecatorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Java", "C#", "C++", "Sql", "Matlab" }));
        UploadSourceCode_languageIndecatorComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                UploadSourceCode_languageIndecatorComboBoxItemStateChanged(evt);
            }
        });
        UploadSourceCode_languageIndecatorComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadSourceCode_languageIndecatorComboBoxActionPerformed(evt);
            }
        });

        UploadSourceCode_codeReviewArea.setEditable(false);
        UploadSourceCode_codeReviewArea.setColumns(20);
        UploadSourceCode_codeReviewArea.setRows(5);
        jScrollPane1.setViewportView(UploadSourceCode_codeReviewArea);

        UploadSoruceCode_code.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        UploadSoruceCode_code.setText("Code:");

        UploadSoruceCode_saveButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UploadSoruceCode_saveButton.setText("Save");
        UploadSoruceCode_saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadSoruceCode_saveButtonActionPerformed(evt);
            }
        });

        UploadSoruceCode_backButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UploadSoruceCode_backButton.setText("Back");
        UploadSoruceCode_backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadSoruceCode_backButtonActionPerformed(evt);
            }
        });

        UploadSourceCode_saveButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UploadSourceCode_saveButton.setText("Saved !");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(UploadSoruceCode_title, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(UploadSoruceCode_language, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(UploadSourceCode_languageIndecatorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(UploadSoruceCode_code))
                                .addGap(112, 112, 112)))
                        .addContainerGap(75, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(UploadSoruceCode_backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(UploadSoruceCode_saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UploadSourceCode_saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(UploadSoruceCode_title, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UploadSoruceCode_language, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UploadSourceCode_languageIndecatorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UploadSoruceCode_code)
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UploadSoruceCode_saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(UploadSourceCode_saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(UploadSoruceCode_backButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UploadSoruceCode_saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadSoruceCode_saveButtonActionPerformed
        // TODO add your handling code here:
        Settings.setLanguageCode(code);
        Settings.setLanguageName(UploadSourceCode_languageIndecatorComboBox.getSelectedItem().toString());
        UploadSourceCode_saveButton.setVisible(true);
    }//GEN-LAST:event_UploadSoruceCode_saveButtonActionPerformed

    private void UploadSoruceCode_backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadSoruceCode_backButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MainMenu().setVisible(true);
    }//GEN-LAST:event_UploadSoruceCode_backButtonActionPerformed

    private String code;
    private void UploadSourceCode_languageIndecatorComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_UploadSourceCode_languageIndecatorComboBoxItemStateChanged
        // TODO add your handling code here:
        String selectedItem = UploadSourceCode_languageIndecatorComboBox.getSelectedItem().toString();
        String filePath = "CodeResources//" + selectedItem + ".txt";
        
        try
        {   
            code = "";
            ArrayList<String> lines = new ArrayList<>();
            lines = (ArrayList<String>) Files.readAllLines(Paths.get(filePath));
            for(int i = 0 ;i<lines.size(); i++)
            {
                String[] words = lines.get(i).split(" ");
                int count =0;
                int j=0;
                while(count<40 && j < words.length)
                {
                    code += words[j] + ' ';
                    count += words[j].length();
                    j++;
                }
                code += '\n';
                
            }
            code = code.replace("}", "");
            code = code.replace("{", "");
            UploadSourceCode_codeReviewArea.setText(code);
            UploadSourceCode_saveButton.setVisible(false);
        }
        catch (IOException ex) 
        {
            Logger.getLogger(UploadSourceCode.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_UploadSourceCode_languageIndecatorComboBoxItemStateChanged

    private void UploadSourceCode_languageIndecatorComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadSourceCode_languageIndecatorComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UploadSourceCode_languageIndecatorComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(UploadSourceCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UploadSourceCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UploadSourceCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UploadSourceCode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UploadSourceCode().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UploadSoruceCode_backButton;
    private javax.swing.JLabel UploadSoruceCode_code;
    private javax.swing.JLabel UploadSoruceCode_language;
    private javax.swing.JButton UploadSoruceCode_saveButton;
    private javax.swing.JLabel UploadSoruceCode_title;
    private javax.swing.JTextArea UploadSourceCode_codeReviewArea;
    private javax.swing.JComboBox<String> UploadSourceCode_languageIndecatorComboBox;
    private javax.swing.JLabel UploadSourceCode_saveButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
