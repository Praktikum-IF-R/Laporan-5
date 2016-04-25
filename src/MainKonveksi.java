package Tugas;
import java.util.Scanner;
public class MainKonveksi {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        boolean status = true;
        Konveksi z = new Konveksi();
        while(status){
        System.out.println("=============||CV LABKOMDAS||=============");
        System.out.println("Koleksi jaket:");
        System.out.println("1.Jaket Model A IDR Rp 100000");
        System.out.println("2.Jaker Model B IDR Rp 125000");
        System.out.println("3.Jaket Model C IDR RP 175000");
        System.out.println("4.Lihat Daftar Belanja");
        System.out.println("5.Keluar");
        System.out.print("Ingin beli yang mana?\nInput: ");
        int a = in.nextInt();
        switch (a){
            case 1  :   System.out.print("Jumlah yang ingin anda pesan: ");
                        int b = in.nextInt();
                        z.Disc(a, b);
                        z.beli(a, b);
                        break;
            case 2  :   System.out.print("Jumlah yang ingin anda pesan: ");
                        b = in.nextInt();
                        z.Disc(a, b);
                        z.beli(a, b);
                        break;
            case 3  :   System.out.print("Jumlah yang ingin anda pesan: ");
                        b = in.nextInt();
                        z.Disc(a, b);
                        z.beli(a, b);
                        break;
            case 4  :   z.daftarBelanja();
                        break;
            case 5  :   status = false; break;
            default :   System.out.println("Pilihan anda tidak ditemukan.");
        }
        }
    }
}
