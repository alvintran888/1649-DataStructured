/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

/**
 *
 * @author Admin
 */
public class form4 extends javax.swing.JFrame {

    /**
     * Creates new form form4
     */
    public form4() {
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

        one = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        two.setText("2");
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        three.setText("3");
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(two, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(one, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(three, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(zero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(384, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(two, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(three, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(279, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
       if(one.getText() == ""){
        }else if(one.getText() == "1" && zero.getText() == ""){
            zero.setText("1");
            one.setText(zero.getText());
            one.setText("");
        }else if(one.getText() == "2" && two.getText() == ""){
            two.setText("2");
            one.setText(two.getText());
            one.setText("");
        }else if(one.getText() == "2" && zero.getText() == ""){
            zero.setText("2");
            one.setText(zero.getText());
            one.setText("");
        }else if(one.getText() == "3" && zero.getText() == ""){
            zero.setText("3");
            one.setText(zero.getText());
            one.setText("");
        }else if(one.getText() == "1" && two.getText() == ""){
            two.setText("1");
            one.setText(two.getText());
            one.setText("");
        }else if(one.getText() == "3" && two.getText() == ""){
            two.setText("3");
            one.setText(two.getText());
            one.setText("");
        }
    }//GEN-LAST:event_oneActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        if(zero.getText() == ""){
        }else if(zero.getText() == "1" && one.getText() == ""){
            one.setText("1");
            zero.setText(one.getText());
            zero.setText("");
        }else if(zero.getText() == "3" && three.getText() == ""){
            three.setText("3");
            zero.setText(three.getText());
            zero.setText("");
        }else if(zero.getText() == "1" && three.getText() == ""){
            three.setText("1");
            zero.setText(three.getText());
            zero.setText("");
        }else if(zero.getText() == "2" && three.getText() == ""){
            three.setText("2");
            zero.setText(three.getText());
            zero.setText("");
        }else if(zero.getText() == "3" && one.getText() == ""){
            one.setText("3");
            zero.setText(one.getText());
            zero.setText("");
        }else if(zero.getText() == "2" && one.getText() == ""){
            one.setText("2");
            zero.setText(one.getText());
            zero.setText("");
        }
    }//GEN-LAST:event_zeroActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        if(two.getText() == ""){
        }else if(two.getText() == "2" && one.getText() == ""){
            one.setText("2");
            two.setText(one.getText());
            two.setText("");
        }else if(two.getText() == "3" && three.getText() == ""){
            three.setText("3");
            two.setText(three.getText());
            two.setText("");
        }else if(two.getText() == "3" && one.getText() == ""){
            one.setText("3");
            two.setText(one.getText());
            two.setText("");
        }else if(two.getText() == "1" && one.getText() == ""){
            one.setText("1");
            two.setText(one.getText());
            two.setText("");
        }else if(two.getText() == "2" && three.getText() == ""){
            three.setText("2");
            two.setText(three.getText());
            two.setText("");
        }else if(two.getText() == "1" && three.getText() == ""){
            three.setText("1");
            two.setText(three.getText());
            two.setText("");
        }else if(two.getText() == "3" && three.getText() == ""){
            three.setText("3");
            two.setText(three.getText());
            two.setText("");
        }
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        if(three.getText() == ""){    
        }else if(zero.getText() == "" && three.getText() == "3"){
            zero.setText("3");
            three.setText(zero.getText());
            three.setText("");
}else if(two.getText() == "" && three.getText() == "3"){
            two.setText("3");
            three.setText(two.getText());
            three.setText("");
        }if(two.getText() == "" && three.getText() == "1"){
            two.setText("1");
            three.setText(two.getText());
            three.setText("");
        }if(two.getText() == "" && three.getText() == "2"){
            two.setText("2");
            three.setText(two.getText());
            three.setText("");
        }else if(zero.getText() == "" && three.getText() == "2"){
            zero.setText("2");
            three.setText(zero.getText());
            three.setText("");
        }else if(zero.getText() == "" && three.getText() == "1"){
            zero.setText("1");
            three.setText(zero.getText());
            three.setText("");
        }
    }//GEN-LAST:event_threeActionPerformed

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
            java.util.logging.Logger.getLogger(form4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton one;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}