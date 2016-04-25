public class takakuba {
    private int a,b;
    
    public static void Tambah(int a, int b){
        int h1 = a + b;
        System.out.println("Hasil penjumlahan adalah "+h1);
    }
    public static void Kurang(int c, int d){
        int h2 = c - d;
        System.out.println("Hasil pengurangan adalah "+h2);
    }
    public int Kali(int e, int f){
        int h3 = e * f;
        System.out.println("Hasil perkalian adalah "+h3);
        return h3;
    }
    public int Bagi(int g, int h){
        int h4 = g / h;
        System.out.println("Hasil pembagian adalah "+h4);
        return h4;
    }
    public int Sederhana(int i, int j){
        a = i;
        b = j;
        int hatjep = i / j;
        while(j!=0){
            int l = j;
            j = i % j;
            i = l;
        }
        int k = a;
        a = a / k;
        b = a / k;
        System.out.println("Hasil penyederhanaan pecahan adalah "+a+"/"+b);
        return hatjep;
    }
}