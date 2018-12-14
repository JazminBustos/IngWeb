// Frisicaro, Mauro Giuliano. mfrisicaro220@alumnos.iua.edu.ar
package presentacion;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import presentacion.admin.PrincipalAdmin;
import presentacion.inquilino.PrincipalInquilino;
import modelo.Usuario;
import negocios.UsuarioBO;

public class LogIn extends javax.swing.JFrame {

    private final UsuarioBO usuarioBO = new UsuarioBO();

    public LogIn() {
        initComponents();
        start();
    }

    private void start() {
        this.setIconImage(new ImageIcon(getClass().getResource("imagenes/HouseLogo.png")).getImage());
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelLogIn = new javax.swing.JPanel();
        botonIngresar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        panelUsuario = new javax.swing.JLabel();
        panelContrasena = new javax.swing.JLabel();
        textoUsuario = new javax.swing.JTextField();
        textoContrasena = new javax.swing.JPasswordField();
        panelSAI21 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Administracion Inmobiliaria");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        panelLogIn.setBackground(new java.awt.Color(72, 72, 136));
        panelLogIn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        panelLogIn.setMaximumSize(new java.awt.Dimension(32000, 32000));

        botonIngresar.setBackground(new java.awt.Color(153, 153, 255));
        botonIngresar.setText("Ingresar");
        botonIngresar.setPreferredSize(new java.awt.Dimension(80, 20));
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });

        botonSalir.setBackground(new java.awt.Color(153, 153, 255));
        botonSalir.setText("Salir");
        botonSalir.setPreferredSize(new java.awt.Dimension(70, 20));
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        panelUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        panelUsuario.setText("Usuario");

        panelContrasena.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelContrasena.setForeground(new java.awt.Color(255, 255, 255));
        panelContrasena.setText("Contraseña");

        textoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoUsuarioActionPerformed(evt);
            }
        });
        textoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textoUsuarioKeyPressed(evt);
            }
        });

        textoContrasena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textoContrasenaKeyPressed(evt);
            }
        });

        panelSAI21.setBackground(new java.awt.Color(0, 0, 0));
        panelSAI21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/SAI21.png"))); // NOI18N

        javax.swing.GroupLayout panelLogInLayout = new javax.swing.GroupLayout(panelLogIn);
        panelLogIn.setLayout(panelLogInLayout);
        panelLogInLayout.setHorizontalGroup(
            panelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogInLayout.createSequentialGroup()
                .addGroup(panelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLogInLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(panelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLogInLayout.createSequentialGroup()
                                .addGroup(panelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(panelContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(panelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelLogInLayout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addComponent(textoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLogInLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(panelLogInLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(panelSAI21)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        panelLogInLayout.setVerticalGroup(
            panelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogInLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(panelSAI21)
                .addGap(27, 27, 27)
                .addGroup(panelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelLogInLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        if ((textoUsuario.getText().trim()).equals("") || (textoContrasena.getText().trim()).equals("")) {
            JOptionPane.showMessageDialog(null, "INGRESE USUARIO Y CONTRASEÑA.");
        } else {
            Usuario usuarioActual = new Usuario();
            ArrayList<Usuario> usuarios = usuarioBO.getUsuarios();
            String usuario = textoUsuario.getText();
            usuario = usuario.trim();
            String password = new String(textoContrasena.getPassword());
            password = password.trim();
            for (Usuario u : usuarios) {
                if (u.getUsuario().equals(usuario)) {
                    usuarioActual = u;
                    break;
                } else {
                    usuarioActual.setClave("invalido");
                    usuarioActual.setUsuario("invalido");
                }
            }
            if (usuarioActual.getUsuario().equals(usuario) && usuarioActual.getClave().equals(password)) {

                if (usuarioActual.getEstadoAdmin()) {
                    String msg = usuarioActual.getIdUsuario();
                    PrincipalAdmin admin = new PrincipalAdmin(msg);
                    admin.setVisible(true);
                    dispose();
                } else {
                    PrincipalInquilino inquilino = new PrincipalInquilino();
                    inquilino.setVisible(true);
                    dispose();
                }
            } else {
                JOptionPane.showMessageDialog(null, "USUARIO Y/O CONTRASEÑA INCORRECTA.");
            }
        }
    }//GEN-LAST:event_botonIngresarActionPerformed

    private void textoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoUsuarioActionPerformed

    private void textoUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            botonIngresarActionPerformed(null);
        }
    }//GEN-LAST:event_textoUsuarioKeyPressed

    private void textoContrasenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoContrasenaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            botonIngresarActionPerformed(null);
        }
    }//GEN-LAST:event_textoContrasenaKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonIngresar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel panelContrasena;
    private javax.swing.JPanel panelLogIn;
    private javax.swing.JLabel panelSAI21;
    private javax.swing.JLabel panelUsuario;
    private javax.swing.JPasswordField textoContrasena;
    private javax.swing.JTextField textoUsuario;
    // End of variables declaration//GEN-END:variables
}
