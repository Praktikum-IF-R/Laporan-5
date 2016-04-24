package hitung;
import java.util.Scanner;
public class MainHitung {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka pertama (x): ");
        int x = input.nextInt();
        System.out.print("Masukkan angka kedua (y)  : ");
        int y = input.nextInt();
        System.out.println("Penjumlahan(x+y) : "+Hitung.getPenjumlahan(x,y));
        System.out.println("Pengurangan(x-y) : "+Hitung.getPengurangan(x,y));
        Hitung hitung1 = new Hitung();
        System.out.println("Perkalian(x*y)   : "+hitung1.getPerkalian(x,y));
        System.out.println("Pembagian(x/y)   : "+hitung1.getPembagian(x,y));
        hitung1.Sederhana(x,y);
        System.out.print("Penyederhanaan(x/y): ");
        hitung1.display();
    }
}