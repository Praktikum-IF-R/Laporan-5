package calculatorstatic;
import java.util.Scanner;
public class CalculatorStatic {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int plh;
        do{
        System.out.println("=============================================");
        System.out.println("           Program Calculator");
        System.out.println("=============================================");
        System.out.println("Menu Hitungan               : ");
        System.out.println("1.Penjumlahan");
        System.out.println("2.Pengurangan");
        System.out.println("3.Perkalian");
        System.out.println("4.Pembagian");
        System.out.println("5.Penyederhanaan");
        System.out.println("6.Keluar");
        System.out.print("Masukan Nomor Pilihan Anda    : ");
        plh = in.nextInt();
        switch(plh){
            case 1 : System.out.println("            Penjumlahan");
                     System.out.println("====================================");
                     System.out.print("Masukan Angka      :");
                     double a = in.nextDouble();
                     System.out.print("Masukan Angka      :");
                     double b = in.nextDouble();
                     System.out.println("====================================");
                     Calculator.htgJumlah(a,b);
                     break;
            case 2 : System.out.println("           Pengurangan");
                     System.out.println("====================================");
                     System.out.print("Masukan Angka      :");
                     double a1 = in.nextDouble();
                     System.out.print("Masukan Angka      :");
                     double b1 = in.nextDouble();
                     System.out.println("====================================");
                     Calculator.htgKurang(a1,b1);
                     break;
            case 3 : System.out.println("              Perkalian");
                     System.out.println("====================================");
                     System.out.print("Masukan Angka      \t:");
                     double a2 = in.nextDouble();
                     System.out.print("Masukan Angka      \t:");
                     double b2 = in.nextDouble();
                     System.out.println("====================================");
                     Calculator ivan = new Calculator();
                     ivan.htgKali(a2,b2);
                     break;
            case 4 : System.out.println("             Pembagian");
                     System.out.println("====================================");
                     System.out.print("Masukan Angka      :");
                     double a3 = in.nextDouble();
                     System.out.print("Masukan Angka      \t:");
                     double b3 = in.nextDouble();
                     System.out.println("====================================");
                     Calculator ivan1 = new Calculator();
                     ivan1.htgBagi(a3,b3);
                     break;
            case 5 : System.out.println("           Penyederhanaan");
                     System.out.println("====================================");
                     System.out.print("Masukan Angka      :");
                     double a4 = in.nextDouble();
                     System.out.print("Masukan Angka      \t:");
                     double b4 = in.nextDouble();
                     System.out.println("====================================");
                     Calculator ivan2 = new Calculator();
                     ivan2.htgsederhana(a4,b4);
                     break;
            case 6 : System.out.println("Terima Kasih");
                     break;
        }
        }while(plh!=6);        
    }
   }
   

