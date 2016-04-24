/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Static;

/**
 *
 * @author nuel
 */
import java.util.Scanner;

public class MainPerhitungan {

    public static void main(String[] args) {
        Scanner nuel = new Scanner(System.in);
        int menu;

        System.out.println("Menu : ");
        System.out.println("1. Penjumlahan ");
        System.out.println("2. Perkalian ");
        System.out.println("3. Pembagian ");
        System.out.println("4. Pengurangan ");
        System.out.println("5. Penyederhanaan Pecahan");
        System.out.println("6. Keluar--");
        do {
            System.out.print("Input menu : ");
            menu = nuel.nextInt();
            Perhitungan baru = new Perhitungan();
            switch (menu) {
                case 1:
                    System.out.println("Penjumlahan");
                    System.out.print("Input bil 1 : ");
                    double bil1 = nuel.nextDouble();
                    System.out.print("Input bil 2 : ");
                    double bil2 = nuel.nextDouble();
                    baru.penjumlahan(bil1, bil2);
                    break;
                case 2:
                    System.out.println("Perkalian");
                    System.out.print("Input bil 1 :");
                    double bil1a = nuel.nextDouble();
                    System.out.print("Input bil 2 : ");
                    double bil2a = nuel.nextDouble();
                    baru.perkalian(bil1a, bil2a);
                    break;
                case 3:
                    System.out.println("Pembagian");
                    System.out.print("Input bil 1 : ");
                    double bil1b = nuel.nextDouble();
                    System.out.print("Input bil 2 : ");
                    double bil2b = nuel.nextDouble();
                    baru.pembagian(bil1b, bil2b);
                    break;
                case 4:
                    System.out.println("Pengurangan");
                    System.out.print("Input bil 1 : ");
                    double bil1c = nuel.nextDouble();
                    System.out.print("Input bil 2 : ");
                    double bil2c = nuel.nextDouble();
                    baru.pengurangan(bil1c, bil2c);
                    break;
                case 5:
                    System.out.println("Penyederhanaan");
                    System.out.print("Input pembilang : ");
                    double pemb=nuel.nextDouble();
                    System.out.print("Input penyebut : ");
                    double peny=nuel.nextDouble();
                    baru.Sederhana(pemb,peny);
                    break;
                case 6:
                    System.out.println("Exit...............");
                    System.exit(0);
                default:
                    System.out.println("Menu Tidak ditemukan");
                    break;
            }
        } while (menu != 6);
    }

}
