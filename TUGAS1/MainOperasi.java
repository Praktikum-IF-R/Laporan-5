/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS1;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class MainOperasi {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean menu = true;
        int input;
        double a, b;
        Operasi nilai = new Operasi();
        System.out.println("Operasi 2 buah bilangan");
        System.out.println("1. Penjumlahan  2. Pengurangan\n3. Perkalian    4. Pembagian\n5. Penyederhanaan Pecahan\n6. Selesai");
        while (menu) {
            System.out.print("Menu : ");
            input = scan.nextInt();
            switch (input) {
                case 1:
                    System.out.print("Bilangan 1 : ");
                    a = scan.nextDouble();
                    System.out.print("Bilangan 2 : ");
                    b = scan.nextDouble();
                    System.out.println("Hasil    : " + Operasi.Penjumlahan(a, b));
                    break;
                case 2:
                     System.out.print("Bilangan 1 : ");
                    a = scan.nextDouble();
                    System.out.print("Bilangan 2 : ");
                    b = scan.nextDouble();
                    System.out.println("Hasil    : " + Operasi.Pengurangan(a, b));
                    break;
                case 3:
                    System.out.print("Bilangan 1 : ");
                    a = scan.nextDouble();
                    System.out.print("Bilangan 2 : ");
                    b = scan.nextDouble();
                    System.out.println("Hasil    : " + nilai.Perkalian(a, b));
                    break;
                case 4:
                    System.out.print("Bilangan 1 : ");
                    a = scan.nextDouble();
                    System.out.print("Bilangan 2 : ");
                    b = scan.nextDouble();
                    System.out.println("Hasil    : " + nilai.Pembagian(a, b));
                    break;
                case 5:
                    System.out.print("Pembilang : ");
                    a = scan.nextDouble();
                    System.out.print("Penyebut  : ");
                    b = scan.nextDouble();
                    nilai.Sederhana(a, b);
                    break;
                case 6:
                    System.out.println("Program selesai");
                    menu = false;
                    break;
            }
        }
    }
}
