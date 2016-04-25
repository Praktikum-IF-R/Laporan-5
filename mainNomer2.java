/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgstatic.pkgfinal;

import java.util.*;

public class mainNomer2 {

    static double banyak;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        nomer2 jacket = new nomer2(100000, 125000, 175000);
        System.out.println("mau beli jaket apa : \n1. jaket a Rp.100.000\n2. jaket b Rp.125.000\n3. jaket c Rp.175.000");
        System.out.print("pilih : ");
        String a = in.next();

        if (a.equalsIgnoreCase("1")) {
            banyak = jacket.milih();
            if (banyak > 100) {
                jacket = new nomer2(95000, 120000, 160000);
                jacket.jacketJa(banyak);
            } else {
                jacket.jacketJa(banyak);
            }
        } else if (a.equalsIgnoreCase("2")) {
            banyak = jacket.milih();
            if (banyak > 100) {
                jacket = new nomer2(95000, 120000, 160000);
                jacket.jacketJb(banyak);
            } else {
                jacket.jacketJb(banyak);
            }
        } else if (a.equalsIgnoreCase("3")) {
            banyak = jacket.milih();
            if (banyak > 100) {
                jacket = new nomer2(95000, 120000, 160000);
                jacket.jacketJc(banyak);
            } else {
                jacket.jacketJc(banyak);
            }
        }
        jacket.printHarga();
    }
}
