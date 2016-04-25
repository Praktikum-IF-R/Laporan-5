package pkgstatic.pkgfinal;

import java.util.*;

public class nomer1 {

    static Scanner in = new Scanner(System.in);
    static double hasil, nomer1, nomer2;

    public static void main(String[] args) {
        nomer1 run = new nomer1();
        System.out.println("masukkan pilihan operasi hitung : \n1. penjumlahan\n2. pengurangan"
                + "\n3. perkalian\n4. pembagian\n=============");
        int a = in.nextInt();
        if (a == 1) {
            run.penjumlahan();
        } else if (a == 2) {
            run.pengurangan();
        } else if (a == 3) {
            run.perkalian();
        } else if (a == 4) {
            run.pembagian();
        } else {
            System.out.println("pilih yang benar, coba run lagi");
        }
        System.out.println("mau disederhanakan ? (y/n)");
        String ab = in.next();
        if (ab.equalsIgnoreCase("y")) {
            run.sederhanakan(hasil);
        } else {
            System.out.println(hasil);
        }
    }

    static void penjumlahan() {
        masukan();
        hasil = nomer1 + nomer2;
    }

    static void pengurangan() {
        masukan();
        hasil = nomer1 - nomer2;
    }

    void perkalian() {
        System.out.print("masukkan nomer pertama : ");
        nomer1 = in.nextDouble();
        System.out.print("masukkan nomer kedua : ");
        nomer2 = in.nextDouble();
        hasil = nomer1 * nomer2;
    }

    void pembagian() {
        System.out.print("masukkan nomer pertama : ");
        nomer1 = in.nextDouble();
        System.out.print("masukkan nomer kedua : ");
        nomer2 = in.nextDouble();
        hasil = nomer1 / nomer2;
    }

    static void masukan() {
        System.out.print("masukkan nomer pertama : ");
        nomer1 = in.nextDouble();
        System.out.print("masukkan nomer kedua : ");
        nomer2 = in.nextDouble();
    }

    void sederhanakan(double akhir) {
        System.out.printf("%s %.1f","hasil sederhananya : ",akhir);
    }

}
