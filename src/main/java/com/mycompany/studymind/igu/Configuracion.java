package com.mycompany.studymind.igu;

import com.mycompany.studymind.logica.Controladora;
import com.mycompany.studymind.logica.Estudiante;
import com.mycompany.studymind.logica.Materia;
import com.mycompany.studymind.logica.MenuUsuario;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JOptionPane;

public class Configuracion extends javax.swing.JFrame {

    private Estudiante estudiante;
    private Materia materia;

    public Configuracion(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.materia = materia;
        initComponents();
        MenuUsuario.aplicarMenu(lblUsuario, this, estudiante);
        lblUsuario.setText(estudiante.getNombre());
        txtUsuario.setText(estudiante.getNombre());
        txtCorreo.setText(estudiante.getCorreo());
        txtCorreo.setPreferredSize(new Dimension(txtCorreo.getPreferredSize().width, txtCorreo.getPreferredSize().height));
        txtCorreo.setMaximumSize(new Dimension(Short.MAX_VALUE, Short.MAX_VALUE));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlCentral = new javax.swing.JPanel();
        lblMensaje = new javax.swing.JLabel();
        lblUsuario1 = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblContrasenia = new javax.swing.JLabel();
        btnActualizar1 = new javax.swing.JPanel();
        btnActualizar12 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JLabel();
        btnActualizar2 = new javax.swing.JPanel();
        btnActualizar22 = new javax.swing.JLabel();
        btnActualizar3 = new javax.swing.JPanel();
        btnActualizar33 = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JPasswordField();
        btnLimpiar1 = new javax.swing.JButton();
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
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(1100, 700));
        pnlPrincipal.setLayout(null);

        pnlCentral.setBackground(new java.awt.Color(157, 178, 191));

        lblMensaje.setFont(new java.awt.Font("Roboto Condensed Black", 0, 36)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(255, 255, 255));
        lblMensaje.setText("¿Tienes un cambio en mente?");

        lblUsuario1.setFont(new java.awt.Font("Roboto Condensed", 3, 20)); // NOI18N
        lblUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario1.setText("Usuario:");

