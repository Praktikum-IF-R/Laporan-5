package Bab5;

import java.util.Scanner;

public class hitungMain {

    public static void main(String[] args) {
        int a, b;
        Scanner in = new Scanner(System.in);
        hitung h = new hitung();
        System.out.println("Penjumlahan");
        System.out.print("Angka ke 1 = ");
        a = in.nextInt();
        System.out.print("dijumlahkan dengan = ");
        b = in.nextInt();
        hitung.penjumlahan(a, b);
        System.out.println("Pengurangan");
        System.out.print("Angka ke 1 = ");
        a = in.nextInt();
        System.out.print("dikurangkan dengan = ");
        b = in.nextInt();
        hitung.pengurangan(a, b);
        System.out.println("Perkalian");
        System.out.print("Angka ke 1 = ");
        a = in.nextInt();
        System.out.print("dikalikan dengan = ");
        b = in.nextInt();
        h.perkalian(a, b);
        System.out.println("Pembagian");
        System.out.print("Angka ke 1 = ");
        a = in.nextInt();
        System.out.print("dibagikan dengan = ");
        b = in.nextInt();
        h.pembagian(a, b);
        System.out.println("Penyederhanaan Pecahan");
        System.out.print("Nilai pembilang = ");
        a = in.nextInt();
        System.out.print("Nilai penyebut = ");
        b = in.nextInt();
        h.sederhana(a, b);

    }
}
