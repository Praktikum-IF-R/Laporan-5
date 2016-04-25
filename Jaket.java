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
public class Jaket {
     private final int jaketA = 100000;
     private final int jaketB = 125000;
     private final int jaketC = 175000;
     private int JJaket, HJaket;
 
     public void JualJaket(int pilihan, int JJaket) {
         switch(pilihan){
             case 1 :
             if (JJaket > 100) {
                 HJaket = 95000 * JJaket;
                 System.out.println("Pembelian lebih dari 100, Total harga jaket A = Rp " + HJaket);
             } else {
                 HJaket = jaketA * JJaket;
                 System.out.println("Total harga jaket A = Rp " + HJaket);
             }break;
             case 2 :
             if (JJaket > 100) {
                 HJaket = 120000 * JJaket;
                 System.out.println("Pembelian lebih dari 100, Total harga jaket B = Rp " + HJaket);
             } else {
                 HJaket = jaketB * JJaket;
                 System.out.println("Total harga jaket B = Rp " + HJaket);
             }break;
             case 3 :
             if (JJaket > 100) {
                 HJaket = 175000 * JJaket;
                 System.out.println("Pembelian lebih dari 100, Total harga jaket C = Rp " + HJaket);
             } else {
                 HJaket = jaketC * JJaket;
                 System.out.println("Total harga jaket C = Rp " + HJaket);
             }break;
             default : break;
             //System.out.println("Maaf, pilihan Anda tidak tersedia");
         }
     }
}