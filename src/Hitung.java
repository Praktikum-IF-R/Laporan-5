package Tugas;
public class Hitung {
    public Hitung(){
        
    }
    public static void jumlah(int a, int b){
        int hasil = a+b;
        System.out.println("Hasil jumlahnya: "+hasil);
        System.out.println("");
    }
    public static void kurang(int a, int b){
        int hasil = a-b;
        System.out.println("Hasil kurangnya: "+hasil);
        System.out.println("");
    }
    public void kali(int a, int b){
       int hasil = a*b;
       System.out.println("Hasil kalinya: "+hasil);
       System.out.println("");
    }
    public void bagi1(int a, int b){
        int hasil = a/b;
        System.out.println("Hasil baginya: "+hasil);
        System.out.println("");
    }
    public void bagi2(int a, int b){
       int bagi = sederhana(a,b);
       int a2 = a/bagi;
       int b2 = b/bagi;
       System.out.println("Hasil baginya: "+a2+"/"+b2);
       System.out.println("");
    }
    public static int sederhana(int g, int h){
        int x = 2; int y = 2;
        int a=g, b=h; 
        while (a!=b){
            if (a>b){ 
                while ((g%x)!=0){ 
                x++; 
                } 
            a=g/x;   
            x++; 
            }else{ 
                while((h%y)!=0){
                y++;
            }   
            b=h/y; 
            y++; 
            }   
        } 
        return (a);
    }
}
