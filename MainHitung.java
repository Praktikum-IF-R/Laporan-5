import java.util.Scanner;
public class MainHitung {
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
        int pilih;
        Hitung pecah= new Hitung ();    
        System.out.print("Masukkan pembilang 1: ");
        int pem = in.nextInt();
        System.out.print("Masukkan penyebut 1: ");
        int penye= in.nextInt();
        System.out.print("Masukkan pembilang 2: ");
        int pem1 = in.nextInt();
        System.out.print("Masukkan penyebut 2: ");
        int penye2= in.nextInt();
        System.out.println();
        do{
        System.out.print("Masukkan pilihan anda: ");
        pilih = in.nextInt();
            switch (pilih){
                case 1: Hitung.Penjumlahan(pem, penye, pem1, penye2);
                        pecah.Sederhana();
                        break;
                case 2: Hitung.Pengurangan(pem, penye, pem1, penye2);
                        pecah.Sederhana();
                        break;
                case 3: pecah.Perkalian(pem, penye, pem1, penye2);
                        pecah.Sederhana();
                        break;
                case 4: pecah.Pembagian(pem, penye, pem1, penye2);
                        pecah.Sederhana();
                        break;
            }
        } while (pilih!=4);
    }
}
