package Laporan5;

/**
 *
 * @author wahyuridiansyah
 */
public class Aritmatika {

    private int x, y;

    public Aritmatika(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void hitPenjumlahan(int x, int y) {
        int value = x + y;
        System.out.println("Hasil penjumlahan adalah    : " + value);
    }

    public static void hitPengurangan(int x, int y) {
        int value = x - y;
        System.out.println("Hasil pengurangan adalah    : " + value);
    }

    public void hitPerkalian(int x, int y) {
        int value = x * y;
        System.out.println("Hasil perkalian adalah      : " + value);
    }

    public void hitPembagian(double x, double y) {
        double value = (double) x / y;
        System.out.println("Hasil pembagian adalah      : " + value);
    }

    public void SederhanaPecahan() {
        int temp, X, Y;
        X = (x < y) ? y : x;
        Y = (x < y) ? x : y;
        for (int i = 0; Y != 0; i++) {
            temp = X % Y;
            X = Y;
            Y = temp;
        }
        x /= X;
        y /= X;
    }

    public void info() {
        System.out.println(x + "/" + y);
    }
}
