/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum5;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class nomor1main {
    public static void main(String[] args){
        Scanner masuk=new Scanner(System.in);
        System.out.print("masukan angka pertama : ");
        int a=masuk.nextInt();
        System.out.print("masukan angka kedua   : ");
        int b=masuk.nextInt();
        System.out.println("jumlah :"+nomor1.penjumlahan(a, b));
        System.out.println("kurang :"+nomor1.pengurangan(a, b));
        nomor1 hitung=new nomor1();
        System.out.println("kali :"+hitung.perkalian(a, b));
        System.out.println("bagi :"+hitung.pembagian(a, b));
        System.out.print("sederhana : ");
        hitung.sederhana(a, b);
    }
}
