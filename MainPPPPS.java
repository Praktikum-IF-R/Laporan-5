package praktikum1;

import java.util.Scanner;

public class MainPPPPS {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan nilai 1: ");
        int nil1 = in.nextInt();
        System.out.print("Masukkan nilai 2: ");
        int nil2 = in.nextInt();
        PPPPS.hitungPenjumlahan(nil1, nil2);
        PPPPS.hitungPengurangan(nil1, nil2);
        PPPPS b = new PPPPS();
        b.hitungPembagian(nil1, nil2);
        b.hitungPerkalian(nil1, nil2);
        System.out.print("masukkan nilai pembilang : ");
        int value1 = in.nextInt();
        System.out.print("masukkan nilai penyebut : ");
        int value2 = in.nextInt();
        System.out.println("Nilai pecahan "+value1+"/"+value2);
        b.Sederhana(value1, value2);
        
    }
}