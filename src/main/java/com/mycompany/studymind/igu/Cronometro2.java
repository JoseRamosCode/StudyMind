 
package com.mycompany.studymind.igu;

import com.mycompany.studymind.igu.Cronometro2;
import com.mycompany.studymind.igu.AgregarMateria;
import com.mycompany.studymind.logica.Controladora;
import com.mycompany.studymind.logica.Estudiante;
import com.mycompany.studymind.logica.Materia;
import com.mycompany.studymind.logica.MenuUsuario;
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
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;



 
public class Cronometro2 extends javax.swing.JFrame {
    Controladora control = new Controladora ();
private Timer timer;
private int tiempoRestante = 5; 
private boolean enEjecucion = false;
private int tiempoEstudiadoActual = 0;

private Estudiante estudiante;
private Materia materia;


    
   public Cronometro2(Estudiante estudiante, Materia materia) {
    this.estudiante = estudiante;
    this.materia = materia;
    initComponents();
    MenuUsuario.aplicarMenu(lblUsuario, this, estudiante);
    lblMateria.setText("Hola " + estudiante.getNombre() + ", estás estudiando " + materia.getNombre());

}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlCentral = new javax.swing.JPanel();
        pnlmagen = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        btnPausar = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        lblMateria = new javax.swing.JLabel();
        pnlMenulargo3 = new javax.swing.JPanel();
        btnEstadisticas3 = new javax.swing.JButton();
        btnConfiguracion3 = new javax.swing.JButton();
        btnHorario3 = new javax.swing.JButton();
        btnEstadisticasL3 = new javax.swing.JButton();
        btnConfiguracionL3 = new javax.swing.JButton();
        btnCronometroL3 = new javax.swing.JButton();
        btnMenu3 = new javax.swing.JButton();
        btnActividades3 = new javax.swing.JButton();
        pnlCamuflado3 = new javax.swing.JPanel();
        btnActividadesL3 = new javax.swing.JButton();
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

        pnlmagen.setBackground(new java.awt.Color(240, 245, 250));
        pnlmagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Baymax.png"))); // NOI18N

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
        lblMateria.setText("Hola, santi, estás estudiando Redes de datos");

