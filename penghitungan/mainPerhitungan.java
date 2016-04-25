package penghitungan;

import java.util.Scanner;

public class mainPerhitungan {

    public static Penghitungan kalibagi = new Penghitungan();

    public static void main(String[] args) {
        Scanner stri = new Scanner(System.in);
        Scanner indo = new Scanner(System.in);
        int yati;
        String yatidak;
        do {
            System.out.println("= = = = = = = = = = = = = = = = ");
            System.out.println("<< MESIN HITUNG >>");
            System.out.println("1. PENJUMLAHAN");
            System.out.println("2. PENGURANGAN");
            System.out.println("3. PERKALIAN");
            System.out.println("4. PEMBBAGIAN");
            System.out.println("5. KELUAR");
            System.out.println("= = = = = = = = = = = = = = = = ");
            System.out.print("Masukkan Pilihan: ");
            int pilihan = indo.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("");
                    System.out.print("Masukkan Jumlah Angka yang akan Dijumlahkan: ");
                    int banyak = indo.nextInt();
                    for (int x = 0; x < banyak; x++) {
                        int b = x + 1;
                        System.out.print("Masukkan Nilai ke-" + b + ": \t");
                        int a = indo.nextInt();
                        Penghitungan.Penjumlahan(banyak, x, a);
                    }
                    break;
                case 2:
                    System.out.println("");
                    System.out.print("Masukkan Jumlah Angka yang akan Dikurangkan: ");
                    int banya = indo.nextInt();
                    for (int x = 0; x < banya; x++) {
                        int b = x + 1;

                        System.out.print("Masukkan Nilai ke-" + b + ": \t");
                        int a = indo.nextInt();
                        Penghitungan.Pengurangan(banya, x, a);
                    }
                    break;
                case 3:
                    System.out.println("");
                    System.out.print("Masukkan Jumlah Angka yang akan Dikalikan: ");
                    int bany = indo.nextInt();
                    for (int x = 0; x < bany; x++) {
                        int b = x + 1;

                        System.out.print("Masukkan Nilai ke-" + b + ": \t");
                        double a = indo.nextInt();
                        kalibagi.Perkalian(bany, x, a);
                    }
                    break;
                case 4:
                    System.out.println("");
                    System.out.print("Masukkan Bilangan Pembilang   :  ");
                    int pembilang = indo.nextInt();
                    System.out.print("Masukkan Bilangan Penyebut    :  ");
                    int penyebut = indo.nextInt();
                    kalibagi.Pembagian(pembilang, penyebut);
                    System.out.print("Sederhanakan Hasil? (Y/T)     :  ");
                    String seder = stri.nextLine();
                    if (seder.equalsIgnoreCase("Y")) {
                        System.out.println("-  -  -  -  -  -  -  -  -  -  -  -");
                        kalibagi.Sederhana(pembilang, penyebut);
                        System.out.println("-  -  -  -  -  -  -  -  -  -  -  -");
                        System.out.println("");
                    } else {
                        System.out.println("");
                    }

                    break;
                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("PILIHAN TIDAK ADA");
            }

            System.out.print("==> TAMPILKAN MENU TAMPIL? (Y/T)  : ");
            yatidak = stri.nextLine();

        } while (yatidak.equalsIgnoreCase("Y"));

    }

}
