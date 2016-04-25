package StaticdanFinal;
import java.util.Scanner;
public class MainOperasi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Operasi op = new Operasi();
        int pil;
        do {
            System.out.println("Menu Operasi ");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. KELUAR");
            System.out.print("Pilih menu no : ");
            pil = in.nextInt();
            if (pil == 1) {
                System.out.println("OPERASI PENJUMLAHAN");
                System.out.print("bil 1 = ");
                int bil1 = in.nextInt();
                System.out.print("bil 2 = ");
                int bil2 = in.nextInt();
                Operasi.Penjumlahan(bil1, bil2);
            } else if (pil == 2) {
                System.out.println("OPERASI PENGURANGAN");
                System.out.print("bil 1 = ");
                int bil1 = in.nextInt();
                System.out.print("bil 2 = ");
                int bil2 = in.nextInt();
                Operasi.Pengurangan(bil1, bil2);
            } else if (pil == 3) {
                System.out.println("OPERASI PERKALIAN");
                System.out.print("bil 1 = ");
                int bil1 = in.nextInt();
                System.out.print("bil 2 = ");
                int bil2 = in.nextInt();
                op.Perkalian(bil1, bil2);
            } else if (pil == 4) {
                System.out.println("OPERASI PEMBAGIAN");
                System.out.print("bil 1 = ");
                int bil1 = in.nextInt();
                System.out.print("bil 2 = ");
                int bil2 = in.nextInt();
                if ((bil1 >= bil2) && (bil1 % bil2 == 0)){
                    op.Pembagian(bil1, bil2);
                }else{
                    op.Sederhana(bil1, bil2);
                }
            }
        } while (pil != 5 && pil < 5);
    }
}
