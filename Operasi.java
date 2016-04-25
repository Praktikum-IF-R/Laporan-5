package StaticdanFinal;
public class Operasi {
    private int pem, pen;
    private static int jum;
    public static void Penjumlahan(int a, int b) {
        jum = a + b;
        System.out.println(a + " + " + b + " = " + jum);
    }
    public static void Pengurangan(int a, int b) {
        jum = a - b;
        System.out.println(a + " - " + b + " = " + jum);
    }
    public void Perkalian(int a, int b) {
        jum = a * b;
        System.out.println(a + " * " + b + " = " + jum);
    }
    public void Pembagian(int a, int b) {
        jum = a / b;
        System.out.println(a + " : " + b + " = " + jum);
    }
    public void Sederhana(int a, int b) {
        pem = a;
        pen = b;
        if (pem > pen && pem % pen != 0) {
            while (((pem % 2 == 0) && (pen % 2 == 0))) {
                pem /= 2;
                pen /= 2;
            }
            while (((pem % 3 == 0) && (pen % 3 == 0))) {
                pem /= 3;
                pen /= 3;
            }
            System.out.println(a + " : " + b + " = " + pem + " / " + pen);
        } else if (pem < pen) {
            if ((pem % 2 == 0) && (pen % 2 == 0)) {
                while (((pem % 2 == 0) && (pen % 2 == 0))) {
                    pem /= 2;
                    pen /= 2;
                }
            } else if ((pem % 3 == 0) && (pen % 3 == 0)) {
                while ((pem % 3 == 0) && (pen % 3 == 0)) {
                    pem /= 3;
                    pen /= 3;
                }
            } else if ((pem % 5 == 0) && (pen % 5 == 0)) {
                while ((pem % 5 == 0) && (pen % 5 == 0)) {
                    pem /= 3;
                    pen /= 3;
                }
            }
            System.out.println(a + " : " + b + " = " + pem + " / " + pen);
        }
    }
}
