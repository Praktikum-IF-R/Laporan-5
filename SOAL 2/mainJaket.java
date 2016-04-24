/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KonstantaFinal;
//memasukkan fungsi scanner
import java.util.Scanner;

/**
 *
 * @author DS
 */
public class mainJaket {

    public static void main(String[] args) {
        //membuat fungsi scanner
        Scanner in = new Scanner(System.in);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("                   Central Jaket Labkomdas");
        System.out.println("            Terjamin, Terpercaya dan Berkualitas ");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Berikut Pilihan Bahan yang tersedia ");
        System.out.println("1. Jaket Bahan A (Harga perbijinya adalah Rp." + Jaket.bahanA + ")");
        System.out.println("2. Jaket Bahan B (Harga perbijinya adalah Rp." + Jaket.bahanB + ")");
        System.out.println("3. Jaket Bahan C (Harga perbijinya adalah Rp." + Jaket.bahanC + ")");
        System.out.println(".............................................................");
        System.out.println("Ada potongan harga spesial bila memesan lebih dari 100 biji");
        //menapilkan harga diskon
        Jaket.diskon();
        System.out.println(".............................................................");
        //perulangan pesan lagi atau tidak
        for (String ulang = "ya"; ulang.equalsIgnoreCase("ya");) {
            System.out.print("Nomor Berapa Pilihan anda : ");
            int pilih = in.nextInt();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            switch (pilih) {
                case 1: {
                    System.out.println("Jaket Bahan A ");
                    System.out.print("ingin beli berapa banyak : ");
                    int banyakA = in.nextInt();
                    Jaket.BahanA(banyakA);
                    break;
                }
                case 2: {
                    System.out.println("Jaket Bahan B ");
                    System.out.print("ingin beli berapa banyak : ");
                    int banyakB = in.nextInt();
                    Jaket.BahanB(banyakB);
                    break;
                }
                case 3: {
                    System.out.println("Jaket Bahan C ");
                    System.out.print("ingin beli berapa banyak : ");
                    int banyakC = in.nextInt();
                    Jaket.BahanC(banyakC);
                    break;
                }
                default:{
                    System.out.println("tidak ada pilihannya");
                }
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Pesan Lagi (ya/tidak) ? ");
            ulang = in.next();
        }
        //menampilkan total seluruhnya
        System.out.println("-------------------------------------------------------------");
        System.out.println("Total Biaya Seluruhnya adalah Rp." + Jaket.getTotal());
        System.out.println("-------------------------------------------------------------");

    }
}
