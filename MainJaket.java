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
public class MainJaket {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         Jaket Jaket = new Jaket();
         System.out.println("------------------------------------------------");
         System.out.println("              CV. LabKomdas");
         System.out.println("------------------------------------------------");
         
 
         for (int i = 1; i < 4; i++) {
             System.out.println();
             System.out.println("===========Daftar Jenis Jaket===========");
             System.out.print("1. Jaket A\n2. Jaket B\n3. Jaket C\n Pilihan Anda : ");
             
             int pilihanUser = in.nextInt();
 
             System.out.print("Jumlah Yang Di beli :  ");
             int item = in.nextInt();
             System.out.println();
             Jaket.JualJaket(pilihanUser, item);
         }
     }
}