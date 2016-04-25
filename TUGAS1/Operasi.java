package TUGAS1;

public class Operasi {

    private static double A, B;

    public static double Penjumlahan(double a, double b) {
        A = a;
        B = b;
        return A + B;
    }

    public static double Pengurangan(double a, double b) {
        A = a;
        B = b;
        return A - B;
    }

    public double Perkalian(double a, double b) {
        A = a;
        B = b;
        return A * B;
    }

    public double Pembagian(double a, double b) {
        A = a;
        B = b;
        return A / B;
    }

    public void Sederhana(double a, double b) {
        A = a;
        B = b;
        if (A % 5 == 0 && B % 5 == 0) {
            while (A % 5 == 0 && B % 5 == 0) {
                A = A / 5;
                B = B / 5;
                Sederhana(A, B);
            }
        } else if (A % 3 == 0 && B % 3 == 0) {
            while (A % 3 == 0 && B % 3 == 0) {
                A = A / 3;
                B = B / 3;
                Sederhana(A, B);
            }
        } else if (A % 2 == 0 && B % 2 == 0) {
            while (A % 2 == 0 && B % 2 == 0) {
                A = A / 2;
                B = B / 2;
                Sederhana(A, B);
            }
        } else if (B < A && A % B == 0) {
            A = A / B;
            B = 1;
            System.out.println("Hasil     : " + A + "/" + B);
        } else if (A < B && B % A == 0) {
            B = B / A;
            A = 1;
            System.out.println("Hasil     : " + A + "/" + B);
        } else {
            System.out.println("Hasil     : " + A + "/" + B);
        }
    }
}
