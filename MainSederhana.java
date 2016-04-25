/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rexy
 */
public class MainSederhana {
        public static void main(String[] args) {
        Sederhana s1 = new Sederhana(2,10);
        System.out.println("Hasil Penjumlahan = "+Sederhana.Tambah(2, 7));
        System.out.println("Hasil Pengurangan = "+Sederhana.Kurang(12,5));
        System.out.println("Hasil Perkalian   = "+s1.Kali(4, 5));
        System.out.println("Hasil Pembagian   = "+s1.Bagi(10.0, 5.0));
        s1.Sederhana();
    }
}