        javax.swing.GroupLayout pnlCentralLayout = new javax.swing.GroupLayout(pnlCentral);
        pnlCentral.setLayout(pnlCentralLayout);
        pnlCentralLayout.setHorizontalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentralLayout.createSequentialGroup()
                .addComponent(pnlmagen, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPausar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCentralLayout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(lblTiempo))
                            .addGroup(pnlCentralLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(lblMateria)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlCentralLayout.setVerticalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(pnlmagen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(lblTiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPausar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
        );

        pnlPrincipal.add(pnlCentral);
        pnlCentral.setBounds(370, 180, 700, 460);

        pnlMenulargo3.setBackground(new java.awt.Color(157, 178, 191));
        pnlMenulargo3.setLayout(null);

        btnEstadisticas3.setBackground(new java.awt.Color(157, 178, 191));
        btnEstadisticas3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/estadistico.png"))); // NOI18N
        btnEstadisticas3.setBorder(null);
        btnEstadisticas3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstadisticas3.setFocusPainted(false);
        btnEstadisticas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticas3btnEstadisticasActionPerformed(evt);
            }
        });
        pnlMenulargo3.add(btnEstadisticas3);
        btnEstadisticas3.setBounds(20, 400, 52, 49);

        btnConfiguracion3.setBackground(new java.awt.Color(157, 178, 191));
        btnConfiguracion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/conf45.png"))); // NOI18N
        btnConfiguracion3.setBorder(null);
        btnConfiguracion3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguracion3.setFocusPainted(false);
        btnConfiguracion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracion3btnConfiguracionActionPerformed(evt);
            }
        });
        pnlMenulargo3.add(btnConfiguracion3);
        btnConfiguracion3.setBounds(20, 500, 52, 49);

        btnHorario3.setBackground(new java.awt.Color(157, 178, 191));
        btnHorario3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/horario.png"))); // NOI18N
        btnHorario3.setBorder(null);
        btnHorario3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHorario3.setFocusPainted(false);
        btnHorario3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorario3btnHorarioActionPerformed(evt);
            }
        });
        pnlMenulargo3.add(btnHorario3);
        btnHorario3.setBounds(20, 190, 52, 49);

        btnEstadisticasL3.setBackground(new java.awt.Color(157, 178, 191));
        btnEstadisticasL3.setFont(new java.awt.Font("Roboto Medium", 2, 20)); // NOI18N
        btnEstadisticasL3.setForeground(new java.awt.Color(255, 255, 255));
        btnEstadisticasL3.setText("Estadisticas");
        btnEstadisticasL3.setBorder(null);
        btnEstadisticasL3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstadisticasL3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasL3btnEstadisticasLActionPerformed(evt);
            }
        });
        pnlMenulargo3.add(btnEstadisticasL3);
        btnEstadisticasL3.setBounds(100, 410, 120, 24);

        btnConfiguracionL3.setBackground(new java.awt.Color(157, 178, 191));
        btnConfiguracionL3.setFont(new java.awt.Font("Roboto Medium", 2, 20)); // NOI18N
        btnConfiguracionL3.setForeground(new java.awt.Color(255, 255, 255));
        btnConfiguracionL3.setText("Ajustes");
        btnConfiguracionL3.setBorder(null);
        btnConfiguracionL3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionL3btnConfiguracionLActionPerformed(evt);
            }
        });
        pnlMenulargo3.add(btnConfiguracionL3);
        btnConfiguracionL3.setBounds(90, 520, 130, 24);

        btnCronometroL3.setBackground(new java.awt.Color(157, 178, 191));
        btnCronometroL3.setFont(new java.awt.Font("Roboto Medium", 2, 20)); // NOI18N
        btnCronometroL3.setForeground(new java.awt.Color(255, 255, 255));
        btnCronometroL3.setText("Horario");
        btnCronometroL3.setBorder(null);
        btnCronometroL3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCronometroL3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCronometroL3btnCronometroLActionPerformed(evt);
            }
        });
        pnlMenulargo3.add(btnCronometroL3);
        btnCronometroL3.setBounds(100, 210, 65, 24);

        btnMenu3.setBackground(new java.awt.Color(157, 178, 191));
        btnMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/menu45.png"))); // NOI18N
        btnMenu3.setBorder(null);
        btnMenu3.setFocusPainted(false);
        btnMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenu3btnMenuActionPerformed(evt);
            }
        });
        pnlMenulargo3.add(btnMenu3);
        btnMenu3.setBounds(20, 10, 45, 45);

        btnActividades3.setBackground(new java.awt.Color(157, 178, 191));
        btnActividades3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actividad.png"))); // NOI18N
        btnActividades3.setBorder(null);
        btnActividades3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActividades3.setFocusPainted(false);
        btnActividades3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActividades3btnActividadesActionPerformed(evt);
            }
        });
        pnlMenulargo3.add(btnActividades3);
        btnActividades3.setBounds(20, 290, 52, 60);

        pnlCamuflado3.setBackground(new java.awt.Color(157, 178, 191));

        btnActividadesL3.setBackground(new java.awt.Color(157, 178, 191));
        btnActividadesL3.setFont(new java.awt.Font("Roboto Medium", 2, 20)); // NOI18N
        btnActividadesL3.setForeground(new java.awt.Color(255, 255, 255));
        btnActividadesL3.setText("Actividades");
        btnActividadesL3.setBorder(null);
        btnActividadesL3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActividadesL3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActividadesL3btnActividadesLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCamuflado3Layout = new javax.swing.GroupLayout(pnlCamuflado3);
        pnlCamuflado3.setLayout(pnlCamuflado3Layout);
        pnlCamuflado3Layout.setHorizontalGroup(
            pnlCamuflado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCamuflado3Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(btnActividadesL3)
                .addGap(30, 30, 30))
        );
        pnlCamuflado3Layout.setVerticalGroup(
            pnlCamuflado3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCamuflado3Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(btnActividadesL3)
                .addGap(29, 29, 29))
        );

        pnlMenulargo3.add(pnlCamuflado3);
        pnlCamuflado3.setBounds(0, 270, 240, 90);

        pnlPrincipal.add(pnlMenulargo3);
        pnlMenulargo3.setBounds(0, 100, 240, 600);

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
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

                    // Guardar tiempo estudiado al finalizar
                    control.registrarEstudio(estudiante, materia, tiempoEstudiadoActual);
                    tiempoEstudiadoActual = 0; // Reset

                    // UI personalizada
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

    // Guardar tiempo actual antes de reiniciar
    if (tiempoEstudiadoActual > 0) {
        control.registrarEstudio(estudiante, materia, tiempoEstudiadoActual);
        tiempoEstudiadoActual = 0;
    }

    tiempoRestante = 40 * 60;
    enEjecucion = false;
    actualizarEtiqueta();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnEstadisticas3btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticas3btnEstadisticasActionPerformed
        Estadistico estadistico = new Estadistico(estudiante);
        estadistico.setVisible(true);
        estadistico.pack();
        estadistico.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnEstadisticas3btnEstadisticasActionPerformed

    private void btnConfiguracion3btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracion3btnConfiguracionActionPerformed
        Configuracion configuracion = new Configuracion(estudiante);
        configuracion.setVisible(true);
        configuracion.pack();
        configuracion.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnConfiguracion3btnConfiguracionActionPerformed

    private void btnHorario3btnHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorario3btnHorarioActionPerformed
        Horario Horario = new Horario(estudiante);
        Horario.setVisible(true);
        Horario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnHorario3btnHorarioActionPerformed

    private void btnEstadisticasL3btnEstadisticasLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasL3btnEstadisticasLActionPerformed

    }//GEN-LAST:event_btnEstadisticasL3btnEstadisticasLActionPerformed

    private void btnConfiguracionL3btnConfiguracionLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionL3btnConfiguracionLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfiguracionL3btnConfiguracionLActionPerformed

    private void btnCronometroL3btnCronometroLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCronometroL3btnCronometroLActionPerformed
        Horario horario = new Horario(estudiante);
        horario.setVisible(true);
        horario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCronometroL3btnCronometroLActionPerformed

    private void btnMenu3btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu3btnMenuActionPerformed
        Cronometro cronometro = new Cronometro(estudiante, materia);
        cronometro.setVisible(true);
        cronometro.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMenu3btnMenuActionPerformed

    private void btnActividades3btnActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividades3btnActividadesActionPerformed
        Actividad actividad = new Actividad(estudiante);
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActividades3btnActividadesActionPerformed

    private void btnActividadesL3btnActividadesLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadesL3btnActividadesLActionPerformed
        Actividad actividad = new Actividad(estudiante);
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActividadesL3btnActividadesLActionPerformed
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
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActividades3;
    private javax.swing.JButton btnActividadesL3;
    private javax.swing.JButton btnConfiguracion3;
    private javax.swing.JButton btnConfiguracionL3;
    private javax.swing.JButton btnCronometroL3;
    private javax.swing.JButton btnEstadisticas3;
    private javax.swing.JButton btnEstadisticasL3;
    private javax.swing.JButton btnHorario3;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnMenu3;
    private javax.swing.JButton btnPausar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel lblIconoUsuario;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JLabel lblMateria;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlCamuflado3;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlHead;
    private javax.swing.JPanel pnlMenulargo3;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JLabel pnlmagen;
    // End of variables declaration//GEN-END:variables


    private void actualizarEtiqueta() {
    int minutos = tiempoRestante / 60;
    int segundos = tiempoRestante % 60;
    lblTiempo.setText(String.format("%02d:%02d", minutos, segundos));
}
    
}

