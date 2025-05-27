package com.mycompany.studymind.igu;

import com.mycompany.studymind.logica.Controladora;
import com.mycompany.studymind.logica.Estudiante;
import com.mycompany.studymind.logica.Materia;
import com.mycompany.studymind.logica.MenuUsuario;
import javax.swing.JOptionPane;

public class ActualizarContrasenia extends javax.swing.JFrame {

    private Estudiante estudiante;
    private Materia materia;

    public ActualizarContrasenia(Estudiante estudiante) {
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
        JButton = new javax.swing.JButton();
        pnlNuevaContrasenia = new javax.swing.JPanel();
        sepNuevaContrasenia = new javax.swing.JSeparator();
        lblNuevaContrasenia = new javax.swing.JLabel();
        txtNuevaContrasenia = new javax.swing.JPasswordField();
        JButton1 = new javax.swing.JButton();
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
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JButton)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlConfirmarContraseniaLayout.setVerticalGroup(
            pnlConfirmarContraseniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfirmarContraseniaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblConfirmarContrasenia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlConfirmarContraseniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sepConfirmarContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlNuevaContrasenia.setBackground(new java.awt.Color(157, 178, 191));

        sepNuevaContrasenia.setForeground(new java.awt.Color(82, 109, 130));

        lblNuevaContrasenia.setFont(new java.awt.Font("Roboto Condensed", 3, 18)); // NOI18N
        lblNuevaContrasenia.setForeground(new java.awt.Color(255, 255, 255));
        lblNuevaContrasenia.setText("Nueva contraseña:");

        txtNuevaContrasenia.setBackground(new java.awt.Color(157, 178, 191));
        txtNuevaContrasenia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtNuevaContrasenia.setForeground(new java.awt.Color(255, 255, 255));
        txtNuevaContrasenia.setBorder(null);
        txtNuevaContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNuevaContraseniaActionPerformed(evt);
            }
        });

        JButton1.setBackground(new java.awt.Color(157, 178, 191));
        JButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/ojoContraseña.png"))); // NOI18N
        JButton1.setBorder(null);
        JButton1.setBorderPainted(false);
        JButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JButton1.setFocusPainted(false);
        JButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNuevaContraseniaLayout = new javax.swing.GroupLayout(pnlNuevaContrasenia);
        pnlNuevaContrasenia.setLayout(pnlNuevaContraseniaLayout);
        pnlNuevaContraseniaLayout.setHorizontalGroup(
            pnlNuevaContraseniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevaContraseniaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sepNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlNuevaContraseniaLayout.createSequentialGroup()
                .addGroup(pnlNuevaContraseniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlNuevaContraseniaLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblNuevaContrasenia))
                    .addGroup(pnlNuevaContraseniaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JButton1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlNuevaContraseniaLayout.setVerticalGroup(
            pnlNuevaContraseniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevaContraseniaLayout.createSequentialGroup()
                .addComponent(lblNuevaContrasenia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlNuevaContraseniaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNuevaContraseniaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sepNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlCentralLayout = new javax.swing.GroupLayout(pnlCentral);
        pnlCentral.setLayout(pnlCentralLayout);
        pnlCentralLayout.setHorizontalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentralLayout.createSequentialGroup()
                .addGap(0, 293, Short.MAX_VALUE)
                .addComponent(pnlActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(283, 283, 283))
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(lblMensaje)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlConfirmarContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(254, 254, 254))
        );
        pnlCentralLayout.setVerticalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(pnlNuevaContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(pnlConfirmarContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(pnlActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
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

    private void lblActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarMouseClicked
     actualizarContraseniaUsuario();
    }//GEN-LAST:event_lblActualizarMouseClicked

    private void lblActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblActualizarMouseEntered

    private void lblActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblActualizarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblActualizarMouseExited

    private void pnlActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlActualizarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlActualizarMouseExited

    private void pnlActualizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlActualizarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlActualizarMouseEntered
private void actualizarContraseniaUsuario() {
    String contraseniaActual = new String(txtPassword.getPassword()).trim();
    String nuevaContrasenia = new String(txtNuevaContrasenia.getPassword()).trim();

    if (contraseniaActual.isEmpty() || nuevaContrasenia.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos", "Campos vacíos", JOptionPane.WARNING_MESSAGE);
        return;
    }

    if (nuevaContrasenia.length() < 6) {
        JOptionPane.showMessageDialog(this, "La nueva contraseña debe tener al menos 6 caracteres", "Contraseña inválida", JOptionPane.WARNING_MESSAGE);
        return;
    }

    Controladora control = new Controladora();
    this.estudiante = control.traerEstudiantePorId(this.estudiante.getId_Estudiante());

    String contraseniaActualEncriptada = SignUp.Encriptacion.encriptarContrasenia(contraseniaActual);
    if (!this.estudiante.getContrasenia().equals(contraseniaActualEncriptada)) {
        JOptionPane.showMessageDialog(this, "La contraseña actual no coincide", "Error de autenticación", JOptionPane.ERROR_MESSAGE);
        return;
    }

    
    String nuevaEncriptada = SignUp.Encriptacion.encriptarContrasenia(nuevaContrasenia);
    this.estudiante.setContrasenia(nuevaEncriptada);

    boolean actualizado = control.actualizarEstudiante(this.estudiante);

    if (actualizado) {
        JOptionPane.showMessageDialog(this, "Contraseña actualizada con éxito", "Actualización exitosa", JOptionPane.INFORMATION_MESSAGE);

        Configuracion configuracion = new Configuracion(this.estudiante);
        configuracion.setVisible(true);
        configuracion.setLocationRelativeTo(null);
        this.dispose();
    } else {
        JOptionPane.showMessageDialog(this, "Ocurrió un error al actualizar la contraseña", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    private void pnlActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlActualizarMouseClicked
     actualizarContraseniaUsuario();
    }//GEN-LAST:event_pnlActualizarMouseClicked

    private void txtNuevaContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNuevaContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNuevaContraseniaActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

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

    private void JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonActionPerformed
        if (txtPassword.getEchoChar() == (char) 0) {

            txtPassword.setEchoChar('*');

        } else {

            txtPassword.setEchoChar((char) 0);

        }
    }//GEN-LAST:event_JButtonActionPerformed

    private void JButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton1ActionPerformed
        if (txtNuevaContrasenia.getEchoChar() == (char) 0) {

            txtNuevaContrasenia.setEchoChar('*');

        } else {

            txtNuevaContrasenia.setEchoChar((char) 0);

        }
    }//GEN-LAST:event_JButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton;
    private javax.swing.JButton JButton1;
    private javax.swing.JButton btnActividades1;
    private javax.swing.JButton btnConfiguracion1;
    private javax.swing.JButton btnEstadisticas1;
    private javax.swing.JButton btnHorario1;
    private javax.swing.JButton btnMenu1;
    private javax.swing.JLabel lblActualizar;
    private javax.swing.JLabel lblConfirmarContrasenia;
    private javax.swing.JLabel lblIconoUsuario;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblNuevaContrasenia;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlActualizar;
    private javax.swing.JPanel pnlCamuflado1;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlConfirmarContrasenia;
    private javax.swing.JPanel pnlHead;
    private javax.swing.JPanel pnlMenulargo1;
    private javax.swing.JPanel pnlNuevaContrasenia;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JSeparator sepConfirmarContrasenia;
    private javax.swing.JSeparator sepNuevaContrasenia;
    private javax.swing.JPasswordField txtNuevaContrasenia;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables

}
