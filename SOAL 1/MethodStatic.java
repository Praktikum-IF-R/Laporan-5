/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticModiefier;

import java.util.Scanner;

/**
 *
 * @author DS
 */
public class MethodStatic {
//deklarasi static variabel
    public static int pembilang, penyebut;
    Scanner in = new Scanner(System.in);
//method static jumlah untuk menjumlahkan dengan parameter masing* pembilang dan penyebut
    public static void jumlah(int pembilang1, int penyebut1, int pembilang2, int penyebut2) {
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("       OPERASI PENGURANGAN PECAHAN");        
        System.out.println(pembilang1+"/"+penyebut1+" + "+pembilang2+"/"+penyebut2);
        //kondisi ketika penyebut sama
        if (penyebut1 == penyebut2) {
            int jumlah = pembilang1 + pembilang2;            
            System.out.println("Hasilnya adalah : " + jumlah + "/" + penyebut1);            
        //kondisi ketika penyebut tidak sama    
        } else {
            pembilang = (pembilang1 * penyebut2) + (pembilang2 * penyebut1);
            penyebut = penyebut1 * penyebut2;            
            System.out.println("Hasilnya adalah : " + pembilang + "/" + penyebut);
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
//method static kurang untuk operasi matematika pengurangan pembilang dan penyebut pada parameternya
    public static void kurang(int pembilang1, int penyebut1, int pembilang2, int penyebut2) {
        //operasi matematika untuk pembilang dan penyebut
        pembilang = (pembilang1 * penyebut2) - (pembilang2 * penyebut1);
        penyebut = penyebut1 * penyebut2;
        int kurang = pembilang1 - pembilang2;      
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("       OPERASI PENGURANGAN PECAHAN");
        System.out.println(pembilang1+"/"+penyebut1+" - "+pembilang2+"/"+penyebut2);        
        //seleksi kondisi operasi matematika jika dikurangi
        if (pembilang == 0) {           
            System.out.println("Hasilnya adalah : " + pembilang);
        } else if (penyebut1 == penyebut2) {
            System.out.println("Hasilnya adalah : " + kurang + "/" + penyebut1);
        } else {
            System.out.println("Hasilnya adalah : " + pembilang + "/" + penyebut);
        }
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
    }
//method non static kali untuk operasi perkalian
    public void kali(int pembilang1, int penyebut1, int pembilang2, int penyebut2) {
        //operasi matematika pecahan kali
        pembilang = pembilang1 * pembilang2;
        penyebut = penyebut1 * penyebut2;
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("          OPERASI PERKALIAN PECAHAN");
        System.out.println(pembilang1+"/"+penyebut1+" X "+pembilang2+"/"+penyebut2);
        System.out.println("Hasilnya adalah : " + pembilang + "/" + penyebut);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.print("sudah sederhanakah nilainya (sudah/belum) ? ");
        String belum = in.next();
        if (belum.equalsIgnoreCase("belum")) {
            sederhana(pembilang, penyebut);
        }
    }
//method non static bagi untuk operasi pembagian
    public void bagi(int pembilang1, int penyebut1, int pembilang2, int penyebut2) {
        //operasi matematika pecahan bagi
        int atas = (pembilang1 * penyebut2);
        int bawah = (pembilang2 * penyebut1);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("          OPERASI PEMBAGIAN PECAHAN");
        System.out.println(pembilang1+"/"+penyebut1+" : "+pembilang2+"/"+penyebut2);        
        System.out.println("Nilai Pembagiannya adalah : " + atas + "/" + bawah);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.print("sudah sederhanakah nilainya (sudah/belum) ? ");
        String belum = in.next();
        if (belum.equalsIgnoreCase("belum")) {
            sederhana(atas, bawah);
        }
    }
//method non static sederhana untuk menyederhanakan

    private void sederhana(int atas, int bawah) {
//perulangan untuk menemukan nilai yang lebih sederhana
        for (int x = bawah; x >= 1; x--) {
            if (atas % x == 0 && bawah % x == 0) {
                atas /= x;
                bawah /= x;
            }
        }
        //seleksi kondisi untuk menemukan nilai sederhananya
        System.out.println("..........................................................");
        if (bawah == 1) {
            System.out.println("Hasil dari penyederhanaan bilangan tersebut adalah : " + atas);
        } else {
            System.out.println("Hasil dari penyederhanaan bilangan tersebut adalah : " + atas + "/" + bawah);
        }
        
        System.out.println("..........................................................");
    }
}
