
package bab5;


public class Jaketabc {
      private static final int jaketa=100000, jaketb=125000, jaketc=175000;
    private static final int disa=95000, disb=120000, disc=160000;
    private static int totalakhir=0;
    private int belia, belib, belic, total=0;
    public Jaketabc(){
    }
    public Jaketabc(int a, int b, int c){
        this.belia=a;
        this.belib=b;
        this.belic=c;
    }
    public int getBelia(){
        return belia;
    }
    public int getBelib(){
        return belib;
    }
    public int getBelic(){
        return belic;
    }
    public void beliJaket(){
    int totalja=0, totaljb=0, totaljc=0;
            System.out.println("---------------CV. Labkomdas---------------");
        if (belia>100) {
            totalja=disa*getBelia();
            System.out.println("   ---------------Jaket A---------------");
            System.out.println("Harga awal     : Rp. "+jaketa);
            System.out.println("Karna membeli jaket lebih dari 100, maka:");
            System.out.println("Diskon sebesar : Rp. "+(jaketa-5000));
            System.out.println("Total harga    : Rp. "+totalja);
            System.out.println("--------------------------------------------");
        }else{
            totalja=jaketa*getBelia();
            System.out.println("   ---------------Jaket A---------------");
            System.out.println("Karna membeli jaket kurang dari 100, maka:");
            System.out.println("Total harga    : Rp. "+totalja);
            System.out.println("--------------------------------------------");}
        if (belib>100) {
            totaljb=disb*getBelib();
            System.out.println("   ---------------Jaket B---------------");
            System.out.println("Harga awal     : Rp. "+jaketb);
            System.out.println("Karna membeli jaket lebih dari 100, maka:");
            System.out.println("Diskon sebesar : Rp. "+(jaketb-5000));
            System.out.println("Total harga    : Rp. "+totaljb);
            System.out.println("--------------------------------------------");
        }else{
            totaljb=jaketb*getBelib();
            System.out.println("   ---------------Jaket B---------------");
            System.out.println("Karna membeli jaket kurang dari 100, maka:");
            System.out.println("Total harga    : Rp. "+totaljb);
            System.out.println("--------------------------------------------");}
        if (belic>100) {
            totaljc=disc*getBelic();
            System.out.println("   ---------------Jaket C---------------");
            System.out.println("Harga awal     : Rp. "+jaketc);
            System.out.println("Karna membeli jaket lebih dari 100, maka:");
            System.out.println("Diskon sebesar : Rp. "+(jaketc-15000));
            System.out.println("Total harga    : Rp. "+totaljc);
            System.out.println("--------------------------------------------");
        }else{
            totaljc=jaketc*getBelic();
            System.out.println("   ---------------Jaket C---------------");
            System.out.println("Karna membeli jaket kurang dari 100, maka:");
            System.out.println("Total harga    : Rp. "+totaljc);
            System.out.println("--------------------------------------------");}
        this.total=totalja+totaljb+totaljc;
        System.out.println("Harga Total    : Rp. "+total);
            System.out.println("--------------------------------------------");
 }
}
  

