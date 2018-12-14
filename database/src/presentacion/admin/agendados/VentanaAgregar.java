package presentacion.admin.agendados;

import javax.swing.ImageIcon;

public class VentanaAgregar extends javax.swing.JFrame {

    public VentanaAgregar() {
        initComponents();
        start();
    }

    private void start() {
//        this.setIconImage(new ImageIcon(getClass().getResource("../imagenes/HouseLogo.png")).getImage());
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonInquilino = new javax.swing.JButton();
        botonPropietario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(72, 72, 136));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jPanel1.setForeground(new java.awt.Color(72, 72, 136));

        botonInquilino.setBackground(new java.awt.Color(153, 153, 255));
        botonInquilino.setText("Inquilino");
        botonInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInquilinoActionPerformed(evt);
            }
        });

        botonPropietario.setBackground(new java.awt.Color(153, 153, 255));
        botonPropietario.setText("Propietario");
        botonPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPropietarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonInquilino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonPropietario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonInquilino)
                    .addComponent(botonPropietario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInquilinoActionPerformed
        dispose();
        VentanaAgregarInquilino inqui = new VentanaAgregarInquilino();
        inqui.setVisible(true);
    }//GEN-LAST:event_botonInquilinoActionPerformed

    private void botonPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPropietarioActionPerformed
        dispose();
        VentanaAgregarPropietario inqui = new VentanaAgregarPropietario();
        inqui.setVisible(true);
    }//GEN-LAST:event_botonPropietarioActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaAgregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInquilino;
    private javax.swing.JButton botonPropietario;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
