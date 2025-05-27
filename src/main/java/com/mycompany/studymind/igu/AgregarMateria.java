package com.mycompany.studymind.igu;

import com.mycompany.studymind.igu.Actividad;
import com.mycompany.studymind.logica.Controladora;
import com.mycompany.studymind.logica.Estudiante;
import com.mycompany.studymind.logica.Materia;
import com.mycompany.studymind.logica.MenuUsuario;
import java.awt.Color;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class AgregarMateria extends javax.swing.JFrame {

    Controladora control = new Controladora();
    private Estudiante estudiante;
    private Materia materia;

    public AgregarMateria(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.materia = materia;
        initComponents();
        lblUsuario.setText(estudiante.getNombre());
        MenuUsuario.aplicarMenu(lblUsuario, this, estudiante);

    }

    private void guardarMateria() {
        String materia = txtNombre.getText().trim();
        String docente = txtDocente1.getText().trim();
        String prioridad = (String) cmbPrioridad.getSelectedItem();  // Cambio aquí: Obtener del JComboBox


        if (materia.isEmpty() || materia.equals("Ingrese el nombre de la materia")
                || docente.isEmpty() || docente.equals("Ingrese el nombre del docente a cargo")
                || prioridad == null || prioridad.equals("Ingrese que tan importante considera esta area")) {  // Validación para JComboBox

            mostrarMensaje("Por favor complete todos los campos correctamente.", "Error", "Campos incompletos");
            return;
        }

        boolean guardado = control.guardarMateria(materia, docente, prioridad, estudiante);
        if (guardado) {
            mostrarMensaje("La materia se ha registrado de manera correcta.", "Info", "Materia Registrada");

            Horario horario = new Horario(estudiante);
            horario.setVisible(true);
            horario.setLocationRelativeTo(null);
            this.dispose();
        } else {
            mostrarMensaje("Ya existe la materia. Intente nuevamente.", "Error", "Error al guardar");
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
        sepNombre = new javax.swing.JSeparator();
        lblNombreAsignatura = new javax.swing.JLabel();
        pnlDocente = new javax.swing.JPanel();
        txtDocente1 = new javax.swing.JTextField();
        sepDocente = new javax.swing.JSeparator();
        lblDocente = new javax.swing.JLabel();
        pnlPrioridad = new javax.swing.JPanel();
        lblPrioridad = new javax.swing.JLabel();
        cmbPrioridad = new javax.swing.JComboBox<>();
        lblTitulo = new javax.swing.JLabel();
        pnlBoton = new javax.swing.JPanel();
        lblGuardar = new javax.swing.JLabel();
        pnlMenulargo = new javax.swing.JPanel();
        btnEstadisticas11 = new javax.swing.JButton();
        btnConfiguracion11 = new javax.swing.JButton();
        btnHorario11 = new javax.swing.JButton();
        btnMenu11 = new javax.swing.JButton();
        btnActividades11 = new javax.swing.JButton();
        pnlCamuflado = new javax.swing.JPanel();
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
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
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

        sepNombre.setForeground(new java.awt.Color(82, 109, 130));

        lblNombreAsignatura.setFont(new java.awt.Font("Roboto Condensed", 3, 18)); // NOI18N
        lblNombreAsignatura.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreAsignatura.setText("Nombre de la asignatura: ");

        javax.swing.GroupLayout lblNombreDeAsignaturaLayout = new javax.swing.GroupLayout(lblNombreDeAsignatura);
        lblNombreDeAsignatura.setLayout(lblNombreDeAsignaturaLayout);
        lblNombreDeAsignaturaLayout.setHorizontalGroup(
            lblNombreDeAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblNombreDeAsignaturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblNombreDeAsignaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(sepNombre)
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
                .addComponent(sepNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlDocente.setBackground(new java.awt.Color(157, 178, 191));

        txtDocente1.setBackground(new java.awt.Color(157, 178, 191));
        txtDocente1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtDocente1.setForeground(new java.awt.Color(255, 255, 255));
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

        sepDocente.setForeground(new java.awt.Color(82, 109, 130));

        lblDocente.setFont(new java.awt.Font("Roboto Condensed", 3, 18)); // NOI18N
        lblDocente.setForeground(new java.awt.Color(255, 255, 255));
        lblDocente.setText("Docente:");

        javax.swing.GroupLayout pnlDocenteLayout = new javax.swing.GroupLayout(pnlDocente);
        pnlDocente.setLayout(pnlDocenteLayout);
        pnlDocenteLayout.setHorizontalGroup(
            pnlDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDocenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDocenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(sepDocente)
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
                .addComponent(sepDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlPrioridad.setBackground(new java.awt.Color(157, 178, 191));

        lblPrioridad.setFont(new java.awt.Font("Roboto Condensed", 3, 18)); // NOI18N
        lblPrioridad.setForeground(new java.awt.Color(255, 255, 255));
        lblPrioridad.setText("Prioridad:");

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
                    .addComponent(lblPrioridad)
                    .addComponent(cmbPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(305, Short.MAX_VALUE))
        );
        pnlPrioridadLayout.setVerticalGroup(
            pnlPrioridadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrioridadLayout.createSequentialGroup()
                .addComponent(lblPrioridad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        lblTitulo.setFont(new java.awt.Font("Roboto Condensed Black", 0, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Agregar nueva materia");

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
        lblGuardar.setText("Guardar");
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
                            .addComponent(lblNombreDeAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50))
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(lblTitulo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
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
                        .addComponent(pnlPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblImagen))
                .addGap(21, 21, 21)
                .addComponent(pnlBoton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(572, 572, 572))
        );

        pnlPrincipal.add(pnlCentral);
        pnlCentral.setBounds(370, 190, 700, 470);

        pnlMenulargo.setBackground(new java.awt.Color(157, 178, 191));
        pnlMenulargo.setLayout(null);

        btnEstadisticas11.setBackground(new java.awt.Color(157, 178, 191));
        btnEstadisticas11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/estadistico.png"))); // NOI18N
        btnEstadisticas11.setBorder(null);
        btnEstadisticas11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstadisticas11.setFocusPainted(false);
        btnEstadisticas11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticas11ActionPerformed(evt);
            }
        });
        pnlMenulargo.add(btnEstadisticas11);
        btnEstadisticas11.setBounds(20, 400, 52, 49);

        btnConfiguracion11.setBackground(new java.awt.Color(157, 178, 191));
        btnConfiguracion11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/conf45.png"))); // NOI18N
        btnConfiguracion11.setBorder(null);
        btnConfiguracion11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguracion11.setFocusPainted(false);
        btnConfiguracion11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracion11ActionPerformed(evt);
            }
        });
        pnlMenulargo.add(btnConfiguracion11);
        btnConfiguracion11.setBounds(20, 500, 52, 49);

        btnHorario11.setBackground(new java.awt.Color(221, 230, 237));
        btnHorario11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/horario.png"))); // NOI18N
        btnHorario11.setBorder(null);
        btnHorario11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHorario11.setFocusPainted(false);
        btnHorario11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorario11ActionPerformed(evt);
            }
        });
        pnlMenulargo.add(btnHorario11);
        btnHorario11.setBounds(20, 190, 52, 49);

        btnMenu11.setBackground(new java.awt.Color(157, 178, 191));
        btnMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/menu45.png"))); // NOI18N
        btnMenu11.setBorder(null);
        btnMenu11.setFocusPainted(false);
        btnMenu11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenu11ActionPerformed(evt);
            }
        });
        pnlMenulargo.add(btnMenu11);
        btnMenu11.setBounds(20, 10, 45, 45);

        btnActividades11.setBackground(new java.awt.Color(157, 178, 191));
        btnActividades11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actividad.png"))); // NOI18N
        btnActividades11.setBorder(null);
        btnActividades11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActividades11.setFocusPainted(false);
        btnActividades11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActividades11ActionPerformed(evt);
            }
        });
        pnlMenulargo.add(btnActividades11);
        btnActividades11.setBounds(20, 300, 52, 60);

        pnlCamuflado.setBackground(new java.awt.Color(221, 230, 237));

        javax.swing.GroupLayout pnlCamufladoLayout = new javax.swing.GroupLayout(pnlCamuflado);
        pnlCamuflado.setLayout(pnlCamufladoLayout);
        pnlCamufladoLayout.setHorizontalGroup(
            pnlCamufladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        pnlCamufladoLayout.setVerticalGroup(
            pnlCamufladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        pnlMenulargo.add(pnlCamuflado);
        pnlCamuflado.setBounds(0, 170, 90, 90);

        pnlPrincipal.add(pnlMenulargo);
        pnlMenulargo.setBounds(0, 100, 90, 600);

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

    }//GEN-LAST:event_txtNombreMousePressed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtDocente1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDocente1MousePressed

    }//GEN-LAST:event_txtDocente1MousePressed

    private void txtDocente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocente1ActionPerformed

    private void lblGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardarMouseClicked
        guardarMateria();
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
        guardarMateria();
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

    private void btnActividades1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadesActionPerformed
        Actividad actividad = new Actividad(estudiante);
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActividadesActionPerformed

    private void btnHorario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorarioActionPerformed
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

    private void btnMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Actividad2 actividad2 = new Actividad2(estudiante);
        actividad2.setVisible(true);
        actividad2.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnEstadisticas11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticas11ActionPerformed
        Estadistico configuracion = new Estadistico(estudiante);
        configuracion.setVisible(true);
        configuracion.pack();
        configuracion.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnEstadisticas11ActionPerformed

    private void btnConfiguracion11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracion11ActionPerformed
        Configuracion configuracion = new Configuracion(estudiante);
        configuracion.setVisible(true);
        configuracion.pack();
        configuracion.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnConfiguracion11ActionPerformed

    private void btnHorario11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorario11ActionPerformed
        Horario Horario = new Horario(estudiante);
        Horario.setVisible(true);
        Horario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnHorario11ActionPerformed

    private void btnMenu11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu11ActionPerformed
        Actividad2 actividad2 = new Actividad2(estudiante);
        actividad2.setVisible(true);
        actividad2.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMenu11ActionPerformed

    private void btnActividades11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividades11ActionPerformed
        Actividad actividad = new Actividad(estudiante);
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActividades11ActionPerformed

    private void btnEstadisticas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        Estadistico configuracion = new Estadistico(estudiante);
        configuracion.setVisible(true);
        configuracion.pack();
        configuracion.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    private void btnConfiguracion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        Configuracion configuracion = new Configuracion(estudiante);
        configuracion.setVisible(true);
        configuracion.pack();
        configuracion.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorario2ActionPerformed
        Horario Horario = new Horario(estudiante);
        Horario.setVisible(true);
        Horario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnHorario2ActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu2ActionPerformed
        AgregarMateria agregarMateria = new AgregarMateria(estudiante);
        agregarMateria.setVisible(true);
        agregarMateria.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMenu2ActionPerformed

    private void btnActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividades2ActionPerformed
        Actividad actividad = new Actividad(estudiante);
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActividades2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActividades11;
    private javax.swing.JButton btnConfiguracion11;
    private javax.swing.JButton btnEstadisticas11;
    private javax.swing.JButton btnHorario11;
    private javax.swing.JButton btnMenu11;
    private javax.swing.JComboBox<String> cmbPrioridad;
    private javax.swing.JLabel lblDocente;
    private javax.swing.JLabel lblGuardar;
    private javax.swing.JLabel lblIconoUsuario;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JLabel lblNombreAsignatura;
    private javax.swing.JPanel lblNombreDeAsignatura;
    private javax.swing.JLabel lblPrioridad;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlBoton;
    private javax.swing.JPanel pnlCamuflado;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlDocente;
    private javax.swing.JPanel pnlHead;
    private javax.swing.JPanel pnlMenulargo;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPanel pnlPrioridad;
    private javax.swing.JSeparator sepDocente;
    private javax.swing.JSeparator sepNombre;
    private javax.swing.JTextField txtDocente1;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

}
