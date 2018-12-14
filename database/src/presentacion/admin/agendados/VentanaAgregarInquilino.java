package presentacion.admin.agendados;

import modelo.Garante;
import modelo.Inquilino;
import modelo.Usuario;
import negocios.GaranteBO;
import negocios.InquilinoBO;
import negocios.UsuarioBO;

public class VentanaAgregarInquilino extends javax.swing.JFrame {

    public VentanaAgregarInquilino() {
        initComponents();
        start();
    }

    private void start() {
//        this.setIconImage(new ImageIcon(getClass().getResource("../imagenes/HouseLogo.png")).getImage());
        this.setLocationRelativeTo(null);
    }

//    Inquilino inquilino = new Inquilino();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        nombreInquilino = new javax.swing.JTextField();
        apellidoInquilino = new javax.swing.JTextField();
        generoInquilino = new javax.swing.JComboBox<>();
        nacimientoInquilino = new javax.swing.JTextField();
        ivaInquilino = new javax.swing.JComboBox<>();
        cuitInquilino = new javax.swing.JTextField();
        bancariaGarante = new javax.swing.JTextField();
        cbuGarante = new javax.swing.JTextField();
        tipodniInquilino = new javax.swing.JComboBox<>();
        dniInquilino = new javax.swing.JTextField();
        emailInquilino = new javax.swing.JTextField();
        celularInquilino = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        obeservacionesInquilino = new javax.swing.JTextArea();
        nombreUsuario = new javax.swing.JTextField();
        claveUsuario = new javax.swing.JPasswordField();
        claverepetidaUsuario = new javax.swing.JPasswordField();
        nombreGarante = new javax.swing.JTextField();
        ApellidoGarante = new javax.swing.JTextField();
        telefonoGarante = new javax.swing.JTextField();
        tipodniGarante = new javax.swing.JComboBox<>();
        numerodocumetoGarante = new javax.swing.JTextField();
        calleGarante = new javax.swing.JTextField();
        numerocasaGarante = new javax.swing.JTextField();
        pisoGarante = new javax.swing.JTextField();
        localidadGarante = new javax.swing.JTextField();
        provinciaGarante = new javax.swing.JComboBox<>();
        nacimientoGarante = new javax.swing.JTextField();
        condicionivaGarante = new javax.swing.JComboBox<>();
        cuilGarante = new javax.swing.JTextField();
        rubroGarante = new javax.swing.JTextField();
        sueldoGarante = new javax.swing.JTextField();
        emailGarante = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        observacionesGarante = new javax.swing.JTextArea();
        xxxxxxxxxxxx = new javax.swing.JLabel();
        botonAceptar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel000 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        cbuInquilino = new javax.swing.JTextField();
        bancariaInquilino = new javax.swing.JTextField();
        errorMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(72, 72, 136));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black, java.awt.Color.black));
        jPanel1.setMaximumSize(new java.awt.Dimension(830, 660));
        jPanel1.setMinimumSize(new java.awt.Dimension(830, 660));
        jPanel1.setPreferredSize(new java.awt.Dimension(830, 660));

        nombreInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreInquilinoActionPerformed(evt);
            }
        });

        apellidoInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoInquilinoActionPerformed(evt);
            }
        });

        generoInquilino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        generoInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generoInquilinoActionPerformed(evt);
            }
        });

        nacimientoInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacimientoInquilinoActionPerformed(evt);
            }
        });

        ivaInquilino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consumidor Final", "Responsable Inscripto", "Monotributo", "Exento", "Otro" }));
        ivaInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ivaInquilinoActionPerformed(evt);
            }
        });

        cuitInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuitInquilinoActionPerformed(evt);
            }
        });

        bancariaGarante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bancariaGaranteActionPerformed(evt);
            }
        });

        cbuGarante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbuGaranteActionPerformed(evt);
            }
        });

        tipodniInquilino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "D.N.I", "L.E", "L.C", "PAS." }));
        tipodniInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipodniInquilinoActionPerformed(evt);
            }
        });

        dniInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dniInquilinoActionPerformed(evt);
            }
        });

        emailInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailInquilinoActionPerformed(evt);
            }
        });

        celularInquilino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celularInquilinoActionPerformed(evt);
            }
        });

        obeservacionesInquilino.setColumns(20);
        obeservacionesInquilino.setRows(5);
        obeservacionesInquilino.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                obeservacionesInquilinoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(obeservacionesInquilino);

        nombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreUsuarioActionPerformed(evt);
            }
        });

        claverepetidaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                claverepetidaUsuarioActionPerformed(evt);
            }
        });

        tipodniGarante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "D.N.I", "L.E", "L.C", "PAS." }));

        provinciaGarante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cordoba", "Buenos Aires", "Catamarca", "Salta", "La Rioja", "Jujuy", "Chaco", "Misiones", "Stgo del Estero" }));
        provinciaGarante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provinciaGaranteActionPerformed(evt);
            }
        });

        condicionivaGarante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consumidor Final", "Responsable Inscripto", "Monotributo", "Exento", "Otro" }));
        condicionivaGarante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                condicionivaGaranteActionPerformed(evt);
            }
        });

        observacionesGarante.setColumns(20);
        observacionesGarante.setRows(5);
        observacionesGarante.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                observacionesGaranteAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(observacionesGarante);

        xxxxxxxxxxxx.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        xxxxxxxxxxxx.setForeground(new java.awt.Color(255, 255, 255));
        xxxxxxxxxxxx.setText("Informacion de Usuario");

        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Doc:");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Tel Cel:");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Fecha Nacimiento:");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Condicion I.V.A.:");

        jLabel000.setForeground(new java.awt.Color(255, 255, 255));
        jLabel000.setText("CBU:");

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Cuenta Bancaria:");

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("C.B.U:");

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("E-mail:");

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Observaciones:");

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Apellido:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Genero:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Informacion del Inquilino");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Informacion del Garante");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Usuario:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Clave:");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Repetir la Clave:");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre:");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Apellido:");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Telefono:");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Documento:");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Calle:");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Numero:");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Piso:");

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Localidad:");

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Provincia:");

        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Fecha de Nacimiento:");

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Numero CUIT/CUIL:");

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Condicion I.V.A.:");

        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Rubro:");

        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Sueldo:");

        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("E-mail:");

        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Observaciones:");

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("CUIT:");

        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Cuenta Bancaria:");

        errorMessage.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailInquilino)
                                    .addComponent(celularInquilino)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel13))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tipodniInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbuInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addGap(132, 132, 132))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cuitInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(generoInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(apellidoInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(nacimientoInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ivaInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(dniInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(nombreInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(101, 101, 101))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(errorMessage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(xxxxxxxxxxxx)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(50, 50, 50)
                                        .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel35)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(bancariaInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(claveUsuario)
                                    .addComponent(claverepetidaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel32)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel000)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel22))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pisoGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(calleGarante)
                                        .addComponent(ApellidoGarante)
                                        .addComponent(nombreGarante, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                        .addComponent(telefonoGarante)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(tipodniGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(numerodocumetoGarante, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)))
                                    .addComponent(bancariaGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numerocasaGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbuGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(botonAceptar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botonCancelar))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addGap(59, 59, 59)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nacimientoGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(localidadGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel28))
                                    .addComponent(jLabel29))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailGarante, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sueldoGarante, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(rubroGarante, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cuilGarante, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(condicionivaGarante, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(155, 155, 155))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(provinciaGarante, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombreInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(nombreGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(apellidoInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ApellidoGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generoInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11)
                    .addComponent(telefonoGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(nacimientoInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(tipodniGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numerodocumetoGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ivaInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(cbuInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dniInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipodniInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel21))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(emailInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(celularInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(xxxxxxxxxxxx)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(calleGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cuitInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel000)
                                .addComponent(cbuGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bancariaGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(bancariaInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(numerocasaGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(pisoGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel26)
                            .addComponent(provinciaGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(localidadGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(nacimientoGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(condicionivaGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(cuilGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(rubroGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(sueldoGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(emailGarante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(claveUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(claverepetidaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(errorMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonAceptar)
                            .addComponent(botonCancelar))))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void observacionesGaranteAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_observacionesGaranteAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_observacionesGaranteAncestorAdded

    private void condicionivaGaranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_condicionivaGaranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_condicionivaGaranteActionPerformed

    private void nombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreUsuarioActionPerformed

    private void obeservacionesInquilinoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_obeservacionesInquilinoAncestorAdded
//        inquilino.setObservacion(obeservacionesInquilino.getText().trim());
    }//GEN-LAST:event_obeservacionesInquilinoAncestorAdded

    private void generoInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generoInquilinoActionPerformed
//        inquilino.setGenero((String) generoInquilino.getSelectedItem());
    }//GEN-LAST:event_generoInquilinoActionPerformed

    private void tipodniInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipodniInquilinoActionPerformed
//        inquilino.setTipoDocumento((String) tipodniInquilino.getSelectedItem());
    }//GEN-LAST:event_tipodniInquilinoActionPerformed

    private void emailInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailInquilinoActionPerformed
//        inquilino.setEmail(emailInquilino.getText().trim());
    }//GEN-LAST:event_emailInquilinoActionPerformed
//
    private void cbuGaranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbuGaranteActionPerformed
//        inquilino.setCbu(cuitGarante.getText().trim());
    }//GEN-LAST:event_cbuGaranteActionPerformed

    private void bancariaGaranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bancariaGaranteActionPerformed
//        inquilino.setCuentaBancaria(bancariaGarante.getText().trim());
    }//GEN-LAST:event_bancariaGaranteActionPerformed

    private void cuitInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuitInquilinoActionPerformed
//        inquilino.setCuit(cuitInquilino.getText().trim());
    }//GEN-LAST:event_cuitInquilinoActionPerformed

    private void nacimientoInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacimientoInquilinoActionPerformed
        /*
        UtilDateModel model = new UtilDateModel();
        JDatePanelImpl datePanel = new JDatePanelImpl(model);
        JDatePickerImpl datePicker = new JDatePickerImpl(datePanel);

        frame.add(datePicker);
         */
//        inquilino.setFechaNacimiento(nacimientoInquilino.getText().trim());
    }//GEN-LAST:event_nacimientoInquilinoActionPerformed

    private void ivaInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ivaInquilinoActionPerformed
//        inquilino.setCondicionIVA((String) ivaInquilino.getSelectedItem());
    }//GEN-LAST:event_ivaInquilinoActionPerformed

    private void celularInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celularInquilinoActionPerformed
//        inquilino.setCelular(celularInquilino.getText().trim());
    }//GEN-LAST:event_celularInquilinoActionPerformed

    private void dniInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dniInquilinoActionPerformed
//        inquilino.setNumeroDocumnto(dniInquilino.getText().trim());
    }//GEN-LAST:event_dniInquilinoActionPerformed

    private void apellidoInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoInquilinoActionPerformed
//        inquilino.setApellido(apellidoInquilino.getText().trim());
    }//GEN-LAST:event_apellidoInquilinoActionPerformed

    private void nombreInquilinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreInquilinoActionPerformed
//        inquilino.setNombre(nombreInquilino.getText().trim());
    }//GEN-LAST:event_nombreInquilinoActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        /*
        // Validacion de Datos
        if (nombreGarante.getText().isEmpty()) {
            errorMessage.setText("Nombre de Garante Vacio");
            return;
        }

        if (ApellidoGarante.getText().isEmpty()) {
            errorMessage.setText("Apellido de Garante Vacio");
            return;
        }

        if (telefonoGarante.getText().isEmpty()) {
            errorMessage.setText("Telefono de Garante Vacio");
            return;
        }
        for (int i = 0; i < telefonoGarante.getText().length(); ++i) {
            if (!Character.isDigit(telefonoGarante.getText().charAt(i))) {
                errorMessage.setText("Telefono de Garante Incorrecto - Numeros");
                return;
            }
        }
        if (telefonoGarante.getText().length() != 10) {
            errorMessage.setText("Telefono de Garante Incorrecto - Tamaño");
            return;
        }

        if (tipodniGarante.getSelectedItem().toString().isEmpty()) {
            errorMessage.setText("Tipo de DNI de Garante Vacio");
            return;
        }

        if (numerodocumetoGarante.getText().isEmpty()) {
            errorMessage.setText("Numero de Documento de Garante Incorrecto");
            return;
        }
        for (int i = 0; i < numerodocumetoGarante.getText().length(); ++i) {
            if (!Character.isDigit(numerodocumetoGarante.getText().charAt(i))) {
                errorMessage.setText("Numero de Documento de Garante Incorrecto - Numeros");
                return;
            }
        }
        if (numerodocumetoGarante.getText().length() != 8) {
            errorMessage.setText("Numero de Documento de Garante Incorrecto - Tamaño");
            return;
        }

        if (calleGarante.getText().isEmpty()) {
            errorMessage.setText("Calle de Garante Vacio");
            return;
        }

        if (numerocasaGarante.getText().isEmpty()) {
            errorMessage.setText("Numero de Casa de Garante Vacio");
            return;
        }
        for (int i = 0; i < numerocasaGarante.getText().length(); ++i) {
            if (!Character.isDigit(numerocasaGarante.getText().charAt(i))) {
                errorMessage.setText("Numero de Casa de Garante Incorrecto - Numeros");
                return;
            }
        }

        for (int i = 0; i < pisoGarante.getText().length(); ++i) {
            if (!Character.isDigit(pisoGarante.getText().charAt(i))) {
                errorMessage.setText("Piso de Garante Incorrecto - Numeros");
                return;
            }
        }

        if (localidadGarante.getText().isEmpty()) {
            errorMessage.setText("Localidad de Garante Vacio");
            return;
        }

        if (provinciaGarante.getSelectedItem().toString().isEmpty()) {
            errorMessage.setText("Provincia de Garante Vacio");
            return;
        }

        // WIP WIP WIP
        // wip - mejorar fecha de nacimiento
        if ("".equals(nacimientoGarante.getText())) {
            errorMessage.setText("Fecha de Nacimiento de Garante Incorrecto");
            return;
        }

        if (condicionivaGarante.getSelectedItem().toString().isEmpty()) {
            errorMessage.setText("Condicion IVA de Garante Vacio");
            return;
        }

        if (cbuGarante.getText().isEmpty()) {
            errorMessage.setText("CBU de Garante Incorrecto");
            return;
        }
        if (cbuGarante.getText().length() != 11) {
            errorMessage.setText("CBU de Garante Incorrecto - Tamaño");
            return;
        }
        for (int i = 0; i < cbuGarante.getText().length(); ++i) {
            if (!Character.isDigit(cbuGarante.getText().charAt(i))) {
                errorMessage.setText("CBU Garante Incorrecto - Numeros");
                return;
            }
        }

        if (bancariaGarante.getText().isEmpty()) {
            errorMessage.setText("Cuenta Bancaria de Garante Incorrecto");
            return;
        }
        for (int i = 0; i < bancariaGarante.getText().length(); ++i) {
            if (!Character.isDigit(bancariaGarante.getText().charAt(i))) {
                errorMessage.setText("Cuenta Bancaria de Garante Incorrecto - Numeros");
                return;
            }
        }

        // wip        
        if (cuilGarante.getText().isEmpty()) {
            errorMessage.setText("CUIL de Garante Incorrecto");
            return;
        }

        // wip        
        if (rubroGarante.getText().isEmpty()) {
            errorMessage.setText("Rubro de Garante Incorrecto");
            return;
        }

        // wip
        if (sueldoGarante.getText().isEmpty()) {
            errorMessage.setText("Sueldo de Garante Incorrecto");
            return;
        }

        // wip        
        if (emailGarante.getText().isEmpty()) {
            errorMessage.setText("Email de Garante Incorrecto");
            return;
        }

        // wip        
        if (observacionesGarante.getText().isEmpty()) {
            errorMessage.setText("Observaciones de Garante Incorrecto");
            return;
        }

        // wip
        if (nombreInquilino.getText().isEmpty()) {
            errorMessage.setText("Nombre de Inquilino Incorrecto");
            return;
        }

        // wip
        if (apellidoInquilino.getText().isEmpty()) {
            errorMessage.setText("Apellido de Inquilino Incorrecto");
            return;
        }

        // wip
        if (emailInquilino.getText().isEmpty()) {
            errorMessage.setText("Email de Inquilino Incorrecto");
            return;
        }

        // wip
        if (celularInquilino.getText().isEmpty()) {
            errorMessage.setText("Numero de celular de Inquilino Incorrecto");
            return;
        }

        // wip
        if (obeservacionesInquilino.getText().isEmpty()) {
            errorMessage.setText("Observaciones de Inquilino Incorrecto");
            return;
        }

        // wip
        if (tipodniInquilino.getSelectedItem().toString().isEmpty()) {
            errorMessage.setText("Tipo de DNI de Inquilino Incorrecto");
            return;
        }

        // wip
        if (dniInquilino.getText().isEmpty()) {
            errorMessage.setText("Numero de DNI de Inquilino Incorrecto");
            return;
        }

        // wip
        if (ivaInquilino.getSelectedItem().toString().isEmpty()) {
            errorMessage.setText("COndicion IVA de Inquilino Incorrecto");
            return;
        }

        // wip
        if (cuitInquilino.getText().isEmpty()) {
            errorMessage.setText("CUIT de Inquilino Incorrecto");
            return;
        }

        // wip
        if (bancariaInquilino.getText().isEmpty()) {
            errorMessage.setText("Cuenta Bancaria de Inquilino Incorrecto");
            return;
        }

        // wip
        if (cbuInquilino.getText().isEmpty()) {
            errorMessage.setText("CBU de Inquilino Incorrecto");
            return;
        }

        // wip
        if (generoInquilino.getSelectedItem().toString().isEmpty()) {
            errorMessage.setText("Genero de Inquilino Incorrecto");
            return;
        }

        // wip - mejorar fecha de nacimiento
        if (nacimientoInquilino.getText().isEmpty()) {
            errorMessage.setText("Fecha de Nacimiento de Inquilino Incorrecto");
            return;
        }

        // wip - comprar si no esta en la bd
        if (nombreUsuario.getText().isEmpty()) {
            errorMessage.setText("Nombre de Usuario Incorrecto");
            return;
        }

        // wip - comprobar si las claves son iguales
        if ("".equals((claveUsuario.getPassword()).toString()) || (claveUsuario.getPassword().equals(claverepetidaUsuario.getPassword()))) {
            errorMessage.setText("Clave Incorrecta Incorrecto");
            return;
        }*/

        // isEmpty()
        // Creando objetos
        Garante grt = new Garante();
        Inquilino inq = new Inquilino();
        Usuario usr = new Usuario();

        // Guardadndo en el Modelo
        grt.setIdGarante("6");
        grt.setNombre(nombreGarante.getText());
        grt.setApellido(ApellidoGarante.getText());
        grt.setCelular(telefonoGarante.getText());
        grt.setTipoDocumento(tipodniGarante.getSelectedItem().toString());
        grt.setNumeroDocumnto(numerodocumetoGarante.getText());
        grt.setCalle(calleGarante.getText());
        grt.setNumeroCalle(numerocasaGarante.getText());
        grt.setPiso(pisoGarante.getText());
        grt.setProvincia(localidadGarante.getText());
        grt.setLocalidad(provinciaGarante.getSelectedItem().toString());
        grt.setFechaNacimiento(nacimientoGarante.getText());
        grt.setCondicionIVA(condicionivaGarante.getSelectedItem().toString());
        grt.setCbu(cbuGarante.getText());
        grt.setCuentaBancaria(bancariaGarante.getText());
        grt.setCuit(cuilGarante.getText());
        grt.setRubro(rubroGarante.getText());
        grt.setSueldo(sueldoGarante.getText());
        grt.setEmail(emailGarante.getText());
        grt.setObservacion(observacionesGarante.getText());
        inq.setIdInquilino("6");
        inq.setNombre(nombreInquilino.getText());
        inq.setApellido(apellidoInquilino.getText());
        inq.setEmail(emailInquilino.getText());
        inq.setCelular(celularInquilino.getText());
        inq.setObservacion(obeservacionesInquilino.getText());
        inq.setTipoDocumento(tipodniInquilino.getSelectedItem().toString());
        inq.setNumeroDocumnto(dniInquilino.getText());
        inq.setCondicionIVA(ivaInquilino.getSelectedItem().toString());
        inq.setCuit(cuitInquilino.getText());
        inq.setCuentaBancaria(bancariaInquilino.getText());
        inq.setCbu(cbuInquilino.getText());
        inq.setGenero(generoInquilino.getSelectedItem().toString());
        inq.setFechaNacimiento(nacimientoInquilino.getText());
        inq.setDeuda("0.0");
        usr.setIdUsuario("16");        
        usr.setUsuario(nombreUsuario.getText());
        usr.setClave(claveUsuario.getPassword().toString());
        usr.setEstadoAdmin(false);

        GaranteBO algo = new GaranteBO();
        InquilinoBO putostodos = new InquilinoBO();
        UsuarioBO aaa = new UsuarioBO();
        
        // Guardadndo en la base de Datos        
        algo.guardar(grt);
        putostodos.guardar(inq);
        aaa.guardar(usr);
// Cerrar Ventana
        dispose();

        // WIP WIP WIP
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void claverepetidaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_claverepetidaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_claverepetidaUsuarioActionPerformed

    private void provinciaGaranteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provinciaGaranteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provinciaGaranteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoGarante;
    private javax.swing.JTextField apellidoInquilino;
    private javax.swing.JTextField bancariaGarante;
    private javax.swing.JTextField bancariaInquilino;
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JTextField calleGarante;
    private javax.swing.JTextField cbuGarante;
    private javax.swing.JTextField cbuInquilino;
    private javax.swing.JTextField celularInquilino;
    private javax.swing.JPasswordField claveUsuario;
    private javax.swing.JPasswordField claverepetidaUsuario;
    private javax.swing.JComboBox<String> condicionivaGarante;
    private javax.swing.JTextField cuilGarante;
    private javax.swing.JTextField cuitInquilino;
    private javax.swing.JTextField dniInquilino;
    private javax.swing.JTextField emailGarante;
    private javax.swing.JTextField emailInquilino;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JComboBox<String> generoInquilino;
    private javax.swing.JComboBox<String> ivaInquilino;
    private javax.swing.JLabel jLabel000;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField localidadGarante;
    private javax.swing.JTextField nacimientoGarante;
    private javax.swing.JTextField nacimientoInquilino;
    private javax.swing.JTextField nombreGarante;
    private javax.swing.JTextField nombreInquilino;
    private javax.swing.JTextField nombreUsuario;
    private javax.swing.JTextField numerocasaGarante;
    private javax.swing.JTextField numerodocumetoGarante;
    private javax.swing.JTextArea obeservacionesInquilino;
    private javax.swing.JTextArea observacionesGarante;
    private javax.swing.JTextField pisoGarante;
    private javax.swing.JComboBox<String> provinciaGarante;
    private javax.swing.JTextField rubroGarante;
    private javax.swing.JTextField sueldoGarante;
    private javax.swing.JTextField telefonoGarante;
    private javax.swing.JComboBox<String> tipodniGarante;
    private javax.swing.JComboBox<String> tipodniInquilino;
    private javax.swing.JLabel xxxxxxxxxxxx;
    // End of variables declaration//GEN-END:variables
}
