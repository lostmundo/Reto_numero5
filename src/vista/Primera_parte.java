/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author sebas
 */
public class Primera_parte extends javax.swing.JFrame {

    /**
     * Creates new form Primera_parte
     */
    Requerimiento_1 requerimiento;
    consulta Consulta;
    consulta_2 Consulta_2;
    consulta_3 Consulta_3;
    
    public Primera_parte() throws SQLException {
        this.initComponents();
        setSize(620, 420);
        this.setLocationRelativeTo(null);
        
        requerimiento= new Requerimiento_1();
        requerimiento.setBounds(0,0,620,380);
        add(requerimiento);
        Consulta = new consulta();
        Consulta.setBounds(134,10,620,380);
        add(Consulta);
        Consulta.setVisible(false);
        Consulta_2 = new consulta_2();
        Consulta_2.setBounds(134,10,620,380);
        add(Consulta_2);
        Consulta_2.setVisible(false);
        Consulta_3 = new consulta_3();
        Consulta_3.setBounds(134,10,620,380);
        add(Consulta_3);
        Consulta_3.setVisible(false);
        
        
        
        
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
        Bt_consulta_1 = new javax.swing.JButton();
        Bt_consulta_2 = new javax.swing.JButton();
        Bt_consulta_3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(132, 245, 222));
        jPanel1.setAutoscrolls(true);

        Bt_consulta_1.setBackground(new java.awt.Color(0, 245, 222));
        Bt_consulta_1.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        Bt_consulta_1.setForeground(new java.awt.Color(255, 255, 255));
        Bt_consulta_1.setText("   Consulta_1");
        Bt_consulta_1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Bt_consulta_1.setBorderPainted(false);
        Bt_consulta_1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Bt_consulta_1.setMaximumSize(new java.awt.Dimension(47, 17));
        Bt_consulta_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_consulta_1ActionPerformed(evt);
            }
        });

        Bt_consulta_2.setBackground(new java.awt.Color(0, 245, 222));
        Bt_consulta_2.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        Bt_consulta_2.setForeground(new java.awt.Color(255, 255, 255));
        Bt_consulta_2.setText("   Consulta_2");
        Bt_consulta_2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Bt_consulta_2.setBorderPainted(false);
        Bt_consulta_2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Bt_consulta_2.setMaximumSize(new java.awt.Dimension(47, 17));
        Bt_consulta_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_consulta_2ActionPerformed(evt);
            }
        });

        Bt_consulta_3.setBackground(new java.awt.Color(0, 245, 222));
        Bt_consulta_3.setFont(new java.awt.Font("Bahnschrift", 0, 11)); // NOI18N
        Bt_consulta_3.setForeground(new java.awt.Color(255, 255, 255));
        Bt_consulta_3.setText("   Consulta_3");
        Bt_consulta_3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Bt_consulta_3.setBorderPainted(false);
        Bt_consulta_3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Bt_consulta_3.setMaximumSize(new java.awt.Dimension(47, 17));
        Bt_consulta_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_consulta_3ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/LogoApliacionReto5_25%.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bt_consulta_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Bt_consulta_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Bt_consulta_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Bt_consulta_1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bt_consulta_2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Bt_consulta_3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 444, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bt_consulta_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_consulta_1ActionPerformed
        // TODO add your handling code here:
        setSize (800,450);
        requerimiento.setVisible(false);
        Consulta.setVisible(true);
        Consulta_2.setVisible(false);
        Consulta_3.setVisible(false);
        
        
    }//GEN-LAST:event_Bt_consulta_1ActionPerformed

    private void Bt_consulta_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_consulta_2ActionPerformed
        // TODO add your handling code here:
        setSize (800,450);
        requerimiento.setVisible(false);
        Consulta.setVisible(false);
        Consulta_2.setVisible(true);
        Consulta_3.setVisible(false);
    }//GEN-LAST:event_Bt_consulta_2ActionPerformed

    private void Bt_consulta_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_consulta_3ActionPerformed
        // TODO add your handling code here:
        setSize (800,450);
        requerimiento.setVisible(false);
        Consulta.setVisible(false);
        Consulta_2.setVisible(false);
        Consulta_3.setVisible(true);
    }//GEN-LAST:event_Bt_consulta_3ActionPerformed

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
            java.util.logging.Logger.getLogger(Primera_parte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Primera_parte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Primera_parte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Primera_parte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Primera_parte().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Primera_parte.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_consulta_1;
    private javax.swing.JButton Bt_consulta_2;
    private javax.swing.JButton Bt_consulta_3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
private void setLocationRelativeto(Object object) {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
