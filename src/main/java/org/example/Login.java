package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Login extends JDialog {
    public JPanel getLoginP(){
        return LoginPanel;
    }
    private JTextField usnField;
    private JButton loginButton;
    private JPanel LoginPanel;
    private JPasswordField pwField;
    private JPanel MainPanel;

    public Login() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username  = "Timsukses";
                String password = "12345";
                if(usnField.getText().equals(username) && pwField.getText().equals(password)){
                    JOptionPane.showMessageDialog(null, "LOGIN BERHASIL");
                }else {
                    JOptionPane.showMessageDialog(null, "LOGIN GAGAL");
                }
                dispose();
            }
        });
    }
}
