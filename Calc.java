
package praktikumbab5;


public class Calc {
    private double a,b;
    
    public Calc(double a, double b){
        this.a=a;
        this.b=b;
    }
    
    public static void Penjumlahan(double c,double d){
        double plus=c+d;
        System.out.println("Hasil Penjumlahan  : "+plus);
    }
    public static void Pengurangan(double c,double d){
        double minus=c-d;
        System.out.println("Hasil Pengurangan  : "+minus);
    }
    public void Perkalian(){
        double kali=a*b;
        System.out.println("");
    }
    public void Pembagian(){
        double bagi=a/b;
        System.out.println("Hasil Pembagian  : "+bagi);
        
    }
    public void Sederhana(int y,int z){
        int a=y;
        int i=z%a;
        if(i==0){
                    int m =y/a;
                    int n=z/a;
                    System.out.println("Penyerdehanaan : "+m+"/"+n);
                }
        else
            System.out.println("Penyederhanaan : "+a+"/"+b);
            }
        
        
    }

