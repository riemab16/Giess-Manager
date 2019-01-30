package GUI;

import BL.GießManager;
import javax.swing.ImageIcon;
import observer.GießObserver;

public class GießManagerStatus extends javax.swing.JFrame implements GießObserver {

    public GießManagerStatus() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void update(GießManager m) {
        if (m.getTemp() > 0 && m.getLastTime() > 24) {
            lbStatus.setIcon(new ImageIcon("src/images/gießkanne.jpg"));
        } else if (m.getTemp() > 10 && m.getLastTime() > 16) {
            lbStatus.setIcon(new ImageIcon("src/images/gießkanne.jpg"));
        } else if (m.getTemp() > 20 && m.getLastTime() > 10) {
            lbStatus.setIcon(new ImageIcon("src/images/gießkanne.jpg"));
        } else if (m.getTemp() > 30 && m.getLastTime() > 6) {
            lbStatus.setIcon(new ImageIcon("src/images/gießkanne.jpg"));
        } //--------------------------------------------------------------
        else if (m.getTemp() > 0 && m.getLastTime() > 30) {
            lbStatus.setIcon(new ImageIcon("src/images/daumenrunter.jpg"));
        } else if (m.getTemp() > 10 && m.getLastTime() > 24) {
            lbStatus.setIcon(new ImageIcon("src/images/daumenrunter.jpg"));
        } else if (m.getTemp() > 20 && m.getLastTime() > 16) {
            lbStatus.setIcon(new ImageIcon("src/images/daumenrunter.jpg"));
        } else if (m.getTemp() > 30 && m.getLastTime() > 10) {
            lbStatus.setIcon(new ImageIcon("src/images/daumenrunter.jpg"));
        } //--------------------------------------------------------------
        else {
            lbStatus.setIcon(new ImageIcon("src/images/daumenhoch.jpg"));
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbStatus;
    // End of variables declaration//GEN-END:variables
}
