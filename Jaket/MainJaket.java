package jaket;
import java.util.Scanner;
public class MainJaket {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int pilih;
        do{
        System.out.println("---------------------------------------------");
        System.out.println("-----------WELCOME TO DDR'S JACKET-----------");
        System.out.println("---------------------------------------------");
        System.out.println(" Pilihan\t\t\tHarga");
        System.out.println("\n1. Jaket A(Sweater)\t\tRp 100.000");
        System.out.println("2. Jaket B(Parasut)\t\tRp 125.000");
        System.out.println("3. Jaket C(Kulit)\t\tRp 175.000");
        System.out.println("4. Keluar");
        System.out.println();
        
        System.out.print("Masukkan Pilihan Jaket anda  : ");
        pilih=input.nextInt();
        switch(pilih){
            case 1 : System.out.print("Masukkan Jumlah Jaket dibeli : ");
                     int a=input.nextInt();
                     Jaket j1 = new Jaket();
                     j1.HargajaketA(a);break;
            case 2 : System.out.print("Masukkan Jumlah Jaket dibeli : ");
                     int b=input.nextInt();
                     Jaket j2 = new Jaket();
                     j2.HargajaketB(b);break;
            case 3 : System.out.print("Masukkan Jumlah Jaket dibeli : ");
                     int c=input.nextInt();
                     Jaket j3 = new Jaket();
                     j3.HargajaketC(c);break;
            case 4 : System.out.println("--------------------------------------------");
                     System.out.println("--Terimkasih, Ditunggu Orderan Selanjutnya--");
                     System.out.println("--------------------------------------------"); break;
        }
    }
        while(pilih!=4); }
}
