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
public class jaket {
    private final int jaketA = 100000;
    private final int jaketB = 125000;
    private final int jaketC = 175000;
    private int hasil;
    static int jumlah;
    
    public void setjumlah(int j){
        jumlah = j;
    }
    
    public int getjumlah(){
        return jumlah;
    }
    
    public void hitungA(){
        if (jumlah >= 100){
            System.out.println("Anda mendapat potongan  Rp 5000,00");
            hasil = jumlah * 95000;
        } else {
            hasil = jumlah * jaketA;
        }
        System.out.println("TOTAL                 = Rp "+hasil);
        System.out.println("---------------------------------------");
    }
    
    public void hitungB(){
        if (jumlah >= 100){
            System.out.println("Anda mendapat potongan  Rp 5000,00");
            hasil = jumlah * 120000;
        } else {
            hasil = jumlah * jaketB;
        }
        System.out.println("TOTAL                 = Rp "+hasil);
        System.out.println("---------------------------------------");
    }
    
    public void hitungC(){
        if (jumlah >= 100){
            System.out.println("Anda mendapat potongan  Rp 15000,00");
            hasil = jumlah * 160000;
        } else {
            hasil = jumlah * jaketC;
        }
        System.out.println("TOTAL                 = Rp "+hasil);
        System.out.println("---------------------------------------");
    }
    
}
