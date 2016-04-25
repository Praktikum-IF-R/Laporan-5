package bab5;
public class ProgKabataku {
public static void penjumlahan(int a, int b, int c){
       int jumlah=a+b+c;
        System.out.println("Hasil penjumlahan : "+jumlah);}
    public static void pengurangan(int a, int b, int c){
        int kurang=a-b-c;
        System.out.println("Hasil pengurangan : "+kurang);}
    public void perkalian(int a, int b){
        int kali=a*b;
        System.out.println("Hasil perkalian   : "+kali);}
    public void pembagian(double a, double b){
        double bagi=a/b;
        if (a==0) {
            System.out.println("Hasil pembagian   : 0");
        }else if (b==0) {
            System.out.println("Hasil pembagian   : ∞ (Tidak terdefinisi)");
        }else{
         System.out.println("Hasil pembagian   : "+bagi); 
         System.out.println("Dalam bentuk pecahan : "+(int)a+"/"+(int)b);}}
    public void Sederhana(int a, int b){
        int pembilang, penyebut, besar, kecil, coi=1;
        pembilang=a; penyebut=b;
        besar=(a>b) ? a : b;
        kecil=(b<a) ? b : a;
        a=besar; b=kecil;
        while(kecil!=0){
            if (a%b==0) {
                coi=b; break;
            }else{
                int balik=kecil;
                kecil=besar%kecil;
                besar=balik;
                coi=besar;}}
        a=pembilang; b=penyebut;
        if (b==0) {
            System.out.println("Hasil penyederhanaan dari "+a+"/"+b);
            System.out.println("adalah : ∞ (Tidak terdefinisi)");
        }else if (a==0) {
            System.out.println("Hasil penyederhanaan dari "+a+"/"+b);
            System.out.println("adalah : 0");
        }else if (coi!=1) {
            pembilang /= coi;
            penyebut /= coi;
            System.out.println("Hasil penyederhanaan dari "+a+"/"+b);
            System.out.println("adalah : "+pembilang+"/"+penyebut);
        }else{
            System.out.println("Hasil penyederhanaan dari "+a+"/"+b);
            System.out.println("adalah : "+a+"/"+b);}
    }
}
    

