package StaticAndFinal;
public class JaketShop {
private static long HargaA,HargaB,HargaC ; private long TotalHarga;
private static final long JaketA = 100000;
private static final long JaketB = 125000;
private static final long JaketC = 175000;

public static void HargaDiskon(){
    long HargaA = 95000;
    long HargaB = 120000;
    long HargaC = 160000;
    System.out.println("Jaket A             \t:"+HargaA);
    System.out.println("Jaket B             \t:"+HargaB);
    System.out.println("Jaket C             \t:"+HargaC);
}
public static void JaketA(int A){
    long a;
    if(A > 100){
        a = 95000;
        HargaA = (long) a*A;
        System.out.println("Harga "  +A+  " Jaket Adalah    \t:"+HargaA);
    }
    else{
        a = 100000;
        HargaA = (long) a*A;
        System.out.println("Harga "  +A+ " Jaket Adalah     \t:"+HargaA);
    }
}
public static void JaketB(int B){
    long a;
    if(B > 100){
        a = 120000;
        HargaB = (long) a*B;
        System.out.println("Harga "  +B+ " Jaket Adalah     \t:"+HargaB);
    }
    else{
        a = 125000;
        HargaB = (long) a*B;
        System.out.println("Harga "  +B+ " Jaket Adalah     \t:"+HargaB);
}
}
public static void JaketC(int C){
    long a;
    if(C > 100){
        a = 120000;
        HargaC = (long) a*C;
        System.out.println("Harga "  +C+ " Jaket Adalah     \t:"+HargaC);
    }
    else{
        a = 125000;
        HargaC = (long) a*C;
        System.out.println("Harga "  +C+ " Jaket Adalah     \t:"+HargaC);
}
}
public static long getTotal(){
     long TotalHarga = HargaA + HargaB + HargaC;
     return TotalHarga;
}


}
