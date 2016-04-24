package perhitungan;
import java.util.Scanner;
public class MainPerhitungan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int pilih;
        do{
        System.out.println("Pilihan : ");
        System.out.println("1. Menghitung Penjumlahan");
        System.out.println("2. Menghitung Pengurangan");
        System.out.println("3. Menghitung Perkalian");
        System.out.println("4. Menghitung Pembagian");
        System.out.println("5. Menyederhanakan Pecahan");
        System.out.println("6. Keluar");
        
        System.out.println("Masukkan Pilihan anda : ");
        pilih =input.nextInt();
        switch (pilih){
            case 1 : {
                     System.out.println("Anda Memilih Program Penjumlahan : ");   
                     System.out.print("Masukkan Angka 1 : ");
                     int a=input.nextInt();
                     System.out.print("Masukkan Angka 2 : ");
                     int b=input.nextInt(); 
                     Perhitungan.Penjumlahan(a,b);
                     System.out.println();
                     break;}
            case 2 : {
                     System.out.println("Anda Memilih Program Pengurangan : ");
                     System.out.print("Masukkan Angka 1 : ");
                     int a=input.nextInt();
                     System.out.print("Masukkan Angka 2 : ");
                     int b=input.nextInt(); 
                     Perhitungan.Pengurangan(a,b);
                     System.out.println();
                     break;}
            case 3 : {
                     System.out.println("Anda Memilih Program Perkalian : ");
                     System.out.print("Masukkan Angka 1 : ");
                     int a=input.nextInt();
                     System.out.print("Masukkan Angka 2 : ");
                     int b=input.nextInt(); 
                     Perhitungan a1=new Perhitungan();
                     a1.Perkalian(a,b);
                     System.out.println();
                     break;}
            case 4 : {
                     System.out.println("Anda Memilih Program Pembagian : ");
                     System.out.print("Masukkan Angka 1 : ");
                     int a=input.nextInt();
                     System.out.print("Masukkan Angka 2 : ");
                     int b=input.nextInt(); 
                     Perhitungan a2=new Perhitungan();
                     a2.Pembagian(a,b);
                     System.out.println();
                     break;}
            case 5 : {System.out.println("Anda Memilih Program Menyederhanakan pecahan : ");
                     System.out.print("Masukkan Angka 1 : ");
                     int a=input.nextInt();
                     System.out.print("Masukkan Angka 2 : ");
                     int b=input.nextInt(); 
                     Perhitungan a3=new Perhitungan();
                     a3.Sederhana(a,b);
                     System.out.println();
                     break;}
            case 6 : {System.out.println("Keluar"); break;}
               }
       
        }
         while(pilih!=6);
        }
}