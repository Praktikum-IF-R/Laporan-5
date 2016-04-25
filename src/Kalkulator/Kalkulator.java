package Kalkulator;
public class Kalkulator {
public static void Penjumlahan(int a,int b){
    int nilai = a+b;
    System.out.println("Hasil penjumlahan adalah : "+nilai);
    }
public static void Pengurangan(int a, int b){
    int nilai = a-b;
    System.out.println("Hasil pengurangan adalah : "+nilai);
    }  
public void Perkalian(int a, int b){
    int nilai = a*b;
    System.out.println("Hasil perkalian adalah : "+nilai);
     }
public void Pembagian (double a, double b){
    double nilai = a/b;
    System.out.println("Hasil pembagian adalah : "+nilai);

    }
public void sederhana(int a, int b) {
    for (int i = a; i>= 1; i--) {
        if (a%i==0&&b%i==0) {
            a/=i;
            b/=i;
        }
    }
    if (b==1) {
        System.out.println("Hasil penyederhanaan adalah : "+a);
        }
    else if (a%b==0) {
        System.out.println("Hasil penyederhanaan adalah : "+a/b);
        }
    else{
        System.out.println("Hasil penyederhanaan adalah : "+a+"/"+b);
        }       
}
}
