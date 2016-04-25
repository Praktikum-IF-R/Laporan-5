/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum5;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class nomor2main {
    public static void main(String[] args) {
        Scanner masuk=new Scanner (System.in);
        System.out.println("harga jaket: ");
        System.out.println("bahan A = 100.000");
        System.out.println("bahan B = 125.000");
        System.out.println("bahan C = 175.000");
        System.out.print("masukan banyak jaket bahan A yang ingin dibeli: ");
        int a=masuk.nextInt();
        System.out.print("masukan banyak jaket bahan B yang ingin dibeli: ");
        int b=masuk.nextInt();
        System.out.print("masukan banyak jaket bahan C yang ingin dibeli: ");
        int c=masuk.nextInt();
        nomor2 jaket=new nomor2();
        jaket.total(a, b, c);
    }
}
