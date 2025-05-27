package com.mycompany.studymind.igu;

import com.mycompany.studymind.logica.Controladora;
import com.mycompany.studymind.logica.Estudiante;
import com.mycompany.studymind.logica.Materia;
import com.mycompany.studymind.logica.MenuUsuario;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Horario2 extends javax.swing.JFrame {

    private Estudiante estudiante;
    private Controladora control = new Controladora();
    private Materia materia;

    public Horario2(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.materia = materia;
        initComponents();
        MenuUsuario.aplicarMenu(lblUsuario, this, estudiante);
        lblUsuario.setText(estudiante.getNombre());

        configurarTabla();
        cargarMateriasDelEstudiante();
        estilizarTabla();

        this.pack();
    }

    private void estilizarTabla() {

        jTable1.getTableHeader().setFont(new java.awt.Font("Roboto", java.awt.Font.BOLD, 16));
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(new java.awt.Color(82, 109, 130));
        jTable1.getTableHeader().setForeground(java.awt.Color.WHITE);

        jTable1.setFont(new java.awt.Font("Roboto", java.awt.Font.PLAIN, 14));
        jTable1.setRowHeight(28);

        javax.swing.table.DefaultTableCellRenderer centrado = new javax.swing.table.DefaultTableCellRenderer();
        centrado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setCellRenderer(centrado);
        }

        javax.swing.table.DefaultTableCellRenderer renderPersonalizado = new javax.swing.table.DefaultTableCellRenderer() {
            @Override
            public java.awt.Component getTableCellRendererComponent(javax.swing.JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {

                java.awt.Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

                if (!isSelected) {
                    c.setBackground(new java.awt.Color(221, 230, 237)); // ✅ tu color pastel
                } else {
                    c.setBackground(new java.awt.Color(182, 205, 222)); // ✅ seleccionado
                }

                return c;
            }
        };

        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setCellRenderer(renderPersonalizado);
        }

    }

    private void configurarTabla() {
        String[] columnas = {"Docente", "Materia", "Importancia"};

        javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(columnas, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        jTable1.setModel(modelo);
    }

    private void cargarMateriasDelEstudiante() {
        List<Materia> materias = control.obtenerMateriasDelEstudiante(estudiante);
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);

        for (Materia materia : materias) {
            Object[] fila = {
                materia.getDocente(),
                materia.getNombre(),
                materia.getImportancia()
            };
            modelo.addRow(fila);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        pnlCentral = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnLimpiar1 = new javax.swing.JButton();
        scrollMaterias = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEstudiar = new javax.swing.JButton();
        pnlMenulargo = new javax.swing.JPanel();
        btnEstadisticas = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();
        btnEstadisticasL = new javax.swing.JButton();
        btnConfiguracionL = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnActividades = new javax.swing.JButton();
        pnlCamuflado = new javax.swing.JPanel();
        btnCronometroL = new javax.swing.JButton();
        btnHorario = new javax.swing.JButton();
        btnActividadesL = new javax.swing.JButton();
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

        lblImagen.setBackground(new java.awt.Color(240, 245, 250));
        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Baymax.png"))); // NOI18N

        btnGuardar.setBackground(new java.awt.Color(82, 109, 130));
        btnGuardar.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Agregar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(82, 109, 130));
        btnLimpiar.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Actualizar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnLimpiar1.setBackground(new java.awt.Color(82, 109, 130));
        btnLimpiar1.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        btnLimpiar1.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar1.setText("Eliminar");
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(157, 178, 191));
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

        btnEstudiar.setBackground(new java.awt.Color(82, 109, 130));
        btnEstudiar.setFont(new java.awt.Font("Roboto Condensed", 0, 18)); // NOI18N
        btnEstudiar.setForeground(new java.awt.Color(255, 255, 255));
        btnEstudiar.setText("Estudiar");
        btnEstudiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstudiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCentralLayout = new javax.swing.GroupLayout(pnlCentral);
        pnlCentral.setLayout(pnlCentralLayout);
        pnlCentralLayout.setHorizontalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentralLayout.createSequentialGroup()
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(scrollMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEstudiar)))
                .addGap(47, 47, 47))
        );
        pnlCentralLayout.setVerticalGroup(
            pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCentralLayout.createSequentialGroup()
                .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagen)
                    .addGroup(pnlCentralLayout.createSequentialGroup()
                        .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCentralLayout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(btnEstudiar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCentralLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(scrollMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)))
                        .addGroup(pnlCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pnlPrincipal.add(pnlCentral);
        pnlCentral.setBounds(370, 180, 700, 470);

        pnlMenulargo.setBackground(new java.awt.Color(157, 178, 191));
        pnlMenulargo.setLayout(null);

        btnEstadisticas.setBackground(new java.awt.Color(157, 178, 191));
        btnEstadisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/estadistico.png"))); // NOI18N
        btnEstadisticas.setBorder(null);
        btnEstadisticas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstadisticas.setFocusPainted(false);
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasbtnEstadisticasActionPerformed(evt);
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
                btnConfiguracionbtnConfiguracionActionPerformed(evt);
            }
        });
        pnlMenulargo.add(btnConfiguracion);
        btnConfiguracion.setBounds(20, 500, 52, 49);

        btnEstadisticasL.setBackground(new java.awt.Color(157, 178, 191));
        btnEstadisticasL.setFont(new java.awt.Font("Roboto Medium", 2, 20)); // NOI18N
        btnEstadisticasL.setForeground(new java.awt.Color(255, 255, 255));
        btnEstadisticasL.setText("Estadisticas");
        btnEstadisticasL.setBorder(null);
        btnEstadisticasL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstadisticasL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasLbtnEstadisticasLActionPerformed(evt);
            }
        });
        pnlMenulargo.add(btnEstadisticasL);
        btnEstadisticasL.setBounds(100, 410, 120, 24);

        btnConfiguracionL.setBackground(new java.awt.Color(157, 178, 191));
        btnConfiguracionL.setFont(new java.awt.Font("Roboto Medium", 2, 20)); // NOI18N
        btnConfiguracionL.setForeground(new java.awt.Color(255, 255, 255));
        btnConfiguracionL.setText("Ajustes");
        btnConfiguracionL.setBorder(null);
        btnConfiguracionL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguracionL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionLbtnConfiguracionLActionPerformed(evt);
            }
        });
        pnlMenulargo.add(btnConfiguracionL);
        btnConfiguracionL.setBounds(90, 520, 130, 24);

        btnMenu.setBackground(new java.awt.Color(157, 178, 191));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/menu45.png"))); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.setFocusPainted(false);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenubtnMenuActionPerformed(evt);
            }
        });
        pnlMenulargo.add(btnMenu);
        btnMenu.setBounds(20, 10, 45, 45);

        btnActividades.setBackground(new java.awt.Color(157, 178, 191));
        btnActividades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actividad.png"))); // NOI18N
        btnActividades.setBorder(null);
        btnActividades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActividades.setFocusPainted(false);
        btnActividades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActividadesbtnActividadesActionPerformed(evt);
            }
        });
        pnlMenulargo.add(btnActividades);
        btnActividades.setBounds(20, 290, 52, 60);

        pnlCamuflado.setBackground(new java.awt.Color(221, 230, 237));

        btnCronometroL.setBackground(new java.awt.Color(221, 230, 237));
        btnCronometroL.setFont(new java.awt.Font("Roboto Medium", 2, 20)); // NOI18N
        btnCronometroL.setForeground(new java.awt.Color(255, 255, 255));
        btnCronometroL.setText("Horario");
        btnCronometroL.setBorder(null);
        btnCronometroL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCronometroL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCronometroLbtnCronometroLActionPerformed(evt);
            }
        });

        btnHorario.setBackground(new java.awt.Color(221, 230, 237));
        btnHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/horario.png"))); // NOI18N
        btnHorario.setBorder(null);
        btnHorario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHorario.setFocusPainted(false);
        btnHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorariobtnHorarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCamufladoLayout = new javax.swing.GroupLayout(pnlCamuflado);
        pnlCamuflado.setLayout(pnlCamufladoLayout);
        pnlCamufladoLayout.setHorizontalGroup(
            pnlCamufladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCamufladoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(btnCronometroL)
                .addGap(56, 56, 56))
        );
        pnlCamufladoLayout.setVerticalGroup(
            pnlCamufladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCamufladoLayout.createSequentialGroup()
                .addGroup(pnlCamufladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCamufladoLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnCronometroL))
                    .addGroup(pnlCamufladoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pnlMenulargo.add(pnlCamuflado);
        pnlCamuflado.setBounds(0, 180, 240, 90);

        btnActividadesL.setBackground(new java.awt.Color(157, 178, 191));
        btnActividadesL.setFont(new java.awt.Font("Roboto Medium", 2, 20)); // NOI18N
        btnActividadesL.setForeground(new java.awt.Color(255, 255, 255));
        btnActividadesL.setText("Actividades");
        btnActividadesL.setBorder(null);
        btnActividadesL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnActividadesL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActividadesLbtnActividadesLActionPerformed(evt);
            }
        });
        pnlMenulargo.add(btnActividadesL);
        btnActividadesL.setBounds(110, 310, 101, 24);

        pnlPrincipal.add(pnlMenulargo);
        pnlMenulargo.setBounds(0, 100, 240, 600);

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
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 1112, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        AgregarMateria agregarMateria = new AgregarMateria(estudiante);
        agregarMateria.setVisible(true);
        agregarMateria.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed
    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada == -1) {
            mostrarMensaje("Selecciona una materia para actualizar", "Error", "Actualización");
            return;
        }

        String docente = (String) jTable1.getValueAt(filaSeleccionada, 0);
        String nombre = (String) jTable1.getValueAt(filaSeleccionada, 1);
        String importancia = (String) jTable1.getValueAt(filaSeleccionada, 2);

        ActualizarMateria actualizarMateria = new ActualizarMateria(estudiante, nombre, docente);
        actualizarMateria.setVisible(true);
        actualizarMateria.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada == -1) {
            mostrarMensaje("Debe seleccionar una materia para eliminar", "Error", "Eliminar materia");
            return;
        }

        // Obtener datos de la fila seleccionada
        String docente = (String) jTable1.getValueAt(filaSeleccionada, 0);
        String nombre = (String) jTable1.getValueAt(filaSeleccionada, 1);

        // Buscar la materia correspondiente usando docente y nombre
        Materia materiaAEliminar = control.obtenerMateriaPorNombreYDocente(estudiante, nombre, docente);
        if (materiaAEliminar == null) {
            mostrarMensaje("No se encontró la materia seleccionada", "Error", "Eliminar materia");
            return;
        }

        // Confirmar eliminación
        int confirmar = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar la materia \"" + nombre + "\"?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        if (confirmar == JOptionPane.YES_OPTION) {
            boolean eliminado = control.eliminarMateria(materiaAEliminar);
            if (eliminado) {
                mostrarMensaje("Materia eliminada correctamente.", "Info", "Eliminar materia");
                cargarMateriasDelEstudiante(); // refrescar tabla
            } else {
                mostrarMensaje("No se pudo eliminar la materia.", "Error", "Eliminar materia");
            }
        }
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void btnHorarioLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorarioLActionPerformed
        Horario2 Horario = new Horario2(estudiante);
        Horario.setVisible(true);
        Horario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnHorarioLActionPerformed

    private void btnEstudiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstudiarActionPerformed
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada == -1) {
            mostrarMensaje("Selecciona una materia para estudiar", "Error", "Estudio");
            return;
        }

        String nombreMateria = (String) jTable1.getValueAt(filaSeleccionada, 1);
        Materia materia = control.buscarMateriaPorNombre(estudiante, nombreMateria);

        Cronometro cronometro = new Cronometro(estudiante, materia);
        cronometro.setVisible(true);
        cronometro.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnEstudiarActionPerformed

    private void btnEstadisticasbtnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasbtnEstadisticasActionPerformed
        Estadistico estadistico = new Estadistico(estudiante);
        estadistico.setVisible(true);
        estadistico.pack();
        estadistico.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnEstadisticasbtnEstadisticasActionPerformed

    private void btnConfiguracionbtnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionbtnConfiguracionActionPerformed
        Configuracion configuracion = new Configuracion(estudiante);
        configuracion.setVisible(true);
        configuracion.pack();
        configuracion.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnConfiguracionbtnConfiguracionActionPerformed

    private void btnHorariobtnHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorariobtnHorarioActionPerformed
        Horario Horario = new Horario(estudiante);
        Horario.setVisible(true);
        Horario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnHorariobtnHorarioActionPerformed

    private void btnEstadisticasLbtnEstadisticasLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasLbtnEstadisticasLActionPerformed
        Estadistico estadistico = new Estadistico(estudiante);
        estadistico.setVisible(true);
        estadistico.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnEstadisticasLbtnEstadisticasLActionPerformed

    private void btnConfiguracionLbtnConfiguracionLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionLbtnConfiguracionLActionPerformed
        Configuracion configuracion = new Configuracion(estudiante);
        configuracion.setVisible(true);
        configuracion.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnConfiguracionLbtnConfiguracionLActionPerformed

    private void btnCronometroLbtnCronometroLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCronometroLbtnCronometroLActionPerformed
        Horario horario = new Horario(estudiante);
        horario.setVisible(true);
        horario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCronometroLbtnCronometroLActionPerformed

    private void btnMenubtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenubtnMenuActionPerformed
        Horario horario = new Horario(estudiante);
        horario.setVisible(true);
        horario.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnMenubtnMenuActionPerformed

    private void btnActividadesbtnActividadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadesbtnActividadesActionPerformed
        Actividad actividad = new Actividad(estudiante);
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActividadesbtnActividadesActionPerformed

    private void btnActividadesLbtnActividadesLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActividadesLbtnActividadesLActionPerformed
        Actividad actividad = new Actividad(estudiante);
        actividad.setVisible(true);
        actividad.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnActividadesLbtnActividadesLActionPerformed
    public void actualizarFilaEnTabla(Materia materiaActualizada) {

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            String nombreMateria = (String) jTable1.getValueAt(i, 1);
            String docenteMateria = (String) jTable1.getValueAt(i, 0);

            if (nombreMateria.equals(materiaActualizada.getNombre()) && docenteMateria.equals(materiaActualizada.getDocente())) {
                jTable1.setValueAt(materiaActualizada.getDocente(), i, 0);
                jTable1.setValueAt(materiaActualizada.getNombre(), i, 1);
                jTable1.setValueAt(materiaActualizada.getImportancia(), i, 2);
                break;
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActividades;
    private javax.swing.JButton btnActividadesL;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnConfiguracionL;
    private javax.swing.JButton btnCronometroL;
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnEstadisticasL;
    private javax.swing.JButton btnEstudiar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnHorario;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnMenu;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblIconoUsuario;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblLogotipo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlCamuflado;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlHead;
    private javax.swing.JPanel pnlMenulargo;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JScrollPane scrollMaterias;
    // End of variables declaration//GEN-END:variables

}
