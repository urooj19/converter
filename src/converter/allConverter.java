/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

/**
 *
 * @author urooj
 */
public class allConverter extends javax.swing.JFrame {

    /**
     * Creates new form allConverter
     */
    public allConverter() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CONVERTALL = new javax.swing.JPanel();
        CONVERTER = new javax.swing.JLabel();
        DISTANCE = new javax.swing.JButton();
        TEMPERATURE = new javax.swing.JButton();
        CURRENCY = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 150));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        CONVERTALL.setBackground(new java.awt.Color(0, 153, 153));

        CONVERTER.setBackground(new java.awt.Color(51, 51, 255));
        CONVERTER.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        CONVERTER.setForeground(new java.awt.Color(255, 255, 255));
        CONVERTER.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CONVERTER.setText("CONVERTER");
        CONVERTER.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        DISTANCE.setBackground(new java.awt.Color(0, 153, 153));
        DISTANCE.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DISTANCE.setText("DISTANCE");
        DISTANCE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        DISTANCE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DISTANCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DISTANCEActionPerformed(evt);
            }
        });

        TEMPERATURE.setBackground(new java.awt.Color(0, 153, 153));
        TEMPERATURE.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        TEMPERATURE.setText("TEMPERATURE");
        TEMPERATURE.setToolTipText("");
        TEMPERATURE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TEMPERATURE.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TEMPERATURE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEMPERATUREActionPerformed(evt);
            }
        });

        CURRENCY.setBackground(new java.awt.Color(0, 153, 153));
        CURRENCY.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        CURRENCY.setText("CURRENCY");
        CURRENCY.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CURRENCY.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CURRENCY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CURRENCYActionPerformed(evt);
            }
        });

        EXIT.setText("Exit");
        EXIT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EXIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXITActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CONVERTALLLayout = new javax.swing.GroupLayout(CONVERTALL);
        CONVERTALL.setLayout(CONVERTALLLayout);
        CONVERTALLLayout.setHorizontalGroup(
            CONVERTALLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CONVERTALLLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(CONVERTALLLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(CONVERTALLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CONVERTER, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CURRENCY, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEMPERATURE, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DISTANCE, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        CONVERTALLLayout.setVerticalGroup(
            CONVERTALLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CONVERTALLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CONVERTER, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CURRENCY, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TEMPERATURE, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DISTANCE, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(EXIT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CONVERTALL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CONVERTALL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DISTANCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DISTANCEActionPerformed
        // TODO add your handling code here:
        distance obj1 = new distance();
        dispose();
        obj1.setVisible(true);
    }//GEN-LAST:event_DISTANCEActionPerformed

    private void TEMPERATUREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEMPERATUREActionPerformed
        // TODO add your handling code here:
        tempertaure obj2 = new tempertaure();
        dispose();
        obj2.setVisible(true);

    }//GEN-LAST:event_TEMPERATUREActionPerformed

    private void CURRENCYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CURRENCYActionPerformed
        // TODO add your handling code here:
        currency obj = new currency();
        dispose();
        obj.setVisible(true);
      

    }//GEN-LAST:event_CURRENCYActionPerformed

    private void EXITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXITActionPerformed
        System.exit(0);
    }//GEN-LAST:event_EXITActionPerformed

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
            java.util.logging.Logger.getLogger(allConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(allConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(allConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(allConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new allConverter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CONVERTALL;
    private javax.swing.JLabel CONVERTER;
    private javax.swing.JButton CURRENCY;
    private javax.swing.JButton DISTANCE;
    private javax.swing.JButton EXIT;
    private javax.swing.JButton TEMPERATURE;
    // End of variables declaration//GEN-END:variables
}
