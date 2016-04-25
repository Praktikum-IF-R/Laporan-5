import java.util.Scanner;
public class VendorMain {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int choose;
        do{
            System.out.println("                       CV. LABKOMDAS                      ");
            System.out.println("    Menerima jasa pembuatan jaket untuk kebutuhan anda.   ");
            System.out.println("==========================================================");
            System.out.println("Daftar harga : ");
            System.out.println("1. Jaket A (Sport)   Rp100.000,-");
            System.out.println("2. Jaket B (Varsity) Rp125.000,-");
            System.out.println("3. Jaket C (Kulit)   Rp175.000,-");
            System.out.println("4. Selesai");
            System.out.println("==========================================================");
            System.out.print("Pilihan anda : ");
            choose = in.nextInt();
            switch(choose){
                case 1:{
                    System.out.println("Anda memilih jaket A / jaket sport.");
                    System.out.print("Masukkan jumlah jaket yang dipesan : ");
                    int jmla = in.nextInt();
                    Vendor.JaketA(jmla);
                    break;
                }
                case 2:{
                    System.out.println("Anda memilih jaket B / jaket varsity.");
                    System.out.print("Masukkan jumlah jaket yang dipesan : ");
                    int jmlb = in.nextInt();
                    Vendor.JaketB(jmlb);
                    break;
                }
                case 3:{
                    System.out.println("Anda memilih jaket C / jaket kulit.");
                    System.out.print("Masukkan jumlah jaket yang dipesan : ");
                    int jmlc = in.nextInt();
                    Vendor.JaketC(jmlc);
                    break;
                }
                case 4:{
                    System.out.println("Terima kasih telah mengunjungi toko kami.");
                    System.out.print("Kedatangan anda selalu dinanti.");
                    break;
                }
            }
        }while(choose!=4);
    }
}
