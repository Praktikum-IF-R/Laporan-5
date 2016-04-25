package produksi;
public class Produksi {
    public static final int jaketA = 100000;
    public static final int jaketB = 125000;
    public static final int jaketC = 175000;
    public static void jaketA(int jumlah){
        System.out.println(" Daftar Pembelian ");
        System.out.println("Bahan Jaket  : A");
        System.out.println("Jumlah Jaket : " + jumlah);
        if (jumlah > 100 ){
            System.out.println("Harga Satuan  : Rp. 95.000");
            int total = jumlah * 95000;
            System.out.println("Total         : Rp. " + total);
        } else {
            System.out.println("Harga Satuan  : Rp. " + jaketA);
            int total = (jumlah * jaketA);
            System.out.println("Total         : Rp. " + total);
        }
    }
    public static void jaketB(int jumlah){
        System.out.println(" Daftar Pembelian ");
        System.out.println("Bahan Jaket : B");
        System.out.println("Jumlah Jaket : " + jumlah);
        if (jumlah > 100 ){
            System.out.println("Harga Satuan  : Rp. 120.000");
            int total = jumlah * 120000;
            System.out.println("Total         : Rp. " + total);
        } else {
            System.out.println("Harga Satuan  : Rp. " + jaketB);
            int total = (jumlah * jaketB);
            System.out.println("Total         : Rp. " + total);
        }
    }
    public static void jaketC(int jumlah){
        System.out.println(" Daftar Pembelian ");
        System.out.println("Bahan Jaket       : C");
        System.out.println("Jumlah Jaket      : " + jumlah);
        if (jumlah > 100 ){
            System.out.println("Harga Satuan  : Rp. 160.000");
            int total = jumlah * 160000;
            System.out.println("Total         : Rp. " + total);
        } else {
            System.out.println("Harga Satuan  : Rp. " + jaketC);
            int total = (jumlah * jaketC);
            System.out.println("Total         : Rp. " + total);
        }
    }
}
