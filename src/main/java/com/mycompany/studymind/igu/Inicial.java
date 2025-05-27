package com.mycompany.studymind.igu;

import com.mycompany.studymind.igu.SignUp.Encriptacion;
import com.mycompany.studymind.logica.Controladora;
import com.mycompany.studymind.logica.Estudiante;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;

public class Inicial extends javax.swing.JFrame {

    Controladora control;
    private javax.swing.Timer timer;
    private int tiempoRestante = 5;
    private boolean enEjecucion = false;
    private int tiempoEstudiadoActual = 0;

    public Inicial() {
        initComponents();
        control = new Controladora();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        pnlIzquierda = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        Feet = new javax.swing.JLabel();
        lblLogotipo = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnSignUp = new javax.swing.JButton();
        lblNoTengoCuenta = new javax.swing.JLabel();
        lblTengoCuenta = new javax.swing.JLabel();
        pnlCentral = new javax.swing.JPanel();
        lblTiempo = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        btnPausar = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        lblMateria = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setResizable(false);

        pnlIzquierda.setBackground(new java.awt.Color(255, 255, 255));
        pnlIzquierda.setPreferredSize(new java.awt.Dimension(800, 500));
        pnlIzquierda.setLayout(null);

        Right.setBackground(new java.awt.Color(82, 109, 130));
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        lblLogo.setBackground(new java.awt.Color(0, 102, 102));
        lblLogo.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblLogo.setForeground(new java.awt.Color(255, 255, 255));
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/logotipoInicio.png"))); // NOI18N

        Feet.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Feet.setForeground(new java.awt.Color(255, 255, 255));
        Feet.setText("© 2025 StudyMind. Todos los derechos reservados.");

        lblLogotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/LogoCerebro.png"))); // NOI18N

        btnLogin.setBackground(new java.awt.Color(157, 178, 191));
        btnLogin.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Ingresar");
        btnLogin.setFocusPainted(false);
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnSignUp.setBackground(new java.awt.Color(157, 178, 191));
        btnSignUp.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("Registrarse");
        btnSignUp.setFocusPainted(false);
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        lblNoTengoCuenta.setBackground(new java.awt.Color(255, 255, 255));
        lblNoTengoCuenta.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        lblNoTengoCuenta.setForeground(new java.awt.Color(255, 255, 255));
        lblNoTengoCuenta.setText("¿No tengo una cuenta?");

        lblTengoCuenta.setBackground(new java.awt.Color(255, 255, 255));
        lblTengoCuenta.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N
        lblTengoCuenta.setForeground(new java.awt.Color(255, 255, 255));
        lblTengoCuenta.setText("Tengo una cuenta");

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(RightLayout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addComponent(lblLogotipo))
                        .addGroup(RightLayout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Feet))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNoTengoCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTengoCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                .addGap(43, 43, 43))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(lblLogotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(lblTengoCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNoTengoCuenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(Feet)
                .addGap(15, 15, 15))
        );

        pnlIzquierda.add(Right);
        Right.setBounds(0, 0, 400, 500);

        pnlCentral.setBackground(new java.awt.Color(157, 178, 191));

        lblTiempo.setBackground(new java.awt.Color(210, 220, 230));
        lblTiempo.setFont(new java.awt.Font("Roboto Black", 0, 80)); // NOI18N
        lblTiempo.setForeground(new java.awt.Color(255, 255, 255));
        lblTiempo.setText("40:00");

        btnIniciar.setBackground(new java.awt.Color(82, 109, 130));
        btnIniciar.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("INICIAR");
        btnIniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciar.setFocusPainted(false);
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        btnPausar.setBackground(new java.awt.Color(82, 109, 130));
        btnPausar.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        btnPausar.setForeground(new java.awt.Color(255, 255, 255));
        btnPausar.setText("PAUSAR");
        btnPausar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPausar.setFocusPainted(false);
        btnPausar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPausarActionPerformed(evt);
            }
        });

        btnReiniciar.setBackground(new java.awt.Color(82, 109, 130));
        btnReiniciar.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        btnReiniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnReiniciar.setText("REINICIAR");
        btnReiniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReiniciar.setFocusPainted(false);
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        lblMateria.setBackground(new java.awt.Color(0, 102, 102));
        lblMateria.setFont(new java.awt.Font("Roboto Condensed Black", 0, 24)); // NOI18N
        lblMateria.setForeground(new java.awt.Color(255, 255, 255));
        lblMateria.setText("Bienvenido/a a Studymind");

        javax.swing.GroupLayout pnlCentralLayout = new javax.swing.GroupLayout(pnlCentral);
        pnlCentral.setLayout(pnlCentralLayout);
        pnlCentralLayout.setHorizontalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPausar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(39, 39, 39))
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(lblMateria))
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(lblTiempo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCentralLayout.setVerticalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(lblTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPausar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pnlIzquierda.add(pnlCentral);
        pnlCentral.setBounds(400, 0, 400, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlIzquierda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        Login login = new Login();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        SignUp signUp = new SignUp();
        signUp.setVisible(true);
        signUp.pack();
        signUp.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        if (!enEjecucion) {
            timer = new Timer(1000, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (tiempoRestante > 0) {
                        tiempoRestante--;
                        tiempoEstudiadoActual++; // Sumar 1 segundo cada segundo
                        actualizarEtiqueta();
                    } else {
                        timer.stop();
                        enEjecucion = false;

                        reproducirSonido();

                        JOptionPane.showMessageDialog(null, "¡Tiempo terminado!");

                        Inicial inicial = new Inicial();
                        inicial.setVisible(true);
                        inicial.setLocationRelativeTo(null);
                        dispose();
                    }
                }
            });
            timer.start();
            enEjecucion = true;
        }
    }//GEN-LAST:event_btnIniciarActionPerformed
    
public void reproducirSonido() {
    try {
        
        String rutaSonido = "/sonido/ronaldosiu.wav";  

        
        URL url = getClass().getResource(rutaSonido);
        if (url == null) {
            System.out.println("El archivo de sonido no se encuentra.");
            return;
        }

        // Abrir el sonido
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(url);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        clip.start();  // Reproduce el sonido

    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
        System.out.println("Error al reproducir el sonido: " + ex.getMessage());
        ex.printStackTrace();
    }
}
    private void btnPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausarActionPerformed
        if (timer != null && timer.isRunning()) {
            timer.stop();
            enEjecucion = false;
        }
    }//GEN-LAST:event_btnPausarActionPerformed
    private void actualizarEtiqueta() {
        int minutos = tiempoRestante / 60;
        int segundos = tiempoRestante % 60;
        lblTiempo.setText(String.format("%02d:%02d", minutos, segundos));
    }
    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        if (timer != null) {
            timer.stop();
        }
        tiempoRestante = 40 * 60;
        enEjecucion = false;
        actualizarEtiqueta();
    }//GEN-LAST:event_btnReiniciarActionPerformed

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
    private javax.swing.JLabel Feet;
    private javax.swing.JPanel Right;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnPausar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JLabel lblMateria;
    private javax.swing.JLabel lblNoTengoCuenta;
    private javax.swing.JLabel lblTengoCuenta;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlIzquierda;
    // End of variables declaration//GEN-END:variables
}
