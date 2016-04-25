/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB_5;
import java.util.Scanner;
/**
 *
 * @author Deltaviyahya
 */
public class MainKalkulator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Kalkulator b = new Kalkulator();

        System.out.println("==++ PROGRAM BERHITUNG ++==");

        System.out.print("Bilangan pertama\t: ");

        int bil1 = input.nextInt();

        System.out.print("Bilangan kedua\t\t: ");

        int bil2 = input.nextInt();

        System.out.println("");

        Kalkulator.Penjumlahan(bil1, bil2);

        Kalkulator.Pengurangan(bil1, bil2);

        b.Pembagian(bil1, bil2);

        b.Perkalian(bil1, bil2);

        b.Sederhana((int) bil1, (int) bil2);
}
}
