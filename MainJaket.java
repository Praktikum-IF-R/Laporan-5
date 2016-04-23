package Laporan5;

/**
 *
 * @author wahyuridiansyah
 */
import java.util.Scanner;

public class MainJaket {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Jaket Jaket = new Jaket();
        System.out.println("------------------------------------------------");
        System.out.println("          StoreApps CV. LabKomdas");
        System.out.println("------------------------------------------------");
        System.out.println("DISKON! Membeli produk kami lebih dari 100 item akan mendapatkan kejutan diskon");

        for (int i = 1; i < 4; i++) {
            System.out.println();
            System.out.println("===========Pilihan Jenis Jaket===========");
            System.out.println("[Code: 001] -> Jaket A");
            System.out.println("[Code: 002] -> Jaket B");
            System.out.println("[Code: 003] -> Jaket C\n");
            System.out.print("Inputkan Code Jaket:  ");
            int pilihanUser = in.nextInt();

            System.out.print("Inputkan Jumlah Item Yang Dibeli:  ");
            int item = in.nextInt();
            System.out.println();
            Jaket.JualJaket(pilihanUser, item);
        }
    }
}
