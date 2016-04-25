
package bab5;


import java.util.Scanner;
public class mainJaketabc {
    public static void main(String[] args) {
        Scanner yes=new Scanner (System.in);
        Scanner yes2=new Scanner(System.in);
        String lagi; int belia, belib, belic;
        Jaketabc pesan = new Jaketabc();
        do{
        System.out.println("------------------CV. Labkomdas------------------");
        System.out.println("      Perusahaan Jaket Murah Kualitas Dunia");
        System.out.println("(A). Jaket A");
        System.out.println("(B). Jaket B\n(C). Jaket C");
        System.out.println("Menu:\n1. Tampilkan Semua Harga\n2. Order Jaket");
        System.out.println("Catatan: Toko kami memberi diskon bila membeli\njaket lebih dari 100pcs tiap merek.");
        System.out.println("-------------------------------------------------");
        System.out.print("Pilih → ");
        int pilih=yes.nextInt();
        if (pilih==1) {
          System.out.println("---------- HARGA ----------");
            System.out.println("(1). Jaket A\nHarga Normal : Rp. 100.000/pcs");
            System.out.println("(2). Jaket B\nHarga Normal : Rp. 125.000/pcs");
            System.out.println("(3). Jaket C\nHarga Normal : Rp. 175.000/pcs");
        }else if (pilih==2) {
            System.out.print("Jumlah Order untuk Jaket A : ");
            belia=yes.nextInt();
            System.out.print("Jumlah Order untuk Jaket B : ");
            belib=yes.nextInt();
            System.out.print("Jumlah Order untuk Jaket C : ");
            belic=yes.nextInt();
            pesan = new Jaketabc(belia, belib, belic);
            pesan.beliJaket();
        }
            System.out.print("Ingin Kembali? (Y|T): ");
            lagi=yes2.next();
        }while(lagi.equalsIgnoreCase("Y"));
   }
}

    
