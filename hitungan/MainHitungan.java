package hitungan;
import java.util.Scanner;
public class MainHitungan{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Hitungan aaa = new Hitungan();
        System.out.println(" Operasi Penjumlahan ");
        System.out.print("Masukkan nilai 1 : ");
        int a = in.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        int b = in.nextInt();
        Hitungan.Penjumlahan(a, b);
        System.out.println("");
        System.out.println(" Operasi Pengurangan ");
        System.out.print("Masukkan nilai 1 : ");
        a = in.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        b = in.nextInt();
        Hitungan.Pengurangan(a, b);
        System.out.println("");
        System.out.println(" Operasi Perkalian ");
        System.out.print("Masukkan nilai 1 : ");
        a = in.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        b = in.nextInt();
        aaa.Perkalian(a, b);
        System.out.println("");
        System.out.println(" Operasi Pembagian ");
        System.out.print("Masukkan nilai 1 : ");
        double c = in.nextInt();
        System.out.print("Masukkan nilai 2 : ");
        double d = in.nextInt();
        aaa.Pembagian(c, d);
        System.out.println("");
        System.out.println(" Operasi Penyederhanaan Pecahan ");
        System.out.print("Masukkan pembilang : ");
        a = in.nextInt();
        System.out.print("Masukkan penyebut : ");
        b = in.nextInt();
        System.out.println("Bentuk sederhana dari " + a + "/" + b + " adalah " + aaa.Sederhana(a,b));
    }
}
    