package StaticdanFinal;
import java.util.Scanner;
public class MainJaket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("CV. Lamkomdas");
        System.out.println("");
        int pil,bnyk;
        do{
            System.out.println("1. Jaket A");
            System.out.println("2. Jaket B");
            System.out.println("3. Jaket C");
            System.out.println("4. SELESAI");
            System.out.print("Pilih no :");
            pil = in.nextInt();
            if (pil == 1){
                System.out.print("Banyak barang : ");
                bnyk = in.nextInt();
                Jaket.JaketA(bnyk);
            }else if(pil == 2){
                System.out.print("Banyak barang : ");
                bnyk = in.nextInt();
                Jaket.JaketB(bnyk);
            }else if(pil == 3){
                System.out.print("Banyak barang : ");
                bnyk = in.nextInt();
                Jaket.JaketC(bnyk);
            }
        }while(pil <4);
        Jaket.display();
    }
}
