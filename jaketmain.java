package lap5staticnfinal;

import java.util.Scanner;

public class jaketmain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\tCV. LABKOMDAS\n");
        System.out.println("PILIHAN PEMESANAN JAKET\n");
        System.out.println("1.JAKET A\t\tRp 100.00,00");
        System.out.println("2.JAKET B\t\tRp 125.00,00");
        System.out.println("3.JAKET C\t\tRp 175.00,00");
        System.out.println("4.KELUAR");
        System.out.println("*NB : Harga special untuk pembelian diatas 100 buah\n");
        System.out.print("Masukkan pilihan Anda : ");
        int pil = in.nextInt();
        do {
            if (pil == 4) {
                System.out.println("Terima kasih telah memesan di toko kami");
                break;
            }
            System.out.print("Masukkan jumlah jaket yang ingin Anda pesan : ");
            int jml = in.nextInt();
            System.out.println("=======================================================");
            jaket.pilihan(pil, jml);break;
        } while (pil != 4);

    }

}
