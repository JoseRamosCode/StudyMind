 
package com.mycompany.studymind.igu;

import java.awt.Color;



 
public class Plantilla extends javax.swing.JFrame {

    
    public Plantilla() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblMenu = new javax.swing.JLabel();
        lblMaterias = new javax.swing.JLabel();
        lblJuegos = new javax.swing.JLabel();
        lblEstadistica = new javax.swing.JLabel();
        lblConfiguraciones = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 700));
        jPanel1.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(82, 109, 130));

        jLabel6.setBackground(new java.awt.Color(0, 102, 102));
        jLabel6.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("StudyMind");

        jLabel7.setBackground(new java.awt.Color(0, 102, 102));
        jLabel7.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Usuario");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 660, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(99, 99, 99))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6);
        jPanel6.setBounds(0, -10, 1100, 100);

        jPanel7.setBackground(new java.awt.Color(221, 230, 237));
        jPanel7.setLayout(null);

        lblMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\joser\\OneDrive\\Documentos\\NetBeansProjects\\StudyMind\\Icon\\square-menu_icon-icons.com_69888.png")); // NOI18N
        lblMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMenuMouseExited(evt);
            }
        });
        jPanel7.add(lblMenu);
        lblMenu.setBounds(20, 10, 50, 50);

        lblMaterias.setIcon(new javax.swing.ImageIcon("C:\\Users\\joser\\OneDrive\\Documentos\\NetBeansProjects\\StudyMind\\Icon\\read_book_study_icon-icons.com_51077.png")); // NOI18N
        jPanel7.add(lblMaterias);
        lblMaterias.setBounds(20, 170, 50, 40);

        lblJuegos.setIcon(new javax.swing.ImageIcon("C:\\Users\\joser\\OneDrive\\Documentos\\NetBeansProjects\\StudyMind\\Icon\\google_games_icon_131690.png")); // NOI18N
        jPanel7.add(lblJuegos);
        lblJuegos.setBounds(20, 240, 50, 50);

        lblEstadistica.setIcon(new javax.swing.ImageIcon("C:\\Users\\joser\\OneDrive\\Documentos\\NetBeansProjects\\StudyMind\\Icon\\business_diagram_report_analytics_statistics_graph_statistic_icon_226217.png")); // NOI18N
        jPanel7.add(lblEstadistica);
        lblEstadistica.setBounds(20, 320, 50, 50);

        lblConfiguraciones.setIcon(new javax.swing.ImageIcon("C:\\Users\\joser\\OneDrive\\Documentos\\NetBeansProjects\\StudyMind\\Icon\\iconfinder-settings-4341324_120534.png")); // NOI18N
        lblConfiguraciones.setText(" ");
        jPanel7.add(lblConfiguraciones);
        lblConfiguraciones.setBounds(20, 400, 50, 50);

        jPanel1.add(jPanel7);
        jPanel7.setBounds(0, 90, 90, 620);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_lblMenuMouseClicked

    private void lblMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseEntered
        lblMenu.setBackground(new Color(100, 150, 255));
    }//GEN-LAST:event_lblMenuMouseEntered

    private void lblMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuMouseExited
        // TODO add your handling code here:
        lblMenu.setBackground(new Color(60, 120, 200));
    }//GEN-LAST:event_lblMenuMouseExited

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblConfiguraciones;
    private javax.swing.JLabel lblEstadistica;
    private javax.swing.JLabel lblJuegos;
    private javax.swing.JLabel lblMaterias;
    private javax.swing.JLabel lblMenu;
    // End of variables declaration//GEN-END:variables


    
    
}

