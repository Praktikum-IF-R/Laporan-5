package praktikum1;

public class PPPPS {


    public static void hitungPenjumlahan(int a, int b) {
        int nilai = a + b;
        System.out.println("Hasil penjumlahan adalah: " + nilai);
    }

    public static void hitungPengurangan(int a, int b) {
        int nilai = a - b;
        System.out.println("Hasil pengurangan adalah: " + nilai);
    }

    public void hitungPerkalian(int a, int b) {
        int nilai = a * b;
        System.out.println("Hasil perkalian adalah: " + nilai);
    }

    public void hitungPembagian(int a, int b) {
        float nilai = a / b;
        System.out.println("Hasil pembagian adalah: " + nilai);
    }

    public void Sederhana(int a, int b) {
        if (b % a == 0) {
            int nilai2 = b / a;
            int nilai3 = a / a;
            System.out.println("Hasil penyederhanaannya: " + nilai3 + "/" + nilai2);
        } else if (a % b == 0) {
            int nilai1 = a / b;
            System.out.println("Hasil penyederhanaannya: " + nilai1);
        } else {
            for (int i=a; i>=1; i-- ){
            if (a % i == 0 && b % i == 0) {
                a /= i;
                b /= i;
            }
            }
            System.out.println("Hasil penyederhanaannya: "+a+"/"+b);
        }
    }
}