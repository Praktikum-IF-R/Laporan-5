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
public class MainOperatorStatic {
    //deklarasi variabel    
    public static int pembilang1,penyebut1,pembilang2,penyebut2;
    public static void main(String[] args) {
        //membuat fungsi scanner
        Scanner in = new Scanner (System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("***** PROGRAM PENGHITUNG PECAHAN MATEMATIKA *****");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //masukan user
        System.out.print("Masukkan pembilang bilangan 1     : ");
        pembilang1 = in.nextInt();
        System.out.print("Masukkan penyebut bilangan  1     : ");
        penyebut1 = in.nextInt();
        System.out.println(".................................................");
        System.out.println("bilangan pertama : "+ pembilang1 +"/"+penyebut1);
        System.out.println(".................................................");
        System.out.print("Masukkan pembilang bilangan 2     : ");
        pembilang2 = in.nextInt();
        System.out.print("Masukkan penyebut bilangan  2     : ");
        penyebut2 = in.nextInt();
        System.out.println(".................................................");
        System.out.println("bilangan kedua   : "+ pembilang2 +"/"+penyebut2);      
        System.out.println(".................................................");
        
//pemanggilan method static tanpa harus membuat objek terlebih dahulu
        
        MethodStatic.jumlah(pembilang1, penyebut1, pembilang2, penyebut2);
        MethodStatic.kurang(pembilang1, penyebut1, pembilang2, penyebut2);
        
//pemanggilan method yang bukan static maka harus menginstance suatu object terlebih dahulu
//agar dapat dipanggil/dijalan kan method yang di panggil
        
        MethodStatic matematika = new MethodStatic();
        matematika.kali(pembilang1, penyebut1, pembilang2, penyebut2);
        matematika.bagi(pembilang1, penyebut1, pembilang2, penyebut2);
    }
}
