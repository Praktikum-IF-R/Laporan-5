/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum5_1;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class mainJaket {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("-----------------------------------------------------");
        System.out.println("                    CV. Labkomdas");
        System.out.println("-----------------------------------------------------");
        System.out.println("Promo   : Diskon setiap pembelian lebih dari 100 item");
        System.out.println("-----------------------------------------------------");
        System.out.println("                    Daftar Barang");
        System.out.println("         Kode Barang                  Harga");
        System.out.println("        111. Jaket A            Rp. 100.000/item");
        System.out.println("        112. Jaket B            Rp. 125.000/item");
        System.out.println("        113. Jaket C            Rp. 175.000/item");
        System.out.println("-----------------------------------------------------");
        System.out.print("Silahkan masukkan kode barang : ");
        int pil = in.nextInt();
        System.out.print("Jumlah Barang : ");
        int b = in.nextInt();
        System.out.println();
        System.out.println("-----Nota Pembayaran-----");
        Jaket.Pembayaran(pil, b);
        System.out.println("Terima Kasih, Selamat Datang Kembali");
    }
}
