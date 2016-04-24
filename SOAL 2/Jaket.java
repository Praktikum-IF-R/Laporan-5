/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KonstantaFinal;

/**
 *
 * @author DS
 */
public class Jaket {
//deklarasi static variabel dan konstanta final
    private static int totalA, totalB, totalC;
    public static final int bahanA = 100000;
    public static final int bahanB = 125000;
    public static final int bahanC = 175000;

    //static method BahanA
    public static void BahanA(int banyak) {        
        int hargaA = 95000;
        if (banyak > 100) {        
        //seleksi kondisi pemesanan    
            System.out.println("Harga perbiji Menjadi Rp."+hargaA);
            totalA = hargaA * banyak;
            System.out.println("Total Biaya " + banyak + " jaket Bahan A : Rp." + totalA);
        } else {
            totalA = bahanA * banyak;
            System.out.println("Total Biaya " + banyak + " jaket Bahan A : Rp." + totalA);
        }
    }
    //static method BahanB
    public static void BahanB(int banyak) {
        int hargaB = 120000;
        //seleksi kondisi pemesanan
        if (banyak > 100) {                       
            System.out.println("Harga perbiji Menjadi Rp."+hargaB);
            totalB = hargaB * banyak;
            System.out.println("Total Biaya " + banyak + " jaket Bahan B : Rp." + totalB);
        } else {
            totalB = bahanB * banyak;
            System.out.println("Total Biaya " + banyak + " jaket Bahan B : Rp." + totalB);
        }
    }
    //static method BahanC
    public static void BahanC(int banyak) {
        int hargaC = 160000;   
        if (banyak > 100) {        
        //seleksi kondisi pemesanan    
            System.out.println("Harga perbiji Menjadi Rp."+hargaC);
            totalC = hargaC * banyak;
            System.out.println("Total Biaya " + banyak + " jaket Bahan C : Rp." + totalC);
        } else {
            totalC = bahanC * banyak;
            System.out.println("Total Biaya " + banyak + " jaket Bahan A : Rp." + totalC);
        }
    }
    //static method untuk diskon
    public static void diskon(){
        int hargaA = 95000;
        int hargaB = 120000;
        int hargaC = 160000;       
            System.out.println("Harga jaket bahan A perbiji Menjadi Rp."+hargaA);                    
            System.out.println("Harga jaket bahan B perbiji Menjadi Rp."+hargaB);
            System.out.println("Harga jaket bahan C perbiji Menjadi Rp."+hargaC);
        
    }
    //Static method getTotal untuk mendapatkan total
    public static int getTotal() {
        int biaya = totalA + totalB + totalC;
        return biaya;
    }
}
