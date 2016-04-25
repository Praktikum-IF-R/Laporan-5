package perhitunganangka;

import java.util.Scanner;

public class mainPerhitunganAngka {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        boolean cek=true;
        double angka1, angka2;
        int p, pembilang, penyebut;
        String p2;
        
        System.out.println("===========================");
        System.out.println("Perhitungan Angka Sederhana");
        System.out.println("===========================");
        System.out.println("1.Penjumlahan\n2.Pengurangan\n3.Perkalian\n4.Pembagian\n5.Penyederhanaan Pecahan\n6.Keluar");
        System.out.print("===========================");
        
        
        do{
            
        System.out.print("\nMasukan Pilihan Anda :");
        p = in.nextInt();
        
        PerhitunganAngka perhitungan = new PerhitunganAngka();
       
        switch(p){
            case 1 :
                System.out.println("\nPenjumlahan");
                System.out.println("===========================");
                System.out.print("Masukan Angka Pertama :");
                angka1 = in.nextDouble();
                System.out.print("Masukan Angka Kedua   :");
                angka2 = in.nextDouble();
                perhitungan.setAngka(angka1, angka2, 0, 0);
                System.out.println("Hasil :"+PerhitunganAngka.penjumlahan());
                break;
            
            case 2 :
                System.out.println("\nPengurangan");
                System.out.println("===========================");
                System.out.print("Masukan Angka Pertama :");
                angka1 = in.nextDouble();
                System.out.print("Masukan Angka Kedua   :");
                angka2 = in.nextDouble();
                perhitungan.setAngka(angka1, angka2, 0, 0);
                System.out.println("Hasil :"+PerhitunganAngka.pengurangan());
                break;
                
            case 3 :
                System.out.println("\nPerkalian");
                System.out.println("===========================");
                System.out.print("Masukan Angka Pertama :");
                angka1 = in.nextDouble();
                System.out.print("Masukan Angka Kedua   :");
                angka2 = in.nextDouble();
                perhitungan.setAngka(angka1, angka2, 0, 0);
                System.out.println("Hasil :"+perhitungan.perkalian());
                break;
            
            case 4 :
                System.out.println("\nPembagian");
                System.out.println("===========================");
                System.out.print("Masukan Angka Pertama :");
                angka1 = in.nextDouble();
                System.out.print("Masukan Angka Kedua   :");
                angka2 = in.nextDouble();
                perhitungan.setAngka(angka1, angka2, 0, 0);
                System.out.println("Hasil :"+perhitungan.pembagian());
                break;
                
            case 5 :
                System.out.println("\nPenyederhanaan Pecahan");
                System.out.println("===========================");
                System.out.print("Masukan Pembilang :");
                pembilang = in.nextInt();
                System.out.print("Masukan Penyebut  :");
                penyebut = in.nextInt();
                perhitungan.setAngka(0, 0, pembilang, penyebut);
                System.out.print("Nilai     :");
                perhitungan.cetak();
                perhitungan.Sederhana();
                System.out.print("Sederhana :");
                perhitungan.cetak();
                break;
            
            case 6 :
                System.out.println("Exit");
                System.exit(0);
                break;
            
            default : 
                System.out.println("Menu Tidak Tersedia");
                
        }
        
            System.out.print("\nPilih lagi ?(y/n) :");
            p2 = in.next();
            
            if(p2.equalsIgnoreCase("y"))
                cek = true;
            else
                cek = false;
            
        }while(cek!=false);
        
        System.out.println("EXIT");
       
       
    }
    
}
