package presentacion.admin.agendados;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import modelo.Inquilino;
import negocios.InquilinoBO;

public class VentanaAgendados extends javax.swing.JFrame {

    InquilinoBO inquilinoBO = new InquilinoBO();
    Integer num;

    public VentanaAgendados() {
        initComponents();
        start();
    }

    private void start() {
        this.setIconImage(new ImageIcon(getClass().getResource("../../imagenes/HouseLogo.png")).getImage());
        this.setLocationRelativeTo(null);
        tablaAgendados.getTableHeader().setBackground(Color.BLUE);

        botonesAgendados.add(botonInquilino);
        botonesAgendados.add(botonPropietario);
        botonesAgendados.add(botonGarante);

        num = 0;
        this.loadTable("");

        barraBusqueda.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                loadTable(barraBusqueda.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                loadTable(barraBusqueda.getText());
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                loadTable(barraBusqueda.getText());
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonesAgendados = new javax.swing.ButtonGroup();
        panelVentanaAgendados = new javax.swing.JPanel();
        scrollTabla = new javax.swing.JScrollPane();
        tablaAgendados = new javax.swing.JTable();
        botonComprobantes = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        barraBusqueda = new javax.swing.JTextField();
        botonAgregar1 = new javax.swing.JButton();
        botonInquilino = new javax.swing.JRadioButton();
        botonGarante = new javax.swing.JRadioButton();
        botonPropietario = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventana de Agendados");
        setMaximumSize(new java.awt.Dimension(845, 600));
        setUndecorated(true);
        setResizable(false);

        panelVentanaAgendados.setBackground(new java.awt.Color(72, 72, 136));
        panelVentanaAgendados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        panelVentanaAgendados.setForeground(new java.awt.Color(102, 153, 255));
        panelVentanaAgendados.setToolTipText("");
        panelVentanaAgendados.setMaximumSize(new java.awt.Dimension(830, 660));
        panelVentanaAgendados.setMinimumSize(new java.awt.Dimension(830, 660));
        panelVentanaAgendados.setPreferredSize(new java.awt.Dimension(830, 660));

        scrollTabla.setBackground(new java.awt.Color(102, 153, 255));
        scrollTabla.setForeground(new java.awt.Color(102, 153, 255));

        tablaAgendados.setBackground(new java.awt.Color(153, 153, 255));
        tablaAgendados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Apellido", "Nombre", "Telefono", "Observaciones"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAgendados.setGridColor(new java.awt.Color(0, 0, 0));
        tablaAgendados.setSelectionForeground(new java.awt.Color(153, 255, 255));
        tablaAgendados.getTableHeader().setReorderingAllowed(false);
        scrollTabla.setViewportView(tablaAgendados);
        tablaAgendados.getColumnModel().getColumn(0).setMinWidth(80);
        tablaAgendados.getColumnModel().getColumn(0).setPreferredWidth(80);
        tablaAgendados.getColumnModel().getColumn(0).setMaxWidth(80);
        tablaAgendados.getColumnModel().getColumn(1).setMinWidth(100);
        tablaAgendados.getColumnModel().getColumn(1).setPreferredWidth(100);
        tablaAgendados.getColumnModel().getColumn(1).setMaxWidth(100);
        tablaAgendados.getColumnModel().getColumn(2).setMinWidth(100);
        tablaAgendados.getColumnModel().getColumn(2).setPreferredWidth(100);
        tablaAgendados.getColumnModel().getColumn(2).setMaxWidth(100);
        tablaAgendados.getColumnModel().getColumn(3).setMinWidth(100);
        tablaAgendados.getColumnModel().getColumn(3).setPreferredWidth(100);
        tablaAgendados.getColumnModel().getColumn(3).setMaxWidth(100);

        botonComprobantes.setBackground(new java.awt.Color(153, 153, 255));
        botonComprobantes.setText("Comprobantes");
        botonComprobantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComprobantesActionPerformed(evt);
            }
        });

        botonEditar.setBackground(new java.awt.Color(153, 153, 255));
        botonEditar.setText("Editar");

        botonEliminar.setBackground(new java.awt.Color(153, 153, 255));
        botonEliminar.setText("Eliminar");

        botonSalir.setBackground(new java.awt.Color(153, 153, 255));
        botonSalir.setText("Volver Atras");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        barraBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barraBusquedaActionPerformed(evt);
            }
        });

        botonAgregar1.setBackground(new java.awt.Color(153, 153, 255));
        botonAgregar1.setText("Agregar");
        botonAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregar1ActionPerformed(evt);
            }
        });

        botonInquilino.setBackground(new java.awt.Color(72, 72, 136));
        botonInquilino.setForeground(new java.awt.Color(255, 255, 255));
        botonInquilino.setText("Inquilino");
        botonInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInquilinoActionPerformed(evt);
            }
        });

        botonGarante.setBackground(new java.awt.Color(72, 72, 136));
        botonGarante.setForeground(new java.awt.Color(255, 255, 255));
        botonGarante.setText("Garante");
        botonGarante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGaranteActionPerformed(evt);
            }
        });

        botonPropietario.setBackground(new java.awt.Color(72, 72, 136));
        botonPropietario.setForeground(new java.awt.Color(255, 255, 255));
        botonPropietario.setText("Propietario");
        botonPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPropietarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelVentanaAgendadosLayout = new javax.swing.GroupLayout(panelVentanaAgendados);
        panelVentanaAgendados.setLayout(panelVentanaAgendadosLayout);
        panelVentanaAgendadosLayout.setHorizontalGroup(
            panelVentanaAgendadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVentanaAgendadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelVentanaAgendadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelVentanaAgendadosLayout.createSequentialGroup()
                        .addComponent(botonComprobantes, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelVentanaAgendadosLayout.createSequentialGroup()
                        .addComponent(botonInquilino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonGarante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonPropietario)
                        .addGap(290, 290, 290)
                        .addComponent(barraBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE))
                    .addComponent(scrollTabla, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        panelVentanaAgendadosLayout.setVerticalGroup(
            panelVentanaAgendadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVentanaAgendadosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelVentanaAgendadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(barraBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPropietario)
                    .addComponent(botonGarante)
                    .addComponent(botonInquilino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelVentanaAgendadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVentanaAgendadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonAgregar1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonComprobantes, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVentanaAgendados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelVentanaAgendados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonComprobantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprobantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonComprobantesActionPerformed

    private void barraBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barraBusquedaActionPerformed
        // Busqueda
    }//GEN-LAST:event_barraBusquedaActionPerformed

    private void botonAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregar1ActionPerformed
        VentanaAgregar agendados = new VentanaAgregar();
        agendados.setVisible(true);
    }//GEN-LAST:event_botonAgregar1ActionPerformed

    private void botonPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPropietarioActionPerformed
        if (num == 2) {
            num = 0;
        } else {
            num = 2;
        }
        loadTable("");
    }//GEN-LAST:event_botonPropietarioActionPerformed

    private void botonInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInquilinoActionPerformed
        if (num == 1) {
            num = 0;
        } else {
            num = 1;
        }
        loadTable("");
    }//GEN-LAST:event_botonInquilinoActionPerformed

    private void botonGaranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGaranteActionPerformed
        if (num == 3) {
            num = 0;
        } else {
            num = 3;
        }
        loadTable("");
    }//GEN-LAST:event_botonGaranteActionPerformed

    public void loadTable(String txt) {
        DefaultTableModel table = (DefaultTableModel) tablaAgendados.getModel();
        table.setRowCount(0);

        switch (num) {
            case 0:
                buscaInquilino(table, txt);
                buscaPropietario(table, txt);
                buscaGarante(table, txt);
                break;
            case 1:
                buscaInquilino(table, txt);
                break;
            case 2:
                buscaPropietario(table, txt);
                break;
            case 3:
                buscaGarante(table, txt);
                break;
            default:
//                throw new RuntimeError();
        }
    }

    public void buscaInquilino(DefaultTableModel table, String txt) {
        for (Inquilino inq : inquilinoBO.getInquilinos()) {
            if (txt.equals("")) {
                Object[] ob = {"Inquilino", inq.getApellido(), inq.getNombre(), inq.getCelular(), inq.getObservacion()};
                table.addRow(ob);
            } else {
                Object[] ob = {"Inquilino", inq.getApellido(), inq.getNombre(), inq.getCelular(), inq.getObservacion()};
                if (inq.getApellido().startsWith(txt) || inq.getNombre().startsWith(txt) || inq.getCelular().startsWith(txt) || inq.getObservacion().startsWith(txt)) {
                    table.addRow(ob);
                }
            }
        }
    }

    public void buscaPropietario(DefaultTableModel table, String txt) {
        return;
    }

    public void buscaGarante(DefaultTableModel table, String txt) {
        return;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField barraBusqueda;
    private javax.swing.JButton botonAgregar1;
    private javax.swing.JButton botonComprobantes;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JRadioButton botonGarante;
    private javax.swing.JRadioButton botonInquilino;
    private javax.swing.JRadioButton botonPropietario;
    private javax.swing.JButton botonSalir;
    private javax.swing.ButtonGroup botonesAgendados;
    private javax.swing.JPanel panelVentanaAgendados;
    private javax.swing.JScrollPane scrollTabla;
    private javax.swing.JTable tablaAgendados;
    // End of variables declaration//GEN-END:variables
}
