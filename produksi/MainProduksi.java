package produksi;
import java.util.Scanner;
public class MainProduksi {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int pilihan = 0;
        int jumlah;
        System.out.println(" CV. Labkomdas ");
        System.out.println("1. Jaket dengan bahan A (Bahan Cotton) = Rp. 100000");
        System.out.println("2. Jaket dengan bahan B (Bahan Wol)    = Rp. 125000");
        System.out.println("3. Jaket dengan bahan C (Bahan Sutra)  = Rp. 175000");
        System.out.print("Pilih bahan jaket yang diinginkan      : ");
        pilihan = in.nextInt();
        switch (pilihan){
            case 1:
                System.out.println("Jika membeli lebih dari 100 jaket, maka akan mendapatkan diskon!");
                System.out.print("Masukkan jumlah jaket yang akan dibeli : ");
                jumlah = in.nextInt();
                System.out.println("");
                Produksi.jaketA(jumlah);
                System.out.println("===============================");
                break;
            case 2:
                System.out.println("Jika membeli lebih dari 100 jaket, maka akan mendapatkan diskon!");
                System.out.print("Masukkan jumlah jaket yang akan dibeli : ");
                jumlah = in.nextInt();
                System.out.println("");
                Produksi.jaketB(jumlah);
                System.out.println("===============================");
                break;
            case 3:
                System.out.println("Jika membeli lebih dari 100 jaket, akan mendapatkan diskon!");
                System.out.print("Masukkan jumlah jaket yang akan dibeli : ");
                jumlah = in.nextInt();
                System.out.println("");
                Produksi.jaketC(jumlah);
                System.out.println("================================");
                break;
            default:
                System.out.println("Maaf pilihan tidak tersedia!");
                break;
        }
    }   
}
