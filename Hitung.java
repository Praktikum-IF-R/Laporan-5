package hitung;
public class Hitung {
    private int pembilang;
    private int penyebut;
    public static int getPenjumlahan(int x, int y){
        return x+y;
    }
    public static int getPengurangan(int x, int y){
        return x-y;
    }
    public int getPerkalian(int x, int y){
        return x*y;
    }
    public double getPembagian(double x, double y){
        return x/y;
    }
    public void Sederhana(int x, int y) {
        pembilang = x;
        penyebut = y;
        int X, A, B;
        if (penyebut == 0) {
            return;
        }
        A = (pembilang < penyebut) ? penyebut : pembilang;
        B = (pembilang < penyebut) ? pembilang : penyebut;
        while (B != 0) {
            X = A % B;
            A = B;
            B = X;
        }
        pembilang /= A;
        penyebut /= A;
    }
    public void display() {
        System.out.println(pembilang + "/" + penyebut);
    }
}
