
package cvlabkomdas;

public class CVLabKomDas {
    private final int JaketA=95000;
    private final int JaketB=120000;
    private final int JaketC=160000;
    private int jumlahjaketA;
    private int jumlahjaketB;
    private int jumlahjaketC;
    private int totaljaketA;
    private int totaljaketB;
    private int totaljaketC;
    private int Jumlah;
    public int jaketA(int a){
        jumlahjaketA=a;
        if(jumlahjaketA>=100){
            totaljaketA=jumlahjaketA*95000;
        
        }
        else{
            totaljaketA=JaketA*jumlahjaketA;
        }
        return totaljaketA;
    }
    public int jaketB(int b){
        jumlahjaketB=b;
        if(jumlahjaketB>=100){
            totaljaketB=jumlahjaketB*120000;
        
        }
        else{
            totaljaketB=JaketB*jumlahjaketB;
        }
        return totaljaketB;
    }
    public int jaketC(int c){
    jumlahjaketC=c;
        if(jumlahjaketC>=100){
            totaljaketC=jumlahjaketC*160000;
        
        }
        else{
            totaljaketB=JaketC*jumlahjaketC;
        }
        return totaljaketC;    
}
    public int JumlahPembelian(){
       Jumlah=totaljaketA+totaljaketB+totaljaketC;
        return Jumlah;
    }
    public void displayMessage(){
        System.out.println("Total pembelian jaket A :"+totaljaketA);
        System.out.println("Total pembelian jaket B :"+totaljaketB);
        System.out.println("Total pembelian jaket C :"+totaljaketC);
        System.out.println("Total semua pembelian :"+Jumlah);
    }
}