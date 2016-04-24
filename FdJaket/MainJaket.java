package FdJaket;

import java.util.Scanner;
public class MainJaket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Jaket fd = new Jaket();
        int piljak;
        System.out.println("=================WELCOME TO FD'S DISTRO=================");
        System.out.println("MENU JAKET : ");
        System.out.println("NAMA JAKET\tHARGA JAKET");
        System.out.println("1.Jaket A\tRp.100000");
        System.out.println("2.Jaket B\tRp.125000");
        System.out.println("3.Jaket C\tRp.175000");
        String pilihanjak;
        do{
        System.out.print("Masukkan pilihan jaket : ");
        piljak = input.nextInt();
        switch(piljak){
            case 1 : 
                System.out.print("Berapa jaket yang ingin dibeli : ");
                int jumlahA = input.nextInt();
                fd.JaketA(jumlahA);
                System.out.println("Total Harga Jaket A : Rp." + fd.getJaketA()); break;
            case 2 :
                System.out.print("Berapa jaket yang ingin dibeli : ");
                int jumlahB = input.nextInt();
                fd.JaketB(jumlahB);
                System.out.println("Total Harga Jaket B : Rp." + fd.getJaketB()); break;
            case 3 :
                System.out.print("Berapa jaket yang ingin dibeli : ");
                int jumlahC = input.nextInt();
                fd.JaketC(jumlahC);
                System.out.println("Total Harga Jaket C : Rp." + fd.getJaketC()); break;
                }
        System.out.print("Ada lagi? (Y/N) : ");
        pilihanjak = input.next();
            }while(pilihanjak.equalsIgnoreCase("Y"));
        System.out.println("Jadi total yang harus anda bayar adalah : "+fd.Total());
        System.out.println("=================TERIMA KASIH================");
        }
}