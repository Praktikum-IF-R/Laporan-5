package Laporan5;

/**
 *
 * @author wahyuridiansyah
 */
import java.util.Scanner;

public class MainAritmatika {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("------------------------------------------------");
        System.out.println("              Program Aritmatika");
        System.out.println("------------------------------------------------");
        System.out.println();

        System.out.print("Inputkan nilai 1 : ");
        int value1 = in.nextInt();
        System.out.print("Inputkan nilai 2 : ");
        int value2 = in.nextInt();
        System.out.println();

        Aritmatika.hitPenjumlahan(value1, value2);
        Aritmatika.hitPengurangan(value1, value2);
        Aritmatika a = new Aritmatika(value1, value2);
        a.hitPerkalian(value1, value2);
        a.hitPembagian(value1, value2);

        System.out.println();
        System.out.println("----- Aritmatika Menyederhanakan Pecahan -----");
        System.out.print("Inputkan nilai 1: ");
        int p1 = in.nextInt();
        System.out.print("Inputkan nilai 2: ");
        int p2 = in.nextInt();
        Aritmatika pecahan = new Aritmatika(p1, p2);
        System.out.println();
        System.out.print("Pecahan terbilang: ");
        pecahan.info();
        System.out.print("Hasil dari penyederhanaan pecahan " + p1 + "/" + p2 + " adalah ");
        pecahan.SederhanaPecahan();
        pecahan.info();
    }
}
