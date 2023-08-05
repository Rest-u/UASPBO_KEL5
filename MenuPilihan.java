/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_PBO;

import javax.swing.JOptionPane;

/**
 * @author Arvilanti Devani 22104410075
 * @author Nur Cindy Intan Fanderella 22104410098
 * @author Hanik Hatul Halimah 22104410101
 * @author Eka Fardinal Hergitarestu 22104410119
 * @author Wasi'atul Jannah 22104410121
 */
public class MenuPilihan {
    public static void main(String[] args) {
        int a = 100, b=25;
        int hasil;
        System.out.println("Input Pilihan");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        String input = JOptionPane.showInputDialog("Masukkan pilihan anda : ");
        int pilihan = Integer.parseInt(input);
        
        switch (pilihan) {
            case 1:
                hasil = a + b;
                System.out.println("Penjumlahan a: " + a + "+ b:"+b+" = "+hasil);
                break;
             case 2:
                hasil = a - b;
                System.out.println("Pengurangan a: " + a + "- b:"+b+" adalah "+hasil);
                break;
            default:
                System.out.println("Pilihan anda salah");
        }   
    }   
}