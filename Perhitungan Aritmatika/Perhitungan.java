package perhitungan;

public class Perhitungan {

    private int m,n;

    public static void Penjumlahan(int a, int b) {
        int hasil = a + b;
        System.out.println("Hasil Penjumlahan adalah : " + hasil);
    }

    public static void Pengurangan(int a, int b) {
        int hasil = a - b;
        System.out.println("Hasil Pengurangan adalah : " + hasil);
    }

    public int Perkalian(int a, int b) {
        int hasil = a * b;
        System.out.println("Hasil perkalian adalah : " + hasil);
        return hasil;
    }

    public int Pembagian(int a, int b) {
        int hasil = a / b;
        System.out.println("Hasil pembagian adalah : " + hasil);
        return hasil;
    }
    public int Sederhana(int a, int b) {
        m = a;
        n = b;
        int hasil = a / b;
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        int gcd = a;
        m /= gcd;
        n /= gcd;
        System.out.println("Hasil Penyederhanaan Pecahan adalah :" +m+"/"+n);
        return hasil;
    }
}

