/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum1;

import java.util.Scanner;

/**
 *
 * @author Windows 10
 */
public class BioData {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        String nm, nim, ps;
        
        System.out.println("Silahkan isi biodata berikut.");
        System.out.print("Masukkan Nama Anda : ");
        nm = in.nextLine();
        System.out.print("Masukkan NIM Anda : ");
        nim = in.nextLine();
        System.out.print("Program Studi : ");
        ps = in.nextLine();
        
        System.out.println("Selamat datang " + nm + " dengan NIM " + nim + " dari program studi " + ps + "!");
    }
}