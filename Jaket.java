/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaket;

/**
 *
 * @author LENY
 */
public class Jaket {

    private int jumlah;
    private int total1;
    private int total2;
    private int total3;
    private int total11;
    private int total22;
    private int total33;
    private int total;
    static final int jkta = 100000;
    static final int jktb = 125000;
    static final int jktc = 175000;
    private int jktaa = 95000;
    private int jktbb = 120000;
    private int jktcc = 160000;

    public int getjaketA() {
        return jkta;
    }

    public int getjaketB() {
        return jktb;
    }

    public int getjaketC() {
        return jktc;
    }

    public void jumlah(int a) {
        this.jumlah = a;
    }

    public int total1() {
        return total1 = jumlah * jkta;
    }

    public int total2() {
        return total2 = jumlah * jktb;
    }

    public int total3() {
        return total3 = jumlah * jktc;
    }

    public int total11() {
        return total1 = jumlah * jktaa;
    }

    public int total22() {
        return total22 = jumlah * jktbb;
    }

    public int total33() {
        return total33 = jktcc * jumlah;
    }

    public void total() {
        total = total1 + total2 + total3 + total11 + total22 + total33;
    }

    public int gettotal() {
        return total;

    }
}
