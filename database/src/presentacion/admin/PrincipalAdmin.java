package presentacion.admin;

import java.util.Map;
import java.util.TreeMap;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import presentacion.admin.agendados.VentanaAgendados;
import presentacion.admin.propiedades.VentanaPropiedades;
import presentacion.admin.contratos.VentanaContratos;
import presentacion.admin.comprobantes.VentanaComprobantes;
import presentacion.admin.recibos.VentanaRecibos;
import presentacion.admin.saldos.VentanaSaldos;
import presentacion.admin.opciones.VentanaImpresora;
import presentacion.admin.opciones.VentanaRegistro;
import presentacion.admin.opciones.VentanaParametros;
import negocios.AdministradorBO;
import presentacion.LogIn;

public class PrincipalAdmin extends javax.swing.JFrame {

    private final AdministradorBO administradorBO = new AdministradorBO();

    public PrincipalAdmin(String id) {
        initComponents();
        start(id);
    }

    private void start(String msg) {
        this.setIconImage(new ImageIcon(getClass().getResource("../imagenes/HouseLogo.png")).getImage());
        this.setLocationRelativeTo(null);
        String administradorActual = administradorBO.buscarNombre(Integer.parseInt(msg));
        panelUsuario.setText(administradorActual);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        panelPrincipalAdmin = new javax.swing.JPanel();
        botonAgendados = new javax.swing.JButton();
        botonPropiedades = new javax.swing.JButton();
        botonContratos = new javax.swing.JButton();
        botonRecibos = new javax.swing.JButton();
        botonComprobantes = new javax.swing.JButton();
        botonSaldos = new javax.swing.JButton();
        panelSAI21 = new javax.swing.JLabel();
        panelEnSesion = new javax.swing.JLabel();
        panelUsuario = new javax.swing.JLabel();
        botonCerrarSesion = new javax.swing.JButton();
        panelIcono1 = new javax.swing.JLabel();
        panelIcono2 = new javax.swing.JLabel();
        panelIcono3 = new javax.swing.JLabel();
        panelIcono4 = new javax.swing.JLabel();
        panelIcono5 = new javax.swing.JLabel();
        panelIcono6 = new javax.swing.JLabel();
        menuAdmin = new javax.swing.JMenuBar();
        menuOpciones = new javax.swing.JMenu();
        itemImpresoras = new javax.swing.JMenuItem();
        itemParametros = new javax.swing.JMenuItem();
        itemRegistro = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Administracion Inmobiliaria");
        setBackground(new java.awt.Color(0, 0, 0));
        setName("jPrincipalAdmin"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        panelPrincipalAdmin.setBackground(new java.awt.Color(72, 72, 136));
        panelPrincipalAdmin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        panelPrincipalAdmin.setForeground(new java.awt.Color(255, 255, 255));
        panelPrincipalAdmin.setMaximumSize(new java.awt.Dimension(830, 558));
        panelPrincipalAdmin.setMinimumSize(new java.awt.Dimension(830, 558));
        panelPrincipalAdmin.setName(""); // NOI18N

        botonAgendados.setBackground(new java.awt.Color(153, 153, 255));
        botonAgendados.setText("Agendados");
        botonAgendados.setMaximumSize(new java.awt.Dimension(122, 50));
        botonAgendados.setMinimumSize(new java.awt.Dimension(122, 50));
        botonAgendados.setPreferredSize(new java.awt.Dimension(126, 50));
        botonAgendados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgendadosActionPerformed(evt);
            }
        });

        botonPropiedades.setBackground(new java.awt.Color(153, 153, 255));
        botonPropiedades.setText("Propiedades");
        botonPropiedades.setMaximumSize(new java.awt.Dimension(122, 50));
        botonPropiedades.setMinimumSize(new java.awt.Dimension(122, 50));
        botonPropiedades.setPreferredSize(new java.awt.Dimension(126, 50));
        botonPropiedades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPropiedadesActionPerformed(evt);
            }
        });

        botonContratos.setBackground(new java.awt.Color(153, 153, 255));
        botonContratos.setText("Contratos");
        botonContratos.setMaximumSize(new java.awt.Dimension(122, 50));
        botonContratos.setMinimumSize(new java.awt.Dimension(122, 50));
        botonContratos.setPreferredSize(new java.awt.Dimension(126, 50));
        botonContratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonContratosActionPerformed(evt);
            }
        });

        botonRecibos.setBackground(new java.awt.Color(153, 153, 255));
        botonRecibos.setText("Recibos");
        botonRecibos.setMaximumSize(new java.awt.Dimension(122, 50));
        botonRecibos.setMinimumSize(new java.awt.Dimension(122, 50));
        botonRecibos.setPreferredSize(new java.awt.Dimension(126, 50));
        botonRecibos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRecibosActionPerformed(evt);
            }
        });

        botonComprobantes.setBackground(new java.awt.Color(153, 153, 255));
        botonComprobantes.setText("Comprobantes");
        botonComprobantes.setMaximumSize(new java.awt.Dimension(122, 50));
        botonComprobantes.setMinimumSize(new java.awt.Dimension(122, 50));
        botonComprobantes.setPreferredSize(new java.awt.Dimension(126, 50));
        botonComprobantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComprobantesActionPerformed(evt);
            }
        });

        botonSaldos.setBackground(new java.awt.Color(153, 153, 255));
        botonSaldos.setText("Saldos");
        botonSaldos.setMaximumSize(new java.awt.Dimension(122, 50));
        botonSaldos.setMinimumSize(new java.awt.Dimension(122, 50));
        botonSaldos.setPreferredSize(new java.awt.Dimension(126, 50));
        botonSaldos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSaldosActionPerformed(evt);
            }
        });

        panelSAI21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/SAI21.png"))); // NOI18N

        panelEnSesion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelEnSesion.setForeground(new java.awt.Color(255, 255, 255));
        panelEnSesion.setText("Administrador en Sesion:");

        panelUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        panelUsuario.setForeground(new java.awt.Color(240, 240, 240));
        panelUsuario.setText("Apellido, Nombre.");

        botonCerrarSesion.setBackground(new java.awt.Color(153, 153, 255));
        botonCerrarSesion.setText("Cerrar Sesion");
        botonCerrarSesion.setMaximumSize(new java.awt.Dimension(122, 50));
        botonCerrarSesion.setMinimumSize(new java.awt.Dimension(122, 50));
        botonCerrarSesion.setPreferredSize(new java.awt.Dimension(126, 50));
        botonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionActionPerformed(evt);
            }
        });

        panelIcono1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/Icono1.png"))); // NOI18N

        panelIcono2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/Icono2.png"))); // NOI18N

        panelIcono3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/Icono3.png"))); // NOI18N

        panelIcono4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/Icono4.png"))); // NOI18N

        panelIcono5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/Icono5.png"))); // NOI18N

        panelIcono6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/Icono6.png"))); // NOI18N

        javax.swing.GroupLayout panelPrincipalAdminLayout = new javax.swing.GroupLayout(panelPrincipalAdmin);
        panelPrincipalAdmin.setLayout(panelPrincipalAdminLayout);
        panelPrincipalAdminLayout.setHorizontalGroup(
            panelPrincipalAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalAdminLayout.createSequentialGroup()
                .addGroup(panelPrincipalAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelPrincipalAdminLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panelPrincipalAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelPrincipalAdminLayout.createSequentialGroup()
                                    .addComponent(botonAgendados, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(botonPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(botonContratos, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(botonRecibos, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(botonComprobantes, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(botonSaldos, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelPrincipalAdminLayout.createSequentialGroup()
                                    .addComponent(panelIcono1)
                                    .addGap(14, 14, 14)
                                    .addComponent(panelIcono2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(panelIcono3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(panelIcono4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(panelIcono5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(panelIcono6))))
                        .addGroup(panelPrincipalAdminLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(panelEnSesion)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(panelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPrincipalAdminLayout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(panelSAI21)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPrincipalAdminLayout.setVerticalGroup(
            panelPrincipalAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalAdminLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelPrincipalAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgendados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonContratos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRecibos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSaldos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonComprobantes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPropiedades, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelIcono4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(panelIcono3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(panelIcono2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(panelIcono1, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(panelIcono6)
                    .addComponent(panelIcono5))
                .addGap(62, 62, 62)
                .addComponent(panelSAI21)
                .addGap(54, 54, 54)
                .addGroup(panelPrincipalAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(panelEnSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonCerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        menuAdmin.setBackground(new java.awt.Color(153, 153, 255));
        menuAdmin.setForeground(new java.awt.Color(153, 153, 255));

        menuOpciones.setText("Opciones");

        itemImpresoras.setText("Configurar Impresora");
        itemImpresoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemImpresorasActionPerformed(evt);
            }
        });
        menuOpciones.add(itemImpresoras);

        itemParametros.setText("Editar Parametros");
        itemParametros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemParametrosActionPerformed(evt);
            }
        });
        menuOpciones.add(itemParametros);

        itemRegistro.setText("Editar Registro");
        itemRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemRegistroActionPerformed(evt);
            }
        });
        menuOpciones.add(itemRegistro);

        menuAdmin.add(menuOpciones);

        setJMenuBar(menuAdmin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipalAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipalAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgendadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgendadosActionPerformed
//        this.setVisible(false);
        VentanaAgendados iniciar = new VentanaAgendados();
        iniciar.setVisible(true);
    }//GEN-LAST:event_botonAgendadosActionPerformed

    private void botonPropiedadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPropiedadesActionPerformed
        dispose();
        VentanaPropiedades iniciar = new VentanaPropiedades();
        iniciar.setVisible(true);
    }//GEN-LAST:event_botonPropiedadesActionPerformed

    private void botonContratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonContratosActionPerformed
        dispose();
        VentanaContratos iniciar = new VentanaContratos();
        iniciar.setVisible(true);
    }//GEN-LAST:event_botonContratosActionPerformed

    private void botonComprobantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprobantesActionPerformed
        dispose();
        VentanaComprobantes iniciar = new VentanaComprobantes();
        iniciar.setVisible(true);
    }//GEN-LAST:event_botonComprobantesActionPerformed

    private void botonSaldosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSaldosActionPerformed
        dispose();
        VentanaSaldos iniciar = new VentanaSaldos();
        iniciar.setVisible(true);
    }//GEN-LAST:event_botonSaldosActionPerformed

    private void botonRecibosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRecibosActionPerformed
        dispose();
        VentanaRecibos iniciar = new VentanaRecibos();
        iniciar.setVisible(true);
    }//GEN-LAST:event_botonRecibosActionPerformed

    private void botonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionActionPerformed
        dispose();
        LogIn atras = new LogIn();
        atras.setVisible(true);
    }//GEN-LAST:event_botonCerrarSesionActionPerformed

    private void itemImpresorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemImpresorasActionPerformed
        final String name = "Impresoras";
        if (mIniciar.get(name) == null) {
            JFrame iniciar = new VentanaImpresora(this, name);
            iniciar.setVisible(true);
            mIniciar.put(name, iniciar);
        }
    }//GEN-LAST:event_itemImpresorasActionPerformed

    private void itemParametrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemParametrosActionPerformed
        final String name = "Parametros";
        if (mIniciar.get(name) == null) {
            JFrame iniciar = new VentanaParametros(this, name);
            iniciar.setVisible(true);
            mIniciar.put(name, iniciar);
        }
    }//GEN-LAST:event_itemParametrosActionPerformed

    private void itemRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemRegistroActionPerformed
        final String name = "Registro";
        if (mIniciar.get(name) == null) {
            JFrame iniciar = new VentanaRegistro(this, name);
            iniciar.setVisible(true);
            mIniciar.put(name, iniciar);
        }
    }//GEN-LAST:event_itemRegistroActionPerformed

    public void notificarCerrado(String name) {
        mIniciar.remove(name);
    }

    private Map<String, JFrame> mIniciar = new TreeMap<>();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgendados;
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JButton botonComprobantes;
    private javax.swing.JButton botonContratos;
    private javax.swing.JButton botonPropiedades;
    private javax.swing.JButton botonRecibos;
    private javax.swing.JButton botonSaldos;
    private javax.swing.JMenuItem itemImpresoras;
    private javax.swing.JMenuItem itemParametros;
    private javax.swing.JMenuItem itemRegistro;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuBar menuAdmin;
    private javax.swing.JMenu menuOpciones;
    private javax.swing.JLabel panelEnSesion;
    private javax.swing.JLabel panelIcono1;
    private javax.swing.JLabel panelIcono2;
    private javax.swing.JLabel panelIcono3;
    private javax.swing.JLabel panelIcono4;
    private javax.swing.JLabel panelIcono5;
    private javax.swing.JLabel panelIcono6;
    private javax.swing.JPanel panelPrincipalAdmin;
    private javax.swing.JLabel panelSAI21;
    private javax.swing.JLabel panelUsuario;
    // End of variables declaration//GEN-END:variables
}
