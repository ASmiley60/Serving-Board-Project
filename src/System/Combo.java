package System;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wj01254
 */
public class Combo extends javax.swing.JFrame {

    String [] Combos = new String[3];
    public Combo() {
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

        jPanel1 = new javax.swing.JPanel();
        ComboLabel = new javax.swing.JLabel();
        Reset = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Combo1 = new javax.swing.JCheckBox();
        Combo2 = new javax.swing.JCheckBox();
        Combo3 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        Printout = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ComboLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        ComboLabel.setText("Combo Menu");

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.setToolTipText("");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        Combo1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        Combo1.setText("Combo 1");
        Combo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Combo1MouseClicked(evt);
            }
        });
        Combo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Combo1ActionPerformed(evt);
            }
        });

        Combo2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        Combo2.setText("Combo 2");
        Combo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Combo2MouseClicked(evt);
            }
        });

        Combo3.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        Combo3.setText("Combo 3");
        Combo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Combo3MouseClicked(evt);
            }
        });

        Printout.setColumns(20);
        Printout.setRows(5);
        jScrollPane1.setViewportView(Printout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Combo3)
                    .addComponent(Combo2)
                    .addComponent(Combo1)
                    .addComponent(ComboLabel))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComboLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(Combo1)
                                .addGap(75, 75, 75)
                                .addComponent(Combo2)
                                .addGap(71, 71, 71)
                                .addComponent(Combo3))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void Combo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Combo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Combo1ActionPerformed

    private void Combo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Combo1MouseClicked
        Combos[0] = "You have choosen Combo 1.\n"
                + "You get the following items: \n"
                + "Main course: Hotdog ($2.00) \n"
                + "Topping(s): Ketchup ($.25) & Relish ($.25) \n"
                + "Snack : Fries ($1.00) \n"
                + " Drink : Soda ($1.00) \n"
                + "The combo will cost $4.50 \n";
        if(Combo1.isSelected()){
        Printout.append(Combos[0]);
        }
        else{
            Combo1.setSelected(false);
            Combo2.setSelected(false);
            Combo3.setSelected(false);
              Printout.setText(null); 
            
             }
    }//GEN-LAST:event_Combo1MouseClicked

    private void Combo2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Combo2MouseClicked
       Combos[1] = "\nYou've picked combo number 2.\n"
                + "You get the following items: \n"
                + "Main course: Salad ($3.00) \n"
                + "Topping(s): Tomato ($.50), Onion ($.50), Pickle ($.50) \n"
                + "Snack : Apple Slices ($1.00) \n"
                + " Drink : Water ($1.00)\n"
                + "The combo will cost $6.50 \n";
        if(Combo2.isSelected()){
            Printout.append(Combos[1]);
        }
        else{
            Combo1.setSelected(false);
            Combo2.setSelected(false);
            Combo3.setSelected(false);
            Printout.setText(null);
        }
    }//GEN-LAST:event_Combo2MouseClicked

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
       Combo1.setSelected(false);
       Combo2.setSelected(false);
       Combo3.setSelected(false);
       Printout.setText(null);
    }//GEN-LAST:event_ResetActionPerformed

    private void Combo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Combo3MouseClicked
       Combos[2] = "\nYou've picked combo number 3.\n"
                + "You get the following items: \n"
                + "Main course: Sandwich ($1.00) \n"
                + "Topping(s): Lettuce ($.50), Onion ($.50), Pickle ($.50),\n Tomato ($.50), and Cheese ($.50)  \n"
                + "Snack : Chips ($1.00) \n"
                + "Drink : Tea ($1.00)\n"
                + "The combo will cost $5.50 \n";
       if(Combo3.isSelected()){
            Printout.append(Combos[2]);
        }
        else{
            Combo1.setSelected(false);
            Combo2.setSelected(false);
            Combo3.setSelected(false);
            Printout.setText(null);
        }
    }//GEN-LAST:event_Combo3MouseClicked

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
            java.util.logging.Logger.getLogger(Combo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Combo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Combo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Combo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Combo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Combo1;
    private javax.swing.JCheckBox Combo2;
    private javax.swing.JCheckBox Combo3;
    private javax.swing.JLabel ComboLabel;
    private javax.swing.JButton Exit;
    private javax.swing.JTextArea Printout;
    private javax.swing.JButton Reset;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}