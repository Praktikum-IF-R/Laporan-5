package hitungaja;
import java.util.Scanner;
public class Hitungaja {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan angka 1 : ");
        int angka1 = in.nextInt();
        System.out.println("Masukkan angka 2 : ");
        int angka2 = in.nextInt();
        Hitungajaclass.tambah(angka1, angka2);
        System.out.println("Masukkan angka 1 : ");
        int angka3 = in.nextInt();
        System.out.println("Masukkan angka 2 : ");
        int angka4 = in.nextInt();
        Hitungajaclass.kurang(angka3, angka4);
        System.out.println("Masukkan angka 1 : ");
        int angka5 = in.nextInt();
        System.out.println("Masukkan angka 2 : ");
        int angka6 = in.nextInt();
        Hitungajaclass hitung = new Hitungajaclass();
        hitung.kali(angka5, angka6);
        System.out.println("Masukkan angka 1 : ");
        int angka7 = in.nextInt();
        System.out.println("Masukkan angka 2 : ");
        int angka8 = in.nextInt();
        hitung.bagi(angka7, angka8);
        System.out.println("Masukkan angka 1 : ");
        int angka9 = in.nextInt();
        System.out.println("Masukkan angka 2 : ");
        int angka10 = in.nextInt();
        hitung.sederhana(angka9, angka10);        
    }
}
