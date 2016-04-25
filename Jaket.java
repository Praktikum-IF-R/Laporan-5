/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum5_1;

/**
 *
 * @author Lenovo
 */
public class Jaket {
    public static final int A = 100000;
    public static final int B = 125000;
    public static final int C = 175000;
    public static void Pembayaran(int a, int b){
        switch (a){
            case 111 : if(b > 100){
                            System.out.println("Selamat Anda Mendapatkan Diskon");
                            System.out.println("Harga per item menjadi Rp. 95000");
                            int total = b*95000;
                            System.out.println("Total pembayaran    : Rp. "+total);
                       }else{
                            System.out.println("Harga per item Rp. 100000");
                            int total = b*A;
                            System.out.println("Total pembayaran    : Rp. "+total);
                       }break;
            case 112 : if(b > 100){
                            System.out.println("Selamat Anda Mendapatkan Diskon");
                            System.out.println("Harga per item menjadi Rp. 120000");
                            int total = b*120000;
                            System.out.println("Total pembayaran    : Rp. "+total);
                       }else{
                            System.out.println("Harga per item Rp. 125000");
                            int total = b*B;
                            System.out.println("Total pembayaran    : Rp. "+total);
                       }break;
            case 113 : if(b > 100){
                            System.out.println("Selamat Anda Mendapatkan Diskon");
                            System.out.println("Harga per item menjadi Rp. 160000");
                            int total = b*160000;
                            System.out.println("Total pembayaran    : Rp. "+total);
                       }else{
                            System.out.println("Harga per item Rp. 175000");
                            int total = b*C;
                            System.out.println("Total pembayaran    : Rp. "+total);
                       }break;
            default : System.exit(0);break;
        }
    }
}
