package org.example;

import javax.swing.*;

public class Home {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Home ::loginGUI );
    }
    public static void loginGUI(){
        Login UI = new Login();
        JPanel log = UI.getLoginP();

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(log);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
