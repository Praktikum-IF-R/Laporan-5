package laporanpraktikum5;

import java.util.Scanner;

public class MainJaket {
    public static void main(String[] args) {
        String jawab;
        int jum1 = 0, jum2 = 0, jum3 = 0;
        Scanner in = new Scanner (System.in);
        Jaket jaket = new Jaket();
        Jaket.showMessages();
        System.out.println("Apakah anda ingin memesan Jaket A?");
        System.out.println("Y/N?");
        System.out.print("==> ");
        jawab = in.next();
        if (jawab.equalsIgnoreCase("Y")){
            System.out.println("Berapa jumlahnya?");
            System.out.print("==> ");
            jum1 = in.nextInt();
            System.out.println();
        } else {
            System.out.println();
        }
        System.out.println("Apakah anda ingin memesan Jaket B?");
        System.out.println("Y/N?");
        System.out.print("==> ");
        jawab = in.next();
        if (jawab.equalsIgnoreCase("Y")){
            System.out.println("Berapa jumlahnya?");
            System.out.print("==> ");
            jum2 = in.nextInt();
            System.out.println();
        } else {
            System.out.println();
        }
        System.out.println("Apakah anda ingin memesan Jaket C?");
        System.out.println("Y/N?");
        System.out.print("==> ");
        jawab = in.next();
        if (jawab.equalsIgnoreCase("Y")){
            System.out.println("Berapa jumlahnya?");
            System.out.print("==> ");
            jum3 = in.nextInt();
            System.out.println();
        } else {
            System.out.println();
        }
        jaket.hargaJaketA(jum1);
        jaket.hargaJaketB(jum2);
        jaket.hargaJaketC(jum3);
        jaket.hargaKeseluruhan();  
    }
}