package com.mycompany.studymind.igu;

import com.mycompany.studymind.logica.Estudiante;
import com.mycompany.studymind.logica.Materia;
import com.mycompany.studymind.logica.MenuUsuario;

public class Actividad2 extends javax.swing.JFrame {

    private Estudiante estudiante;
    private Materia materia;

    public Actividad2(Estudiante estudiante) {
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
        pnlHead = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblLogotipo = new javax.swing.JLabel();
        lblIconoUsuario = new javax.swing.JLabel();
        pnlCentral = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        btnGeneraractividad = new javax.swing.JButton();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(221, 230, 237));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(1100, 700));
        pnlPrincipal.setLayout(null);

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

        pnlCentral.setBackground(new java.awt.Color(157, 178, 191));

        lblImagen.setBackground(new java.awt.Color(240, 245, 250));
        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Baymax con mariposa(1)(1).png"))); // NOI18N

        lblMensaje.setFont(new java.awt.Font("Roboto Condensed Black", 0, 36)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(255, 255, 255));
        lblMensaje.setText("Hola, es hora de una pausa activa");

        btnGeneraractividad.setBackground(new java.awt.Color(82, 109, 130));
        btnGeneraractividad.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        btnGeneraractividad.setForeground(new java.awt.Color(255, 255, 255));
        btnGeneraractividad.setText("Generar actividad");
        btnGeneraractividad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGeneraractividad.setFocusPainted(false);
        btnGeneraractividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneraractividadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCentralLayout = new javax.swing.GroupLayout(pnlCentral);
        pnlCentral.setLayout(pnlCentralLayout);
        pnlCentralLayout.setHorizontalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGeneraractividad, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(lblMensaje)
                .addGap(0, 108, Short.MAX_VALUE))
        );
        pnlCentralLayout.setVerticalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addComponent(lblMensaje)
                .addGap(80, 80, 80)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagen)
                    .addComponent(btnGeneraractividad, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnlPrincipal.add(pnlCentral);
        pnlCentral.setBounds(370, 180, 700, 470);

        pnlMenulargo3.setBackground(new java.awt.Color(157, 178, 191));
        pnlMenulargo3.setLayout(null);

        btnEstadisticas3.setBackground(new java.awt.Color(157, 178, 191));
        btnEstadisticas3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/estadistico.png"))); // NOI18N
        btnEstadisticas3.setBorder(null);
        btnEstadisticas3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstadisticas3.setFocusPainted(false);
        btnEstadisticas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
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
                btnConfiguracionActionPerformed(evt);
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
                btnHorarioActionPerformed(evt);
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
                btnEstadisticasLActionPerformed(evt);
            }
        });
        pnlMenulargo3.add(btnEstadisticasL3);
        btnEstadisticasL3.setBounds(100, 410, 120, 24);

        btnConfiguracionL3.setBackground(new java.awt.Color(157, 178, 191));
        btnConfiguracionL3.setFont(new java.awt.Font("Roboto Medium", 2, 20)); // NOI18N
        btnConfiguracionL3.setForeground(new java.awt.Color(255, 255, 255));
        btnConfiguracionL3.setText("Ajustes");
        btnConfiguracionL3.setBorder(null);
        btnConfiguracionL3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguracionL3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionLActionPerformed(evt);
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
                btnCronometroLActionPerformed(evt);
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
                btnMenuActionPerformed(evt);
            }
        });
        pnlMenulargo3.add(btnMenu3);
        btnMenu3.setBounds(20, 10, 45, 45);

        btnActividades3.setBackground(new java.awt.Color(221, 230, 237));
        btnActividades3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actividad.png"))); // NOI18N
        btnActividades3.setBorder(null);
        btnActividades3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActividades3.setFocusPainted(false);
        btnActividades3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActividadesActionPerformed(evt);
            }
        });
        pnlMenulargo3.add(btnActividades3);
        btnActividades3.setBounds(20, 290, 52, 60);

        pnlCamuflado3.setBackground(new java.awt.Color(221, 230, 237));

        btnActividadesL3.setBackground(new java.awt.Color(221, 230, 237));
        btnActividadesL3.setFont(new java.awt.Font("Roboto Medium", 2, 20)); // NOI18N
        btnActividadesL3.setForeground(new java.awt.Color(255, 255, 255));
        btnActividadesL3.setText("Actividades");
        btnActividadesL3.setBorder(null);
        btnActividadesL3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActividadesL3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActividadesLActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        Cronometro Cronometro = new Cronometro(estudiante, materia);
        Cronometro.setVisible(true);
        Cronometro.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        Horario Horario = new Horario(estudiante);
        Horario.setVisible(true);
        Horario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Cronometro Cronometro = new Cronometro(estudiante, materia);
        Cronometro.setVisible(true);
        Cronometro.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnGeneraractividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneraractividadActionPerformed
        Links linksVista = new Links(estudiante);
        linksVista.setVisible(true);
        linksVista.pack();
        linksVista.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnGeneraractividadActionPerformed

    private void btnActividadesLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadesLActionPerformed
        Actividad actividad = new Actividad(estudiante);
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActividadesLActionPerformed

    private void btnActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadesActionPerformed
        Actividad actividad = new Actividad(estudiante);
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActividadesActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Actividad2 actividad2 = new Actividad2(estudiante);
        actividad2.setVisible(true);
        actividad2.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnCronometroLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCronometroLActionPerformed
        Horario horario = new Horario(estudiante);
        horario.setVisible(true);
        horario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCronometroLActionPerformed

    private void btnConfiguracionLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionLActionPerformed
        Configuracion configuracion = new Configuracion(estudiante);
        configuracion.setVisible(true);
        configuracion.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnConfiguracionLActionPerformed

    private void btnEstadisticasLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasLActionPerformed
        Estadistico estadistico = new Estadistico(estudiante);
        estadistico.setVisible(true);
        estadistico.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnEstadisticasLActionPerformed

    private void btnHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorarioActionPerformed
        Horario Horario = new Horario(estudiante);
        Horario.setVisible(true);
        Horario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnHorarioActionPerformed

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        Configuracion configuracion = new Configuracion(estudiante);
        configuracion.setVisible(true);
        configuracion.pack();
        configuracion.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        Estadistico estadistico = new Estadistico(estudiante);
        estadistico.setVisible(true);
        estadistico.pack();
        estadistico.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnEstadisticasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActividades3;
    private javax.swing.JButton btnActividadesL3;
    private javax.swing.JButton btnConfiguracion3;
    private javax.swing.JButton btnConfiguracionL3;
    private javax.swing.JButton btnCronometroL3;
    private javax.swing.JButton btnEstadisticas3;
    private javax.swing.JButton btnEstadisticasL3;
    private javax.swing.JButton btnGeneraractividad;
    private javax.swing.JButton btnHorario3;
    private javax.swing.JButton btnMenu3;
    private javax.swing.JLabel lblIconoUsuario;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlCamuflado3;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlHead;
    private javax.swing.JPanel pnlMenulargo3;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables

}
