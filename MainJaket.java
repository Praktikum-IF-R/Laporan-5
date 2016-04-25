import java.util.Scanner;
public class MainJaket {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Jaket lab = new Jaket();
        int pil=0;
        System.out.println("========================");
        System.out.println("      CV. Labkomdas \n");
        System.out.println("Jenis:\n1. Jaket A\n2. Jaket B\n3. Jaket c");
        do{
        System.out.print("Masukkan pilihan anda: ");
        pil = in.nextInt();
        System.out.print("Masukkan jumlah: ");
        int jml = in.nextInt();
        System.out.println("========================"); 
        switch(pil){
            case 1: lab.A(jml);
                System.out.println("Anda memilih paket jaket A");
                if(jml>100){
                    System.out.println("Anda mendapatkan diskon menjadi Rp 95.000 per biji");
                }
                else
                    System.out.println("Harga Rp 100.000/biji");
                System.out.println("Total harga: Rp " + lab.getTotal());break;
            case 2: lab.B(jml);
                System.out.println("Anda memilih paket jaket B");
                if(jml>100){
                    System.out.println("Anda mendapatkan diskon menjadi Rp 120.000 per biji");
                }
                else
                    System.out.println("Harga Rp 125.000/biji");
                System.out.println("Total harga: Rp "+lab.getTotal());break;
            case 3: lab.C(jml);
                System.out.println("Anda memilih paket jaket C");
                if(jml>100){
                    System.out.println("Anda mendapatkan diskon menjadi Rp 160.000 per biji");
                }
                else
                    System.out.println("Harga Rp 175.000/biji");
                System.out.println("Total harga: Rp " + lab.getTotal());break;
            case 4 : System.exit(0);
        }
    } while (pil!=4);
}
}
