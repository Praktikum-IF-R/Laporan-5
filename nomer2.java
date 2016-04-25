package pkgstatic.pkgfinal;

import java.util.*;

public class nomer2 {

    static Scanner in = new Scanner(System.in);
    final double jA, jB, jC;
    double harga = 0, banyak;

    public nomer2(double a, double b, double c) {
        jA = a;
        jB = b;
        jC = c;
    }

    public double milih() {

        System.out.println("berapa jacket : ");
        banyak = in.nextInt();
        return banyak;
    }

    public void jacketJa(double b) {
        banyak = b;
        harga += jA * banyak;
    }

    public void jacketJb(double b) {
        banyak = b;
        harga += jB * banyak;
    }

    public void jacketJc(double b) {
        banyak = b;
        harga += jC * banyak;
    }

    public void printHarga() {
        System.out.println("harga total : " + harga);
    }

}
