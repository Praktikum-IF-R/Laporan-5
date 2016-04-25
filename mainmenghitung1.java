/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menghitung1;

import java.util.Scanner;

/**
 *
 * @author LENY
 */
public class mainmenghitung1 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.print("masukkan nilai 1 : ");
        int nil1 = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        int nil2 = in.nextInt();
        Menghitung1.hitungpengurangan(nil1, nil2);
        System.out.print("masukkan nilai 1 : ");
        int value1 = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        int value2 = in.nextInt();
        Menghitung1.hitungPenjumlahan(value1, value2);
        System.out.print("masukkan nilai 1 : ");
        nil1 = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        nil2 = in.nextInt();
        Menghitung1 a = new Menghitung1();
        a.hitungPerkalian(nil1, nil2);
        System.out.print("masukkan nilai 1 : ");
        int valu1 = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        int valu2 = in.nextInt();
        Menghitung1 b = new Menghitung1();
        b.hitungPemabagian(valu1, valu2);
        System.out.print("masukkan pembilang : ");
        int valu1e = in.nextInt();
        System.out.print("masukkan penyebut : ");
        int valu2e = in.nextInt();
        Menghitung1 c = new Menghitung1();
        c.Sederhana(valu1e,valu2e);
}
}
