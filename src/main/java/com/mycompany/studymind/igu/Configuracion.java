 
package com.mycompany.studymind.igu;

import com.mycompany.studymind.logica.Estudiante;
import java.awt.Color;
import java.awt.Dimension;



 
public class Configuracion extends javax.swing.JFrame {

    
    private Estudiante estudiante;

    
    public Configuracion(Estudiante estudiante) {
        this.estudiante = estudiante;
    initComponents();
    lblUsuario.setText(estudiante.getNombre());
    lblUsuario1.setText(estudiante.getNombre());
    lblCorreo.setText(estudiante.getCorreo());
    lblCorreo.setPreferredSize(new Dimension(lblCorreo.getPreferredSize().width, lblCorreo.getPreferredSize().height));
    lblCorreo.setMaximumSize(new Dimension(Short.MAX_VALUE, Short.MAX_VALUE));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlHead = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblLogotipo = new javax.swing.JLabel();
        pnlMenulargo = new javax.swing.JPanel();
        btnCronometro = new javax.swing.JButton();
        btnActividades = new javax.swing.JButton();
        btnEstadisticas = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();
        btnHorario = new javax.swing.JButton();
        btnEstadisticasL = new javax.swing.JButton();
        btnConfiguracionL = new javax.swing.JButton();
        btnActividadesL = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnCronometroL = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        pnlCentral = new javax.swing.JPanel();
        lblMensaje = new javax.swing.JLabel();
        lblNombreAsignatura = new javax.swing.JLabel();
        lblNombreAsignatura1 = new javax.swing.JLabel();
        lblNombreAsignatura2 = new javax.swing.JLabel();
        pnlBoton2 = new javax.swing.JPanel();
        lblGuardar2 = new javax.swing.JLabel();
        pnlBoton3 = new javax.swing.JPanel();
        lblGuardar3 = new javax.swing.JLabel();
        pnlBoton4 = new javax.swing.JPanel();
        lblGuardar4 = new javax.swing.JLabel();
        lblUsuario1 = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();

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

        pnlPrincipal.add(pnlHead);
        pnlHead.setBounds(0, 0, 1100, 100);

        pnlMenulargo.setBackground(new java.awt.Color(157, 178, 191));
        pnlMenulargo.setLayout(null);

        btnCronometro.setBackground(new java.awt.Color(157, 178, 191));
        btnCronometro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cronometro1.png"))); // NOI18N
        btnCronometro.setBorder(null);
        btnCronometro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCronometro.setFocusPainted(false);
        btnCronometro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCronometroActionPerformed(evt);
            }
        });
        pnlMenulargo.add(btnCronometro);
        btnCronometro.setBounds(20, 240, 52, 60);

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
        btnActividades.setBounds(20, 330, 52, 60);

        btnEstadisticas.setBackground(new java.awt.Color(157, 178, 191));
        btnEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/estadistico.png"))); // NOI18N
        btnEstadisticas.setBorder(null);
        btnEstadisticas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstadisticas.setFocusPainted(false);
        pnlMenulargo.add(btnEstadisticas);
        btnEstadisticas.setBounds(20, 420, 52, 49);

        btnConfiguracion.setBackground(new java.awt.Color(157, 178, 191));
        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/configuracion.png"))); // NOI18N
        btnConfiguracion.setBorder(null);
        btnConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguracion.setFocusPainted(false);
        pnlMenulargo.add(btnConfiguracion);
        btnConfiguracion.setBounds(20, 520, 52, 49);

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
        btnHorario.setBounds(20, 150, 52, 49);

        btnEstadisticasL.setBackground(new java.awt.Color(157, 178, 191));
        btnEstadisticasL.setFont(new java.awt.Font("Roboto Medium", 2, 20)); // NOI18N
        btnEstadisticasL.setForeground(new java.awt.Color(255, 255, 255));
        btnEstadisticasL.setText("Estadisticas");
        btnEstadisticasL.setBorder(null);
        btnEstadisticasL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstadisticasL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasLActionPerformed(evt);
            }
        });
        pnlMenulargo.add(btnEstadisticasL);
        btnEstadisticasL.setBounds(90, 440, 120, 24);

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
        btnConfiguracionL.setBounds(80, 530, 130, 24);

        btnActividadesL.setBackground(new java.awt.Color(157, 178, 191));
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
        pnlMenulargo.add(btnActividadesL);
        btnActividadesL.setBounds(90, 340, 101, 24);

        jPanel4.setBackground(new java.awt.Color(157, 178, 191));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        pnlMenulargo.add(jPanel4);
        jPanel4.setBounds(0, 130, 210, 90);

        btnCronometroL.setBackground(new java.awt.Color(157, 178, 191));
        btnCronometroL.setFont(new java.awt.Font("Roboto Medium", 2, 20)); // NOI18N
        btnCronometroL.setForeground(new java.awt.Color(255, 255, 255));
        btnCronometroL.setText("Cronometro");
        btnCronometroL.setBorder(null);
        btnCronometroL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCronometroL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCronometroLActionPerformed(evt);
            }
        });
        pnlMenulargo.add(btnCronometroL);
        btnCronometroL.setBounds(90, 260, 104, 24);

        btnMenu.setBackground(new java.awt.Color(157, 178, 191));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/menu.png"))); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.setFocusPainted(false);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        pnlMenulargo.add(btnMenu);
        btnMenu.setBounds(20, 10, 45, 45);

        jPanel1.setBackground(new java.awt.Color(221, 230, 237));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        pnlMenulargo.add(jPanel1);
        jPanel1.setBounds(0, 320, 90, 90);

        pnlPrincipal.add(pnlMenulargo);
        pnlMenulargo.setBounds(0, 100, 90, 600);

        pnlCentral.setBackground(new java.awt.Color(157, 178, 191));

        lblMensaje.setFont(new java.awt.Font("Roboto Condensed Black", 0, 36)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(255, 255, 255));
        lblMensaje.setText("¿Tienes un cambio en mente?");

        lblNombreAsignatura.setFont(new java.awt.Font("Roboto Condensed", 3, 18)); // NOI18N
        lblNombreAsignatura.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreAsignatura.setText("Usuario:");

        lblNombreAsignatura1.setFont(new java.awt.Font("Roboto Condensed", 3, 18)); // NOI18N
        lblNombreAsignatura1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreAsignatura1.setText("Correo:");

        lblNombreAsignatura2.setFont(new java.awt.Font("Roboto Condensed", 3, 18)); // NOI18N
        lblNombreAsignatura2.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreAsignatura2.setText("Contraseña:");

        pnlBoton2.setBackground(new java.awt.Color(82, 109, 130));
        pnlBoton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlBoton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBoton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlBoton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlBoton2MouseExited(evt);
            }
        });

        lblGuardar2.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        lblGuardar2.setForeground(new java.awt.Color(255, 255, 255));
        lblGuardar2.setText("Actualizar");
        lblGuardar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGuardar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGuardar2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGuardar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGuardar2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlBoton2Layout = new javax.swing.GroupLayout(pnlBoton2);
        pnlBoton2.setLayout(pnlBoton2Layout);
        pnlBoton2Layout.setHorizontalGroup(
            pnlBoton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBoton2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblGuardar2)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        pnlBoton2Layout.setVerticalGroup(
            pnlBoton2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBoton2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGuardar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlBoton3.setBackground(new java.awt.Color(82, 109, 130));
        pnlBoton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlBoton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBoton3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlBoton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlBoton3MouseExited(evt);
            }
        });

        lblGuardar3.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        lblGuardar3.setForeground(new java.awt.Color(255, 255, 255));
        lblGuardar3.setText("Actualizar");
        lblGuardar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGuardar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGuardar3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGuardar3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGuardar3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlBoton3Layout = new javax.swing.GroupLayout(pnlBoton3);
        pnlBoton3.setLayout(pnlBoton3Layout);
        pnlBoton3Layout.setHorizontalGroup(
            pnlBoton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBoton3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblGuardar3)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnlBoton3Layout.setVerticalGroup(
            pnlBoton3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBoton3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGuardar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlBoton4.setBackground(new java.awt.Color(82, 109, 130));
        pnlBoton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlBoton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlBoton4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlBoton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlBoton4MouseExited(evt);
            }
        });

        lblGuardar4.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        lblGuardar4.setForeground(new java.awt.Color(255, 255, 255));
        lblGuardar4.setText("Actualizar");
        lblGuardar4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblGuardar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGuardar4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblGuardar4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGuardar4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlBoton4Layout = new javax.swing.GroupLayout(pnlBoton4);
        pnlBoton4.setLayout(pnlBoton4Layout);
        pnlBoton4Layout.setHorizontalGroup(
            pnlBoton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBoton4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblGuardar4)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnlBoton4Layout.setVerticalGroup(
            pnlBoton4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBoton4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGuardar4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblUsuario1.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario1.setText("usuario");

        lblCorreo.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setText("        correo");

        javax.swing.GroupLayout pnlCentralLayout = new javax.swing.GroupLayout(pnlCentral);
        pnlCentral.setLayout(pnlCentralLayout);
        pnlCentralLayout.setHorizontalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentralLayout.createSequentialGroup()
                            .addComponent(pnlBoton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(314, 314, 314))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentralLayout.createSequentialGroup()
                            .addComponent(lblNombreAsignatura1)
                            .addGap(359, 359, 359)))
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlBoton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlCentralLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(lblUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(pnlBoton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(lblNombreAsignatura))
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(lblNombreAsignatura2))
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(lblMensaje)))
                .addGap(0, 163, Short.MAX_VALUE))
        );
        pnlCentralLayout.setVerticalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblMensaje)
                .addGap(18, 18, 18)
                .addComponent(lblNombreAsignatura)
                .addGap(5, 5, 5)
                .addComponent(lblUsuario1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBoton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(lblNombreAsignatura1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBoton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lblNombreAsignatura2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBoton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );

        pnlPrincipal.add(pnlCentral);
        pnlCentral.setBounds(370, 180, 700, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        Configuracion actividad = new Configuracion(estudiante);
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

    private void btnEstadisticasLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasLActionPerformed

    }//GEN-LAST:event_btnEstadisticasLActionPerformed

    private void btnConfiguracionLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfiguracionLActionPerformed

    private void btnActividadesLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadesLActionPerformed
        Configuracion actividad = new Configuracion(estudiante);
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActividadesLActionPerformed

    private void btnCronometroLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCronometroLActionPerformed
        Cronometro Cronometro = new Cronometro(estudiante);
        Cronometro.setVisible(true);
        Cronometro.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCronometroLActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Actividad2 actividad2 = new Actividad2(estudiante);
        actividad2.setVisible(true);
        actividad2.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void lblGuardar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardar2MouseClicked
        Actualizar actualizar = new Actualizar(estudiante);
        actualizar.setVisible(true);
        actualizar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lblGuardar2MouseClicked

    private void lblGuardar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardar2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblGuardar2MouseEntered

    private void lblGuardar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardar2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblGuardar2MouseExited

    private void pnlBoton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBoton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlBoton2MouseClicked

    private void pnlBoton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBoton2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlBoton2MouseEntered

    private void pnlBoton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBoton2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlBoton2MouseExited

    private void lblGuardar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardar3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblGuardar3MouseClicked

    private void lblGuardar3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardar3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblGuardar3MouseEntered

    private void lblGuardar3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardar3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblGuardar3MouseExited

    private void pnlBoton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBoton3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlBoton3MouseClicked

    private void pnlBoton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBoton3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlBoton3MouseEntered

    private void pnlBoton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBoton3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlBoton3MouseExited

    private void lblGuardar4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardar4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblGuardar4MouseClicked

    private void lblGuardar4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardar4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblGuardar4MouseEntered

    private void lblGuardar4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGuardar4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblGuardar4MouseExited

    private void pnlBoton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBoton4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlBoton4MouseClicked

    private void pnlBoton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBoton4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlBoton4MouseEntered

    private void pnlBoton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlBoton4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlBoton4MouseExited

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActividades;
    private javax.swing.JButton btnActividadesL;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnConfiguracionL;
    private javax.swing.JButton btnCronometro;
    private javax.swing.JButton btnCronometroL;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnEstadisticasL;
    private javax.swing.JButton btnHorario;
    private javax.swing.JButton btnMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblGuardar2;
    private javax.swing.JLabel lblGuardar3;
    private javax.swing.JLabel lblGuardar4;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblNombreAsignatura;
    private javax.swing.JLabel lblNombreAsignatura1;
    private javax.swing.JLabel lblNombreAsignatura2;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JPanel pnlBoton2;
    private javax.swing.JPanel pnlBoton3;
    private javax.swing.JPanel pnlBoton4;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlHead;
    private javax.swing.JPanel pnlMenulargo;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables


    
    
}

