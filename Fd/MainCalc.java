package Fd;
import java.util.Scanner;
public class MainCalc {
    public static void main(String[] args) {
        Calculator fd = new Calculator();
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Pembilang 1 : ");
        int a = input.nextInt();
        System.out.print("Masukkan Nilai Penyebut 1  : ");
        int b = input.nextInt();
        System.out.print("Masukkan Nilai Pembilang 2 : ");
        int c = input.nextInt();
        System.out.print("Masukkan Nilai Penyebut 2  : ");
        int d = input.nextInt();
        System.out.println("NILAI");
        System.out.println("Nilai 1 : " + a + "/" + b);
        System.out.println("Nilai 2 : " + c + "/" + d);
        System.out.println("======PILIH SALAH SATU======");
        System.out.println("1. Hitung Jumlah");
        System.out.println("2. Hitung Pengurangan");
        System.out.println("3. Hitung Perkalian");
        System.out.println("4. Hitung Pembagian\n");
        String pil2;
        do{
        System.out.print("Masukkan pilihan anda : ");
        int pil = input.nextInt();
        switch(pil){
            case 1 : System.out.println("Hitung Penjumlahan");
                     Calculator.hitungPenjumlahan(a, b, c, d);
                     fd.sederhana(); break;
            case 2 : System.out.println("Hitung Pengurangan");
                     Calculator.hitungPengurangan(a, b, c, d);
                     fd.sederhana(); break;
            case 3 : System.out.println("Hitung Perkalian");
                     fd.hitungPerkalian(a, b, c, d);
                     fd.sederhana(); break;
            case 4 : System.out.println("Hitung Pembagian");
                     fd.hitungPembagian(a, b, c, d);
                     fd.sederhana(); break;
            }
        System.out.print("Ada lagi? (Y/N) : ");
        pil2 = input.next();
        System.out.println();
        }while(pil2.equalsIgnoreCase("Y"));
        System.out.println("=============TERIMA KASIH============");
    }
}

    

