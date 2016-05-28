/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab5;

import java.util.Scanner;

/**
 *
 * @author Anita Rizky A
 */
public class Mainmatika {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nilai 1 = ");
        int nil1 = in.nextInt();
        System.out.print("Masukkan nilai 2 = ");
        int nil2 = in.nextInt();
        System.out.println("");
        Matika.hitungjumlah(nil1, nil2);
        Matika.hitungkurang(nil1, nil2);
        Matika.hitungkali(nil1, nil2);
        Matika.hitungbagi(nil1, nil2);
        System.out.println("");
        Matika mat = new Matika(nil1, nil2);
        mat.Sederhana();
    }
}
