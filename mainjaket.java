/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaket;

import java.util.Scanner;

/**
 *
 * @author LENY
 */
public class mainjaket {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Jaket pilihan = new Jaket();
        System.out.println("");
        System.out.println("Daftar jaket               Harga");
        System.out.println("");
        System.out.println("1. Jaket A              : 100000");
        System.out.println("2. Jaket B              : 125000");
        System.out.println("3. Jaket C              : 175000");
        System.out.println("5. Keluar");

        System.out.print("Masukkan pilihan    : ");
        int pil = in.nextInt();

        switch (pil) {
            case 1:
                System.out.print("Banyak Jaket        : ");
                int a = in.nextInt();
                pilihan.jumlah(a);
                if (a > 100) {
                    pilihan.total11();
                } else {
                    pilihan.total1();
                }

                break;
            case 2:
                System.out.print("Banyak Jaket        : ");
                a = in.nextInt();
                pilihan.jumlah(a);
                if (a > 100) {
                    pilihan.total22();
                } else {
                    pilihan.total2();
                }
                break;
            case 3:
                System.out.print("Banyak Jaket      : ");
                a = in.nextInt();
                pilihan.jumlah(a);
                if (a > 100) {
                    pilihan.total33();
                } else {
                    pilihan.total3();
                }
                break;
            default:
                System.out.println("maaf yang anda inputkan salah");
        }
        pilihan.total();
        System.out.println("total " + pilihan.gettotal());
    }
}