        lblCorreo.setFont(new java.awt.Font("Roboto Condensed", 3, 20)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setText("Correo:");

        lblContrasenia.setFont(new java.awt.Font("Roboto Condensed", 3, 20)); // NOI18N
        lblContrasenia.setForeground(new java.awt.Color(255, 255, 255));
        lblContrasenia.setText("Contraseña:");

        btnActualizar1.setBackground(new java.awt.Color(82, 109, 130));
        btnActualizar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizar1MouseExited(evt);
            }
        });

        btnActualizar12.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        btnActualizar12.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar12.setText("Actualizar");
        btnActualizar12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizar12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizar12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizar12MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnActualizar1Layout = new javax.swing.GroupLayout(btnActualizar1);
        btnActualizar1.setLayout(btnActualizar1Layout);
        btnActualizar1Layout.setHorizontalGroup(
            btnActualizar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizar1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnActualizar12)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        btnActualizar1Layout.setVerticalGroup(
            btnActualizar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnActualizar12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        txtUsuario.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setText("usuario");

        txtCorreo.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setText("correo");

        btnActualizar2.setBackground(new java.awt.Color(82, 109, 130));
        btnActualizar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizar2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizar2MouseExited(evt);
            }
        });

        btnActualizar22.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        btnActualizar22.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar22.setText("Actualizar");
        btnActualizar22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizar22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizar22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizar22MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnActualizar2Layout = new javax.swing.GroupLayout(btnActualizar2);
        btnActualizar2.setLayout(btnActualizar2Layout);
        btnActualizar2Layout.setHorizontalGroup(
            btnActualizar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizar2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnActualizar22)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        btnActualizar2Layout.setVerticalGroup(
            btnActualizar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnActualizar22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        btnActualizar3.setBackground(new java.awt.Color(82, 109, 130));
        btnActualizar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizar3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizar3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizar3MouseExited(evt);
            }
        });

        btnActualizar33.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        btnActualizar33.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar33.setText("Actualizar");
        btnActualizar33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizar33MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizar33MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizar33MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnActualizar3Layout = new javax.swing.GroupLayout(btnActualizar3);
        btnActualizar3.setLayout(btnActualizar3Layout);
        btnActualizar3Layout.setHorizontalGroup(
            btnActualizar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizar3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnActualizar33)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        btnActualizar3Layout.setVerticalGroup(
            btnActualizar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnActualizar33, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        txtContrasenia.setBackground(new java.awt.Color(157, 178, 191));
        txtContrasenia.setForeground(new java.awt.Color(255, 255, 255));
        txtContrasenia.setText("jPasswordField1");
        txtContrasenia.setBorder(null);

        btnLimpiar1.setBackground(new java.awt.Color(82, 109, 130));
        btnLimpiar1.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        btnLimpiar1.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar1.setText("Eliminar");
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCentralLayout = new javax.swing.GroupLayout(pnlCentral);
        pnlCentral.setLayout(pnlCentralLayout);
        pnlCentralLayout.setHorizontalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario1)
                            .addComponent(lblCorreo))
                        .addGap(18, 18, 18)
                        .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMensaje)
                            .addGroup(pnlCentralLayout.createSequentialGroup()
                                .addComponent(lblContrasenia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 163, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283))
        );
        pnlCentralLayout.setVerticalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblMensaje)
                .addGap(71, 71, 71)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsuario1)
                            .addComponent(txtUsuario))
                        .addGap(30, 30, 30)
                        .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCorreo)
                            .addComponent(txtCorreo)))
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addComponent(btnActualizar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblContrasenia)
                            .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pnlPrincipal.add(pnlCentral);
        pnlCentral.setBounds(370, 180, 700, 470);

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

        btnConfiguracion1.setBackground(new java.awt.Color(221, 230, 237));
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

        btnHorario1.setBackground(new java.awt.Color(157, 178, 191));
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
        pnlCamuflado1.setBounds(0, 480, 90, 90);

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
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1102, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizar12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar12MouseClicked
        ActualizarUsuario actualizar = new ActualizarUsuario(estudiante);
        actualizar.setVisible(true);
        actualizar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActualizar12MouseClicked

    private void btnActualizar12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar12MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar12MouseEntered

    private void btnActualizar12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar12MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar12MouseExited

    private void btnActualizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar1MouseClicked
        ActualizarUsuario actualizar = new ActualizarUsuario(estudiante);
        actualizar.setVisible(true);
        actualizar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActualizar1MouseClicked

    private void btnActualizar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar1MouseEntered

    private void btnActualizar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar1MouseExited

    private void btnActualizar22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar22MouseClicked
        ActualizarCorreo actualizar = new ActualizarCorreo(estudiante);
        actualizar.setVisible(true);
        actualizar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActualizar22MouseClicked

    private void btnActualizar22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar22MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar22MouseEntered

    private void btnActualizar22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar22MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar22MouseExited

    private void btnActualizar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar2MouseClicked
        ActualizarCorreo actualizar = new ActualizarCorreo(estudiante);
        actualizar.setVisible(true);
        actualizar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActualizar2MouseClicked

    private void btnActualizar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar2MouseEntered

    private void btnActualizar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar2MouseExited

    private void btnActualizar33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar33MouseClicked
        ActualizarContrasenia actualizar = new ActualizarContrasenia(estudiante);
        actualizar.setVisible(true);
        actualizar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActualizar33MouseClicked

    private void btnActualizar33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar33MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar33MouseEntered

    private void btnActualizar33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar33MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar33MouseExited

    private void btnActualizar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar3MouseClicked
        ActualizarUsuario actualizar = new ActualizarUsuario(estudiante);
        actualizar.setVisible(true);
        actualizar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActualizar3MouseClicked

    private void btnActualizar3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar3MouseEntered

    private void btnActualizar3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar3MouseExited

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
        Configuracion2 configuracion = new Configuracion2(estudiante);
        configuracion.setVisible(true);
        configuracion.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMenu1ActionPerformed

    private void btnActividades1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividades1ActionPerformed
        Actividad actividad = new Actividad(estudiante);
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActividades1ActionPerformed

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        
        int confirmar = JOptionPane.showConfirmDialog(this,
                "¿Está seguro que desea eliminar su usuario? Esta acción no se puede deshacer.",
                "Confirmar eliminación",
                JOptionPane.YES_NO_OPTION);

        if (confirmar == JOptionPane.YES_OPTION) {
            Controladora control = new Controladora();
            boolean eliminado = control.eliminarEstudiante(estudiante);

            if (eliminado) {
                JOptionPane.showMessageDialog(this,
                        "Usuario eliminado correctamente.",
                        "Usuario eliminado",
                        JOptionPane.INFORMATION_MESSAGE);

                
                Login login = new Login();  
                login.setVisible(true);
                login.setLocationRelativeTo(null);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this,
                        "No se pudo eliminar el usuario.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnLimpiar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActividades1;
    private javax.swing.JPanel btnActualizar1;
    private javax.swing.JLabel btnActualizar12;
    private javax.swing.JPanel btnActualizar2;
    private javax.swing.JLabel btnActualizar22;
    private javax.swing.JPanel btnActualizar3;
    private javax.swing.JLabel btnActualizar33;
    private javax.swing.JButton btnConfiguracion1;
    private javax.swing.JButton btnEstadisticas1;
    private javax.swing.JButton btnHorario1;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnMenu1;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblIconoUsuario;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JPanel pnlCamuflado1;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlHead;
    private javax.swing.JPanel pnlMenulargo1;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JLabel txtCorreo;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables

}
