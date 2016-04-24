package praktikumbab5;
import java.util.*;
import praktikumbab5.Calc;
public class CalcMain {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Angka Pertama     : ");
        double a = in.nextInt();
        System.out.print("Angka Kedua       : ");
        double b = in.nextInt();
        System.out.println("=====HAsil=====");
        Calc.Penjumlahan(a, b);
        Calc.Pengurangan(a, b);
        Calc satu = new Calc (a,b);
        satu.Perkalian();
        satu.Pembagian();
        System.out.println("\n=====Penyederhanaan=====");
        System.out.print("Masukkan Pembilang    = ");
        int c = in.nextInt();
        System.out.print("Masukkan Penyebut     = ");
        int d = in.nextInt();
        satu.Sederhana(c, d);   
    }
}

