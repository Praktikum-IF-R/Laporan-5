/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab5;

import java.util.Scanner;
public class Bab5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        jaket jaket = new jaket();
        int pil;
        System.out.println("---------------------------------------");
        System.out.println("          CV. Labkomdas Malang");
        System.out.println("              Jacket Store");
        System.out.println("---------------------------------------");
        System.out.println(" Jenis Jaket :");
        System.out.println(" 1. Jaket A          Rp 100.000,00");
        System.out.println(" 2. Jaket B          Rp 125.000,00");
        System.out.println(" 3. Jaket C          Rp 175.000,00");
        System.out.print("Pilihan Anda : ");
        pil = in.nextInt();
        System.out.println("---------------------------------------");
        if(pil == 1){
            System.out.println("Pilihan Anda            : JAKET A");
            System.out.print("Masukkan jumlah pesanan : ");
            jaket.jumlah = in.nextInt();
            jaket.setjumlah(jaket.jumlah);
            System.out.println("---------------------------------------");
            System.out.println("Jaket A\t\t"+jaket.getjumlah()+"\t"+"Rp 100.000,00");
            System.out.println("");
            jaket.hitungA();
        } else if(pil == 2){
            System.out.println("Pilihan Anda            : JAKET B");
            System.out.print("Masukkan jumlah pesanan : ");
            jaket.jumlah = in.nextInt();
            jaket.setjumlah(jaket.jumlah);
            System.out.println("---------------------------------------");
            System.out.println("Jaket B\t\t"+jaket.getjumlah()+"\t"+"Rp 125.000,00");
            System.out.println("");
            jaket.hitungB();
        } else if(pil == 3){
            System.out.println("Pilihan Anda            : JAKET C");
            System.out.print("Masukkan jumlah pesanan : ");
            jaket.jumlah = in.nextInt();
            jaket.setjumlah(jaket.jumlah);
            System.out.println("---------------------------------------");
            System.out.println("Jaket C\t\t"+jaket.getjumlah()+"\t"+"Rp 175.000,00");
            System.out.println("");
            jaket.hitungC();
        } else
            System.out.println("*** TERIMA KASIH ***");
            System.exit(0);
    }  
}