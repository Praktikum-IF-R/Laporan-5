package Bab5;

public class hitung {

    public static void penjumlahan(int a, int b) {
        int nilai = a + b;
        System.out.println("hasil penjumlahan adalah : " + nilai);
    }

    public static void pengurangan(int a, int b) {
        int nilai = a - b;
        System.out.println("hasil pengurangan adalah : " + nilai);
    }

    public void perkalian(int a, int b) {
        int nilai = a * b;
        System.out.println("hasil perkalian adalah : " + nilai);
    }

    public void pembagian(double a, double b) {
        double nilai = a / b;
        System.out.printf("%s%.1f\n", "hasil pembagian adalah : ", nilai);
    }

    public void sederhana(int a, int b) {
        int t, pb = 0, pn = 0;
        if (a > b) {
            t = b;
        } else if (a < b) {
            t = a;
        } else {
            t = a;
        }
        for (int z = 1; z <= t; z++) {
            if ((a % z == 0) && (b % z == 0)) {
                pb = a / z;
                pn = b / z;
            }
        }
        System.out.println("Maka penederhanaan pecahan = ");
        System.out.println(a + "      " + pb);
        System.out.println("--  =  --");
        System.out.println(b + "      " + pn);
    }
}
