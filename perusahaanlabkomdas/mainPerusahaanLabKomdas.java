package perusahaanlabkomdas;

import java.util.Scanner;

public class mainPerusahaanLabKomdas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner st = new Scanner(System.in);
        PerusahaanLabKomdas jaket = new PerusahaanLabKomdas();
        String yatautidak;
        do {
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.println("\t\t CV LABKOMDAS JAKET SHOP");
            System.out.println("");
            System.out.println("1. Lihat Jaket dan Harganya [Recommend, ada promo]");
            System.out.println("2. Beli Jaket");
            System.out.println("3. Lihat Total Harga Jaket yg Dibeli");
            System.out.println("4. Keluar");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.print("Masukkan Pilihan : ");
            int pil = in.nextInt();

            switch (pil) {
                case 1:
                    System.out.println("");
                    System.out.println("Tipe Jaket \t\t Harga");
                    System.out.println("1. Jaket A \t\t Rp. 100.000");
                    System.out.println("2. Jaket B \t\t Rp. 125.000");
                    System.out.println("3. Jaket C \t\t Rp. 175.000");
                    System.out.println("");
                    System.out.println("[PROMO]");
                    System.out.println("Jika beli jaket lebih dari 100, maka harga akan berubah\n"
                            + "1. Jaket A \t\t Rp. 95.000\n"
                            + "2. Jaket B \t\t Rp. 120.000\n"
                            + "3. Jaket C \t\t Rp. 160.000");
                    System.out.println("");
                    break;

                case 2:
                    String a;
                    do {
                        System.out.println("");
                        System.out.println("\t PILIHAN JAKET");
                        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = =");
                        System.out.println("Tipe Jaket \t\t Harga");
                        System.out.println("1. Jaket A \t\t Rp. 100.000");
                        System.out.println("2. Jaket B \t\t Rp. 125.000");
                        System.out.println("3. Jaket C \t\t Rp. 175.000");
                        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = = = = =");
                        System.out.print("Masukkan Pilihan Jaket yg Akan Dibeli: ");
                        int pj = in.nextInt();
                        if (pj == 1) {
                            System.out.print("Berapa Banyak Jaket yg dibeli: ");
                            int bj = in.nextInt();
                            jaket.BeliJaketA(bj);
                        } else if (pj == 2) {
                            System.out.print("Berapa Banyak Jaket yg dibeli: ");
                            int bj = in.nextInt();
                            jaket.BeliJaketB(bj);
                        } else if (pj == 3) {
                            System.out.print("Berapa Banyak Jaket yg dibeli: ");
                            int bj = in.nextInt();
                            jaket.BeliJaketC(bj);
                        } else {
                            System.out.println("PILIHAN TIDAK ADA!");
                        }
                        System.out.println("");
                        System.out.print("Beli Jaket Lagi? (Y/T) : ");
                        a = st.nextLine();
                    } while (a.equalsIgnoreCase("Y"));
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("");
                    jaket.HargaDiskon();
                    System.out.println("");
                    break;

                case 4:
                    jaket.HargaDiskon();
                    System.exit(0);
                    break;

                default:
                    System.out.println("PILIHAN TIDAK ADA!");
                    break;
            }
            System.out.print("==> Ingin Menampilkan Menu? (Y/T):\t\t ");
            yatautidak = st.nextLine();
        } while (yatautidak.equalsIgnoreCase("Y"));
        jaket.HargaDiskon();
    }

}
