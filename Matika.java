/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab5;

/**
 *
 * @author Anita Rizky A
 */
public class Matika {
    static int hasil;
    int t, a, b, x, y;   
    public Matika(int a, int b){
        x = a;
        y = b;
    }
    
    public static void hitungjumlah(int i, int j){
        hasil = i + j;
        System.out.println("Hasil Penjumlahan = " + hasil);
    }
    public static void hitungkurang(int i, int j){
        hasil = i - j;
        System.out.println("Hasil Pengurangan = " + hasil);
    }
    public static void hitungkali(int i, int j){
        hasil = i * j;
        System.out.println("Hasil Perkalian = " + hasil);
    }
    public static void hitungbagi(double i, double j){
        double hasil1 = i / j;
        System.out.println("Hasil Pembagian = " + hasil1);
    }

    public void Sederhana() {
        a = (x < y) ? y : x;
        b = (x < y) ? x : y;
        do{
            t = a%b;
            a = b;
            b = t;
        } while (b != 0);
        x = x / a;
        y = y / a;
        System.out.println("HAsil Penyederhanaan : "+x+" / "+y);
    }
}