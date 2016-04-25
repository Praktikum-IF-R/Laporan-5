package aritmatika2;
import java.util.Scanner;
public class MainARITMATIKA2 {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    ARITMATIKA2 cal =new ARITMATIKA2();
    System.out.print("Masukan angka a   :");
    int a=input.nextInt();
    System.out.print("Masukan angka b   :");
    int b=input.nextInt();
    ARITMATIKA2.Penjumlahan(a, b);
    ARITMATIKA2.Pengurangan(a, b);
    cal.Perkalian(a, b);
    cal.Pembagian(a, b);
    cal.Sederhana(a, b);
    }
    }

