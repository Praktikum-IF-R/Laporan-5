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
public class nomor2 {
    private final long A,B,C;
    private long a,b,c,total,totalasli,diskon;
    public nomor2(){
        A=100000;
        B=125000;
        C=175000;
    }
    public void total(int x, int y, int z){
        a=A;
        b=B;
        c=C;
        if (x>=100){
            a=A-5000;
        }
        if (y>=100){
            b=B-5000;
        }
        if (z>=100){
            c=C-15000;
        }
        totalasli=(A*x)+(B*y)+(C*z);
        total=(a*x)+(b*y)+(c*z);
        diskon=totalasli-total;
        System.out.println("anda mendapat diskon sebesar: "+diskon+"\ntotal yang harus dibayarkan sebesar: "+total);
    }
}
