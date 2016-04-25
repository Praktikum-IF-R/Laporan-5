public class Vendor {
    private static long HargaA, HargaB, HargaC;
    public Vendor(){
        HargaA = 100000;
        HargaB = 125000;
        HargaC = 175000;
    }
    public Vendor(int a, int b, int c){
        HargaA = a;
        HargaB = b;
        HargaC = c;
    }
    public static void JaketA(int ja){
        long a;
        if(ja>100){
            a = 95000;
            HargaA = (long) a*ja;
            System.out.println("Jumlah jaket dipesan : "+ja+"pcs.");
            System.out.println("Total harga          : Rp"+HargaA);
        }else{
            a = 100000;
            HargaA = (long) a*ja;
            System.out.println("Jumlah jaket dipesan : "+ja+"pcs.");
            System.out.println("Total harga          : Rp"+HargaA);
        }
    }
    public static void JaketB(int jb){
        long b;
        if(jb>100){
            b = 120000;
            HargaB = (long) b*jb;
            System.out.println("Jumlah jaket dipesan : "+jb+"pcs.");
            System.out.println("Total harga          : Rp"+HargaB);
        }else{
            b = 100000;
            HargaB = (long) b*jb;
            System.out.println("Jumlah jaket dipesan : "+jb+"pcs.");
            System.out.println("Total harga          : Rp"+HargaB);
        }
    }
    public static void JaketC(int jc){
        long c;
        if(jc>100){
            c = 95000;
            HargaC = (long) c*jc;
            System.out.println("Jumlah jaket dipesan : "+jc+"pcs.");
            System.out.println("Total harga          : Rp"+HargaC);
        }else{
            c = 100000;
            HargaC = (long) c*jc;
            System.out.println("Jumlah jaket dipesan : "+jc+"pcs.");
            System.out.println("Total harga          : Rp"+HargaC);
        }
    }
}
