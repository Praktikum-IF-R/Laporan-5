package StaticdanFinal;
public class Jaket {
    private static final long A = 100000;
    private static final long B = 125000;
    private static final long C = 175000;
    private static long jum = 0;
    public static void JaketA(int a) {
        if(a>100){
            jum += (long) 95000 * a;
        }else{
            jum += (long) A * a;
        }
        System.out.println("Total sementara : "+jum);
    }
    public static void JaketB(int a) {
        if(a>100){
            jum += (long) 120000 * a;
        }else{
            jum += (long) B * a;
        }
        System.out.println("Total sementara : "+jum);
    }
    public static void JaketC(int a) {
        if(a>100){
            jum += (long) 160000 * a;
        }else{
            jum += (long) C * a;
        }
        System.out.println("Total sementara : "+jum);
    }
    public static void display(){
        System.out.println("Jumlah harga yang harus di bayar : "+jum);
    }
}
