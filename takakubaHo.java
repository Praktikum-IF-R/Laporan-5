import java.util.Scanner;
public class takakubaHo {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        takakuba t2 = new takakuba();
        int choose;
        do{
            System.out.println("      Program TAKAKUBA       ");
            System.out.println("=============================");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Penyederhanaan Pecahan");
            System.out.println("6. Selesai");
            System.out.println("=============================");
            System.out.print("Pilihan anda : ");
            choose = in.nextInt();
            switch(choose){
                case 1:{
                    System.out.println("Anda memilih penjumlahan.");
                    System.out.println("Silahkan masukkan angka dibawah.");
                    System.out.print("Angka pertama : ");
                    int a = in.nextInt();
                    System.out.print("Angka kedua   : ");
                    int b = in.nextInt();
                    takakuba.Tambah(a, b);
                    break;
                }
                case 2:{
                    System.out.println("Anda memilih pengurangan.");
                    System.out.println("Silahkan masukkan angka dibawah.");
                    System.out.print("Angka pertama : ");
                    int c = in.nextInt();
                    System.out.print("Angka kedua   : ");
                    int d = in.nextInt();
                    takakuba.Kurang(c, d);
                    break;
                }
                case 3:{
                    System.out.println("Anda memilih perkalian.");
                    System.out.println("Silahkan masukkan angka dibawah.");
                    System.out.print("Angka pertama : ");
                    int e = in.nextInt();
                    System.out.print("Angka kedua   : ");
                    int f = in.nextInt();
                    t2.Kali(e, f);
                    break;
                }
                case 4:{
                    System.out.println("Anda memilih pembagian.");
                    System.out.println("Silahkan masukkan angka dibawah.");
                    System.out.print("Angka pertama : ");
                    int g = in.nextInt();
                    System.out.print("Angka kedua   : ");
                    int h = in.nextInt();
                    t2.Bagi(g, h);
                    break;
                }
                case 5:{
                    System.out.println("Anda memilih penyederhanaan pecahan.");
                    System.out.println("Silahkan masukkan angka dibawah.");
                    System.out.print("Angka pertama : ");
                    int i = in.nextInt();
                    System.out.print("Angka kedua   : ");
                    int j = in.nextInt();
                    t2.Sederhana(i, j);
                    break;
                }
                case 6:{
                    System.out.println("Terima kasih telah menggunakan program kami.");
                    System.out.println("Sampai jumpa.");
                    break;
                }
            }
        }while(choose!=6);
    }
}
