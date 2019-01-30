/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BL.GießManager;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import observer.GießObserver;

/**
 *
 * @author ASUS
 */
public class GießManagerImages extends javax.swing.JFrame implements GießObserver {

    /**
     * Creates new form GießManagerImages
     */
    public GießManagerImages() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbImages = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbImages, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbImages, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbImages;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(GießManager m) {
        if (m.getTemp() > 0 && m.getLastTime() > 24) {
            lbImages.setIcon(new ImageIcon("src/images/eingehend.jpg"));
            JOptionPane.showMessageDialog(null, "Bitte gießen!");
        } else if (m.getTemp() > 10 && m.getLastTime() > 16) {
            lbImages.setIcon(new ImageIcon("src/images/eingehend.jpg"));
            JOptionPane.showMessageDialog(null, "Bitte gießen!");
        } else if (m.getTemp() > 20 && m.getLastTime() > 10) {
            lbImages.setIcon(new ImageIcon("src/images/eingehend.jpg"));
            JOptionPane.showMessageDialog(null, "Bitte gießen!");
        } else if (m.getTemp() > 30 && m.getLastTime() > 6) {
            lbImages.setIcon(new ImageIcon("src/images/eingehend.jpg"));
            JOptionPane.showMessageDialog(null, "Bitte gießen!");
        } //--------------------------------------------------------------
        else if (m.getTemp() > 0 && m.getLastTime() > 30) {
            lbImages.setIcon(new ImageIcon("src/images/tot.jpg"));
            JOptionPane.showMessageDialog(null, "Planze ist tot!");
        } else if (m.getTemp() > 10 && m.getLastTime() > 24) {
            lbImages.setIcon(new ImageIcon("src/images/tot.jpg"));
            JOptionPane.showMessageDialog(null, "Planze ist tot!");
        } else if (m.getTemp() > 20 && m.getLastTime() > 16) {
            lbImages.setIcon(new ImageIcon("src/images/tot.jpg"));
            JOptionPane.showMessageDialog(null, "Planze ist tot!");
        } else if (m.getTemp() > 30 && m.getLastTime() > 10) {
            lbImages.setIcon(new ImageIcon("src/images/tot.jpg"));
            JOptionPane.showMessageDialog(null, "Planze ist tot!");
        } //--------------------------------------------------------------
        else if(m.getTemp() > 40 || m.getTemp() < -10){
            JOptionPane.showMessageDialog(null, "ungültiger Temperaturwert! (-10 --> +40)");
        }
        else if(m.getLastTime() < 0 || m.getLastTime() > 50){
            JOptionPane.showMessageDialog(null, "ungültiger Zeitraum! (0 --> +50)");
        }
        else {
            lbImages.setIcon(new ImageIcon("src/images/schön_1.jpg"));
            JOptionPane.showMessageDialog(null, "Pflanze optimal!");
        }
    }
}
