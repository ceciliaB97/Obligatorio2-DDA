package UI;

public class DialogoMesa extends javax.swing.JDialog {

    public DialogoMesa(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        String nombreMozo = "NombreMozo";
        this.setTitle("Atención de Mesas | Mozo: " + nombreMozo);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMesa1 = new javax.swing.JButton();
        lblMesa2 = new javax.swing.JButton();
        lblMesa3 = new javax.swing.JButton();
        lblMesa4 = new javax.swing.JButton();
        lblMesa5 = new javax.swing.JButton();
        lblAbrir = new javax.swing.JButton();
        lblCerrar = new javax.swing.JButton();
        lblTransferir = new javax.swing.JButton();
        lblAddProducto = new javax.swing.JButton();
        lblMesaSeleccionada = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        lblDescripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        lblCantidad = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblMesa1.setLabel("Mesa 1");
        lblMesa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblMesa1ActionPerformed(evt);
            }
        });

        lblMesa2.setLabel("Mesa 2");
        lblMesa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblMesa2ActionPerformed(evt);
            }
        });

        lblMesa3.setLabel("Mesa 3");
        lblMesa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblMesa3ActionPerformed(evt);
            }
        });

        lblMesa4.setLabel("Mesa 4");
        lblMesa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblMesa4ActionPerformed(evt);
            }
        });

        lblMesa5.setLabel("Mesa 5");
        lblMesa5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblMesa5ActionPerformed(evt);
            }
        });

        lblAbrir.setText("Abrir");

        lblCerrar.setText("Cerrar");

        lblTransferir.setText("Transferir");

        lblAddProducto.setText("AgregarProducto");

        lblMesaSeleccionada.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblMesaSeleccionada.setText("no hay mesa seleccionada");

        lblCodigo.setText("Código");

        lblDescripcion.setText("Descripción:");

        lblCantidad.setText("Cantidad:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(lblMesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblMesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblMesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTransferir, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblMesaSeleccionada))
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCantidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAddProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblMesaSeleccionada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAbrir)
                        .addGap(8, 8, 8)
                        .addComponent(lblCerrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTransferir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMesa1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMesa2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMesa3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMesa4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMesa5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescripcion)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCantidad)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddProducto))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        lblMesaSeleccionada.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMesa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblMesa1ActionPerformed
        this.lblMesaSeleccionada.setText("Mesa 1");
    }//GEN-LAST:event_lblMesa1ActionPerformed

    private void lblMesa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblMesa2ActionPerformed
        this.lblMesaSeleccionada.setText("Mesa 2");
    }//GEN-LAST:event_lblMesa2ActionPerformed

    private void lblMesa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblMesa3ActionPerformed
        this.lblMesaSeleccionada.setText("Mesa 3");
    }//GEN-LAST:event_lblMesa3ActionPerformed

    private void lblMesa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblMesa4ActionPerformed
        this.lblMesaSeleccionada.setText("Mesa 4");
    }//GEN-LAST:event_lblMesa4ActionPerformed

    private void lblMesa5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblMesa5ActionPerformed
        this.lblMesaSeleccionada.setText("Mesa 2");
    }//GEN-LAST:event_lblMesa5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton lblAbrir;
    private javax.swing.JButton lblAddProducto;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JButton lblCerrar;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JButton lblMesa1;
    private javax.swing.JButton lblMesa2;
    private javax.swing.JButton lblMesa3;
    private javax.swing.JButton lblMesa4;
    private javax.swing.JButton lblMesa5;
    private javax.swing.JLabel lblMesaSeleccionada;
    private javax.swing.JButton lblTransferir;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
