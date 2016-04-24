package jaket;
import java.util.Scanner;
public class Jaket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("TOKO JAKET");
        System.out.println("1.Jaket A / Rp 100.000,-");
        System.out.println("2.Jaket B / Rp 125.000,-");
        System.out.println("3.Jaket C / Rp 175.000,-");
        System.out.println("Jika anda membeli lebih dari 100 maka anda akan mendapatkan harga spesial");
        System.out.print("Banyak Pembelian Jaket A : ");
        int input1 = in.nextInt();
        System.out.print("Banyak Pembelian Jaket B : ");
        int input2 = in.nextInt();
        System.out.print("Banyak Pembelian Jaket C : ");
        int input3 = in.nextInt();
        
        int a = Jaketclass.diskona(input1);
        int b = Jaketclass.diskonb(input2);
        int c = Jaketclass.diskonc(input3);
        
        System.out.println("Total Harga Jaket A : "+a);
        System.out.println("Total Harga Jaket B : "+b);
        System.out.println("Total Harga Jaket C : "+c);
        System.out.println("Total Yang Harus Dibayar : "+(a+b+c));
    }
}
