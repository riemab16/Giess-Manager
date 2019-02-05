package GUI;

import BL.GiessManagerEntry;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import observer.GiessObserver;

public class GiessManagerStatus extends javax.swing.JFrame implements GiessObserver {

    public GiessManagerStatus() {
        initComponents();
        this.setTitle("GiessManagerStatus");
    
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
    public void update(GiessManagerEntry m) {
     if (m.getTemp() > 12 && m.getLastTime() > 24 && m.getLastTime() <= 35) {
            lbStatus.setIcon(new ImageIcon("src/images/giesskanne.jpg"));
    
        } //--------------------------------------------------------------
         else if (m.getTemp() > 12 && m.getLastTime() > 35) {
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
