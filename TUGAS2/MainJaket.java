/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS2;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class MainJaket {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean menu = true;
        int input;
        System.out.println("             CV. Labkomdas");
        System.out.println("1. Beli Jaket A (Rp.100000/pcs)\n2. Beli Jaket B (Rp.125000/pcs)\n3. Beli Jaket C (Rp.175000/pcs)\n4. Selesai");
        System.out.println("Note : Diskon untuk pembelian Jaket diatas 100 pcs");
        while (menu) {
            System.out.print("Menu : ");
            input = scan.nextInt();
            switch (input) {
                case 1:
                    System.out.print("Jumlah         : ");
                    input = scan.nextInt();
                    System.out.println("Total Harga    : " + Jaket.jaketA(input));
                    break;
                case 2:
                    System.out.print("Jumlah         : ");
                    input = scan.nextInt();
                    System.out.println("Total Harga    : " + Jaket.jaketB(input));
                    break;
                case 3:
                    System.out.print("Jumlah         : ");
                    input = scan.nextInt();
                    System.out.println("Total Harga    : " + Jaket.jaketC(input));
                    break;
                case 4:
                    System.out.println("        Pembelian Selesai\nTerima Kasih Atas Kunjungan Anda");
                    menu = false;
                    break;
            }
        }
    }
}
