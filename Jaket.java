package laporanpraktikum5;
public class Jaket {
    private final int jaketA = 100000;
    private final int jaketB = 125000;
    private final int jaketC = 175000;
    int hargatotalA, hargatotalB, hargatotalC;
    public static void showMessages(){
        System.out.println("\tCV Lab Komputasi Dasar");
        System.out.println("Produk\t\t Harga");
        System.out.println("Jaket A \t Rp 100000/pcs");
        System.out.println("Jaket B \t Rp 125000/pcs");
        System.out.println("Jaket C \t Rp 175000/pcs");
    }
    public void hargaJaketA(int jumlah){
        if (jumlah > 100){
            int newjaketA = jaketA - 5000;
            hargatotalA = (newjaketA*jumlah);
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Anda membeli lebih dari 100 pcs, harga menjadi: Rp "+newjaketA+"/pcs");
            System.out.println("Harga total Jaket A: Rp "+ hargatotalA);
        } else if (jumlah > 0 && jumlah <=100){
            System.out.println("-----------------------------------------------------------------");
            hargatotalA = (jaketA*jumlah);
            System.out.println("Harga total Jaket A: Rp "+ hargatotalA);
        } else {
            System.out.println();
        }
    }
    public void hargaJaketB(int jumlah){
        if (jumlah > 100){
            int newjaketB = jaketB - 5000;
            hargatotalB = (newjaketB*jumlah);
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Anda membeli lebih dari 100 pcs, harga menjadi: Rp "+newjaketB+"/pcs");
            System.out.println("Harga total Jaket B: Rp "+ hargatotalB);
        } else if (jumlah > 0 && jumlah <=100){
            System.out.println("-----------------------------------------------------------------");
            hargatotalB = jaketB*jumlah;
            System.out.println("Harga total Jaket B: Rp "+hargatotalB);
        } else {
            System.out.println();
        }
    }
    public void hargaJaketC(int jumlah){
        if (jumlah > 100){
            int newjaketC = jaketC - 15000;
            hargatotalC = (newjaketC*jumlah);
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Anda membeli lebih dari 100 pcs, harga menjadi: Rp "+newjaketC+"/pcs");
            System.out.println("Harga total Jaket C: Rp "+ hargatotalC);
        } else if (jumlah > 0 && jumlah <=100){
            System.out.println("-----------------------------------------------------------------");
            hargatotalC = jaketC*jumlah;
            System.out.println("Harga total Jaket C: Rp "+hargatotalC);
        } else {
            System.out.println();
        }
    }
    public void hargaKeseluruhan(){
        System.out.println("====================CV LAB KOMPUTASI DASAR=======================");
        System.out.println("Total harga keseluruhan: Rp " +(hargatotalA+hargatotalB+hargatotalC));
        System.out.println("=========================TERIMA KASIH============================");
        
    }
}