package com.mycompany.studymind.igu;

import com.mycompany.studymind.igu.Actividad;
import com.mycompany.studymind.logica.Controladora;
import com.mycompany.studymind.logica.Estudiante;
import com.mycompany.studymind.logica.Materia;
import com.mycompany.studymind.logica.MenuUsuario;
import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class ActualizarMateria extends javax.swing.JFrame {

    Controladora control = new Controladora();
    private Estudiante estudiante;
    private Materia materia;

    public ActualizarMateria(Estudiante estudiante, String nombreMateria, String docenteMateria) {
        this.estudiante = estudiante;
        this.control = new Controladora(); // por si no está
        this.materia = control.obtenerMateriaPorNombreYDocente(estudiante, nombreMateria, docenteMateria);

        initComponents();
        lblUsuario.setText(estudiante.getNombre());
        MenuUsuario.aplicarMenu(lblUsuario, this, estudiante);

        if (materia != null) {
            txtNombre.setText(materia.getNombre());
            txtDocente1.setText(materia.getDocente());
            cmbPrioridad.setSelectedItem(materia.getImportancia()); 
        } else {
            mostrarMensaje("No se encontró la materia", "Error", "Error");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlCentral = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        lblNombreDeAsignatura = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        lblNombreAsignatura = new javax.swing.JLabel();
        pnlDocente = new javax.swing.JPanel();
        txtDocente1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lblDocente = new javax.swing.JLabel();
        pnlPrioridad = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cmbPrioridad = new javax.swing.JComboBox<>();
        lblTitulo = new javax.swing.JLabel();
        pnlBoton = new javax.swing.JPanel();
        lblGuardar = new javax.swing.JLabel();
        pnlMenulargo1 = new javax.swing.JPanel();
        btnEstadisticas1 = new javax.swing.JButton();
        btnConfiguracion1 = new javax.swing.JButton();
        btnHorario1 = new javax.swing.JButton();
        btnMenu1 = new javax.swing.JButton();
        btnActividades1 = new javax.swing.JButton();
        pnlCamuflado1 = new javax.swing.JPanel();
        pnlHead = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblLogotipo = new javax.swing.JLabel();
        lblIconoUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(221, 230, 237));
        pnlPrincipal.setMaximumSize(new java.awt.Dimension(1100, 700));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(1100, 700));
        pnlPrincipal.setLayout(null);

        pnlCentral.setBackground(new java.awt.Color(157, 178, 191));

        lblImagen.setBackground(new java.awt.Color(240, 245, 250));
        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Baymax.png"))); // NOI18N

        lblNombreDeAsignatura.setBackground(new java.awt.Color(157, 178, 191));

        txtNombre.setBackground(new java.awt.Color(157, 178, 191));
        txtNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(230, 230, 230));
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(82, 109, 130));

        lblNombreAsignatura.setFont(new java.awt.Font("Roboto Condensed", 3, 18)); // NOI18N
        lblNombreAsignatura.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreAsignatura.setText("Nuevo nombre:");

        javax.swing.GroupLayout lblNombreDeAsignaturaLayout = new javax.swing.GroupLayout(lblNombreDeAsignatura);
        lblNombreDeAsignatura.setLayout(lblNombreDeAsignaturaLayout);
        lblNombreDeAsignaturaLayout.setHorizontalGroup(
            lblNombreDeAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblNombreDeAsignaturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblNombreDeAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                    .addComponent(lblNombreAsignatura, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lblNombreDeAsignaturaLayout.setVerticalGroup(
            lblNombreDeAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblNombreDeAsignaturaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNombreAsignatura)
                .addGap(4, 4, 4)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlDocente.setBackground(new java.awt.Color(157, 178, 191));

        txtDocente1.setBackground(new java.awt.Color(157, 178, 191));
        txtDocente1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtDocente1.setForeground(new java.awt.Color(230, 230, 230));
        txtDocente1.setBorder(null);
        txtDocente1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDocente1MousePressed(evt);
            }
        });
        txtDocente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocente1ActionPerformed(evt);
            }
        });

        jSeparator3.setForeground(new java.awt.Color(82, 109, 130));

        lblDocente.setFont(new java.awt.Font("Roboto Condensed", 3, 18)); // NOI18N
        lblDocente.setForeground(new java.awt.Color(255, 255, 255));
        lblDocente.setText("Nuevo docente:");

        javax.swing.GroupLayout pnlDocenteLayout = new javax.swing.GroupLayout(pnlDocente);
        pnlDocente.setLayout(pnlDocenteLayout);
        pnlDocenteLayout.setHorizontalGroup(
            pnlDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDocenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator3)
                    .addComponent(txtDocente1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                    .addComponent(lblDocente, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDocenteLayout.setVerticalGroup(
            pnlDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDocenteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDocente)
                .addGap(4, 4, 4)
                .addComponent(txtDocente1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlPrioridad.setBackground(new java.awt.Color(157, 178, 191));

        jLabel6.setFont(new java.awt.Font("Roboto Condensed", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nueva prioridad:");

        cmbPrioridad.setBackground(new java.awt.Color(157, 178, 191));
        cmbPrioridad.setFont(new java.awt.Font("Roboto Condensed", 2, 18)); // NOI18N
        cmbPrioridad.setForeground(new java.awt.Color(255, 255, 255));
        cmbPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alta", "Baja" }));
        cmbPrioridad.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pnlPrioridadLayout = new javax.swing.GroupLayout(pnlPrioridad);
        pnlPrioridad.setLayout(pnlPrioridadLayout);
        pnlPrioridadLayout.setHorizontalGroup(
            pnlPrioridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrioridadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPrioridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cmbPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        pnlPrioridadLayout.setVerticalGroup(
            pnlPrioridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrioridadLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblTitulo.setFont(new java.awt.Font("Roboto Condensed Black", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Actualizar materia:");

        pnlBoton.setBackground(new java.awt.Color(82, 109, 130));
        pnlBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBotonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlBotonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlBotonMouseExited(evt);
            }
        });

        lblGuardar.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        lblGuardar.setForeground(new java.awt.Color(255, 255, 255));
        lblGuardar.setText("Actualizar");
        lblGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGuardarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlBotonLayout = new javax.swing.GroupLayout(pnlBoton);
        pnlBoton.setLayout(pnlBotonLayout);
        pnlBotonLayout.setHorizontalGroup(
            pnlBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lblGuardar)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        pnlBotonLayout.setVerticalGroup(
            pnlBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotonLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlCentralLayout = new javax.swing.GroupLayout(pnlCentral);
        pnlCentral.setLayout(pnlCentralLayout);
        pnlCentralLayout.setHorizontalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentralLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombreDeAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlCentralLayout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(pnlBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(50, 50, 50))
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(lblTitulo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlCentralLayout.setVerticalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblTitulo)
                        .addGap(65, 65, 65)
                        .addComponent(lblNombreDeAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(pnlBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblImagen))
                .addGap(522, 522, 522))
        );

        pnlPrincipal.add(pnlCentral);
        pnlCentral.setBounds(370, 190, 700, 470);

        pnlMenulargo1.setBackground(new java.awt.Color(157, 178, 191));
        pnlMenulargo1.setLayout(null);

        btnEstadisticas1.setBackground(new java.awt.Color(157, 178, 191));
        btnEstadisticas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/estadistico.png"))); // NOI18N
        btnEstadisticas1.setBorder(null);
        btnEstadisticas1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstadisticas1.setFocusPainted(false);
        btnEstadisticas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticas1ActionPerformed(evt);
            }
        });
        pnlMenulargo1.add(btnEstadisticas1);
        btnEstadisticas1.setBounds(20, 400, 52, 49);

        btnConfiguracion1.setBackground(new java.awt.Color(157, 178, 191));
        btnConfiguracion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/conf45.png"))); // NOI18N
        btnConfiguracion1.setBorder(null);
        btnConfiguracion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguracion1.setFocusPainted(false);
        btnConfiguracion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracion1ActionPerformed(evt);
            }
        });
        pnlMenulargo1.add(btnConfiguracion1);
        btnConfiguracion1.setBounds(20, 500, 52, 49);

        btnHorario1.setBackground(new java.awt.Color(221, 230, 237));
        btnHorario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/horario.png"))); // NOI18N
        btnHorario1.setBorder(null);
        btnHorario1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHorario1.setFocusPainted(false);
        btnHorario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorario1ActionPerformed(evt);
            }
        });
        pnlMenulargo1.add(btnHorario1);
        btnHorario1.setBounds(20, 190, 52, 49);

        btnMenu1.setBackground(new java.awt.Color(157, 178, 191));
        btnMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/menu45.png"))); // NOI18N
        btnMenu1.setBorder(null);
        btnMenu1.setFocusPainted(false);
        btnMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenu1ActionPerformed(evt);
            }
        });
        pnlMenulargo1.add(btnMenu1);
        btnMenu1.setBounds(20, 10, 45, 45);

        btnActividades1.setBackground(new java.awt.Color(157, 178, 191));
        btnActividades1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actividad.png"))); // NOI18N
        btnActividades1.setBorder(null);
        btnActividades1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActividades1.setFocusPainted(false);
        btnActividades1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActividades1ActionPerformed(evt);
            }
        });
        pnlMenulargo1.add(btnActividades1);
        btnActividades1.setBounds(20, 300, 52, 60);

        pnlCamuflado1.setBackground(new java.awt.Color(221, 230, 237));

        javax.swing.GroupLayout pnlCamuflado1Layout = new javax.swing.GroupLayout(pnlCamuflado1);
        pnlCamuflado1.setLayout(pnlCamuflado1Layout);
        pnlCamuflado1Layout.setHorizontalGroup(
            pnlCamuflado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        pnlCamuflado1Layout.setVerticalGroup(
            pnlCamuflado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        pnlMenulargo1.add(pnlCamuflado1);
        pnlCamuflado1.setBounds(0, 170, 90, 90);

        pnlPrincipal.add(pnlMenulargo1);
        pnlMenulargo1.setBounds(0, 100, 90, 600);

        pnlHead.setBackground(new java.awt.Color(82, 109, 130));

        lblUsuario.setBackground(new java.awt.Color(0, 102, 102));
        lblUsuario.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuario");
        lblUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblLogotipo.setBackground(new java.awt.Color(0, 102, 102));
        lblLogotipo.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        lblLogotipo.setForeground(new java.awt.Color(255, 255, 255));
        lblLogotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/logotipo.png"))); // NOI18N

        lblIconoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/IconoUsuario.png"))); // NOI18N

        javax.swing.GroupLayout pnlHeadLayout = new javax.swing.GroupLayout(pnlHead);
        pnlHead.setLayout(pnlHeadLayout);
        pnlHeadLayout.setHorizontalGroup(
            pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 446, Short.MAX_VALUE)
                .addComponent(lblUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblIconoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        pnlHeadLayout.setVerticalGroup(
            pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeadLayout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addGroup(pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIconoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))))
        );

        pnlPrincipal.add(pnlHead);
        pnlHead.setBounds(0, 0, 1100, 100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1112, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        if (txtNombre.getText().equals("Ingrese el nombre de la materia")) {
            txtNombre.setText("");
            txtNombre.setForeground(Color.white);
        }

        if (txtDocente1.getText().isEmpty()) {
            txtDocente1.setText("Ingrese el nombre del docente a cargo");
        }

    }//GEN-LAST:event_txtNombreMousePressed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtDocente1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDocente1MousePressed
        if (txtDocente1.getText().equals("Ingrese el nombre del docente a cargo")) {
            txtDocente1.setText("");
            txtDocente1.setForeground(Color.white);
        }

        if (txtNombre.getText().isEmpty()) {
            txtNombre.setText("Ingrese el nombre de la materia");

        }

    }//GEN-LAST:event_txtDocente1MousePressed

    private void txtDocente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocente1ActionPerformed
 // ActualizarMateria.java
