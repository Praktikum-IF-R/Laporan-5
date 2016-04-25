package pabrikjaket;
import java.util.Scanner;
public class MainPabrik {
    public static void main(String[]args){
        Scanner input=new Scanner (System.in);
        System.out.println("-------------------------------------------");
        System.out.println("    Selamat Datang Di CV.Labkomdas      ");
        System.out.println("-------------------------------------------");
        System.out.println("    Mohon Isi Biodata Pembelian Anda    ");
        System.out.println();
        System.out.print("Masukan Nama Pembeli      :");
        String nama=input.next();
        System.out.print("Masukan Alamat Pembeli    :");
        String alamat=input.next();
        System.out.print("Masukan No Hp             :");
        String nohp=input.next();
        System.out.println("-------------------------------------------");
        System.out.println("Jenis Jaket");
        System.out.println("1.Jaket A");
        System.out.println("2.Jaket B");
        System.out.println("3.Jaket C");
        System.out.print("Masukan Jenis Jaket :");
        int jenis=input.nextInt();
        if(jenis == 1 ){
            PabrikJaket.jaketA();
            System.out.print("Masukan jumlah pembelian    :");
            int pembelian=input.nextInt();
            
            if (pembelian > 100 ){
              int harga=95000*pembelian;
              System.out.println("Harga Jaket A=Rp."+harga);
       
            }else {
                int harga=100000*pembelian;
                System.out.println("Harga Jaket A=Rp."+harga);
            }
            
        }else if(jenis == 2){
            PabrikJaket.jaketB();
            System.out.print("Masukan jumlah pembelian    :");
            int pembelian=input.nextInt();
             
            if (pembelian > 100 ){
                int harga=120000*pembelian;
                System.out.println("Harga Jaket B=Rp."+harga);
        
            }else {
                int harga=125000*pembelian;
                System.out.println("Harga Jaket A=Rp."+harga);
            }
            
        }else if(jenis ==3){
            PabrikJaket.jaketC();
            System.out.print("Masukan jumlah pembelian    :");
            int pembelian=input.nextInt();
            
            if (pembelian > 100 ){
                int harga=160000*pembelian;
                System.out.println("Harga Jaket A=Rp."+harga);
       
            }else {
                int harga=175000;
                System.out.println("Harga Jaket A=Rp."+harga);
            }
            
        }else{
            System.out.println("Jaket yang anda pilih tidak Ada di menu,pilih Sesuai menu");
        }
        System.out.println();
        System.out.println("Terimakasi Atas Kunjungan Anda");
    }
}
