
package com.mycompany.studymind;

import com.mycompany.studymind.igu.Login;

 
public class StudyMind {

    public static void main(String[] args) {
        Login login = new Login();
       login.setVisible(true);
       login.pack();
       login.setLocationRelativeTo(null);
    }
}
