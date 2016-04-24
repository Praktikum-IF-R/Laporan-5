package penghitungan;

public class Penghitungan {

    private static double bil1;
    private static double bil2;
    private int pembilang;
    private int penyebut;

    public Penghitungan(double a, double b) {
        bil1 = a;
        bil2 = b;
    }

    public static void bilangan1(double a) {
        bil1 = a;
    }

    public static void bilangan2(double b) {
        bil2 = b;
    }

    public double getbil1() {
        return bil1;
    }

    public double getbil2() {
        return bil2;
    }

    public static double penjumlahan() {
        double penjumlahan = bil1 + bil2;
        return penjumlahan;
    }

    public static double pengurangan() {
        double pengurangan = bil1 - bil2;
        return pengurangan;
    }

    public double perkalian() {
        double perkalian = bil1 * bil2;
        return perkalian;
    }

    public double pembagian() {
        double pembagian = bil1 / bil2;
        return pembagian;
    }

    public void sederhana(int a, int b) {
        pembilang = a;
        penyebut = b;
        int temp;
        int x = (pembilang < penyebut) ? penyebut : pembilang;
        int y = (pembilang < penyebut) ? pembilang : penyebut;
        while (y != 0) {
            temp = x % y;
            x = y;
            y = temp;
        }
        pembilang = pembilang / x;
        penyebut = penyebut / x;

    }

    public void displayMessage() {
        System.out.println("Hasil penyederhanaannya adalah :" + pembilang + "/" + penyebut);
    }
}
