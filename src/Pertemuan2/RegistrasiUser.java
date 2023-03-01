/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;

import java.awt.Image;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author febri
 */
public class RegistrasiUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame j = new JFrame("Registrasi User");
        
        JLabel nama = new JLabel();
        nama.setText("Nama Anda");
        nama.setBounds(50, 100, 100, 30);
        j.add(nama);/*untuk menempelkan lebel ke je frame*/
        
        JLabel username = new JLabel();
        username.setText("Username Anda");
        username.setBounds(50, 150, 100, 30);
        j.add(username);
        
        JLabel password = new JLabel();
        password.setText("Password Anda");
        password.setBounds(50, 200, 100, 30);
        j.add(password);
        
        JLabel email = new JLabel();
        email.setText("Email Anda");
        email.setBounds(50, 250, 100, 30);
        j.add(email);
        
        JLabel NoHp = new JLabel();
        NoHp.setText("No Hp anda");
        NoHp.setBounds(50, 300, 100, 30);
        j.add(NoHp);
        
        JLabel alamat = new JLabel();
        alamat.setText("Alamat anda");
        alamat.setBounds(50, 350, 100, 30);
        j.add(alamat);
        
        JTextField namaTxt = new JTextField();
        namaTxt.setBounds(170, 100, 150, 25);
        j.add(namaTxt);
        
        JTextField usernameTxt = new JTextField();
        usernameTxt.setBounds(170, 150, 150, 25);
        j.add(usernameTxt);
        
        JPasswordField passwordTxt = new JPasswordField();
        passwordTxt.setBounds(170, 200, 150, 25);
        j.add(passwordTxt);
        
        JTextField emailTxt = new JTextField();
        emailTxt.setBounds(170, 250, 150, 25);
        j.add(emailTxt);
        
        JTextField nohpTxt =new JTextField();
        nohpTxt.setBounds(170, 300, 150, 25);
        j.add(nohpTxt);
        
        JTextArea alamatTxt =new JTextArea();
        alamatTxt.setBounds(170, 350, 150, 50);
        j.add(alamatTxt);
        
        JButton regis = new JButton();
        regis.setText("Registrasi");
        regis.setBounds(170, 410, 100, 35);
        j.add(regis);
        
        j.setSize(800,800);
        j.setLayout(null);
        j.setVisible(true);
    }
    
}
