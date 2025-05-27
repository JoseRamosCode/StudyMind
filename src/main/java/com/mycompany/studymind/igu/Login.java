package com.mycompany.studymind.igu;

import com.mycompany.studymind.igu.SignUp.Encriptacion;
import com.mycompany.studymind.logica.Controladora;
import com.mycompany.studymind.logica.Estudiante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Login extends javax.swing.JFrame {

    Controladora control;

    public Login() {
        initComponents();
        control = new Controladora();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        Principal = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblFeet = new javax.swing.JLabel();
        lblLogotipo = new javax.swing.JLabel();
        btnLogin1 = new javax.swing.JButton();
        Left = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblTituloCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblContrasenia = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        lblRegistrarse = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        sepCorreo = new javax.swing.JSeparator();
        sepContrasenia = new javax.swing.JSeparator();
        btnVerContrasenia = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setResizable(false);

        Principal.setBackground(new java.awt.Color(255, 255, 255));
        Principal.setPreferredSize(new java.awt.Dimension(800, 500));
        Principal.setLayout(null);

        Right.setBackground(new java.awt.Color(82, 109, 130));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        lblLogo.setBackground(new java.awt.Color(0, 102, 102));
        lblLogo.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(255, 255, 255));
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/logotipoInicio.png"))); // NOI18N

        lblFeet.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblFeet.setForeground(new java.awt.Color(255, 255, 255));
        lblFeet.setText("© 2025 StudyMind. Todos los derechos reservados.");

        lblLogotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/LogoCerebro.png"))); // NOI18N

        btnLogin1.setBackground(new java.awt.Color(157, 178, 191));
        btnLogin1.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnLogin1.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin1.setText("Cronometro");
        btnLogin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin1.setFocusPainted(false);
        btnLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogin1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFeet)
                            .addGroup(RightLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(lblLogotipo))))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(lblLogotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(lblFeet)
                .addGap(48, 48, 48))
        );

        Principal.add(Right);
        Right.setBounds(0, 0, 400, 500);

        Left.setBackground(new java.awt.Color(157, 178, 191));
        Left.setToolTipText("");
        Left.setPreferredSize(new java.awt.Dimension(400, 500));

        lblTitulo.setFont(new java.awt.Font("Roboto Condensed", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Ingreso");

        lblTituloCorreo.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        lblTituloCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloCorreo.setText("Correo");

        txtCorreo.setBackground(new java.awt.Color(157, 178, 191));
        txtCorreo.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setBorder(null);
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        lblContrasenia.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        lblContrasenia.setForeground(new java.awt.Color(255, 255, 255));
        lblContrasenia.setText("Contraseña");

        txtContrasenia.setBackground(new java.awt.Color(157, 178, 191));
        txtContrasenia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtContrasenia.setForeground(new java.awt.Color(255, 255, 255));
        txtContrasenia.setBorder(null);
        txtContrasenia.setCaretColor(new java.awt.Color(255, 255, 255));
        txtContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseniaActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(82, 109, 130));
        btnLogin.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Ingresar");
        btnLogin.setFocusPainted(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lblRegistrarse.setBackground(new java.awt.Color(255, 255, 255));
        lblRegistrarse.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        lblRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        lblRegistrarse.setText("¿No tengo una cuenta?");

        btnSignUp.setBackground(new java.awt.Color(82, 109, 130));
        btnSignUp.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("Registrarse");
        btnSignUp.setFocusPainted(false);
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        sepCorreo.setForeground(new java.awt.Color(82, 109, 130));

        sepContrasenia.setForeground(new java.awt.Color(82, 109, 130));

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

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(158, 158, 158))
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                        .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVerContrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(sepContrasenia)
                    .addComponent(sepCorreo)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addComponent(lblRegistrarse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblContrasenia)
                    .addComponent(lblTituloCorreo)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtCorreo)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(lblTitulo)
                .addGap(33, 33, 33)
                .addComponent(lblTituloCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sepCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblContrasenia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVerContrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtContrasenia, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sepContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegistrarse)
                    .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65))
        );

        Principal.add(Left);
        Left.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseniaActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String correo = txtCorreo.getText().toLowerCase();   
        String contrasenia = String.valueOf(txtContrasenia.getPassword());  

        String contraseniaEncriptada = Encriptacion.encriptarContrasenia(contrasenia);

        Estudiante estudiante = control.validarEstudiante(correo, contraseniaEncriptada);

        if (estudiante != null) {

            Horario plantilla = new Horario(estudiante);
            plantilla.setVisible(true);
            plantilla.pack();
            plantilla.setLocationRelativeTo(null);
            this.dispose();
        } else {

            mostrarMensaje("Correo o contraseña incorrectos", "Error", "Acceso Denegado");
            txtCorreo.setText("");
            txtContrasenia.setText("");
        }

    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        SignUp signUp = new SignUp();
        signUp.setVisible(true);
        signUp.pack();
        signUp.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void btnVerContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerContraseniaActionPerformed
        if (txtContrasenia.getEchoChar() == (char) 0) {  
        
        txtContrasenia.setEchoChar('*');
        
    } else {
       
        txtContrasenia.setEchoChar((char) 0); 
       
    }
    }//GEN-LAST:event_btnVerContraseniaActionPerformed

    private void btnLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogin1ActionPerformed
        Inicial inicial = new Inicial();
        inicial.setVisible(true);
        inicial.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnLogin1ActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Principal;
    private javax.swing.JPanel Right;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnLogin1;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JButton btnVerContrasenia;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblFeet;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JLabel lblRegistrarse;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTituloCorreo;
    private javax.swing.JSeparator sepContrasenia;
    private javax.swing.JSeparator sepCorreo;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtCorreo;
    // End of variables declaration//GEN-END:variables
}
