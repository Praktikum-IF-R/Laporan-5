/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum5;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class mainAritmatika {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan bilangan pertama   : ");
        int a = in.nextInt();
        System.out.print("Masukkan bilangan kedua     : ");
        int b = in.nextInt();
        System.out.println();
        Aritmatika.hitungPenjumlahan(a, b);
        Aritmatika.hitungPengurangan(a, b);
        Aritmatika bil1 = new Aritmatika(a,b);
        bil1.hitungPerkalian(a, b);
        bil1.hitungPembagian(a, b);
        bil1.Sederhana();
    }
}
