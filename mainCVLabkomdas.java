/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvlabkomdas;

import java.util.Scanner;

/**
 *
 * @author Acer-pc
 */
public class mainCVLabkomdas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner in = new Scanner(System.in);
        int a = 0,b = 0,c = 0, p;
        String p2;
        boolean cek=true;
        
      
        System.out.println("=========================");
        System.out.println(" WELCOME TO CV.LABKOMDAS ");
        System.out.println("      WE SELL JACKET     ");
        System.out.println("=========================");
    
        System.out.print("Masukan Banyak Jaket A :");
        a = in.nextInt();
        System.out.print("Masukan Banyak Jaket B :");
        b = in.nextInt();
        System.out.print("Masukan Banyak Jaket C :");
        c = in.nextInt();
        
        System.out.println("=========================");
                
        CVLabkomdas CV1 = new CVLabkomdas(a,b,c);
                
        System.out.println("===============================");
        System.out.println("          CV.LABKOMDAS         ");
        System.out.println("         WE SELL JACKET        ");
        System.out.print("===============================");
        CV1.totalHargaA();
        CV1.totalHargaB();
        CV1.totalHargaC();
        System.out.print("-------------------------------");
        CVLabkomdas.totalBayar();
        System.out.println("===============================");
        System.out.println("          TERIMA KASIH         ");
        System.out.println("===============================");
             
        
    }
    
}
