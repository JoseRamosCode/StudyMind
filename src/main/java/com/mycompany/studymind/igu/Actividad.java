 
package com.mycompany.studymind.igu;

import com.mycompany.studymind.logica.Estudiante;
import com.mycompany.studymind.logica.Materia;
import com.mycompany.studymind.logica.MenuUsuario;
import java.awt.Color;



 
public class Actividad extends javax.swing.JFrame {

    
    private Estudiante estudiante;
    private Materia materia;

    
    public Actividad(Estudiante estudiante) {
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
        pnlMenulargo = new javax.swing.JPanel();
        btnEstadisticas = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();
        btnHorario = new javax.swing.JButton();
        btnConfiguracionL = new javax.swing.JButton();
        btnCronometroL = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnActividades = new javax.swing.JButton();
        pnlCamuflado = new javax.swing.JPanel();
        btnActividadesL = new javax.swing.JButton();
        pnlCentral = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        btnGeneraractividad = new javax.swing.JButton();
        pnlHead = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblLogotipo = new javax.swing.JLabel();
        lblIconoUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlPrincipal.setBackground(new java.awt.Color(221, 230, 237));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(1100, 700));
        pnlPrincipal.setLayout(null);

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

        btnConfiguracion.setBackground(new java.awt.Color(157, 178, 191));
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

        btnConfiguracionL.setBackground(new java.awt.Color(157, 178, 191));
        btnConfiguracionL.setFont(new java.awt.Font("Roboto Medium", 2, 20)); // NOI18N
        btnConfiguracionL.setForeground(new java.awt.Color(255, 255, 255));
        btnConfiguracionL.setText("Ajustes");
        btnConfiguracionL.setBorder(null);
        btnConfiguracionL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionLActionPerformed(evt);
            }
        });
        pnlMenulargo.add(btnConfiguracionL);
        btnConfiguracionL.setBounds(90, 520, 130, 24);

        btnCronometroL.setBackground(new java.awt.Color(157, 178, 191));
        btnCronometroL.setFont(new java.awt.Font("Roboto Medium", 2, 20)); // NOI18N
        btnCronometroL.setForeground(new java.awt.Color(255, 255, 255));
        btnCronometroL.setText("Horario");
        btnCronometroL.setBorder(null);
        btnCronometroL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCronometroL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCronometroLActionPerformed(evt);
            }
        });
        pnlMenulargo.add(btnCronometroL);
        btnCronometroL.setBounds(100, 210, 65, 24);

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

        btnActividades.setBackground(new java.awt.Color(221, 230, 237));
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
        btnActividades.setBounds(20, 290, 52, 60);

        pnlCamuflado.setBackground(new java.awt.Color(221, 230, 237));

        btnActividadesL.setBackground(new java.awt.Color(221, 230, 237));
        btnActividadesL.setFont(new java.awt.Font("Roboto Medium", 2, 20)); // NOI18N
        btnActividadesL.setForeground(new java.awt.Color(255, 255, 255));
        btnActividadesL.setText("Actividades");
        btnActividadesL.setBorder(null);
        btnActividadesL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActividadesL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActividadesLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCamufladoLayout = new javax.swing.GroupLayout(pnlCamuflado);
        pnlCamuflado.setLayout(pnlCamufladoLayout);
        pnlCamufladoLayout.setHorizontalGroup(
            pnlCamufladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCamufladoLayout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addComponent(btnActividadesL)
                .addGap(30, 30, 30))
        );
        pnlCamufladoLayout.setVerticalGroup(
            pnlCamufladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCamufladoLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(btnActividadesL)
                .addGap(29, 29, 29))
        );

        pnlMenulargo.add(pnlCamuflado);
        pnlCamuflado.setBounds(0, 270, 240, 90);

        pnlPrincipal.add(pnlMenulargo);
        pnlMenulargo.setBounds(0, 100, 90, 600);

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

    private void btnActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadesActionPerformed
        Actividad actividad = new Actividad(estudiante);
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActividadesActionPerformed

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

    private void btnGeneraractividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneraractividadActionPerformed
        Links linksVista = new Links(estudiante);  
        linksVista.setVisible(true);    
        linksVista.pack();               
        linksVista.setLocationRelativeTo(null);  
        this.dispose();
    }//GEN-LAST:event_btnGeneraractividadActionPerformed

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
        Horario horario = new Horario(estudiante);
        horario.setVisible(true);
        horario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCronometroLActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActividades;
    private javax.swing.JButton btnActividadesL;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnConfiguracionL;
    private javax.swing.JButton btnCronometroL;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnGeneraractividad;
    private javax.swing.JButton btnHorario;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel lblIconoUsuario;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlCamuflado;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlHead;
    private javax.swing.JPanel pnlMenulargo;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables


    
    
}

