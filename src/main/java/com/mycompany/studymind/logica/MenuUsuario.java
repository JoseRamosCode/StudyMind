/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studymind.logica;

import com.mycompany.studymind.igu.Inicial;
import javax.swing.*;
import java.awt.*;

public class MenuUsuario {

    public static void aplicarMenu(JLabel lblUsuario, JFrame frame, Estudiante estudiante) {
        JPopupMenu menu = new JPopupMenu();

        JMenuItem cerrarSesion = new JMenuItem("Cerrar sesión");

       
        cerrarSesion.setBackground(new Color(157, 178, 191));
        cerrarSesion.setForeground(Color.WHITE);
        cerrarSesion.setFont(new Font("Roboto conseded", Font.PLAIN, 14));
        cerrarSesion.setOpaque(true); 
        cerrarSesion.addActionListener(e -> {
            Inicial inicial = new Inicial();
            inicial.setVisible(true);
            inicial.setLocationRelativeTo(null);
            frame.dispose();
        });

        menu.add(cerrarSesion);

        lblUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu.show(lblUsuario, 0, lblUsuario.getHeight());
            }
        });
    }
}