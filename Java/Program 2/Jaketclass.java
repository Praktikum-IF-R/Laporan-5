package jaket;
public class Jaketclass {
    private final int A = 100000;
    private final int B = 125000;
    private final int C = 175000;
    
    public static int diskona(int a){
        int c;
        if (a > 100){
            c = a * 95000;
        }
        else{
            c = a * 100000;
        }
        return c;
    }
    
    public static int diskonb(int a){
        int c;
        if (a > 100){
            c = a * 120000;
        }
        else{
            c = a * 125000;
        }        
        return c;
    }
    
    public static int diskonc(int a){
        int c;
        if (a > 100){
            c = a * 160000;
        }
        else{
            c = a * 175000;
        }        
        return c;
    }
}
