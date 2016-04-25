package jaketmain;
public class Jaket {
    private static int A,B,C ; 
    private static final int jA = 100000;
    private static final int jB = 125000;
    private static final int jC = 175000;
    private int Total;
    
public static void Diskon(){
    int hA = 95000;
    int hB = 120000;
    int hC = 160000;
    System.out.println("Jaket A             :"+hA);
    System.out.println("Jaket B             :"+hB);
    System.out.println("Jaket C             :"+hC);
}
public static void jA(int i){
    int x;
    if(i>100){
        x = 95000;
        A = (int) x*i;
        System.out.println("Harga Jaket       :"+A);
    }
    else{
        x = 100000;
        A = (int) x*i;
        System.out.println("Harga Jaket        :"+A);
    }
}
public static void jB(int i){
    int x;
    if(i>100){
        x = 120000;
        B = (int) x*i;
        System.out.println("Harga Jaket        :"+B);
    }
    else{
        x = 125000;
        B = (int) x*i;
        System.out.println("Harga Jaket        :"+B);
}
}
public static void jC(int i){
    int x;
    if(i> 100){
        x = 120000;
        C = (int) x*i;
        System.out.println("Harga Jaket        :"+C);
    }
    else{
        x = 125000;
        C = (int) x*i;
        System.out.println("Harga Jaket        :"+C);
}
}
public static long getTotal(){
     int Total= A+B+C;
     return Total;
}
}
