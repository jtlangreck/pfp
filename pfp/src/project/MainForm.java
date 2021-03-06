/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;

/**
 *
 * @author Jake Langreck
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
    }
    
    public void close(){
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/index.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(204, 51, 255), new java.awt.Color(204, 51, 255), new java.awt.Color(204, 51, 255), new java.awt.Color(204, 51, 255)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 51, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Jamming Jelly, Incorporated");

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(204, 204, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setForeground(new java.awt.Color(102, 0, 102));
        jTextArea1.setRows(5);
        jTextArea1.setText("Jamming Jelly preserves contain only\nnatural ingredients, without artificial\nflavors, perservatives, or coloring; and\nguarantees high-quality products with\nconsistent results.\n\nJamming Jelly offers a range of flavors of\nPremium Preserves, Bakery Jams, and\nGlazes for use in Bakery, Retail, and\nFoodservice operations.\n\nJamming Jelly uses 70% fruit preserves from\nthe famous Lake Lucerne Orchards in\nSwitzerland. These products are available\nin Tubs, Jars, and Portions, Bakery Jams,\nGels, and Glazes - all in a variety of flavors\nand sizes.\n\nCarefully selected fruits, premium\npackagaing, and a unique cooking method\nare what makes Jamming Jelly products so\nspecial.");
        jTextArea1.setCaretColor(new java.awt.Color(153, 153, 255));
        jTextArea1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextArea1.setDisabledTextColor(new java.awt.Color(204, 51, 255));
        jScrollPane1.setViewportView(jTextArea1);

        jMenuBar2.setBackground(new java.awt.Color(153, 102, 255));

        jMenu2.setBackground(new java.awt.Color(204, 102, 255));
        jMenu2.setForeground(new java.awt.Color(255, 255, 102));
        jMenu2.setText("Home");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(204, 102, 255));
        jMenu3.setForeground(new java.awt.Color(255, 255, 102));
        jMenu3.setText("Employees");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(204, 51, 255));
        jMenu4.setForeground(new java.awt.Color(255, 255, 102));
        jMenu4.setText("Departments");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(204, 51, 255));
        jMenu5.setForeground(new java.awt.Color(255, 255, 102));
        jMenu5.setText("Assignments");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu5);

        jMenu6.setBackground(new java.awt.Color(204, 51, 255));
        jMenu6.setForeground(new java.awt.Color(255, 255, 102));
        jMenu6.setText("Payroll");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu6);

        jMenu7.setBackground(new java.awt.Color(204, 51, 255));
        jMenu7.setForeground(new java.awt.Color(255, 255, 102));
        jMenu7.setText("Close");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu7);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addGap(88, 88, 88)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        // TODO add your handling code here:
       // Project.writefiles(); 
        dispose(); 
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        close();
        EmployeeForm e = new EmployeeForm();
        e.setVisible(true);
     
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
          
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
           close();
        DepartmentForm d = new DepartmentForm();
        d.setVisible(true);
     
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
           close();
        AssignmentForm a = new AssignmentForm();
        a.setVisible(true);
     
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        // TODO add your handling code here:
           close();
        PayrollForm p = new PayrollForm();
        p.setVisible(true);
     
    }//GEN-LAST:event_jMenu6MouseClicked

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables


}
