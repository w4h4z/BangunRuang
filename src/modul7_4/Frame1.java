/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul7_4;

import javax.swing.JOptionPane;

/**
 *
 * @author Wahaz
 */
public class Frame1 extends javax.swing.JFrame {

    /**
     * Creates new form Frame1
     */
    public Frame1() {
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

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        panjang1 = new javax.swing.JTextField();
        lebar1 = new javax.swing.JTextField();
        tinggi1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        kubus = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        bola = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Program Pencari Volume Bangun Ruang");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 20, 250, 30);

        jPanel1.setLayout(null);

        jLabel2.setText("Masukkan Panjang :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 30, 150, 30);

        jLabel3.setText("Masukkan Lebar :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 80, 150, 30);

        jLabel4.setText("Masukkan Tinggi :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 130, 150, 30);

        jButton1.setText("Hitung");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(120, 180, 63, 23);
        jPanel1.add(panjang1);
        panjang1.setBounds(150, 30, 120, 30);
        jPanel1.add(lebar1);
        lebar1.setBounds(150, 80, 120, 30);
        jPanel1.add(tinggi1);
        tinggi1.setBounds(150, 130, 120, 30);

        jLabel5.setText("Cm");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(290, 90, 40, 20);

        jLabel6.setText("Cm");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(290, 140, 40, 20);

        jLabel7.setText("Cm");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(290, 40, 40, 20);

        jTabbedPane1.addTab("Balok", jPanel1);

        jPanel2.setLayout(null);

        jLabel8.setText("Cm");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(150, 70, 40, 14);

        jLabel9.setText("Masukkan Panjang Sisi");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(40, 30, 160, 20);
        jPanel2.add(kubus);
        kubus.setBounds(40, 60, 100, 30);

        jButton2.setText("Volume");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(40, 100, 90, 23);

        jTabbedPane1.addTab("Kubus", jPanel2);

        jPanel3.setLayout(null);

        jButton3.setText("Volume");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(40, 100, 80, 23);
        jPanel3.add(bola);
        bola.setBounds(40, 60, 100, 30);

        jLabel10.setText("Cm");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(150, 70, 40, 14);

        jLabel11.setText("Masukkan Panjang Jari-jari");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(40, 30, 150, 20);

        jTabbedPane1.addTab("Bola", jPanel3);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(-10, 50, 420, 250);

        setBounds(0, 0, 416, 339);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int panjang,lebar,tinggi;
        panjang=Integer.parseInt(panjang1.getText());
        lebar=Integer.parseInt(lebar1.getText());
        tinggi=Integer.parseInt(tinggi1.getText());
        int hasil=panjang*lebar*tinggi;
        try{
            JOptionPane.showMessageDialog(null,"Volume Balok Adalah :"+hasil,"luas",JOptionPane.INFORMATION_MESSAGE);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Error :"+e,"Gagal",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int sisi;
        sisi=Integer.parseInt(kubus.getText());
        int hasil=sisi*sisi*sisi;
        
        try{
            JOptionPane.showMessageDialog(null,"Luas Permukaan Kubus Adalah :"+hasil,"luas",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error"+e,"Gagal",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        float jari;
        jari=Integer.parseInt(bola.getText());
        float hasil1=(float) (4/3*3.14*jari*jari*jari);
        
        try{
            JOptionPane.showMessageDialog(null,"Luas Permukaan Bola Adalah :"+hasil1,"luas",JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error"+e,"Gagal",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bola;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField kubus;
    private javax.swing.JTextField lebar1;
    private javax.swing.JTextField panjang1;
    private javax.swing.JTextField tinggi1;
    // End of variables declaration//GEN-END:variables
}
