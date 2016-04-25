package hitungan;
public class Hitungan {
    public static void Penjumlahan (int a, int b){
        int hasil = a+b;
        System.out.println("Hasil penjumlahan antara " + a + " dan " + b + " adalah " + hasil);
    }
    public static void Pengurangan (int a, int b){
        int hasil = a-b;
        System.out.println("Hasil pengurangan antara " + a + " dan " + b + " adalah " + hasil);
    }
    public void Perkalian (int a, int b){
        int hasil = a*b;
        System.out.println("Hasil perkalian antara " + a + " dan " + b + " adalah " + hasil );
    }
    public void Pembagian (double c, double d){
        double hasil = c/d;
        System.out.println("Hasil pembagian antara " + c + " dan " + d + " adalah " + hasil );
    }
    public String Sederhana (int a, int b){
        int c;
        if (a > b){
            c = a;
        } else {
            c = b;
        }
        for(int i = c; i >= 1; i--){
            if (a % i == 0 && b % i == 0 ){
                a = a/i;
                b = b/i;
                break;
            }
        }
        return a + "/" + b;
    }
}
