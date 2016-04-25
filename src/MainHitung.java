package Tugas;
import java.util.Scanner;
public class MainHitung {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Hitung kalkulator = new Hitung();
        boolean m = true;
        while(m){
        System.out.println("=============||Program Perhitungan||=============");
        System.out.println("1.Penjumlahan\n2.Pengurangan");
        System.out.println("3.Perkalian\n4.Pembagian");
        System.out.print("5.Pecahan\n6.Keluar\nInput Anda: ");
        int d = in.nextInt();
        switch(d){
            case 1  :   System.out.print("Masukkan angka 1: ");
                        int a = in.nextInt();
                        System.out.print("Masukkan angka 2: ");
                        int b = in.nextInt();
                        Hitung.jumlah(a, b);
                        break;
            case 2  :   System.out.print("Masukkan angka 1: ");
                        a = in.nextInt();
                        System.out.print("Masukkan angka 2: ");
                        b = in.nextInt();
                        Hitung.kurang(a, b);
                        break;
            case 3  :   System.out.print("Masukkan angka 1: ");
                        a = in.nextInt();
                        System.out.print("Masukkan angka 2: ");
                        b = in.nextInt();
                        kalkulator.kali(a, b);
                        break;
            case 4  :   System.out.print("Masukkan angka 1: ");
                        a = in.nextInt();
                        System.out.print("Masukkan angka 2: ");
                        b = in.nextInt();
                        kalkulator.bagi1(a, b);
                        break;
            case 5  :   System.out.print("Masukkan angka 1: ");
                        a = in.nextInt();
                        System.out.print("Masukkan angka 2: ");
                        b = in.nextInt();
                        kalkulator.bagi2(a, b);
                        break;
            case 6  :   m = false;
                        break;
            default :   System.out.println("Pilihan anda tidak ditemukan.");
        }
        }
    }
}
