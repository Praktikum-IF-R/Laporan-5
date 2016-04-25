package jaketmain;
import java.util.Scanner;
public class JaketMain {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int plh;
        System.out.println("            LABKOMDAS JAKET SHOP     ");
        System.out.println("=================================================");
        System.out.println("No\t||    Menu\t\t    ||    Harga");
        System.out.println("1\t||Jaket A        \t||Rp.100.000");
        System.out.println("2\t||Jaket B        \t||Rp.125.000");
        System.out.println("3\t||Jaket C        \t||Rp.175.000");
        System.out.println("4\t||Keluar");
        System.out.println("=================================================");
        System.out.println("Jika Membeli Lebih Dari 100,Anda Akan Mendapat Diskon   :");
        Jaket.Diskon();
        System.out.print("Masukan Nomor Pilihan Yang Ingin di Beli  :");
        plh = in.nextInt();
        do{ 
            switch(plh){
                case 1 : System.out.println("          JAKET A           ");
                         System.out.println("================================");
                         System.out.print("Jumlah Pembelian         :");
                         int jmlh = in.nextInt();
                         Jaket.jA(jmlh);
                         System.out.println("================================");
                         break;
                case 2 : System.out.println("          JAKET B           ");
                         System.out.println("================================");
                         System.out.print("Jumlah Pembelian         :");
                         int jmlh1 = in.nextInt();
                         Jaket.jB(jmlh1);
                         System.out.println("================================");
                         break;
                case 3 : System.out.println("          JAKET C             ");
                         System.out.println("================================");
                         System.out.print("Jumlah Pembelian         :");
                         int jmlh3 = in.nextInt();
                         Jaket.jC(jmlh3);
                         System.out.println("================================");
                         break;
                case 4 : System.out.println("Terima Kasih");
                         break;
        }
    }while(plh!=4);       
        System.out.println("Total Biaya Pembelian Adalah        \t:"+Jaket.getTotal());
        }
   }
    

