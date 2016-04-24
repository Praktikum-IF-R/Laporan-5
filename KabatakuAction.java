package StaticAndFinal;
import java.util.Scanner;
public class KabatakuAction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kabataku k1 = new Kabataku();
        int pil;
        System.out.println("           Program Kabataku        ");
        System.out.println("-----------------------------------");
        do{
        System.out.println("1.Penjumlahan");
        System.out.println("2.Pengurangan");
        System.out.println("3.Perkalian");
        System.out.println("4.Pembagian");
        System.out.println("5.Penyederhanaan");
        System.out.println("6.Keluar");
        System.out.print("Masukan Pilihan Anda              \t:");
        pil = input.nextInt();
        switch(pil){
            case 1 : System.out.println("Penjumlahan");
                     System.out.println("----------------------");
                     System.out.print("Masukan Angka      \t:");
                     double bil1 = input.nextDouble();
                     System.out.print("Masukan Angka      \t:");
                     double bil2 = input.nextDouble();
                     Kabataku.penjumlahan(bil1, bil2);
                     System.out.println("");
                     break;
            case 2 : System.out.println("Pengurangan");
                     System.out.println("---------------------");
                     System.out.print("Masukan Angka      \t:");
                     double bil3 = input.nextDouble();
                     System.out.print("Masukan Angka      \t:");
                     double bil4 = input.nextDouble();
                     Kabataku.pengurangan(bil3, bil4);
                     System.out.println("");
                     break;
            case 3 : System.out.println("Perkalian");
                     System.out.println("----------------------");
                     System.out.print("Masukan Angka      \t:");
                     double bil5 = input.nextDouble();
                     System.out.print("Masukan Angka      \t:");
                     double bil6 = input.nextDouble();
                     k1.perkalian(bil5, bil6);
                     System.out.println("");
                     break;
            case 4 : System.out.println("Pembagian");
                     System.out.println("-----------------------");
                     System.out.print("Masukan Angka      \t:");
                     double bil7 = input.nextDouble();
                     System.out.print("Masukan Angka      \t:");
                     double bil8 = input.nextDouble();
                     k1.pembagian(bil7, bil8);
                     System.out.println("");
                     break;
            case 5 : System.out.println("Penyederhanaan");
                     System.out.println("------------------------");
                     System.out.print("Masukan Angka      \t:");
                     double bil9 = input.nextDouble();
                     System.out.print("Masukan Angka      \t:");
                     double bil10 = input.nextDouble();
                     k1.sederhana(bil9, bil10);
                     System.out.println("");
                     break;
            case 6 : System.out.println("Exit From Program");
                     break;
        }
        }while(pil!=6);        
    }
}

