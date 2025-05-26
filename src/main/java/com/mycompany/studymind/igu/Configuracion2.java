 
package com.mycompany.studymind.igu;

import com.mycompany.studymind.logica.Estudiante;
import java.awt.Color;
import java.awt.Dimension;



 
public class Configuracion2 extends javax.swing.JFrame {

    
    private Estudiante estudiante;

    
    public Configuracion2(Estudiante estudiante) {
        this.estudiante = estudiante;
    initComponents();
    lblUsuario.setText(estudiante.getNombre());
    lblUsuario1.setText(estudiante.getNombre());
    txtUsuario.setText(estudiante.getNombre());
    txtCorreo.setText(estudiante.getCorreo());
    txtCorreo.setPreferredSize(new Dimension(txtCorreo.getPreferredSize().width, txtCorreo.getPreferredSize().height));
    txtCorreo.setMaximumSize(new Dimension(Short.MAX_VALUE, Short.MAX_VALUE));
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
        jPanel4 = new javax.swing.JPanel();
        btnHorarioL = new javax.swing.JButton();
        btnCronometroL = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        pnlCamuflar = new javax.swing.JPanel();
        btnConfiguracionL = new javax.swing.JButton();
        btnActividadesL = new javax.swing.JButton();
        pnlCentral = new javax.swing.JPanel();
        lblMensaje = new javax.swing.JLabel();
        lblUsuario1 = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblContrasenia = new javax.swing.JLabel();
        btnActualizar1 = new javax.swing.JPanel();
        btnActualizar12 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JLabel();
        btnActualizar2 = new javax.swing.JPanel();
        btnActualizar22 = new javax.swing.JLabel();
        btnActualizar3 = new javax.swing.JPanel();
        btnActualizar33 = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JPasswordField();

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 466, Short.MAX_VALUE)
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
        pnlHead.setBounds(0, 0, 1120, 100);

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
        btnActividades.setBounds(20, 330, 52, 60);

        btnEstadisticas.setBackground(new java.awt.Color(157, 178, 191));
        btnEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/estadistico.png"))); // NOI18N
        btnEstadisticas.setBorder(null);
        btnEstadisticas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstadisticas.setFocusPainted(false);
        pnlMenulargo.add(btnEstadisticas);
        btnEstadisticas.setBounds(20, 420, 52, 49);

