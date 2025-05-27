package com.mycompany.studymind.igu;

import com.mycompany.studymind.logica.Controladora;
import com.mycompany.studymind.logica.Estudiante;
import com.mycompany.studymind.logica.Materia;
import com.mycompany.studymind.logica.MenuUsuario;
import java.util.List;
import javax.swing.JOptionPane;

public class ActualizarCorreo extends javax.swing.JFrame {

    private Estudiante estudiante;
    private Materia materia;

    public ActualizarCorreo(Estudiante estudiante) {
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
        lblConfirmarContrasenia = new javax.swing.JLabel();
        btnVerContrasenia = new javax.swing.JButton();
        pnlNuevaContrasenia = new javax.swing.JPanel();
        sepNuevaContrasenia = new javax.swing.JSeparator();
        lblNuevoCorreo = new javax.swing.JLabel();
        txtNuevoCorreo = new javax.swing.JTextField();
        pnlMenulargo = new javax.swing.JPanel();
        btnEstadisticas = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();
        btnHorario = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnActividades = new javax.swing.JButton();
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
        txtPassword.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        lblConfirmarContrasenia.setFont(new java.awt.Font("Roboto Condensed", 3, 18)); // NOI18N
        lblConfirmarContrasenia.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirmarContrasenia.setText("Confirmar contraseña:");

        btnVerContrasenia.setBackground(new java.awt.Color(157, 178, 191));
        btnVerContrasenia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ojoContraseña.png"))); // NOI18N
        btnVerContrasenia.setBorder(null);
        btnVerContrasenia.setBorderPainted(false);
        btnVerContrasenia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerContrasenia.setFocusPainted(false);
        btnVerContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerContraseniaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlConfirmarContraseniaLayout = new javax.swing.GroupLayout(pnlConfirmarContrasenia);
        pnlConfirmarContrasenia.setLayout(pnlConfirmarContraseniaLayout);
        pnlConfirmarContraseniaLayout.setHorizontalGroup(
            pnlConfirmarContraseniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfirmarContraseniaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlConfirmarContraseniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConfirmarContraseniaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sepConfirmarContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlConfirmarContraseniaLayout.createSequentialGroup()
                        .addGroup(pnlConfirmarContraseniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblConfirmarContrasenia)
                            .addGroup(pnlConfirmarContraseniaLayout.createSequentialGroup()
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVerContrasenia)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlConfirmarContraseniaLayout.setVerticalGroup(
            pnlConfirmarContraseniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfirmarContraseniaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblConfirmarContrasenia)
                .addGap(12, 12, 12)
                .addGroup(pnlConfirmarContraseniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(btnVerContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sepConfirmarContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlNuevaContrasenia.setBackground(new java.awt.Color(157, 178, 191));

        sepNuevaContrasenia.setForeground(new java.awt.Color(82, 109, 130));

        lblNuevoCorreo.setFont(new java.awt.Font("Roboto Condensed", 3, 18)); // NOI18N
        lblNuevoCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblNuevoCorreo.setText("Nuevo correo:");

        txtNuevoCorreo.setBackground(new java.awt.Color(157, 178, 191));
        txtNuevoCorreo.setFont(new java.awt.Font("Roboto", 2, 14)); // NOI18N
        txtNuevoCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtNuevoCorreo.setBorder(null);

        javax.swing.GroupLayout pnlNuevaContraseniaLayout = new javax.swing.GroupLayout(pnlNuevaContrasenia);
        pnlNuevaContrasenia.setLayout(pnlNuevaContraseniaLayout);
        pnlNuevaContraseniaLayout.setHorizontalGroup(
            pnlNuevaContraseniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevaContraseniaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sepNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlNuevaContraseniaLayout.createSequentialGroup()
                .addGroup(pnlNuevaContraseniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNuevaContraseniaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtNuevoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlNuevaContraseniaLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblNuevoCorreo)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlNuevaContraseniaLayout.setVerticalGroup(
            pnlNuevaContraseniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevaContraseniaLayout.createSequentialGroup()
                .addComponent(lblNuevoCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNuevoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sepNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlCentralLayout = new javax.swing.GroupLayout(pnlCentral);
        pnlCentral.setLayout(pnlCentralLayout);
        pnlCentralLayout.setHorizontalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(lblMensaje)
                .addContainerGap(172, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentralLayout.createSequentialGroup()
                        .addComponent(pnlActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(283, 283, 283))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentralLayout.createSequentialGroup()
                        .addComponent(pnlNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(269, 269, 269))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentralLayout.createSequentialGroup()
                        .addComponent(pnlConfirmarContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(254, 254, 254))))
        );
        pnlCentralLayout.setVerticalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(pnlNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(pnlConfirmarContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(pnlActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pnlPrincipal.add(pnlCentral);
        pnlCentral.setBounds(370, 180, 700, 470);

        pnlMenulargo.setBackground(new java.awt.Color(157, 178, 191));
        pnlMenulargo.setLayout(null);

        btnEstadisticas.setBackground(new java.awt.Color(157, 178, 191));
        btnEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/estadistico.png"))); // NOI18N
        btnEstadisticas.setBorder(null);
        btnEstadisticas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstadisticas.setFocusPainted(false);
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });
        pnlMenulargo.add(btnEstadisticas);
        btnEstadisticas.setBounds(20, 400, 52, 49);

        btnConfiguracion.setBackground(new java.awt.Color(221, 230, 237));
        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/conf45.png"))); // NOI18N
        btnConfiguracion.setBorder(null);
        btnConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguracion.setFocusPainted(false);
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });
        pnlMenulargo.add(btnConfiguracion);
        btnConfiguracion.setBounds(20, 500, 52, 49);

        btnHorario.setBackground(new java.awt.Color(157, 178, 191));
        btnHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/horario.png"))); // NOI18N
        btnHorario.setBorder(null);
        btnHorario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHorario.setFocusPainted(false);
        btnHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorarioActionPerformed(evt);
            }
        });
        pnlMenulargo.add(btnHorario);
        btnHorario.setBounds(20, 190, 52, 49);

        btnMenu.setBackground(new java.awt.Color(157, 178, 191));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/menu45.png"))); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.setFocusPainted(false);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        pnlMenulargo.add(btnMenu);
        btnMenu.setBounds(20, 10, 45, 45);

        btnActividades.setBackground(new java.awt.Color(157, 178, 191));
        btnActividades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actividad.png"))); // NOI18N
        btnActividades.setBorder(null);
        btnActividades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActividades.setFocusPainted(false);
        btnActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActividadesActionPerformed(evt);
            }
        });
        pnlMenulargo.add(btnActividades);
        btnActividades.setBounds(20, 300, 52, 60);

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

        pnlMenulargo.add(pnlCamuflado1);
        pnlCamuflado1.setBounds(0, 480, 90, 90);

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
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1106, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void pnlActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlActualizarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlActualizarMouseExited

    private void pnlActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlActualizarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlActualizarMouseEntered

    private void pnlActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlActualizarMouseClicked
        actualizarCorreoUsuario();
    }//GEN-LAST:event_pnlActualizarMouseClicked

    private void lblActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblActualizarMouseExited

    private void lblActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblActualizarMouseEntered

    private void lblActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarMouseClicked
        actualizarCorreoUsuario();
    }//GEN-LAST:event_lblActualizarMouseClicked
    private boolean validarCorreo(String correo) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return correo.matches(regex);
    }

    private void actualizarCorreoUsuario() {
        String nuevoCorreo = txtNuevoCorreo.getText().trim().toLowerCase();
        String contraseniaIngresada = new String(txtPassword.getPassword()).trim();

        if (nuevoCorreo.isEmpty() || contraseniaIngresada.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!validarCorreo(nuevoCorreo)) {
            JOptionPane.showMessageDialog(this, "El correo ingresado no tiene un formato válido", "Correo inválido", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Controladora control = new Controladora();
        this.estudiante = control.traerEstudiantePorId(this.estudiante.getId_Estudiante());

        
        String contraseniaEncriptada = SignUp.Encriptacion.encriptarContrasenia(contraseniaIngresada);

        if (!this.estudiante.getContrasenia().equals(contraseniaEncriptada)) {
            JOptionPane.showMessageDialog(this, "La contraseña no coincide", "Error de autenticación", JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        List<Estudiante> estudiantesRegistrados = control.traerEstudiantes(); 
        for (Estudiante e : estudiantesRegistrados) {
            if (e.getCorreo().equalsIgnoreCase(nuevoCorreo)
                    && e.getId_Estudiante() != this.estudiante.getId_Estudiante()) {
                JOptionPane.showMessageDialog(this, "El correo ya está en uso por otro usuario", "Correo duplicado", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }

        
        this.estudiante.setCorreo(nuevoCorreo);
        boolean actualizado = control.actualizarEstudiante(this.estudiante);

        if (actualizado) {
            this.estudiante = control.traerEstudiantePorId(this.estudiante.getId_Estudiante());
            JOptionPane.showMessageDialog(this, "Correo actualizado con éxito", "Actualización exitosa", JOptionPane.INFORMATION_MESSAGE);

            Configuracion configuracion = new Configuracion(this.estudiante);
            configuracion.setVisible(true);
            configuracion.setLocationRelativeTo(null);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al actualizar el correo", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        Estadistico configuracion = new Estadistico(estudiante);
        configuracion.setVisible(true);
        configuracion.pack();
        configuracion.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        Configuracion configuracion = new Configuracion(estudiante);
        configuracion.setVisible(true);
        configuracion.pack();
        configuracion.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorarioActionPerformed
        Horario Horario = new Horario(estudiante);
        Horario.setVisible(true);
        Horario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnHorarioActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Actividad2 actividad2 = new Actividad2(estudiante);
        actividad2.setVisible(true);
        actividad2.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadesActionPerformed
        Actividad actividad = new Actividad(estudiante);
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActividadesActionPerformed

    private void btnVerContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerContraseniaActionPerformed
        if (txtPassword.getEchoChar() == (char) 0) {

            txtPassword.setEchoChar('*');

        } else {

            txtPassword.setEchoChar((char) 0);

        }
    }//GEN-LAST:event_btnVerContraseniaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActividades;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnHorario;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnVerContrasenia;
    private javax.swing.JLabel lblActualizar;
    private javax.swing.JLabel lblConfirmarContrasenia;
    private javax.swing.JLabel lblIconoUsuario;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblNuevoCorreo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlActualizar;
    private javax.swing.JPanel pnlCamuflado1;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlConfirmarContrasenia;
    private javax.swing.JPanel pnlHead;
    private javax.swing.JPanel pnlMenulargo;
    private javax.swing.JPanel pnlNuevaContrasenia;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JSeparator sepConfirmarContrasenia;
    private javax.swing.JSeparator sepNuevaContrasenia;
    private javax.swing.JTextField txtNuevoCorreo;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

}
