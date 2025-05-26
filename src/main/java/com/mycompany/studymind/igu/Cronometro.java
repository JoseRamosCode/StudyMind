 
package com.mycompany.studymind.igu;

import com.mycompany.studymind.igu.Actividad;
import com.mycompany.studymind.logica.Estudiante;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import java.io.File;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;



 
public class Cronometro extends javax.swing.JFrame {
    
private Timer timer;
private int tiempoRestante = 5; // 40 minutos en segundos
private boolean enEjecucion = false;

    
    private Estudiante estudiante;

    
    public Cronometro(Estudiante estudiante) {
        this.estudiante = estudiante;
    initComponents();
    lblUsuario.setText(estudiante.getNombre());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlHead = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblLogotipo = new javax.swing.JLabel();
        pnlMenulargo2 = new javax.swing.JPanel();
        btnCronometro2 = new javax.swing.JButton();
        btnActividades2 = new javax.swing.JButton();
        btnEstadisticas2 = new javax.swing.JButton();
        btnConfiguracion2 = new javax.swing.JButton();
        btnHorario2 = new javax.swing.JButton();
        btnEstadisticasL2 = new javax.swing.JButton();
        btnConfiguracionL2 = new javax.swing.JButton();
        btnActividadesL2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btnCronometroL2 = new javax.swing.JButton();
        btnMenu2 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        btnPausar = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(221, 230, 237));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 700));
        jPanel1.setLayout(null);

        pnlHead.setBackground(new java.awt.Color(82, 109, 130));

        lblUsuario.setBackground(new java.awt.Color(0, 102, 102));
        lblUsuario.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuario");
        lblUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblLogotipo.setBackground(new java.awt.Color(0, 102, 102));
        lblLogotipo.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        lblLogotipo.setForeground(new java.awt.Color(255, 255, 255));
        lblLogotipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/logotipo.png"))); // NOI18N

        javax.swing.GroupLayout pnlHeadLayout = new javax.swing.GroupLayout(pnlHead);
        pnlHead.setLayout(pnlHeadLayout);
        pnlHeadLayout.setHorizontalGroup(
            pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 446, Short.MAX_VALUE)
                .addComponent(lblUsuario)
                .addGap(74, 74, 74))
        );
        pnlHeadLayout.setVerticalGroup(
            pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeadLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeadLayout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );

        jPanel1.add(pnlHead);
        pnlHead.setBounds(0, 0, 1100, 100);

        pnlMenulargo2.setBackground(new java.awt.Color(157, 178, 191));
        pnlMenulargo2.setLayout(null);

        btnCronometro2.setBackground(new java.awt.Color(221, 230, 237));
        btnCronometro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cronometro1.png"))); // NOI18N
        btnCronometro2.setBorder(null);
        btnCronometro2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCronometro2.setFocusPainted(false);
        btnCronometro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCronometro2ActionPerformed(evt);
            }
        });
        pnlMenulargo2.add(btnCronometro2);
        btnCronometro2.setBounds(20, 240, 52, 60);

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
        btnActividades2.setBounds(20, 330, 52, 60);

        btnEstadisticas2.setBackground(new java.awt.Color(157, 178, 191));
        btnEstadisticas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/estadistico.png"))); // NOI18N
        btnEstadisticas2.setBorder(null);
        btnEstadisticas2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstadisticas2.setFocusPainted(false);
        pnlMenulargo2.add(btnEstadisticas2);
        btnEstadisticas2.setBounds(20, 420, 52, 49);

        btnConfiguracion2.setBackground(new java.awt.Color(157, 178, 191));
        btnConfiguracion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/configuracion.png"))); // NOI18N
        btnConfiguracion2.setBorder(null);
        btnConfiguracion2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguracion2.setFocusPainted(false);
        pnlMenulargo2.add(btnConfiguracion2);
        btnConfiguracion2.setBounds(20, 520, 52, 49);

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
        btnHorario2.setBounds(20, 150, 52, 49);

        btnEstadisticasL2.setBackground(new java.awt.Color(157, 178, 191));
        btnEstadisticasL2.setFont(new java.awt.Font("Roboto Medium", 2, 20)); // NOI18N
        btnEstadisticasL2.setForeground(new java.awt.Color(255, 255, 255));
        btnEstadisticasL2.setText("Estadisticas");
        btnEstadisticasL2.setBorder(null);
        btnEstadisticasL2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstadisticasL2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasL2ActionPerformed(evt);
            }
        });
        pnlMenulargo2.add(btnEstadisticasL2);
        btnEstadisticasL2.setBounds(90, 440, 120, 24);

        btnConfiguracionL2.setBackground(new java.awt.Color(157, 178, 191));
        btnConfiguracionL2.setFont(new java.awt.Font("Roboto Medium", 2, 20)); // NOI18N
        btnConfiguracionL2.setForeground(new java.awt.Color(255, 255, 255));
        btnConfiguracionL2.setText("Ajustes");
        btnConfiguracionL2.setBorder(null);
        btnConfiguracionL2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionL2ActionPerformed(evt);
            }
        });
        pnlMenulargo2.add(btnConfiguracionL2);
        btnConfiguracionL2.setBounds(80, 530, 130, 24);

        btnActividadesL2.setBackground(new java.awt.Color(157, 178, 191));
        btnActividadesL2.setFont(new java.awt.Font("Roboto Medium", 2, 20)); // NOI18N
        btnActividadesL2.setForeground(new java.awt.Color(255, 255, 255));
        btnActividadesL2.setText("Actividades");
        btnActividadesL2.setBorder(null);
        btnActividadesL2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActividadesL2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActividadesL2ActionPerformed(evt);
            }
        });
        pnlMenulargo2.add(btnActividadesL2);
        btnActividadesL2.setBounds(90, 340, 101, 24);

        jPanel7.setBackground(new java.awt.Color(157, 178, 191));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 102, Short.MAX_VALUE)
        );

        pnlMenulargo2.add(jPanel7);
        jPanel7.setBounds(0, 130, 210, 102);

        btnCronometroL2.setBackground(new java.awt.Color(157, 178, 191));
        btnCronometroL2.setFont(new java.awt.Font("Roboto Medium", 2, 20)); // NOI18N
        btnCronometroL2.setForeground(new java.awt.Color(255, 255, 255));
        btnCronometroL2.setText("Cronometro");
        btnCronometroL2.setBorder(null);
        btnCronometroL2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCronometroL2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCronometroL2ActionPerformed(evt);
            }
        });
        pnlMenulargo2.add(btnCronometroL2);
        btnCronometroL2.setBounds(90, 260, 104, 24);

        btnMenu2.setBackground(new java.awt.Color(157, 178, 191));
        btnMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/menu.png"))); // NOI18N
        btnMenu2.setBorder(null);
        btnMenu2.setFocusPainted(false);
        btnMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenu2ActionPerformed(evt);
            }
        });
        pnlMenulargo2.add(btnMenu2);
        btnMenu2.setBounds(20, 10, 45, 45);

        jPanel8.setBackground(new java.awt.Color(221, 230, 237));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        pnlMenulargo2.add(jPanel8);
        jPanel8.setBounds(0, 230, 90, 90);

        jPanel1.add(pnlMenulargo2);
        pnlMenulargo2.setBounds(0, 100, 90, 600);

        jPanel2.setBackground(new java.awt.Color(157, 178, 191));

        jLabel2.setBackground(new java.awt.Color(240, 245, 250));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Baymax.png"))); // NOI18N

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

        jLabel9.setBackground(new java.awt.Color(0, 102, 102));
        jLabel9.setFont(new java.awt.Font("Roboto Condensed Black", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Hola, bienvenid@ a tu temporizador");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPausar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(lblTiempo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(79, 79, 79))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(lblTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPausar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66))))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(370, 180, 700, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1116, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void reproducirSonido() {
    try {
        File sonido = new File("src/sonidos/alarma.wav"); 
        AudioInputStream audioInput = AudioSystem.getAudioInputStream(sonido);
        Clip clip = AudioSystem.getClip();
        clip.open(audioInput);
        clip.start();
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    private void btnCronometro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCronometro1ActionPerformed
        Cronometro Cronometro = new Cronometro(estudiante);
        Cronometro.setVisible(true);
        Cronometro.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCronometro1ActionPerformed

    private void btnActividades1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividades1ActionPerformed
        Actividad actividad = new Actividad(estudiante);
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActividades1ActionPerformed

    private void btnHorario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorario1ActionPerformed
        Horario Horario = new Horario(estudiante);
        Horario.setVisible(true);
        Horario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnHorario1ActionPerformed

    private void btnEstadisticasL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasL1ActionPerformed

    }//GEN-LAST:event_btnEstadisticasL1ActionPerformed

    private void btnConfiguracionL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionL1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfiguracionL1ActionPerformed

    private void btnActividadesL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadesL1ActionPerformed
        Actividad actividad = new Actividad(estudiante);
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActividadesL1ActionPerformed

    private void btnCronometroL1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCronometroL1ActionPerformed
        Cronometro Cronometro = new Cronometro(estudiante);
        Cronometro.setVisible(true);
        Cronometro.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCronometroL1ActionPerformed

    private void btnMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu1ActionPerformed
        Actividad2 actividad = new Actividad2(estudiante);
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMenu1ActionPerformed

    private void btnCronometro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCronometro2ActionPerformed
        Cronometro Cronometro = new Cronometro(estudiante);
        Cronometro.setVisible(true);
        Cronometro.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCronometro2ActionPerformed

    private void btnActividades2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividades2ActionPerformed
        Actividad actividad = new Actividad(estudiante);
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActividades2ActionPerformed

    private void btnHorario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorario2ActionPerformed
        Horario Horario = new Horario(estudiante);
        Horario.setVisible(true);
        Horario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnHorario2ActionPerformed

    private void btnEstadisticasL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasL2ActionPerformed

    }//GEN-LAST:event_btnEstadisticasL2ActionPerformed

    private void btnConfiguracionL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionL2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfiguracionL2ActionPerformed

    private void btnActividadesL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadesL2ActionPerformed
        Actividad actividad = new Actividad(estudiante);
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActividadesL2ActionPerformed

    private void btnCronometroL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCronometroL2ActionPerformed
        Cronometro Cronometro = new Cronometro(estudiante);
        Cronometro.setVisible(true);
        Cronometro.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCronometroL2ActionPerformed

    private void btnMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu2ActionPerformed
        Cronometro2 actividad = new Cronometro2(estudiante);
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMenu2ActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed

        if (!enEjecucion) {
            timer = new Timer(1000, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (tiempoRestante > 0) {
                        tiempoRestante--;
                        actualizarEtiqueta();
                    } else {
                        timer.stop();
                        enEjecucion = false;

                        reproducirSonido();

                        UIManager.put("OptionPane.background", new ColorUIResource(0x9DB2BF));
                        UIManager.put("Panel.background", new ColorUIResource(0x9DB2BF));
                        UIManager.put("OptionPane.messageForeground", new ColorUIResource(0xFFFFFF));
                        UIManager.put("Button.background", new ColorUIResource(0x526D82));
                        UIManager.put("Button.foreground", new ColorUIResource(0xFFFFFF));
                        UIManager.put("OptionPane.messageFont", new Font("Roboto", Font.PLAIN, 16));
                        UIManager.put("Button.font", new Font("Roboto", Font.BOLD, 14));

                        JOptionPane.showMessageDialog(null, "¡Tiempo terminado!");

                        Actividad actividad = new Actividad(estudiante);
                        actividad.setVisible(true);
                        actividad.setLocationRelativeTo(null);
                        dispose();
                    }
                }
            });
            timer.start();
            enEjecucion = true;
        }
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnPausarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPausarActionPerformed
        if (timer != null && timer.isRunning()) {
            timer.stop();
            enEjecucion = false;
        }
    }//GEN-LAST:event_btnPausarActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        if (timer != null) {
            timer.stop();
        }
        tiempoRestante = 40 * 60;
        enEjecucion = false;
        actualizarEtiqueta();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActividades2;
    private javax.swing.JButton btnActividadesL2;
    private javax.swing.JButton btnConfiguracion2;
    private javax.swing.JButton btnConfiguracionL2;
    private javax.swing.JButton btnCronometro2;
    private javax.swing.JButton btnCronometroL2;
    private javax.swing.JButton btnEstadisticas2;
    private javax.swing.JButton btnEstadisticasL2;
    private javax.swing.JButton btnHorario2;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnMenu2;
    private javax.swing.JButton btnPausar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlHead;
    private javax.swing.JPanel pnlMenulargo2;
    // End of variables declaration//GEN-END:variables


    private void actualizarEtiqueta() {
    int minutos = tiempoRestante / 60;
    int segundos = tiempoRestante % 60;
    lblTiempo.setText(String.format("%02d:%02d", minutos, segundos));
}
    
}

