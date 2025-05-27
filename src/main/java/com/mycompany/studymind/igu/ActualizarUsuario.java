package com.mycompany.studymind.igu;

import com.mycompany.studymind.igu.SignUp.Encriptacion;
import com.mycompany.studymind.logica.Controladora;
import com.mycompany.studymind.logica.Estudiante;
import com.mycompany.studymind.logica.Materia;
import com.mycompany.studymind.logica.MenuUsuario;
import java.awt.Color;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JOptionPane;

public class ActualizarUsuario extends javax.swing.JFrame {

    private Estudiante estudiante;
    private Materia materia;

    public ActualizarUsuario(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.materia = materia;
        initComponents();
        lblUsuario.setText(estudiante.getNombre());
        MenuUsuario.aplicarMenu(lblUsuario, this, estudiante);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlCentral = new javax.swing.JPanel();
        lblMensaje = new javax.swing.JLabel();
        pnlActualizar = new javax.swing.JPanel();
        lblActualizar = new javax.swing.JLabel();
        pnlConfirmarContrasenia = new javax.swing.JPanel();
        sepConfirmarContrasenia = new javax.swing.JSeparator();
        txtPassword = new javax.swing.JPasswordField();
        JButton = new javax.swing.JButton();
        pnlNuevoUsuario = new javax.swing.JPanel();
        txtNuevoUsuario = new javax.swing.JTextField();
        sepNuevoUsuario = new javax.swing.JSeparator();
        lblNuevoUsuario = new javax.swing.JLabel();
        lblConfirmarContrasenia = new javax.swing.JLabel();
        pnlMenulargo2 = new javax.swing.JPanel();
        btnEstadisticas2 = new javax.swing.JButton();
        btnConfiguracion2 = new javax.swing.JButton();
        btnHorario2 = new javax.swing.JButton();
        btnMenu2 = new javax.swing.JButton();
        btnActividades2 = new javax.swing.JButton();
        pnlCamuflado2 = new javax.swing.JPanel();
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
        lblMensaje.setText("Actualización de contacto");

        pnlActualizar.setBackground(new java.awt.Color(82, 109, 130));
        pnlActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlActualizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlActualizarMouseExited(evt);
            }
        });

        lblActualizar.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        lblActualizar.setForeground(new java.awt.Color(255, 255, 255));
        lblActualizar.setText("Actualizar");
        lblActualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblActualizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblActualizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblActualizarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlActualizarLayout = new javax.swing.GroupLayout(pnlActualizar);
        pnlActualizar.setLayout(pnlActualizarLayout);
        pnlActualizarLayout.setHorizontalGroup(
            pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlActualizarLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblActualizar)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        pnlActualizarLayout.setVerticalGroup(
            pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        pnlConfirmarContrasenia.setBackground(new java.awt.Color(157, 178, 191));

        sepConfirmarContrasenia.setForeground(new java.awt.Color(82, 109, 130));

        txtPassword.setBackground(new java.awt.Color(157, 178, 191));
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        JButton.setBackground(new java.awt.Color(157, 178, 191));
        JButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ojoContraseña.png"))); // NOI18N
        JButton.setBorder(null);
        JButton.setBorderPainted(false);
        JButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButton.setFocusPainted(false);
        JButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConfirmarContraseniaLayout = new javax.swing.GroupLayout(pnlConfirmarContrasenia);
        pnlConfirmarContrasenia.setLayout(pnlConfirmarContraseniaLayout);
        pnlConfirmarContraseniaLayout.setHorizontalGroup(
            pnlConfirmarContraseniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConfirmarContraseniaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlConfirmarContraseniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sepConfirmarContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlConfirmarContraseniaLayout.createSequentialGroup()
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JButton))))
        );
        pnlConfirmarContraseniaLayout.setVerticalGroup(
            pnlConfirmarContraseniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfirmarContraseniaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConfirmarContraseniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sepConfirmarContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlNuevoUsuario.setBackground(new java.awt.Color(157, 178, 191));

        txtNuevoUsuario.setBackground(new java.awt.Color(157, 178, 191));
        txtNuevoUsuario.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNuevoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtNuevoUsuario.setBorder(null);
        txtNuevoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNuevoUsuarioMousePressed(evt);
            }
        });
        txtNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevoUsuarioActionPerformed(evt);
            }
        });

        sepNuevoUsuario.setForeground(new java.awt.Color(82, 109, 130));

        lblNuevoUsuario.setFont(new java.awt.Font("Roboto Condensed", 3, 18)); // NOI18N
        lblNuevoUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblNuevoUsuario.setText("Nuevo usuario:");

        javax.swing.GroupLayout pnlNuevoUsuarioLayout = new javax.swing.GroupLayout(pnlNuevoUsuario);
        pnlNuevoUsuario.setLayout(pnlNuevoUsuarioLayout);
        pnlNuevoUsuarioLayout.setHorizontalGroup(
            pnlNuevoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevoUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlNuevoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sepNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(pnlNuevoUsuarioLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblNuevoUsuario)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlNuevoUsuarioLayout.setVerticalGroup(
            pnlNuevoUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevoUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNuevoUsuario)
                .addGap(4, 4, 4)
                .addComponent(txtNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sepNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lblConfirmarContrasenia.setFont(new java.awt.Font("Roboto Condensed", 3, 18)); // NOI18N
        lblConfirmarContrasenia.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirmarContrasenia.setText("Confirmar contraseña:");

        javax.swing.GroupLayout pnlCentralLayout = new javax.swing.GroupLayout(pnlCentral);
        pnlCentral.setLayout(pnlCentralLayout);
        pnlCentralLayout.setHorizontalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(lblMensaje)
                .addContainerGap(172, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentralLayout.createSequentialGroup()
                .addGap(0, 273, Short.MAX_VALUE)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentralLayout.createSequentialGroup()
                        .addComponent(pnlActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(283, 283, 283))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentralLayout.createSequentialGroup()
                        .addComponent(lblConfirmarContrasenia)
                        .addGap(269, 269, 269))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlConfirmarContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239))
            .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlCentralLayout.createSequentialGroup()
                    .addGap(264, 264, 264)
                    .addComponent(pnlNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(267, Short.MAX_VALUE)))
        );
        pnlCentralLayout.setVerticalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                .addComponent(lblConfirmarContrasenia)
                .addGap(18, 18, 18)
                .addComponent(pnlConfirmarContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(pnlActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentralLayout.createSequentialGroup()
                    .addContainerGap(212, Short.MAX_VALUE)
                    .addComponent(pnlNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(194, 194, 194)))
        );

        pnlPrincipal.add(pnlCentral);
        pnlCentral.setBounds(370, 180, 700, 470);

        pnlMenulargo2.setBackground(new java.awt.Color(157, 178, 191));
        pnlMenulargo2.setLayout(null);

        btnEstadisticas2.setBackground(new java.awt.Color(157, 178, 191));
        btnEstadisticas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/estadistico.png"))); // NOI18N
        btnEstadisticas2.setBorder(null);
        btnEstadisticas2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstadisticas2.setFocusPainted(false);
        btnEstadisticas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticas2ActionPerformed(evt);
            }
        });
        pnlMenulargo2.add(btnEstadisticas2);
        btnEstadisticas2.setBounds(20, 400, 52, 49);

        btnConfiguracion2.setBackground(new java.awt.Color(221, 230, 237));
        btnConfiguracion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/conf45.png"))); // NOI18N
        btnConfiguracion2.setBorder(null);
        btnConfiguracion2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguracion2.setFocusPainted(false);
        btnConfiguracion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracion2ActionPerformed(evt);
            }
        });
        pnlMenulargo2.add(btnConfiguracion2);
        btnConfiguracion2.setBounds(20, 500, 52, 49);

        btnHorario2.setBackground(new java.awt.Color(157, 178, 191));
        btnHorario2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/horario.png"))); // NOI18N
        btnHorario2.setBorder(null);
        btnHorario2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHorario2.setFocusPainted(false);
        btnHorario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorario2ActionPerformed(evt);
            }
        });
        pnlMenulargo2.add(btnHorario2);
        btnHorario2.setBounds(20, 190, 52, 49);

        btnMenu2.setBackground(new java.awt.Color(157, 178, 191));
        btnMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/menu45.png"))); // NOI18N
        btnMenu2.setBorder(null);
        btnMenu2.setFocusPainted(false);
        btnMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenu2ActionPerformed(evt);
            }
        });
        pnlMenulargo2.add(btnMenu2);
        btnMenu2.setBounds(20, 10, 45, 45);

        btnActividades2.setBackground(new java.awt.Color(157, 178, 191));
        btnActividades2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actividad.png"))); // NOI18N
        btnActividades2.setBorder(null);
        btnActividades2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActividades2.setFocusPainted(false);
        btnActividades2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActividades2ActionPerformed(evt);
            }
        });
        pnlMenulargo2.add(btnActividades2);
        btnActividades2.setBounds(20, 300, 52, 60);

        pnlCamuflado2.setBackground(new java.awt.Color(221, 230, 237));

        javax.swing.GroupLayout pnlCamuflado2Layout = new javax.swing.GroupLayout(pnlCamuflado2);
        pnlCamuflado2.setLayout(pnlCamuflado2Layout);
        pnlCamuflado2Layout.setHorizontalGroup(
            pnlCamuflado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        pnlCamuflado2Layout.setVerticalGroup(
            pnlCamuflado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        pnlMenulargo2.add(pnlCamuflado2);
        pnlCamuflado2.setBounds(0, 480, 90, 90);

        pnlPrincipal.add(pnlMenulargo2);
        pnlMenulargo2.setBounds(0, 100, 90, 600);

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
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1106, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNuevoUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNuevoUsuarioMousePressed

    }//GEN-LAST:event_txtNuevoUsuarioMousePressed

    private void txtNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevoUsuarioActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

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

    private void btnEstadisticas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticas2ActionPerformed
        Estadistico configuracion = new Estadistico(estudiante);
        configuracion.setVisible(true);
        configuracion.pack();
        configuracion.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnEstadisticas2ActionPerformed

    private void btnConfiguracion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracion2ActionPerformed
        Configuracion configuracion = new Configuracion(estudiante);
        configuracion.setVisible(true);
        configuracion.pack();
        configuracion.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnConfiguracion2ActionPerformed

    private void btnHorario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorario2ActionPerformed
        Horario Horario = new Horario(estudiante);
        Horario.setVisible(true);
        Horario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnHorario2ActionPerformed

    private void btnMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu2ActionPerformed
        Actividad2 actividad2 = new Actividad2(estudiante);
        actividad2.setVisible(true);
        actividad2.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMenu2ActionPerformed

    private void btnActividades2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividades2ActionPerformed
        Actividad actividad = new Actividad(estudiante);
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActividades2ActionPerformed

    private void JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonActionPerformed
        if (txtPassword.getEchoChar() == (char) 0) {

            txtPassword.setEchoChar('*');

        } else {

            txtPassword.setEchoChar((char) 0);

        }
    }//GEN-LAST:event_JButtonActionPerformed

    private void pnlActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlActualizarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlActualizarMouseExited

    private void pnlActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlActualizarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlActualizarMouseEntered
    private void actualizarNombreUsuario() {
        String nuevoUsuario = txtNuevoUsuario.getText();
        String contraseniaIngresada = new String(txtPassword.getPassword()).trim();

        if (nuevoUsuario.isEmpty() || contraseniaIngresada.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        
        Controladora control = new Controladora();
        this.estudiante = control.traerEstudiantePorId(this.estudiante.getId_Estudiante());

        
        String contraseniaEncriptada = Encriptacion.encriptarContrasenia(contraseniaIngresada);

        
        if (!this.estudiante.getContrasenia().equals(contraseniaEncriptada)) {
            JOptionPane.showMessageDialog(this, "La contraseña no coincide", "Error de autenticación", JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        if (control.existeNombreEnOtroEstudiante(nuevoUsuario, this.estudiante.getId_Estudiante())) {
            JOptionPane.showMessageDialog(this, "El nombre de usuario ya está en uso", "Nombre duplicado", JOptionPane.WARNING_MESSAGE);
            return;
        }

        
        this.estudiante.setNombre(nuevoUsuario);
        boolean actualizado = control.actualizarEstudiante(this.estudiante);

        if (actualizado) {
            this.estudiante = control.traerEstudiantePorId(this.estudiante.getId_Estudiante());
            JOptionPane.showMessageDialog(this, "Nombre actualizado con éxito", "Actualización exitosa", JOptionPane.INFORMATION_MESSAGE);

            Configuracion configuracion = new Configuracion(this.estudiante);
            configuracion.setVisible(true);
            configuracion.setLocationRelativeTo(null);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al actualizar el usuario", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void pnlActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlActualizarMouseClicked
        actualizarNombreUsuario();
    }//GEN-LAST:event_pnlActualizarMouseClicked

    private void lblActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblActualizarMouseExited

    private void lblActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblActualizarMouseEntered

    private void lblActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarMouseClicked
       actualizarNombreUsuario();
    }//GEN-LAST:event_lblActualizarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton;
    private javax.swing.JButton btnActividades2;
    private javax.swing.JButton btnConfiguracion2;
    private javax.swing.JButton btnEstadisticas2;
    private javax.swing.JButton btnHorario2;
    private javax.swing.JButton btnMenu2;
    private javax.swing.JLabel lblActualizar;
    private javax.swing.JLabel lblConfirmarContrasenia;
    private javax.swing.JLabel lblIconoUsuario;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblNuevoUsuario;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlActualizar;
    private javax.swing.JPanel pnlCamuflado2;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlConfirmarContrasenia;
    private javax.swing.JPanel pnlHead;
    private javax.swing.JPanel pnlMenulargo2;
    private javax.swing.JPanel pnlNuevoUsuario;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JSeparator sepConfirmarContrasenia;
    private javax.swing.JSeparator sepNuevoUsuario;
    private javax.swing.JTextField txtNuevoUsuario;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

}
