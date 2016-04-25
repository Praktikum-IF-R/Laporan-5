import java.util.Scanner;
public class Jaket {
  int harga,harga1,harga2;
  private final int jaketA=100000;
  private final int jaketB=125000;
  private final int jaketC=175000;
public void A(int jumlah){
    if (jumlah > 100){
    harga = jumlah*95000;
    System.out.print("Jumlah yang harus dibayarkan: "+harga);}
    else{
    harga = jumlah*jaketA;
    System.out.println("Jumlah yang harus dibayarkan: "+harga);
    }
}
  public int getA (){
    return harga;
}
public void B(int jumlah){
    if (jumlah > 100){
    harga1 = jumlah*120000;
    System.out.print("Jumlah yang harus dibayarkan: "+harga1);}
    else{
    harga1 = jumlah*jaketB;
    System.out.println("Jumlah yang harus dibayarkan: "+harga1);
    }
}
public int getB(){
    return harga1;
}
public void C (int jumlah){
    if (jumlah > 100){
    harga2 = jumlah*160000;
    System.out.print("Jumlah yang harus dibayarkan: "+harga2);}
    else{
    harga2 = jumlah*jaketC;
    System.out.println("Jumlah yang harus dibayarkan: "+harga2);
    }
}
public int getC(){
    return harga2;
}
public int getTotal(){
 return getA()+getB()+getC();   
}
}