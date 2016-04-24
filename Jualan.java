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
public class Jualan {

    private static final double jaketA = 100000;
    private static final double jaketB = 125000;
    private static final double jaketC = 175000;
    private static double total;
    private static double total2;
    private static double total3;

    public static double pertama(int jumlah) {
        double jaketA1 = 95000;
        if (jumlah > 100) {
            total = jumlah * jaketA1;
            System.out.println("Total Pembelian : Rp." + total);

        } else {
            total = jumlah * jaketA;
            System.out.println("Total Pembelian : Rp." + total);

        }
        return total;
    }

    public static double kedua(int jumlah) {
        double jaketB2 = 120000;
        if (jumlah > 100) {
            total2 = jumlah * jaketB2;
            System.out.println("Total Pembelian : Rp." + total2);

        } else {
            total2 = jumlah * jaketB;
            System.out.println("Total Pembelian : Rp." + total2);

        }
        return total2;
    }

    public static double ketiga(int jumlah) {
        double jaketC3 = 160000;
        if (jumlah > 100) {
            total3 = jumlah * jaketC3;
            System.out.println("Total Pembelian : Rp." + total3);
        } else {
            total3 = jumlah * jaketC;
            System.out.println("Total Pembelian : Rp." + total3);

        }
        return total3;
    }

    void display() {
        double totals = total + total2 + total3;
        System.out.println("Total Pembelian : Rp." + (totals));
    }

}
