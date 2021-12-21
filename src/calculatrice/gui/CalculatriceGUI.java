package calculatrice.gui;

import javax.swing.JOptionPane;

public class CalculatriceGUI extends javax.swing.JFrame {

    public CalculatriceGUI() {
        initComponents();
        RESULTATO.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        SUM = new javax.swing.JButton();
        DIFFERENZA = new javax.swing.JButton();
        PRODOTTO = new javax.swing.JButton();
        DIVISOIONE = new javax.swing.JButton();
        NUMERO1 = new javax.swing.JTextField();
        Clear = new javax.swing.JButton();
        NUMERO2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        RESULTATO = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SUM.setText("+");
        SUM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SUMActionPerformed(evt);
            }
        });

        DIFFERENZA.setText("-");
        DIFFERENZA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DIFFERENZAActionPerformed(evt);
            }
        });

        PRODOTTO.setText("*");
        PRODOTTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRODOTTOActionPerformed(evt);
            }
        });

        DIVISOIONE.setText("/");
        DIVISOIONE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DIVISOIONEActionPerformed(evt);
            }
        });

        NUMERO1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUMERO1ActionPerformed(evt);
            }
        });

        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        NUMERO2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUMERO2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Numero 1");

        jLabel2.setText("Numero 2");

        RESULTATO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESULTATOActionPerformed(evt);
            }
        });

        jLabel3.setText("Resultato");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(NUMERO1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NUMERO2, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(133, 133, 133)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DIVISOIONE, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DIFFERENZA, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(RESULTATO))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(PRODOTTO, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(SUM)
                                    .addGap(43, 43, 43)
                                    .addComponent(Clear))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NUMERO1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NUMERO2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RESULTATO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PRODOTTO)
                    .addComponent(SUM)
                    .addComponent(Clear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DIVISOIONE)
                    .addComponent(DIFFERENZA))
                .addGap(154, 154, 154))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PRODOTTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRODOTTOActionPerformed
        // TODO add your handling code here:
        int num1, num2, prod;
        try {

            num1 = Integer.parseInt(NUMERO1.getText());
            num2 = Integer.parseInt(NUMERO2.getText());
            prod = num1 * num2;
            RESULTATO.setText(Integer.toString(prod));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Please enter a valid number");

        }
    }//GEN-LAST:event_PRODOTTOActionPerformed

    private void SUMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SUMActionPerformed
        // TODO add your handling code here:
        int num1, num2, sum;
        try {

            num1 = Integer.parseInt(NUMERO1.getText());
            num2 = Integer.parseInt(NUMERO2.getText());
            sum = num1 + num2;
            RESULTATO.setText(Integer.toString(sum));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Please enter a valid number");

        }
    }//GEN-LAST:event_SUMActionPerformed

    private void DIVISOIONEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIVISOIONEActionPerformed
        // TODO add your handling code here:
        int num1, num2, dev;
        try {

            num1 = Integer.parseInt(NUMERO1.getText());
            num2 = Integer.parseInt(NUMERO2.getText());
            dev = num1 / num2;
            RESULTATO.setText(Integer.toString(dev));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Please enter a valid number");

        }
    }//GEN-LAST:event_DIVISOIONEActionPerformed

    private void DIFFERENZAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIFFERENZAActionPerformed
        // TODO add your handling code here:

        int num1, num2, dif;
        try {

            num1 = Integer.parseInt(NUMERO1.getText());
            num2 = Integer.parseInt(NUMERO2.getText());
            dif = num1 + num2;
            RESULTATO.setText(Integer.toString(dif));

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Please enter a valid number");

        }
    }//GEN-LAST:event_DIFFERENZAActionPerformed

    private void NUMERO1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUMERO1ActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_NUMERO1ActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        NUMERO1.setText("");
        NUMERO2.setText("");
        RESULTATO.setText("");

    }//GEN-LAST:event_ClearActionPerformed

    private void NUMERO2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUMERO2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NUMERO2ActionPerformed

    private void RESULTATOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESULTATOActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_RESULTATOActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatriceGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton DIFFERENZA;
    private javax.swing.JButton DIVISOIONE;
    private javax.swing.JTextField NUMERO1;
    private javax.swing.JTextField NUMERO2;
    private javax.swing.JButton PRODOTTO;
    private javax.swing.JTextField RESULTATO;
    private javax.swing.JButton SUM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
