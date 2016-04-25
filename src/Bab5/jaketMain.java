package Bab5;

import java.util.Scanner;

public class jaketMain {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Jaket harga = new Jaket();
        String type;
        int jumlah;
        System.out.println("Selamat datang di CV. Labkomdas");
        System.out.println("Katalog Jaket saat ini : ");
        System.out.println("A. Filkom Casual @IDR 100000");
        System.out.println("B. Filkom Varsity @IDR 125000");
        System.out.println("C. Filkom Leather @IDR 175000");
        System.out.print("Input huruf jaket pesanan anda : ");
        type = s.next();
        if (type.equalsIgnoreCase("a") || type.equalsIgnoreCase("b") || type.equalsIgnoreCase("c")) {
            System.out.print("Jumlah pembelian : ");
            jumlah = s.nextInt();
            Jaket.pesan(type, jumlah);
            System.out.println("========= CV. Labkomdas ========");
            System.out.println("======== PAYMENT INVOICE =======");
            System.out.println("Type Jaket      = " + type);
            System.out.println("Jumlah beli     = " + jumlah);
            System.out.println("Diskon          = " + harga.getStat());
            System.out.println("Harga persatuan = Rp." + harga.getHargaAkhir());
            System.out.println("Total           = Rp." + harga.getTotal());
            System.out.println("===============================");
            System.out.println("*NB = Harga per-satuan telah di-\nsesuaikan dengan harga setelah\ndiskon");
            System.out.println("===============================");
        } else {
            System.out.println("Tipe jaket tidak dikenal!");
            System.out.println("Program dihentikan...");
            System.exit(0);
        }

    }
}
