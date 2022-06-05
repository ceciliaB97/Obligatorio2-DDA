package UI;

public class LoginInicio extends javax.swing.JFrame {

    public LoginInicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuMozo = new javax.swing.JMenuItem();
        mnuGestor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Usuarios");

        mnuMozo.setText("Mozo");
        mnuMozo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMozoActionPerformed(evt);
            }
        });
        jMenu1.add(mnuMozo);

        mnuGestor.setText("Gestor");
        mnuGestor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGestorActionPerformed(evt);
            }
        });
        jMenu1.add(mnuGestor);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuMozoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMozoActionPerformed
        this.loginMozo();
    }//GEN-LAST:event_mnuMozoActionPerformed

    private void mnuGestorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGestorActionPerformed
        this.loginGestor();
    }//GEN-LAST:event_mnuGestorActionPerformed

    private void loginMozo() {
        new DialogoLoginMozo(this, false).setVisible(true);
    }

    private void loginGestor() {
        new DialogoLoginGestor(this, false).setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnuGestor;
    private javax.swing.JMenuItem mnuMozo;
    // End of variables declaration//GEN-END:variables
}
