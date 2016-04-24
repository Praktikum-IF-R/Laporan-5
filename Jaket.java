package mainjaket;
public class Jaket {
    private int jmlA,jmlB,jmlC;
    private long total;
    private final long A,B,C;
    public Jaket(){
        A = 100000;
        B = 125000;
        C = 175000;
    }
    public Jaket(long a, long b, long c){
        A = a;
        B = b;
        C = c;
    }
    public static long getHargaA(int a){
        if(a>100){
            return 95000;
        }
        else{
            return 100000;
        }
    }
    public static long getHargaB(int b){
        if(b>100){
            return 120000;
        }
        else{
            return 125000;
        }
    }
    public static long getHargaC(int c){
        if(c>100){
            return 160000;
        }
        else{
            return 175000;
        }
    }
    public long getTotalHarga(int a, int b, int c){
        jmlA = a;
        jmlB = b;
        jmlC = c;
        return total=jmlA*A+jmlB*B+jmlC*C;
    }
}