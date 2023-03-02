/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author febri
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame j = new JFrame("JFrame Pertamaku");
        
        JLabel username = new JLabel();
        username.setText("Username");
        username.setBounds(50, 100, 100, 30);
        j.add(username);
        
        JLabel password = new JLabel();
        password.setText("Password");
        password.setBounds(50, 150, 100, 30);
        j.add(password);
        
        JTextField usernameTxt = new JTextField();
        usernameTxt.setBounds(150, 100, 200, 30);
        j.add(usernameTxt);
        
        JTextField passwordTxt = new JTextField();
        passwordTxt.setBounds(150, 150, 200, 30);
        j.add(passwordTxt);
        
        j.setSize(800, 800);
        j.setLayout(null);
        j.setVisible(true);
    }
    
}
