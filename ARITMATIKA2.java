package aritmatika2;

public class ARITMATIKA2 {
    
public static void Penjumlahan(int a,int b){
    int nilai=a+b;
    System.out.println("Hasil Penjumlahan   :"+a+"+"+b+"="+nilai);
    }
public static void Pengurangan(int a,int b){
    int nilai=a-b;
    System.out.println("Hasil Pengurangan   :"+a+"-"+b+"="+nilai);
}
public void Perkalian(int a,int b){
    int nilai=a*b;
    System.out.println("Hasil Perkalian     :"+a+"*"+b+"="+nilai);
}
public void Pembagian(int a,int b){
   double nilai=a/b;
   System.out.println("Hasil Penjumlahan   :"+a+"/"+b+"="+nilai);
}
public void Sederhana(int a,int b){
    int c=a;
    if(b >=a){
        int x=0;
        int r=0;
        int y=b;
        do{
            x=c/y;
            r=c%y;
            c=y;
            y=r;
        }while(y !=0);
    }
    System.out.println("Hasil Penyederhanaan Pecahan Adalah:"+a/c+"/"+b/c);
}
}
