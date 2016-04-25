/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS2;

/**
 *
 * @author Lenovo
 */
public class Jaket {
    private static long harga;
    private static final long A = 100000, B = 125000, C = 175000;
    public static long jaketA(int jumlah){
        if(jumlah>100)
            harga = 95000;
        else
            harga = A;
        return harga*jumlah;
    }
    public static long jaketB(int jumlah){
        if(jumlah>100)
            harga = 120000;
        else
            harga = B;
        return harga*jumlah;
    }
    public static long jaketC(int jumlah){
        if(jumlah>100)
            harga = 160000;
        else
            harga = C;
        return harga*jumlah;
    }
}
