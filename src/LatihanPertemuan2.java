/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan2;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author febri
 */
public class LatihanPertemuan2 {
    private JPanel panel;
   private JLabel label;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame j = new JFrame("Minang Mart");
        
        JLabel judul = new JLabel("List Menu Minang Mart", JLabel.CENTER);
        judul.setFont(new java.awt.Font("Tahoma", 1, 25));
        judul.setBounds(0, 50, 800, 30);
        j.add(judul);/*untuk menempelkan lebel ke je frame*/
        
        String data[][]={ {"1","Sate","10000"},    
                          {"2","Ayam Bakar","12000"},    
                          {"3","Lotek","10000"},
                          {"4","Soto","11000"},
                          {"5","CapCay","8000"},
                          {"6","ExtraJoss","6000"},
                          {"7","Nutrisari","5000"},
                          {"8","Capcin","5000"},
                          {"9","Teh Es","4000"},
                          {"10","Susu","5000"}};    
        String column[]={"No","Makanan dan Minuman","Harga/pcs"};         
        JTable MenuMM = new JTable(data,column);    
        MenuMM.setBounds(150,110,500,170);
        j.add(MenuMM);
        
        JLabel NamaPemesan = new JLabel();
        NamaPemesan.setText("Nama Costumer");
        NamaPemesan.setBounds(50, 300, 100, 30);
        j.add(NamaPemesan);
        
        JTextArea NamaTxt =new JTextArea();
        NamaTxt.setBounds(150, 300, 150, 30);
        j.add(NamaTxt);
        
        JLabel MenuMinuman = new JLabel();
        MenuMinuman.setText("Menu Makanan");
        MenuMinuman.setBounds(50, 350, 100, 30);
        j.add(MenuMinuman);
        String makan[] = { "Sate", "Ayam Bakar", "Lotek", "Soto", "Capcay" };
        JComboBox menumakanan = new JComboBox(makan);
        menumakanan.setBounds(150, 350, 100, 30);
        j.add(menumakanan);
        
        JLabel JmlhMakanan = new JLabel();
        JmlhMakanan.setText("Jmlh");
        JmlhMakanan.setBounds(280, 350, 100, 30);
        j.add(JmlhMakanan);
        
        JLabel Minum = new JLabel();
        Minum.setText("Menu Minuman");
        Minum.setBounds(50, 400, 100, 30);
        j.add(Minum);
        String minum[] = { "ExtraJoss", "Nutrisari", "Capcin", "Teh Es", "Susu" };
        JComboBox menuminuman = new JComboBox(minum);
        menuminuman.setBounds(150, 400, 100, 30);
        j.add(menuminuman);
        
        JLabel JmlhMinuman = new JLabel();
        JmlhMinuman.setText("Jmlh");
        JmlhMinuman.setBounds(280, 400, 100, 30);
        j.add(JmlhMinuman);
        
        JLabel bayar = new JLabel();
        bayar.setText("Bayar");
        bayar.setBounds(110, 580, 100, 25);
        j.add(bayar);
        
        JLabel kembalian =new JLabel();
        kembalian.setText("Kembalian");
        kembalian.setBounds(110, 610, 100, 25);
        j.add(kembalian);
        
        JTextField JmlhMakanTxt = new JTextField();
        JmlhMakanTxt.setBounds(320, 350, 100, 25);
        j.add(JmlhMakanTxt);
        
        JTextField JmlhMinumTxt = new JTextField();
        JmlhMinumTxt.setBounds(320, 400, 100, 25);
        j.add(JmlhMinumTxt);
        
        JLabel MenuMakanan = new JLabel();
        MenuMakanan.setText("Via");
        MenuMakanan.setBounds(50, 450, 100, 30);
        j.add(MenuMakanan);
        
        JRadioButton b = new JRadioButton("Makan Ditempat", true);
        b.setBounds(250, 450, 150, 30);
        j.add(b);
        JRadioButton a = new JRadioButton("Bawa Pulang");
        a.setBounds(150, 450, 100, 30);
        j.add(a);
                
        JLabel proses = new JLabel("Proses Transaksi", JLabel.CENTER);
        proses.setFont(new java.awt.Font("Tahoma", 1, 18));
        proses.setBounds(0, 500, 800, 30);
        j.add(proses);/*untuk menempelkan lebel ke je frame*/
        
        JButton hitung = new JButton();
        hitung.setText("Hitung");
        hitung.setBounds(170, 550, 80, 25);
        j.add(hitung);
        
        JButton hapus = new JButton();
        hapus.setText("Hapus");
        hapus.setBounds(300, 550, 80, 25);
        j.add(hapus);
        
        JTextField bayarTxt =new JTextField();
        bayarTxt.setBounds(170, 580, 220, 25);
        j.add(bayarTxt);
        
        JTextField kembaliTxt =new JTextField();
        kembaliTxt.setBounds(170, 610, 220, 25);
        j.add(kembaliTxt);
        
        JButton Order = new JButton();
        Order.setText("Order");
        Order.setBounds(170, 650, 80, 25);
        j.add(Order);
        
        j.setSize(800,800);
        j.setLayout(null);
        j.setVisible(true);
    }
    
}
