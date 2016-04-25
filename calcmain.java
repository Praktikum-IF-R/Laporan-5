package lap5staticnfinal;

import java.util.Scanner;

public class calcmain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("\tPROGRAM MENGHITUNG 2 BILANGAN");
        System.out.println("");
        System.out.print("masukkan bilangan 1 : ");
        int a = in.nextInt();
        System.out.print("masukkan bilangan 2 : ");
        int b = in.nextInt();
        System.out.println("=================================================");
        calc.hitungPenjumlahan(a, b);
        calc.hitungPengurangan(a, b);
        calc.hitungPerkalian(a, b);
        calc.hitungPembagian(a, b);
        System.out.println("=================================================");
        System.out.println("\tPROGRAM MENYEDERHANAKAN PECAHAN\n");
        System.out.print("Masukkan pembilang : ");
        int x = in.nextInt();
        System.out.print("Masukkan penyebut  : ");
        int y = in.nextInt();
        calc.sederhana(x, y);
    }
}
