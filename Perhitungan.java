/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Static;

/**
 *
 * @author nuel
 */
public class Perhitungan {

    public static double penjumlahan(double bil1, double bil2) {
        double hasil = bil1 + bil2;
        System.out.println("Hasil Penjumlahan : " + hasil);
        return hasil;
    }

    public static double pengurangan(double bil1, double bil2) {
        double hasil = bil1 - bil2;
        System.out.println("Hasil Pengurangan : " + hasil);
        return hasil;
    }

    public double perkalian(double bil1, double bil2) {
        double hasil = bil1 * bil2;
        System.out.println("Hasil Perkalian : " + hasil);
        return hasil;
    }

    public double pembagian(double bil1, double bil2) {
        double hasil = bil1 / bil2;
        System.out.println("Hasil Pembagian : " + hasil);
        return hasil;
    }

    public void Sederhana(double bil1, double bil2) {

        if (bil1 > bil2 && bil1 % bil2 == 0) {
            double x = bil1 / bil2;
            System.out.println("Hasil : " + x);
        }
        if (bil1 == bil2 && bil1 % bil2 == 0) {
            double x = bil1 / bil2;
            double y = bil1 / bil2;
            System.out.println("Hassil : " + x + "/" + y);
        }
        if (bil2 > bil1 && bil2 % bil1 == 0) {
            double y = bil2 / bil1;
            double x = bil1 / bil1;
            System.out.println("Hasssil : " + x + "/" + y);
        }
        if (bil1 < bil2 && bil1 % bil2 != 0 && bil2 % bil1 != 0 && bil1%2!=0 && bil2%2!=0) {
            System.out.println("Hassssil : " + bil1 + "/" + bil2);
        }
        if (bil1 > bil2 && bil1 % bil2 != 0 && bil2 % bil1 != 0) {
            System.out.println("Hasssssil : " + bil1 + "/" + bil2);
        }
        if (bil1 < bil2 && bil1%2==0 && bil2%2==0 &&bil1!=bil2 && bil2/bil1==0) {
            double x=bil1/2;
            double y=bil2/2;
            System.out.println("Hasil : "+x+"/"+y);
            
        }
        if (bil1<bil2 ||bil2>bil1 && bil2%2!=0 &&bil1%2!=0 ){
            System.out.println("Hasilx : "+bil1+"/"+bil2);
        }
            
    }
}
