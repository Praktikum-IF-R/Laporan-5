package calculatorstatic;
public class Calculator {
    private double x,y;
    public static void htgJumlah(double a, double b){
    double hsl = a+b;
    System.out.println("Hasil Penjumlahan dari " +a+ " + " +b+ " = "+hsl);
}
    public static void htgKurang(double a, double b){
    double hsl = a-b;
    System.out.println("Hasil Pengurangan dari " +a+ " - " +b+ " = "+hsl);
}
public double htgKali(double a, double b){
    double hsl = a*b;
    System.out.println("Hasil Perkalian dari " +a+ " x " +b+ " = "+hsl);
   return hsl;
}
public double htgBagi(double a, double b){
    double hsl = a/b;
    System.out.println("Hasil Pembagian dari " +a+ " : " +b+ " = "+hsl);
    return hsl;
}
public double htgsederhana(double bil1, double bil2){
    x=bil1;
    y=bil2;
    double sederhana = bil1/bil2;
    while(bil2!=0){
        double a = bil2;
        bil2 = bil1%bil2;
        bil1 = a;
    }
    double b = x;
    x=  x/b;
    y=  x/b;
    System.out.println("Hasil Penyederhanaan Pecahan    \t:"+x+"/"+y);
    return sederhana;
}
}
