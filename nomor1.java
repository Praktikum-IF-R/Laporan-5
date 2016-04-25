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
public class nomor1 {
    private int atas,bawah;
    public static int penjumlahan(int a, int b){
        return a+b;
    }
    public static int pengurangan(int a, int b){
        return a-b;
    }
    public int perkalian(int a, int b){
        return a*b;
    }
    public double pembagian(int a, int b){
        return (double)a/(double)b;
    }
    public void sederhana(int a, int b){
        int z=0,x,y;
        atas=a;
        bawah=b;
        for (int i=2;i<=100;i++){
            x=atas%i;
            y=bawah%i;
            if (x==0&&y==0){
                z=i;   
            }
        }
        if(z!=0){
            atas/=z;
            bawah/=z;
        }
        System.out.println(atas+"/"+bawah);
    }
}
