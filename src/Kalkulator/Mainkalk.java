/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kalkulator;
import java.util.Scanner;
public class Mainkalk {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("===========KALKULATOR===========");
        System.out.println("================================");
        System.out.println("Pilihan Kalkulator:\n1. Penjumlahan\n2. Pengurangan\n3. Perkalian\n4. Pembagian\n5. Penyederhanaan pecahan");
        System.out.print("Masukkan nomor pilihan: ");
        int pil = in.nextInt();
        System.out.print("Masukkan nilai1 : ");
        int nilai1 = in.nextInt();
        System.out.print("Masukkan nilai2 : ");
        int nilai2 = in.nextInt();
        Kalkulator a = new Kalkulator();    
        switch (pil){
            case 1:
                Kalkulator.Penjumlahan(nilai1, nilai2);
                break;
            case 2:
                Kalkulator.Pengurangan(nilai1, nilai2);
                break;
            case 3:
                a.Perkalian(nilai1, nilai2);
                break;
            case 4:
                a.Pembagian(nilai1, nilai2);
                break;
            case 5:
                a.sederhana(nilai1, nilai2);
                break;
            default:
                System.out.println("Menu tidak tersedia");
        }
    }
}

