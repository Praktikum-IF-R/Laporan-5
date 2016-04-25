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
public class Aritmatika {
    public int x, y;
    
    public Aritmatika(int a, int b){
        x = a;
        y = b;
    }
    public static void hitungPenjumlahan(int a, int b){
        int hasil = a+b;
        System.out.println("Maka hasil dari penjumlahan : "+hasil);
    }
    public static void hitungPengurangan(int a, int b){
        int hasil = a-b;
        System.out.println("Maka hasil dari pengurangan : "+hasil);
    }
    public void hitungPerkalian(int a, int b){
        int hasil = a*b;
        System.out.println("Maka hasil dari perkalian   : "+hasil);
    }
    public void hitungPembagian(int a, int b){
        double hasil = (double) a/b;
        System.out.println("Maka hasil dari pembagian   : "+hasil);
        System.out.println("Bentuk pecahannya           : "+a+"/"+b);
    }
    public void Sederhana(){
        int temp, A, B;
        A = (x<y) ? y : x;
        B = (x<y) ? x : y;
        do{
            temp = A%B;
            A = B;
            B = temp;
        }while(B != 0);
        x/=A;
        y/=A;
        System.out.println("Maka hasil dari penyederhanaan : "+x+"/"+y);
    }
}
