package com.mycompany.studymind.util;

import com.mycompany.studymind.igu.Login;
import com.mycompany.studymind.logica.Estudiante;
import javax.swing.*;

public class MenuUsuario {

    public static void aplicarMenu(JLabel lblUsuario, JFrame frame, Estudiante estudiante) {
        JPopupMenu menu = new JPopupMenu();

        JMenuItem cerrarSesion = new JMenuItem("Cerrar sesión");
        cerrarSesion.addActionListener(e -> {
            Login login = new Login();
            login.setVisible(true);
            login.setLocationRelativeTo(null);
            frame.dispose(); // Cierra la ventana actual
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