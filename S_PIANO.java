/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class S_PIANO extends javax.swing.JFrame {

    /**
     * Creates new form S_PIANO
     */
    public S_PIANO() {
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

        jButton17 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton17.setBackground(new java.awt.Color(204, 255, 255));
        jButton17.setText("C#");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 60, 130));

        jButton15.setBackground(new java.awt.Color(204, 255, 255));
        jButton15.setText("D#");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 60, 130));

        jButton19.setBackground(new java.awt.Color(204, 255, 255));
        jButton19.setText("F#");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 60, 130));

        jButton14.setBackground(new java.awt.Color(204, 255, 255));
        jButton14.setText("G#");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 60, 130));

        jButton13.setBackground(new java.awt.Color(204, 255, 255));
        jButton13.setText("Bb");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 60, 130));

        jButton12.setBackground(new java.awt.Color(204, 255, 255));
        jButton12.setText("C#1");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 60, 130));

        jButton11.setBackground(new java.awt.Color(204, 255, 255));
        jButton11.setText("D#1");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 130, 60, 130));

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setText("C");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 60, 170));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setText("D");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 60, 170));

        jButton9.setBackground(new java.awt.Color(153, 153, 153));
        jButton9.setText("E");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 60, 170));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setText("F");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 60, 170));

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setText("G");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 60, 170));

        jButton5.setBackground(new java.awt.Color(153, 153, 153));
        jButton5.setText("A");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 60, 170));

        jButton6.setBackground(new java.awt.Color(153, 153, 153));
        jButton6.setText("B");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 60, 170));

        jButton16.setBackground(new java.awt.Color(153, 153, 153));
        jButton16.setText("C1");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 60, 170));

        jButton7.setBackground(new java.awt.Color(153, 153, 153));
        jButton7.setText("D1");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 60, 170));

        jButton8.setBackground(new java.awt.Color(153, 153, 153));
        jButton8.setText("E1");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 60, 170));

        jButton10.setBackground(new java.awt.Color(153, 153, 153));
        jButton10.setText("F1");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, 60, 170));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SK-PIANO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 260, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        
        try{
            String path = "D:\\PIANO_MUSIC\\D_s1.wav";
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
            Clip player = AudioSystem.getClip();
            player.open(audio);
            player.start();
        }catch(Exception e){

        }

    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        try{
            String path = "D:\\PIANO_MUSIC\\F.wav";
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
            Clip player = AudioSystem.getClip();
            player.open(audio);
            player.start();
        }catch(Exception e){

        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        
        try{
            String path = "D:\\PIANO_MUSIC\\F_s.wav";
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
            Clip player = AudioSystem.getClip();
            player.open(audio);
            player.start();
        }catch(Exception e){

        }

    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        
        try{
            String path = "D:\\PIANO_MUSIC\\D_s.wav";
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
            Clip player = AudioSystem.getClip();
            player.open(audio);
            player.start();
        }catch(Exception e){

        }

    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        
        try{
            String path = "D:\\PIANO_MUSIC\\G_s.wav";
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
            Clip player = AudioSystem.getClip();
            player.open(audio);
            player.start();
        }catch(Exception e){

        }

    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        try{
            String path = "D:\\PIANO_MUSIC\\G_s.wav";
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
            Clip player = AudioSystem.getClip();
            player.open(audio);
            player.start();
        }catch(Exception e){

        }

    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed

        try{
            String path = "D:\\PIANO_MUSIC\\Bb.wav";
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
            Clip player = AudioSystem.getClip();
            player.open(audio);
            player.start();
        }catch(Exception e){

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        try{
            String path = "D:\\PIANO_MUSIC\\C_s1.wav";
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
            Clip player = AudioSystem.getClip();
            player.open(audio);
            player.start();
        }catch(Exception e){

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try{
            String path = "D:\\PIANO_MUSIC\\C.wav";
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
            Clip player = AudioSystem.getClip();
            player.open(audio);
            player.start();
        }catch(Exception e){

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
            String path = "D:\\PIANO_MUSIC\\D.wav";
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
            Clip player = AudioSystem.getClip();
            player.open(audio);
            player.start();
        }catch(Exception e){

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        try{
            String path = "D:\\PIANO_MUSIC\\E.wav";
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
            Clip player = AudioSystem.getClip();
            player.open(audio);
            player.start();
        }catch(Exception e){

        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
            String path = "D:\\PIANO_MUSIC\\A.wav";
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
            Clip player = AudioSystem.getClip();
            player.open(audio);
            player.start();
        }catch(Exception e){

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        try{
            String path = "D:\\PIANO_MUSIC\\B.wav";
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
            Clip player = AudioSystem.getClip();
            player.open(audio);
            player.start();
        }catch(Exception e){

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed

        try{
            String path = "D:\\PIANO_MUSIC\\C1.wav";
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
            Clip player = AudioSystem.getClip();
            player.open(audio);
            player.start();
        }catch(Exception e){

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        try{
            String path = "D:\\PIANO_MUSIC\\D1.wav";
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
            Clip player = AudioSystem.getClip();
            player.open(audio);
            player.start();
        }catch(Exception e){

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        try{
            String path = "D:\\PIANO_MUSIC\\E1.wav";
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
            Clip player = AudioSystem.getClip();
            player.open(audio);
            player.start();
        }catch(Exception e){

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        try{
            String path = "D:\\PIANO_MUSIC\\F1.wav";
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
            Clip player = AudioSystem.getClip();
            player.open(audio);
            player.start();
        }catch(Exception e){

        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
            String path = "D:\\PIANO_MUSIC\\G.wav";
            AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
            Clip player = AudioSystem.getClip();
            player.open(audio);
            player.start();
        }catch(Exception e){

        } 
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(S_PIANO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(S_PIANO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(S_PIANO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(S_PIANO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new S_PIANO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
