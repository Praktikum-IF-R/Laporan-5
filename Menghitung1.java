/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menghitung1;

/**
 *
 * @author LENY
 */
public class Menghitung1 {

     private int pembilang, penyebut;

    public void Rasional() {
        pembilang = 0;
        penyebut = 0;
    }

    public static void hitungPenjumlahan(int a, int b) {
        int nilai = a + b;
        System.out.println("nilaipenjumlahan :" + nilai);
    }

    public static void hitungpengurangan(int a, int b) {
        int nilai = a - b;
        System.out.println("nilaipengurangan adalah:" + nilai);
    }

    public void hitungPerkalian(int a, int b) {
        int nilai = a * b;
        System.out.println("nilai perkalian adalah : " + nilai);
    }

    public void hitungPemabagian(int a, int b) {
        double nilai = (a / b);
        System.out.println("nilai pembagian adalah : " + nilai);
    }

    public void Sederhana(int pembilang, int penyebut) {
        int temp, A, B;
        if (penyebut == 0) {
            return;
        }
        A = (pembilang < penyebut) ? penyebut : pembilang;
        B = (pembilang < penyebut) ? pembilang : penyebut;
        while (B != 0) {
            temp = A % B;
            A = B;
            B = temp;
        }
        pembilang /= A;
        penyebut /= A;
        System.out.println("penyederhanaan bilangan : "+pembilang+"/"+penyebut);
    }

}

