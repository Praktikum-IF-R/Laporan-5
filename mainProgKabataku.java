package bab5;

import java.util.Scanner;
public class mainProgKabataku {
    public static void main(String[] args) {
        String lagi;
        Scanner yes = new Scanner(System.in);
        Scanner yes2 = new Scanner(System.in);
        ProgKabataku operasi = new ProgKabataku();
        do{
        System.out.println("Menu:");
        System.out.println("1. Penjumlahan\t4. Pembagian");
        System.out.println("2. Pengurangan\t5. Penyederhana an Pecahan");
        System.out.println("3. Perkalian\t0. Keluar");
        System.out.print("Pilih → ");
        int pilih=yes.nextInt();
        switch (pilih){
            case 1: System.out.println("----------------Penjumlahan----------------");
            System.out.println("Catatan: Maksimal 3 angka yang diinputkan.");
            System.out.print("Input Angka 1 : ");
            int angka1=yes.nextInt();
            System.out.print("Input Angka 2 : ");
            int angka2=yes.nextInt();
            System.out.print("Input Angka 3 : ");
            int angka3=yes.nextInt();
            ProgKabataku.penjumlahan(angka1,angka2,angka3);
            System.out.println("--------------------------------------------");break;
            case 2: System.out.println("----------------Pengurangan----------------");
            System.out.println("Catatan: Maksimal 3 angka yang diinputkan.");
            System.out.print("Input Angka 1 : ");
            angka1=yes.nextInt();
            System.out.print("Input Angka 2 : ");
            angka2=yes.nextInt();
            System.out.print("Input Angka 3 : ");
            angka3=yes.nextInt();
            ProgKabataku.pengurangan(angka1, angka2, angka3);
            System.out.println("--------------------------------------------");break;
            case 3: System.out.println("-----------------Perkalian-----------------");
            System.out.println("Catatan: Maksimal 2 angka yang diinputkan.");
            System.out.print("Input Angka 1 : ");
            angka1=yes.nextInt();
            System.out.print("Input Angka 2 : ");
            angka2=yes.nextInt();
            operasi.perkalian(angka1, angka2);
            System.out.println("--------------------------------------------");break;
            case 4: System.out.println("-----------------Pembagian-----------------");
            System.out.println("Catatan: Maksimal 2 angka yang diinputkan.");
            System.out.print("Input Angka 1 : ");
            angka1=yes.nextInt();
            System.out.print("Input Angka 2 : ");
            angka2=yes.nextInt();
            operasi.pembagian(angka1, angka2);
            System.out.println("--------------------------------------------");break;
            case 5: System.out.println("--------------Penyederhanaan--------------");
            System.out.println("Inputkan Angka:");
            System.out.print("Pembilang : ");
            angka1=yes.nextInt();
            System.out.print("Penyebut  : ");
            angka2=yes.nextInt();
            operasi.Sederhana(angka1, angka2);
            System.out.println("--------------------------------------------");break;
            case 0: System.out.println("Program akan segera keluar. . .");System.exit(0);
            default : System.out.println("Menu yang dipilih tidak tercantum. Silahkan Ulangi.");
        }
            System.out.print("Pilih menu lagi? (Y|T): ");
            lagi=yes2.next();
        }while(lagi.equalsIgnoreCase("Y"));
    }
}
    

