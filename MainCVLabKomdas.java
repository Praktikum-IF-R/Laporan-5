package cvlabkomdas;

import java.util.Scanner;

public class MainCVLabKomdas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan = 0;
        CVLabKomDas a = new CVLabKomDas();
        do {
            System.out.println("Program CV LABKomdas");
            System.out.println("Daftar Harga");
            System.out.println("1. Jaket A Rp 100.000 jika beli lebih dari 100 maka harga per buah Rp 95.000");
            System.out.println("2. Jaket B Rp 125.000 jika beli lebih dari 100 maka harga per buah Rp 120.000");
            System.out.println("3. Jaket C Rp 175.000 jika beli lebih dari 100 maka harga per buah Rp 160.000");
            System.out.println("4. Nota Pembelian");
            System.out.println("5. STOP");
            System.out.println("Masukkan pilihan : ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan Jumlah Jaket yang akan anda beli :");
                    int jumlah1 = input.nextInt();
                    a.jaketA(jumlah1);
                    break;
                case 2:
                    System.out.println("Masukkan Jumlah Jaket yang akan anda beli :");
                    int jumlah2 = input.nextInt();
                    a.jaketB(jumlah2);
                    break;
                case 3:
                    System.out.println("Masukkan Jumlah Jaket yang akan anda beli :");
                    int jumlah3 = input.nextInt();
                    a.jaketC(jumlah3);
                    break;
                case 4:
                    System.out.println("Nota Pembelian :");
                    a.JumlahPembelian();
                    a.displayMessage();
                    break;
            }
        } while (pilihan != 5);

    }
}
