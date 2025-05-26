 
package com.mycompany.studymind.igu;

import com.mycompany.studymind.igu.Horario;
import com.mycompany.studymind.igu.Cronometro;
import com.mycompany.studymind.igu.AgregarMateria;
import com.mycompany.studymind.igu.Actividad;
import com.mycompany.studymind.logica.Estudiante;
import java.awt.Color;



 
public class Horario2 extends javax.swing.JFrame {

    
    private Estudiante estudiante;

    
    public Horario2(Estudiante estudiante) {
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
        pnlCentral = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnLimpiar1 = new javax.swing.JButton();
        scrollMaterias = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pnlMenulargo2 = new javax.swing.JPanel();
        btnCronometro2 = new javax.swing.JButton();
        btnActividades2 = new javax.swing.JButton();
        btnEstadisticas2 = new javax.swing.JButton();
        btnConfiguracion2 = new javax.swing.JButton();
        btnEstadisticasL2 = new javax.swing.JButton();
        btnConfiguracionL2 = new javax.swing.JButton();
        pnlCamulfado1 = new javax.swing.JPanel();
        btnHorarioL2 = new javax.swing.JButton();
        btnHorario2 = new javax.swing.JButton();
        btnCronometroL2 = new javax.swing.JButton();
        btnActividadesL2 = new javax.swing.JButton();
        btnMenu1 = new javax.swing.JButton();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 456, Short.MAX_VALUE)
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
        pnlHead.setBounds(0, 0, 1110, 100);

        pnlCentral.setBackground(new java.awt.Color(157, 178, 191));

        lblImagen.setBackground(new java.awt.Color(240, 245, 250));
        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Baymax.png"))); // NOI18N

        btnGuardar.setBackground(new java.awt.Color(82, 109, 130));
        btnGuardar.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Agregar materia");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(82, 109, 130));
        btnLimpiar.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Actualizar materia");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnLimpiar1.setBackground(new java.awt.Color(82, 109, 130));
        btnLimpiar1.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        btnLimpiar1.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar1.setText("Eliminar materia");
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollMaterias.setViewportView(jTable1);

