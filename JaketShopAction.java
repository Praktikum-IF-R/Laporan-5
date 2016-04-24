package StaticAndFinal;
import java.util.Scanner;
public class JaketShopAction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pil;
        
            System.out.println("    LABKOMDAS JAKETSHOP     ");
            System.out.println("----------------------------");
            System.out.println("1.Jaket A       : Rp.100.000");
            System.out.println("2.Jaket B       : Rp.125.000");
            System.out.println("3.Jaket C       : Rp.175.000");
            System.out.println("4.Keluar");
            System.out.println("----------------------------");
            System.out.println("DAFTAR HARGA DISKON JIKA PEMBELIAN LEBIH DARI 100 ");
            JaketShop.HargaDiskon();
            System.out.println("");
            
            do{
                System.out.print("Masukan Pilihan Yang Ingin di Beli  \t:");
                pil = input.nextInt();
                System.out.println("");
                switch(pil){
                    case 1 : System.out.println("          JAKET A           ");
                             System.out.print("Masukan Jumlah Pemesanan   \t:");
                             int jum = input.nextInt();
                             JaketShop.JaketA(jum);
                             System.out.println("------------------------------");
                             break;
                    case 2 : System.out.println("          JAKET B           ");
                             System.out.print("Masukan Jumlah Pemesanan   \t:");
                             int jum2 = input.nextInt();
                             JaketShop.JaketB(jum2);
                             System.out.println("------------------------------");
                             break;
                    case 3 : System.out.println("          JAKET C             ");
                             System.out.print("Masukan Jumlah Pemesanan   \t:");
                             int jum3 = input.nextInt();
                             JaketShop.JaketC(jum3);
                             System.out.println("------------------------------");
                             break;
                    case 4 : System.out.println("Exit From Delivery");break;
                }
            }while(pil!=4);
            
            System.out.println("Total Biaya Pembelian Adalah        \t:"+JaketShop.getTotal());
           
        
    }
}
