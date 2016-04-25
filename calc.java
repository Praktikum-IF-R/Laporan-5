package lap5staticnfinal;

public class calc {

    public static void hitungPenjumlahan(int a, int b) {
        int nilai = a + b;
        System.out.println("hasil penjumlahan " + a + " dengan " + b + " adalah\t  : " + nilai);
    }

    public static void hitungPengurangan(int a, int b) {
        int nilai = a - b;
        System.out.println("hasil pengurangan " + a + " dengan " + b + " adalah\t  : " + nilai);
    }

    public static void hitungPerkalian(int a, int b) {
        int nilai = a * b;
        System.out.println("hasil perkalian " + a + " dengan " + b + " adalah\t  : " + nilai);
    }

    public static void hitungPembagian(double a, double b) {
        double nilai = (a / b);
        System.out.println("hasil pembagian " + a + " dengan " + b + " adalah\t  : " + nilai);
    }

    public static void sederhana(int a, int b) {
        System.out.print(a + " / " + b);
        for (int i = 2;; i++) {
            if (a % i == 0 && b % i == 0) {
                System.out.print(" = " + a / i + " / " + b / i);
            } else if (i > a && i > b) {
                break;
            }
        }
        System.out.println();
    }
}
