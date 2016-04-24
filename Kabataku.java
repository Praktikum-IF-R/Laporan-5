package StaticAndFinal;
public class Kabataku {
private double a,b;

public static void penjumlahan(double bil1, double bil2){
    double hasil = bil1 + bil2;
    System.out.println("Hasil Penjumlahan dari " +bil1+ " + " +bil2+ " = "+hasil);
}
public static void pengurangan(double bil1, double bil2){
    double hasil = bil1 - bil2;
    System.out.println("Hasil Pengurangan dari " +bil1+ " - " +bil2+ " = "+hasil);
}
public double perkalian(double bil1, double bil2){
    double hasil = bil1 * bil2;
    System.out.println("Hasil Perkalian dari " +bil1+ " x " +bil2+ " = "+hasil);
    return hasil;
}
public double pembagian(double bil1, double bil2){
    double hasil = bil1 / bil2;
    System.out.println("Hasil Pembagian dari " +bil1+ " : " +bil2+ " = "+hasil);
    return hasil;
}
public double sederhana(double c, double d){
    a = c;
    b = d;
    double sederhana = c/d;
    while(d!=0){
        double e = d;
        d = c%d;
        c = e;
    }
    double f = a;
    a =  a/f;
    b =  a/f;
    System.out.println("Hasil Penyederhanaan Pecahan    \t:"+a+"/"+b);
    return sederhana;
}
}
