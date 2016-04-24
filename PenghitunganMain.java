/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penghitungan;

import java.util.Scanner;

public class PenghitunganMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan = 0;
        double a, b;
        do {
            System.out.println("Program Calculator Sederhana");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Penyederhanaan Pecahan");
            System.out.println("6. Stop");
            System.out.println("Masukkan pilihan anda :");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan bil 1 :");
                    a = input.nextDouble();
                    Penghitungan.bilangan1(a);
                    System.out.println("Masukkan bil 2 :");
                    b = input.nextDouble();
                    Penghitungan.bilangan2(b);
                    System.out.println("Hasil Penjumlahan :" + Penghitungan.penjumlahan());
                    break;
                case 2:
                    System.out.println("Masukkan bil 1 :");
                    a = input.nextDouble();
                    Penghitungan.bilangan1(a);
                    System.out.println("Masukkan bil 2 :");
                    b = input.nextDouble();
                    Penghitungan.bilangan2(b);
                    System.out.println("Hasil Pengurangan :" + Penghitungan.pengurangan());
                    break;
                case 3:
                    System.out.println("Masukkan bil 1 :");
                    a = input.nextDouble();
                    System.out.println("Masukkan bil 2 :");
                    b = input.nextDouble();
                    Penghitungan hitung1 = new Penghitungan(a, b);
                    System.out.println("Hasil Perkalian :" + hitung1.perkalian());
                    break;
                case 4:
                    System.out.println("Masukkan bil 1 :");
                    a = input.nextDouble();
                    System.out.println("Masukkan bil 2 :");
                    b = input.nextDouble();
                    Penghitungan hitung2 = new Penghitungan(a, b);
                    System.out.println("Hasil Pembagian :" + hitung2.pembagian());
                    break;
                case 5:
                    System.out.println("Masukkan Pembilang :");
                    int c = input.nextInt();
                    System.out.println("Masukkan Penyebut :");
                    int d = input.nextInt();
                    Penghitungan hitung3 = new Penghitungan(c, d);
                    hitung3.sederhana(c,d);
                    hitung3.displayMessage();
            }
        } while (pilihan != 6);

    }
}