        javax.swing.GroupLayout pnlCentralLayout = new javax.swing.GroupLayout(pnlCentral);
        pnlCentral.setLayout(pnlCentralLayout);
        pnlCentralLayout.setHorizontalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpiar1)
                .addGap(22, 22, 22)
                .addComponent(btnLimpiar)
                .addContainerGap())
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(scrollMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 144, Short.MAX_VALUE))
        );
        pnlCentralLayout.setVerticalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagen)
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(scrollMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel1.add(pnlCentral);
        pnlCentral.setBounds(370, 180, 700, 470);

        pnlMenulargo2.setBackground(new java.awt.Color(157, 178, 191));
        pnlMenulargo2.setLayout(null);

        btnCronometro2.setBackground(new java.awt.Color(157, 178, 191));
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
        btnConfiguracion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracion2ActionPerformed(evt);
            }
        });
        pnlMenulargo2.add(btnConfiguracion2);
        btnConfiguracion2.setBounds(20, 520, 52, 49);

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

        pnlCamulfado1.setBackground(new java.awt.Color(221, 230, 237));

        btnHorarioL2.setBackground(new java.awt.Color(221, 230, 237));
        btnHorarioL2.setFont(new java.awt.Font("Roboto Medium", 2, 20)); // NOI18N
        btnHorarioL2.setForeground(new java.awt.Color(255, 255, 255));
        btnHorarioL2.setText("Horario");
        btnHorarioL2.setBorder(null);
        btnHorarioL2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHorarioL2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorarioL2ActionPerformed(evt);
            }
        });

        btnHorario2.setBackground(new java.awt.Color(221, 230, 237));
        btnHorario2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/horario.png"))); // NOI18N
        btnHorario2.setBorder(null);
        btnHorario2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHorario2.setFocusPainted(false);
        btnHorario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorario2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCamulfado1Layout = new javax.swing.GroupLayout(pnlCamulfado1);
        pnlCamulfado1.setLayout(pnlCamulfado1Layout);
        pnlCamulfado1Layout.setHorizontalGroup(
            pnlCamulfado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCamulfado1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(btnHorario2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnHorarioL2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        pnlCamulfado1Layout.setVerticalGroup(
            pnlCamulfado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCamulfado1Layout.createSequentialGroup()
                .addGroup(pnlCamulfado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCamulfado1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnHorario2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCamulfado1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnHorarioL2)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pnlMenulargo2.add(pnlCamulfado1);
        pnlCamulfado1.setBounds(0, 130, 210, 90);

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
        btnActividadesL2.setBounds(100, 360, 101, 24);

        btnMenu1.setBackground(new java.awt.Color(157, 178, 191));
        btnMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/menu (1).png"))); // NOI18N
        btnMenu1.setBorder(null);
        btnMenu1.setFocusPainted(false);
        btnMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenu1ActionPerformed(evt);
            }
        });
        pnlMenulargo2.add(btnMenu1);
        btnMenu1.setBounds(20, 10, 45, 45);

        jPanel1.add(pnlMenulargo2);
        pnlMenulargo2.setBounds(0, 100, 210, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1112, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCronometroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCronometroActionPerformed
        Cronometro Cronometro = new Cronometro(estudiante);
        Cronometro.setVisible(true);
        Cronometro.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCronometroActionPerformed

    private void btnActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadesActionPerformed
        Actividad actividad = new Actividad(estudiante);
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActividadesActionPerformed

    private void btnEstadisticasLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasLActionPerformed

    }//GEN-LAST:event_btnEstadisticasLActionPerformed

    private void btnConfiguracionLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfiguracionLActionPerformed

    private void btnHorarioLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorarioLActionPerformed
        Horario Horario = new Horario(estudiante);
        Horario.setVisible(true);
        Horario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnHorarioLActionPerformed

    private void btnHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorarioActionPerformed
        Horario Horario = new Horario(estudiante);
        Horario.setVisible(true);
        Horario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnHorarioActionPerformed

    private void btnCronometroLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCronometroLActionPerformed
        Cronometro Cronometro = new Cronometro(estudiante);
        Cronometro.setVisible(true);
        Cronometro.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCronometroLActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Actividad actividad = new Actividad(estudiante);
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnActividadesLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadesLActionPerformed
        Actividad actividad = new Actividad(estudiante);
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActividadesLActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        AgregarMateria agregarMateria = new AgregarMateria(estudiante);
        agregarMateria.setVisible(true);
        agregarMateria.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

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
        Configuracion configuracion = new Configuracion(estudiante);  
        configuracion.setVisible(true);    
        configuracion.pack();               
        configuracion.setLocationRelativeTo(null);  
        this.dispose();
    }//GEN-LAST:event_btnConfiguracionL2ActionPerformed

    private void btnHorarioL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorarioL2ActionPerformed
        Horario Horario = new Horario(estudiante);
        Horario.setVisible(true);
        Horario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnHorarioL2ActionPerformed

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

    private void btnConfiguracion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracion2ActionPerformed
       Configuracion configuracion = new Configuracion(estudiante);  
        configuracion.setVisible(true);    
        configuracion.pack();               
        configuracion.setLocationRelativeTo(null);  
        this.dispose();
    }//GEN-LAST:event_btnConfiguracion2ActionPerformed

    private void btnMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu1ActionPerformed
        Horario horario = new Horario(estudiante);
        horario.setVisible(true);
        horario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMenu1ActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActividades;
    private javax.swing.JButton btnActividades2;
    private javax.swing.JButton btnActividadesL;
    private javax.swing.JButton btnActividadesL2;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnConfiguracion2;
    private javax.swing.JButton btnConfiguracionL;
    private javax.swing.JButton btnConfiguracionL2;
    private javax.swing.JButton btnCronometro;
    private javax.swing.JButton btnCronometro2;
    private javax.swing.JButton btnCronometroL;
    private javax.swing.JButton btnCronometroL2;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnEstadisticas2;
    private javax.swing.JButton btnEstadisticasL;
    private javax.swing.JButton btnEstadisticasL2;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnHorario;
    private javax.swing.JButton btnHorario2;
    private javax.swing.JButton btnHorarioL;
    private javax.swing.JButton btnHorarioL2;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlCamulfado;
    private javax.swing.JPanel pnlCamulfado1;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlHead;
    private javax.swing.JPanel pnlMenulargo;
    private javax.swing.JPanel pnlMenulargo2;
    private javax.swing.JScrollPane scrollMaterias;
    // End of variables declaration//GEN-END:variables


    
    
}

