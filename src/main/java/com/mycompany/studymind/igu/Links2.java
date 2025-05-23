 
package com.mycompany.studymind.igu;

import com.mycompany.studymind.igu.Links;
import com.mycompany.studymind.igu.Horario;
import com.mycompany.studymind.igu.Cronometro;
import com.mycompany.studymind.igu.Actividad;
import java.awt.Color;
import java.util.Random;



 
public class Links2 extends javax.swing.JFrame {

    
    public Links2() {
          initComponents();

        jButton1.setBackground(new java.awt.Color(82, 109, 130));
        jButton1.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("INGRESA AQUI PARA ACCEDER AL JUEGO");

        // Añadir el ActionListener para el botón
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirLinkAleatorio();  // Llamar al método para abrir un enlace aleatorio
            }
        });
    }

        private void abrirLinkAleatorio() {
        // Definir los tres enlaces posibles
        String[] links = {
            "https://www.cokitos.com/blinky-tablas-de-multiplicar/play/",
            "https://www.cokitos.com/problemas-matematicos/play/",
            "https://www.cokitos.com/monos-matematicos-tablas-de-multiplicar/play/",
                "https://www.cokitos.com/blinky-tablas-de-multiplicar/play/",
"https://www.cokitos.com/problemas-matematicos/play/",
"https://www.cokitos.com/monos-matematicos-tablas-de-multiplicar/play/",
"https://www.youtube.com/channel/UCrMjO627KgknV0CO1RoGAEQ/featured?view_as=subscriber",
"https://www.cokitos.com/ranas-saltarinas-logica/play/",
"https://www.cokitos.com/acertijos-de-cruzar-el-rio/play/",
"https://www.cokitos.com/desafio-matematico-sistema-de-ecuaciones/play/",
"https://www.cokitos.com/dibujos-en-3d/play/",
"https://www.cokitos.com/juego-dificil-de-habilidad/play/",
"https://www.cokitos.com/rellenar-ajedrez/play/",
"https://www.cokitos.com/rebota-la-pelota/play/",
"https://www.cokitos.com/problemas-de-reflexion-de-la-luz-en-espejos/play/",
"https://www.cokitos.com/cuadricula-de-tangram/play/",
"https://www.cokitos.com/tangram-para-adultos/play/",
"https://www.cokitos.com/rompecabezas-logico/play/",
"https://www.cokitos.com/pentominos-online/play/",
"https://www.cokitos.com/tangram-de-animales/play/",
"https://www.cokitos.com/encerrar-al-cerdo/play/",
"https://www.cokitos.com/encerrar-al-raton/play/",
"https://www.cokitos.com/escape-logico/play/",
"https://www.cokitos.com/simon-says/play/",
"https://www.cokitos.com/memoria-visual/play/",
"https://www.cokitos.com/patron-de-memoria/play/",
"https://www.cokitos.com/test-de-memoria-visual-y-atencion/play/",
"https://www.cokitos.com/memotest/play/",
"https://www.cokitos.com/kobadoo-memorizar-numeros/play/",
"https://www.cokitos.com/juego-crear-y-memorizar-la-secuencia/",
"https://www.cokitos.com/desafios-de-memoria/play/",
"https://www.cokitos.com/memory-de-colores/play/",
"https://www.cokitos.com/simon-dice-multijugador/play/",
"https://www.cokitos.com/desbloquear-los-barcos-puzzle-logico/play/",
"https://www.cokitos.com/desbloquear-el-regalo-de-navidad/play/",

        };

        // Crear un objeto Random para seleccionar un enlace aleatorio
        Random rand = new Random();
        int index = rand.nextInt(links.length);  // Generar un número aleatorio entre 0 y el tamaño del arreglo

        // Obtener el enlace aleatorio
        String enlaceAleatorio = links[index];

        try {
            // Abrir el enlace en el navegador
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(enlaceAleatorio));
        } catch (java.io.IOException e) {
            e.printStackTrace();  // Manejo de errores
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlCentral = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
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
        btnHorarioL2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnActividadesL2 = new javax.swing.JButton();
        btnCronometroL2 = new javax.swing.JButton();
        btnMenu2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setBackground(new java.awt.Color(221, 230, 237));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(1100, 700));
        pnlPrincipal.setLayout(null);

        pnlCentral.setBackground(new java.awt.Color(157, 178, 191));

        jLabel2.setBackground(new java.awt.Color(240, 245, 250));
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\cloai\\OneDrive\\Escritorio\\Studymind\\StudyMind\\Icon\\Baymax con mariposa(1)(1).png")); // NOI18N

        lblMensaje.setFont(new java.awt.Font("Roboto Condensed Black", 0, 36)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(255, 255, 255));
        lblMensaje.setText("Se ha generado la actividad con exito.");

        jButton1.setBackground(new java.awt.Color(82, 109, 130));
        jButton1.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("INGRESA AQUI PARA ACCEDER AL JUEGO");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCentralLayout = new javax.swing.GroupLayout(pnlCentral);
        pnlCentral.setLayout(pnlCentralLayout);
        pnlCentralLayout.setHorizontalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentralLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblMensaje)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCentralLayout.setVerticalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addComponent(lblMensaje)
                .addGap(34, 34, 34)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentralLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))))
        );

        pnlPrincipal.add(pnlCentral);
        pnlCentral.setBounds(370, 180, 700, 470);

        pnlHead.setBackground(new java.awt.Color(82, 109, 130));

        lblUsuario.setBackground(new java.awt.Color(0, 102, 102));
        lblUsuario.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setText("Usuario");
        lblUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblLogotipo.setBackground(new java.awt.Color(0, 102, 102));
        lblLogotipo.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        lblLogotipo.setForeground(new java.awt.Color(255, 255, 255));
        lblLogotipo.setIcon(new javax.swing.ImageIcon("C:\\Users\\cloai\\OneDrive\\Escritorio\\Studymind\\StudyMind\\Icon\\logotipo.png")); // NOI18N

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

        pnlMenulargo2.setBackground(new java.awt.Color(157, 178, 191));
        pnlMenulargo2.setLayout(null);

        btnCronometro2.setBackground(new java.awt.Color(157, 178, 191));
        btnCronometro2.setIcon(new javax.swing.ImageIcon("C:\\Users\\cloai\\OneDrive\\Escritorio\\Studymind\\StudyMind\\Icon\\cronometro1.png")); // NOI18N
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

        btnActividades2.setBackground(new java.awt.Color(221, 230, 237));
        btnActividades2.setIcon(new javax.swing.ImageIcon("C:\\Users\\cloai\\OneDrive\\Escritorio\\Studymind\\StudyMind\\Icon\\actividad.png")); // NOI18N
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
        btnEstadisticas2.setIcon(new javax.swing.ImageIcon("C:\\Users\\cloai\\OneDrive\\Escritorio\\Studymind\\StudyMind\\Icon\\estadistico.png")); // NOI18N
        btnEstadisticas2.setBorder(null);
        btnEstadisticas2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstadisticas2.setFocusPainted(false);
        pnlMenulargo2.add(btnEstadisticas2);
        btnEstadisticas2.setBounds(20, 420, 52, 49);

        btnConfiguracion2.setBackground(new java.awt.Color(157, 178, 191));
        btnConfiguracion2.setIcon(new javax.swing.ImageIcon("C:\\Users\\cloai\\OneDrive\\Escritorio\\Studymind\\StudyMind\\Icon\\configuracion.png")); // NOI18N
        btnConfiguracion2.setBorder(null);
        btnConfiguracion2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguracion2.setFocusPainted(false);
        pnlMenulargo2.add(btnConfiguracion2);
        btnConfiguracion2.setBounds(20, 520, 52, 49);

        btnHorario2.setBackground(new java.awt.Color(157, 178, 191));
        btnHorario2.setIcon(new javax.swing.ImageIcon("C:\\Users\\cloai\\OneDrive\\Escritorio\\Studymind\\StudyMind\\Icon\\horario.png")); // NOI18N
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

        btnHorarioL2.setBackground(new java.awt.Color(157, 178, 191));
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
        pnlMenulargo2.add(btnHorarioL2);
        btnHorarioL2.setBounds(80, 160, 120, 24);

        jPanel5.setBackground(new java.awt.Color(221, 230, 237));

        btnActividadesL2.setBackground(new java.awt.Color(221, 230, 237));
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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(btnActividadesL2)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnActividadesL2)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pnlMenulargo2.add(jPanel5);
        jPanel5.setBounds(0, 320, 210, 90);

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
        btnMenu2.setIcon(new javax.swing.ImageIcon("C:\\Users\\cloai\\OneDrive\\Escritorio\\Studymind\\StudyMind\\Icon\\menu.png")); // NOI18N
        btnMenu2.setBorder(null);
        btnMenu2.setFocusPainted(false);
        btnMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenu2ActionPerformed(evt);
            }
        });
        pnlMenulargo2.add(btnMenu2);
        btnMenu2.setBounds(20, 10, 45, 45);

        pnlPrincipal.add(pnlMenulargo2);
        pnlMenulargo2.setBounds(0, 100, 210, 600);

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCronometroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCronometroActionPerformed
        Cronometro Cronometro = new Cronometro();
        Cronometro.setVisible(true);
        Cronometro.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCronometroActionPerformed

    private void btnActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadesActionPerformed
        Actividad actividad = new Actividad();
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActividadesActionPerformed

    private void btnHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorarioActionPerformed
        Horario Horario = new Horario();
        Horario.setVisible(true);
        Horario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnHorarioActionPerformed

    private void btnEstadisticasLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasLActionPerformed

    }//GEN-LAST:event_btnEstadisticasLActionPerformed

    private void btnConfiguracionLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfiguracionLActionPerformed

    private void btnHorarioLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorarioLActionPerformed
        Horario Horario = new Horario();
        Horario.setVisible(true);
        Horario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnHorarioLActionPerformed

    private void btnActividadesLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadesLActionPerformed
        Actividad actividad = new Actividad();
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActividadesLActionPerformed

    private void btnCronometroLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCronometroLActionPerformed
        Cronometro Cronometro = new Cronometro();
        Cronometro.setVisible(true);
        Cronometro.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCronometroLActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Actividad actividad = new Actividad();
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnCronometro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCronometro2ActionPerformed
        Cronometro Cronometro = new Cronometro();
        Cronometro.setVisible(true);
        Cronometro.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCronometro2ActionPerformed

    private void btnActividades2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividades2ActionPerformed
        Actividad actividad = new Actividad();
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActividades2ActionPerformed

    private void btnHorario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorario2ActionPerformed
        Horario Horario = new Horario();
        Horario.setVisible(true);
        Horario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnHorario2ActionPerformed

    private void btnEstadisticasL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasL2ActionPerformed

    }//GEN-LAST:event_btnEstadisticasL2ActionPerformed

    private void btnConfiguracionL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionL2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfiguracionL2ActionPerformed

    private void btnHorarioL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorarioL2ActionPerformed
        Horario Horario = new Horario();
        Horario.setVisible(true);
        Horario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnHorarioL2ActionPerformed

    private void btnActividadesL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadesL2ActionPerformed
        Actividad actividad = new Actividad();
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActividadesL2ActionPerformed

    private void btnCronometroL2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCronometroL2ActionPerformed
        Cronometro Cronometro = new Cronometro();
        Cronometro.setVisible(true);
        Cronometro.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCronometroL2ActionPerformed

    private void btnMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu2ActionPerformed
        Actividad actividad = new Actividad();
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMenu2ActionPerformed

    
    

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
    private javax.swing.JButton btnHorario;
    private javax.swing.JButton btnHorario2;
    private javax.swing.JButton btnHorarioL;
    private javax.swing.JButton btnHorarioL2;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnMenu2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlHead;
    private javax.swing.JPanel pnlMenulargo;
    private javax.swing.JPanel pnlMenulargo2;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables


    
    
}

