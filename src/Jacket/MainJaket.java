package Jacket;
import java.util.Scanner;
public class MainJaket {
        public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
            int totalharga = 0;
            System.out.println("========CV Labkomdas=========");
            System.out.println("=============================");
            System.out.print("Jumlah jaket A yang akan dibeli : ");
            int a = input.nextInt();
            System.out.print("Jumlah jaket B yang akan dibeli : ");
            int b = input.nextInt();
            System.out.print("Jumlah jaket C yang akan dibeli : ");
            int c = input.nextInt();
            System.out.println("=============================");
            if (a>100) {
                totalharga += a*(Jaket.A-5000); 
                System.out.println("Harga total jaket A :Rp "+a*(Jaket.A-5000));
            }
            else{
                totalharga += a*Jaket.A;
                System.out.println("Harga total jaket A :Rp "+a*Jaket.A);
                    }
            if (b>100) {
                totalharga += b*(Jaket.B-5000); 
                System.out.println("Harga total jaket B :Rp "+b*(Jaket.B-5000));
            }
            else{
                totalharga += b*Jaket.B;
                System.out.println("Harga total jaket B :Rp "+b*Jaket.B);
                    }
            if (c>100) {
                totalharga += c*(Jaket.C-15000); 
                System.out.println("Harga total jaket C :Rp "+c*(Jaket.C-5000));
            }
            else{
                totalharga += c*Jaket.C;
                System.out.println("Harga total jaket C :Rp "+c*Jaket.C);
                    }
            System.out.println("===========================");
            System.out.println("Total Harga yang harus dibayar :Rp "+totalharga);

    }

}
