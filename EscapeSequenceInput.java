/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum1;

import java.util.Scanner;

public class EscapeSequenceInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String kalimat1, kalimat2, kalimat3;
        System.out.print("Masukkan Kalimat Pertama: ");
        kalimat1 = in.nextLine();
        System.out.print("Masukkan Kalimat Kedua: ");
        kalimat2 = in.nextLine();
        System.out.print("Masukkan Kalimat ketiga: ");
        kalimat3 = in.nextLine();
        
        System.out.println("Kalimat yang anda masukkan ialah : \n");
        System.out.println("1: \"" + kalimat1 + "\"," + "\n2: \"" + kalimat2 + "\", dan " + "\n3: \"" + kalimat3 + "\".");
    }
}
