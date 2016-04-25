/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB_5;

/**
 *
 * @author Deltaviyahya
 */
public class Kalkulator {
    static double hasil;

    public static void Penjumlahan (double a, double b){

        hasil = a+b;

        System.out.println("Hasil penjumlahan    :" +hasil);

    }

    public static void Pengurangan (double a, double b){

        hasil = a-b;

        System.out.println("Hasil pengurangan    :" +hasil);

    }

    public void Perkalian(double a, double b){

        hasil = a*b;

        System.out.println("Hasil Perkalian      : " +hasil );

    }

    public void Pembagian(double a, double b){

        hasil = a/b;

        System.out.println("Hasil Pembagian      : " +hasil);

    }
    private int sdn(int a, int b) {
        return b == 0 ? a : sdn(b, a % b);

    }

    public void Sederhana (int a, int b){

        int sdn = this.sdn(a, b);

        System.out.println("Hasil Penyederhanaan : "+(a / sdn) 

+ "/"+(b / sdn));

    }

    
    
}
