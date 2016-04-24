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

public class MainJualan {

    public static void main(String[] args) {
        Scanner nuel = new Scanner(System.in);
        Jualan wow = new Jualan();
        System.out.println("=========CV.LABKOMDAS=========");
        System.out.println("Daftar Jualan : ");
        System.out.println("1. Jaket A");
        System.out.println("2. Jaket B");
        System.out.println("3. Jaket C");
        System.out.println("4. Total Pembelian");
        System.out.println("5. Exit.");
        System.out.println("==============================");
        int menu;
        do {
            System.out.print("Input Menu : ");

            menu = nuel.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Pembelian Jaket A : ");
                    System.out.print("Input Jumlah : ");
                    int jlh = nuel.nextInt();
                    wow.pertama(jlh);
                    break;
                case 2:
                    System.out.println("Pembelian Jaket B : ");
                    System.out.print("Input Jumlah : ");
                    int jlh2 = nuel.nextInt();
                    wow.kedua(jlh2);
                    break;
                case 3:
                    System.out.println("Pembelian Jaket C : ");
                    System.out.println("Input Jumlah : ");
                    int jlh3 = nuel.nextInt();
                    wow.ketiga(jlh3);
                    break;
                case 4:
                    wow.display();
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Menu Tidak ditemukan..");
            }

        } while (menu != 4);

    }
}
