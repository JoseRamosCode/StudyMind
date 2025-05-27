package com.mycompany.studymind.igu;

import com.mycompany.studymind.igu.Horario;
import com.mycompany.studymind.igu.Cronometro;
import com.mycompany.studymind.igu.Actividad;
import com.mycompany.studymind.logica.Estudiante;
import com.mycompany.studymind.logica.Materia;
import com.mycompany.studymind.logica.MenuUsuario;
import java.awt.Color;
import java.util.Random;

public class Links extends javax.swing.JFrame {

    private Estudiante estudiante;
    private Materia materia;

    public Links(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.materia = materia;
        initComponents();
        MenuUsuario.aplicarMenu(lblUsuario, this, estudiante);
        lblUsuario.setText(estudiante.getNombre());

        btnAccederLinks.setBackground(new java.awt.Color(82, 109, 130));
        btnAccederLinks.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        btnAccederLinks.setForeground(new java.awt.Color(255, 255, 255));
        btnAccederLinks.setText("INGRESA AQUI PARA ACCEDER AL JUEGO");

        btnAccederLinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirLinkAleatorio();
            }
        });
    }

    private void abrirLinkAleatorio() {

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
            "https://www.cokitos.com/desbloquear-el-regalo-de-navidad/play/",};

        Random rand = new Random();
        int index = rand.nextInt(links.length);

        String enlaceAleatorio = links[index];

        try {

            java.awt.Desktop.getDesktop().browse(java.net.URI.create(enlaceAleatorio));
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlCentral = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        lblMensaje = new javax.swing.JLabel();
        btnAccederLinks = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        pnlMenulargo1 = new javax.swing.JPanel();
        btnEstadisticas1 = new javax.swing.JButton();
        btnConfiguracion1 = new javax.swing.JButton();
        btnHorario1 = new javax.swing.JButton();
        btnMenu1 = new javax.swing.JButton();
        btnActividades1 = new javax.swing.JButton();
        pnlCamuflado1 = new javax.swing.JPanel();
        pnlHead = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblLogotipo = new javax.swing.JLabel();
        lblIconoUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPrincipal.setBackground(new java.awt.Color(221, 230, 237));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(1100, 700));
        pnlPrincipal.setLayout(null);

        pnlCentral.setBackground(new java.awt.Color(157, 178, 191));

        lblImagen.setBackground(new java.awt.Color(240, 245, 250));

        lblMensaje.setFont(new java.awt.Font("Roboto Condensed Black", 0, 36)); // NOI18N
        lblMensaje.setForeground(new java.awt.Color(255, 255, 255));
        lblMensaje.setText("Se ha generado la actividad con exito.");

        btnAccederLinks.setBackground(new java.awt.Color(82, 109, 130));
        btnAccederLinks.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        btnAccederLinks.setForeground(new java.awt.Color(255, 255, 255));
        btnAccederLinks.setText("INGRESA AQUI PARA ACCEDER AL JUEGO");
        btnAccederLinks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAccederLinks.setFocusPainted(false);
        btnAccederLinks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederLinksActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Baymax con mariposa(1)(1).png"))); // NOI18N

        javax.swing.GroupLayout pnlCentralLayout = new javax.swing.GroupLayout(pnlCentral);
        pnlCentral.setLayout(pnlCentralLayout);
        pnlCentralLayout.setHorizontalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addContainerGap(379, Short.MAX_VALUE)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addComponent(btnAccederLinks, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27))
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addComponent(lblMensaje)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlCentralLayout.setVerticalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(lblMensaje)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentralLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAccederLinks, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)))
                .addComponent(lblImagen))
        );

        pnlPrincipal.add(pnlCentral);
        pnlCentral.setBounds(370, 180, 700, 470);

        pnlMenulargo1.setBackground(new java.awt.Color(157, 178, 191));
        pnlMenulargo1.setLayout(null);

        btnEstadisticas1.setBackground(new java.awt.Color(157, 178, 191));
        btnEstadisticas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/estadistico.png"))); // NOI18N
        btnEstadisticas1.setBorder(null);
        btnEstadisticas1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstadisticas1.setFocusPainted(false);
        btnEstadisticas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticas1ActionPerformed(evt);
            }
        });
        pnlMenulargo1.add(btnEstadisticas1);
        btnEstadisticas1.setBounds(20, 400, 52, 49);

        btnConfiguracion1.setBackground(new java.awt.Color(157, 178, 191));
        btnConfiguracion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/conf45.png"))); // NOI18N
        btnConfiguracion1.setBorder(null);
        btnConfiguracion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguracion1.setFocusPainted(false);
        btnConfiguracion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracion1ActionPerformed(evt);
            }
        });
        pnlMenulargo1.add(btnConfiguracion1);
        btnConfiguracion1.setBounds(20, 500, 52, 49);

        btnHorario1.setBackground(new java.awt.Color(157, 178, 191));
        btnHorario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/horario.png"))); // NOI18N
        btnHorario1.setBorder(null);
        btnHorario1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHorario1.setFocusPainted(false);
        btnHorario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorario1ActionPerformed(evt);
            }
        });
        pnlMenulargo1.add(btnHorario1);
        btnHorario1.setBounds(20, 190, 52, 49);

        btnMenu1.setBackground(new java.awt.Color(157, 178, 191));
        btnMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/menu45.png"))); // NOI18N
        btnMenu1.setBorder(null);
        btnMenu1.setFocusPainted(false);
        btnMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenu1ActionPerformed(evt);
            }
        });
        pnlMenulargo1.add(btnMenu1);
        btnMenu1.setBounds(20, 10, 45, 45);

        btnActividades1.setBackground(new java.awt.Color(221, 230, 237));
        btnActividades1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actividad.png"))); // NOI18N
        btnActividades1.setBorder(null);
        btnActividades1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActividades1.setFocusPainted(false);
        btnActividades1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActividades1ActionPerformed(evt);
            }
        });
        pnlMenulargo1.add(btnActividades1);
        btnActividades1.setBounds(20, 300, 52, 60);

        pnlCamuflado1.setBackground(new java.awt.Color(221, 230, 237));

        javax.swing.GroupLayout pnlCamuflado1Layout = new javax.swing.GroupLayout(pnlCamuflado1);
        pnlCamuflado1.setLayout(pnlCamuflado1Layout);
        pnlCamuflado1Layout.setHorizontalGroup(
            pnlCamuflado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        pnlCamuflado1Layout.setVerticalGroup(
            pnlCamuflado1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        pnlMenulargo1.add(pnlCamuflado1);
        pnlCamuflado1.setBounds(0, 280, 90, 90);

        pnlPrincipal.add(pnlMenulargo1);
        pnlMenulargo1.setBounds(0, 100, 90, 600);

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

    private void btnAccederLinksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederLinksActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAccederLinksActionPerformed

    private void btnEstadisticas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticas1ActionPerformed
        Estadistico configuracion = new Estadistico(estudiante);
        configuracion.setVisible(true);
        configuracion.pack();
        configuracion.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnEstadisticas1ActionPerformed

    private void btnConfiguracion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracion1ActionPerformed
        Configuracion configuracion = new Configuracion(estudiante);
        configuracion.setVisible(true);
        configuracion.pack();
        configuracion.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnConfiguracion1ActionPerformed

    private void btnHorario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorario1ActionPerformed
        Horario Horario = new Horario(estudiante);
        Horario.setVisible(true);
        Horario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnHorario1ActionPerformed

    private void btnMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu1ActionPerformed
        Links links2 = new Links(estudiante);
        links2.setVisible(true);
        links2.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMenu1ActionPerformed

    private void btnActividades1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividades1ActionPerformed
        Actividad actividad = new Actividad(estudiante);
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActividades1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccederLinks;
    private javax.swing.JButton btnActividades1;
    private javax.swing.JButton btnConfiguracion1;
    private javax.swing.JButton btnEstadisticas1;
    private javax.swing.JButton btnHorario1;
    private javax.swing.JButton btnMenu1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblIconoUsuario;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JLabel lblMensaje;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlCamuflado1;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlHead;
    private javax.swing.JPanel pnlMenulargo1;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables

}
