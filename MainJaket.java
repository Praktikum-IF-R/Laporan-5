package mainjaket;
import java.util.Scanner;
public class MainJaket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("\tPembelian Jaket");
        System.out.println("------------------------------");
        System.out.println("Harga Jaket :");
        System.out.println("Jaket A Rp 100000");
        System.out.println("Jaket B Rp 125000");
        System.out.println("Jaket C Rp 175000");
        System.out.println("");
        System.out.println("Pembelian lebih dari 100 akan \nmendapatkan diskon");
        System.out.println("------------------------------");
        System.out.print("Masukkan jumlah jaket A : ");
        int a = input.nextInt();
        System.out.print("Masukkan jumlah jaket B : ");
        int b = input.nextInt();
        System.out.print("Masukkan jumlah jaket C : ");
        int c = input.nextInt();
        System.out.println("------------------------------");
        long hargaA,hargaB,hargaC;
        if(a>100||b>100||c>100){
            hargaA = Jaket.getHargaA(a);
            hargaB = Jaket.getHargaB(b);
            hargaC = Jaket.getHargaC(c);
            Jaket jaket = new Jaket(hargaA,hargaB,hargaC);
            System.out.println("Total Jaket \t : "+(a+b+c));
            System.out.println("Total Pembayaran : Rp "+jaket.getTotalHarga(a, b, c));
            System.out.println("------------------------------");
        }
        else{
            Jaket jaket = new Jaket();
            System.out.println("Total jaket \t : "+(a+b+c));
            System.out.println("Total Pembayaran : Rp "+jaket.getTotalHarga(a, b, c));
            System.out.println("------------------------------");
        }
    }
}