        btnConfiguracion.setBackground(new java.awt.Color(221, 230, 237));
        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/configuracion.png"))); // NOI18N
        btnConfiguracion.setBorder(null);
        btnConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguracion.setFocusPainted(false);
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });
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

        jPanel4.setBackground(new java.awt.Color(157, 178, 191));

        btnHorarioL.setBackground(new java.awt.Color(157, 178, 191));
        btnHorarioL.setFont(new java.awt.Font("Roboto Medium", 2, 20)); // NOI18N
        btnHorarioL.setForeground(new java.awt.Color(255, 255, 255));
        btnHorarioL.setText("Horario");
        btnHorarioL.setBorder(null);
        btnHorarioL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHorarioL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorarioLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(btnHorarioL, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnHorarioL)
                .addContainerGap(34, Short.MAX_VALUE))
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
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/menu (1).png"))); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.setFocusPainted(false);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        pnlMenulargo.add(btnMenu);
        btnMenu.setBounds(20, 10, 45, 45);

        pnlCamuflar.setBackground(new java.awt.Color(221, 230, 237));

        btnConfiguracionL.setBackground(new java.awt.Color(221, 230, 237));
        btnConfiguracionL.setFont(new java.awt.Font("Roboto Medium", 2, 20)); // NOI18N
        btnConfiguracionL.setForeground(new java.awt.Color(255, 255, 255));
        btnConfiguracionL.setText("Ajustes");
        btnConfiguracionL.setBorder(null);
        btnConfiguracionL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCamuflarLayout = new javax.swing.GroupLayout(pnlCamuflar);
        pnlCamuflar.setLayout(pnlCamuflarLayout);
        pnlCamuflarLayout.setHorizontalGroup(
            pnlCamuflarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCamuflarLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(btnConfiguracionL, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        pnlCamuflarLayout.setVerticalGroup(
            pnlCamuflarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCamuflarLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnConfiguracionL)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pnlMenulargo.add(pnlCamuflar);
        pnlCamuflar.setBounds(0, 510, 230, 90);

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
        btnActividadesL.setBounds(100, 350, 101, 24);

        pnlPrincipal.add(pnlMenulargo);
        pnlMenulargo.setBounds(0, 100, 230, 600);

        pnlCentral.setBackground(new java.awt.Color(157, 178, 191));

        lblMensaje.setFont(new java.awt.Font("Roboto Condensed Black", 0, 36)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(255, 255, 255));
        lblMensaje.setText("¿Tienes un cambio en mente?");

        lblUsuario1.setFont(new java.awt.Font("Roboto Condensed", 3, 18)); // NOI18N
        lblUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario1.setText("Usuario:");

        lblCorreo.setFont(new java.awt.Font("Roboto Condensed", 3, 18)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setText("Correo:");

        lblContrasenia.setFont(new java.awt.Font("Roboto Condensed", 3, 18)); // NOI18N
        lblContrasenia.setForeground(new java.awt.Color(255, 255, 255));
        lblContrasenia.setText("Contraseña:");

        btnActualizar1.setBackground(new java.awt.Color(82, 109, 130));
        btnActualizar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizar1MouseExited(evt);
            }
        });

        btnActualizar12.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        btnActualizar12.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar12.setText("Actualizar");
        btnActualizar12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizar12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizar12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizar12MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnActualizar1Layout = new javax.swing.GroupLayout(btnActualizar1);
        btnActualizar1.setLayout(btnActualizar1Layout);
        btnActualizar1Layout.setHorizontalGroup(
            btnActualizar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizar1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnActualizar12)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        btnActualizar1Layout.setVerticalGroup(
            btnActualizar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizar1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnActualizar12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtUsuario.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setText("usuario");

        txtCorreo.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setText("correo");

        btnActualizar2.setBackground(new java.awt.Color(82, 109, 130));
        btnActualizar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizar2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizar2MouseExited(evt);
            }
        });

        btnActualizar22.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        btnActualizar22.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar22.setText("Actualizar");
        btnActualizar22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizar22MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizar22MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizar22MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnActualizar2Layout = new javax.swing.GroupLayout(btnActualizar2);
        btnActualizar2.setLayout(btnActualizar2Layout);
        btnActualizar2Layout.setHorizontalGroup(
            btnActualizar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizar2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnActualizar22)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        btnActualizar2Layout.setVerticalGroup(
            btnActualizar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizar2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnActualizar22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnActualizar3.setBackground(new java.awt.Color(82, 109, 130));
        btnActualizar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizar3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizar3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizar3MouseExited(evt);
            }
        });

        btnActualizar33.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        btnActualizar33.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar33.setText("Actualizar");
        btnActualizar33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActualizar33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizar33MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizar33MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizar33MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnActualizar3Layout = new javax.swing.GroupLayout(btnActualizar3);
        btnActualizar3.setLayout(btnActualizar3Layout);
        btnActualizar3Layout.setHorizontalGroup(
            btnActualizar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizar3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(btnActualizar33)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        btnActualizar3Layout.setVerticalGroup(
            btnActualizar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnActualizar3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnActualizar33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtContrasenia.setBackground(new java.awt.Color(157, 178, 191));
        txtContrasenia.setForeground(new java.awt.Color(255, 255, 255));
        txtContrasenia.setText("jPasswordField1");
        txtContrasenia.setBorder(null);

        javax.swing.GroupLayout pnlCentralLayout = new javax.swing.GroupLayout(pnlCentral);
        pnlCentral.setLayout(pnlCentralLayout);
        pnlCentralLayout.setHorizontalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMensaje)
                            .addGroup(pnlCentralLayout.createSequentialGroup()
                                .addComponent(lblContrasenia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 163, Short.MAX_VALUE))
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnActualizar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCentralLayout.createSequentialGroup()
                                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsuario1)
                                    .addComponent(lblCorreo))
                                .addGap(18, 18, 18)
                                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlCentralLayout.createSequentialGroup()
                                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(100, 100, 100))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentralLayout.createSequentialGroup()
                                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnActualizar2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlCentralLayout.setVerticalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblMensaje)
                .addGap(74, 74, 74)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblUsuario1)
                        .addComponent(txtUsuario))
                    .addComponent(btnActualizar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCorreo)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnActualizar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblContrasenia)
                        .addComponent(txtContrasenia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnActualizar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(178, Short.MAX_VALUE))
        );

        pnlPrincipal.add(pnlCentral);
        pnlCentral.setBounds(370, 180, 700, 470);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1106, Short.MAX_VALUE)
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

    private void btnEstadisticasLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasLActionPerformed

    }//GEN-LAST:event_btnEstadisticasLActionPerformed

    private void btnConfiguracionLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionLActionPerformed
        Configuracion configuracion = new Configuracion(estudiante);
        configuracion.setVisible(true);
        configuracion.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnConfiguracionLActionPerformed

    private void btnActividadesLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadesLActionPerformed
        Actividad actividad = new Actividad(estudiante);
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
        Configuracion configuracion = new Configuracion(estudiante);
        configuracion.setVisible(true);
        configuracion.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        Configuracion configuracion = new Configuracion(estudiante);  
        configuracion.setVisible(true);    
        configuracion.pack();               
        configuracion.setLocationRelativeTo(null);  
        this.dispose();
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnActualizar12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar12MouseClicked
        ActualizarUsuario actualizar = new ActualizarUsuario(estudiante);
        actualizar.setVisible(true);
        actualizar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActualizar12MouseClicked

    private void btnActualizar12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar12MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar12MouseEntered

    private void btnActualizar12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar12MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar12MouseExited

    private void btnActualizar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar1MouseClicked
        ActualizarUsuario actualizar = new ActualizarUsuario(estudiante);
        actualizar.setVisible(true);
        actualizar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActualizar1MouseClicked

    private void btnActualizar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar1MouseEntered

    private void btnActualizar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar1MouseExited

    private void btnActualizar22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar22MouseClicked
        ActualizarCorreo actualizar = new ActualizarCorreo(estudiante);
        actualizar.setVisible(true);
        actualizar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActualizar22MouseClicked

    private void btnActualizar22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar22MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar22MouseEntered

    private void btnActualizar22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar22MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar22MouseExited

    private void btnActualizar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar2MouseClicked
        ActualizarCorreo actualizar = new ActualizarCorreo(estudiante);
        actualizar.setVisible(true);
        actualizar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActualizar2MouseClicked

    private void btnActualizar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar2MouseEntered

    private void btnActualizar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar2MouseExited

    private void btnActualizar33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar33MouseClicked
        ActualizarContrasenia actualizar = new ActualizarContrasenia(estudiante);
        actualizar.setVisible(true);
        actualizar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActualizar33MouseClicked

    private void btnActualizar33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar33MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar33MouseEntered

    private void btnActualizar33MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar33MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar33MouseExited

    private void btnActualizar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar3MouseClicked
        ActualizarUsuario actualizar = new ActualizarUsuario(estudiante);
        actualizar.setVisible(true);
        actualizar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActualizar3MouseClicked

    private void btnActualizar3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar3MouseEntered

    private void btnActualizar3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar3MouseExited

    private void btnHorarioLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorarioLActionPerformed
        Horario horario = new Horario(estudiante);
        horario.setVisible(true);
        horario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnHorarioLActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActividades;
    private javax.swing.JButton btnActividadesL;
    private javax.swing.JPanel btnActualizar1;
    private javax.swing.JLabel btnActualizar12;
    private javax.swing.JPanel btnActualizar2;
    private javax.swing.JLabel btnActualizar22;
    private javax.swing.JPanel btnActualizar3;
    private javax.swing.JLabel btnActualizar33;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnConfiguracionL;
    private javax.swing.JButton btnCronometro;
    private javax.swing.JButton btnCronometroL;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnEstadisticasL;
    private javax.swing.JButton btnHorario;
    private javax.swing.JButton btnHorarioL;
    private javax.swing.JButton btnMenu;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JPanel pnlCamuflar;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlHead;
    private javax.swing.JPanel pnlMenulargo;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JLabel txtCorreo;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables


    
    
}

