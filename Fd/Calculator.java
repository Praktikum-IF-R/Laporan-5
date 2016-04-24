package Fd;

public class Calculator {
    private static int pembilang;
    private static int penyebut;
public static void hitungPenjumlahan(int a,int b,int c,int d){
    pembilang = (a*d)+(c*b);
    penyebut = b*d;
    System.out.println("Hasil Penjumlahan   : "+pembilang+"/"+penyebut);}
public static void hitungPengurangan(int a,int b,int c,int d){
    pembilang = (a*d)-(c*b);
    penyebut = b*d;
    System.out.println("Hasil Pengurangan   : "+pembilang+"/"+penyebut);}
public void hitungPerkalian(int a,int b, int c,int d){
    pembilang = a*c;
    penyebut = b*d;
    System.out.println("Hasil Perkalian     : "+pembilang+"/"+penyebut);}
public void hitungPembagian(int a,int b,int c, int d){
    pembilang = a*d;
    penyebut = b*c;
    System.out.println("Hasil Pembagian     : "+pembilang+"/"+penyebut);}
public void sederhana(){
    int temp,A,B;
    if (penyebut==0){
        return;}
    A=(pembilang<penyebut)? penyebut:pembilang;
    B=(pembilang<penyebut)? pembilang:penyebut;
    while(B != 0){
        temp = A % B;
        A = B;
        B = temp;}
    pembilang /=A;
    penyebut /=A;
    if(pembilang==penyebut){
        System.out.println("Hasil Sederhana      : 1");}
    else if (pembilang==0){
        System.out.println("Hasil Sederhana      : 0");}
    else if (penyebut==1){
        System.out.println("Hasil Sederhana      : "+pembilang);}
    else{
        System.out.println("Hasil Sederhana      : "+pembilang+"/"+penyebut);}
}
}