public void ActualizarMateria() {
    String nuevoNombre = txtNombre.getText().trim();
    String nuevoDocente = txtDocente1.getText().trim();
    String nuevaImportancia = (String) cmbPrioridad.getSelectedItem();

    // Validación de campos vacíos o incorrectos
    if (nuevoNombre.isEmpty() || nuevoNombre.equals("Ingrese el nombre de la materia")
            || nuevoDocente.isEmpty() || nuevoDocente.equals("Ingrese el nombre del docente a cargo")
            || nuevaImportancia == null || nuevaImportancia.equals("Ingrese que tan importante considera esta area")) {
        mostrarMensaje("Por favor complete todos los campos correctamente.", "Error", "Campos incompletos");
        return;
    }

    // Verifica si la materia ya existe para el estudiante
    if (control.materiaYaExiste(estudiante, nuevoNombre)) {
        mostrarMensaje("Ya existe una materia con ese nombre. Intente con otro.", "Error", "Materia ya registrada");
        return;
    }

    // Si las validaciones son correctas, intentamos actualizar la materia
    boolean actualizado = control.actualizarMateria(materia, nuevoNombre, nuevoDocente, nuevaImportancia);
    if (actualizado) {
        mostrarMensaje("La materia se ha actualizado correctamente.", "Info", "Materia Actualizada");

        // Actualizar la tabla y cerrar la ventana
        Horario horario = new Horario(estudiante);
        horario.actualizarFilaEnTabla(materia); // Llama al método para actualizar la fila de la tabla
        horario.setVisible(true);
        horario.setLocationRelativeTo(null);
        this.dispose();
    } else {
        mostrarMensaje("No se pudo actualizar la materia. Intente nuevamente.", "Error", "Error al actualizar");
    }
}

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked
        ActualizarMateria();
    }//GEN-LAST:event_lblGuardarMouseClicked

    private void lblGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseEntered
        pnlBoton.setBackground(new Color(60, 90, 115));
    }//GEN-LAST:event_lblGuardarMouseEntered

    private void lblGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseExited
        pnlBoton.setBackground(new Color(82, 109, 130));
    }//GEN-LAST:event_lblGuardarMouseExited
    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    private void pnlBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBotonMouseClicked
        ActualizarMateria();
    }//GEN-LAST:event_pnlBotonMouseClicked

    private void pnlBotonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBotonMouseEntered
        pnlBoton.setBackground(new Color(60, 90, 115));
    }//GEN-LAST:event_pnlBotonMouseEntered

    private void pnlBotonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBotonMouseExited
        pnlBoton.setBackground(new Color(82, 109, 130));
    }//GEN-LAST:event_pnlBotonMouseExited

    private void btnCronometroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCronometroActionPerformed
        Cronometro Cronometro = new Cronometro(estudiante, materia);
        Cronometro.setVisible(true);
        Cronometro.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCronometroActionPerformed

    private void btnActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadesActionPerformed
        Actividad actividad = new Actividad(estudiante);
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActividadesActionPerformed

    private void btnHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorarioActionPerformed
        Horario Horario = new Horario(estudiante);
        Horario.setVisible(true);
        Horario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnHorarioActionPerformed

    private void btnEstadisticasLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasLActionPerformed

    }//GEN-LAST:event_btnEstadisticasLActionPerformed

    private void btnConfiguracionLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfiguracionLActionPerformed

    private void btnActividadesLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadesLActionPerformed
        Actividad actividad = new Actividad(estudiante);
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActividadesLActionPerformed

    private void btnCronometroLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCronometroLActionPerformed
        Cronometro Cronometro = new Cronometro(estudiante, materia);
        Cronometro.setVisible(true);
        Cronometro.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCronometroLActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Actividad2 actividad2 = new Actividad2(estudiante);
        actividad2.setVisible(true);
        actividad2.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnEstadisticas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticas1ActionPerformed
        Estadistico configuracion = new Estadistico(estudiante);
        configuracion.setVisible(true);
        configuracion.pack();
        configuracion.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnEstadisticas1ActionPerformed

    private void btnConfiguracion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracion1ActionPerformed
        Configuracion configuracion = new Configuracion(estudiante);
        configuracion.setVisible(true);
        configuracion.pack();
        configuracion.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnConfiguracion1ActionPerformed

    private void btnHorario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorario1ActionPerformed
        Horario Horario = new Horario(estudiante);
        Horario.setVisible(true);
        Horario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnHorario1ActionPerformed

    private void btnMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu1ActionPerformed
        Actividad2 actividad2 = new Actividad2(estudiante);
        actividad2.setVisible(true);
        actividad2.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMenu1ActionPerformed

    private void btnActividades1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividades1ActionPerformed
        Actividad actividad = new Actividad(estudiante);
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActividades1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActividades1;
    private javax.swing.JButton btnConfiguracion1;
    private javax.swing.JButton btnEstadisticas1;
    private javax.swing.JButton btnHorario1;
    private javax.swing.JButton btnMenu1;
    private javax.swing.JComboBox<String> cmbPrioridad;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblDocente;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblIconoUsuario;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JLabel lblNombreAsignatura;
    private javax.swing.JPanel lblNombreDeAsignatura;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlBoton;
    private javax.swing.JPanel pnlCamuflado1;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlDocente;
    private javax.swing.JPanel pnlHead;
    private javax.swing.JPanel pnlMenulargo1;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlPrioridad;
    private javax.swing.JTextField txtDocente1;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

}
