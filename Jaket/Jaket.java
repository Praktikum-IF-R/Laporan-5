package jaket;
public class Jaket {
    private final long jaketa;
    private final long jaketb;
    private final long jaketc;
    
    public Jaket(){
        jaketa=100000;
        jaketb=125000;
        jaketc=175000;
    }
    public Jaket(long a, long b, long c){
        jaketa=a;
        jaketb=b;
        jaketc=c;
    }
    public long HargajaketA(long a){
        long hasil,total,bayar,hasil2,total2;
        hasil=jaketa*5/100;
        hasil2=jaketa*a;
        total=jaketa-hasil;
        total2=jaketa;
        bayar=a*total;
       
        if(a>100){
            System.out.println("Anda mendapatkan diskon sebesar 5% dari total pembelian lebih dari 100 item jaket");
            System.out.println("Harga Persatuan jaket anda menjadi     : "+"Rp "+total);
            System.out.println("Harga yang harus anda bayarkan sebesar : "+"Rp "+bayar);
            System.out.println();
        }
        else {
            System.out.println("Anda Tidak mendapatkan diskon karena total pembelian jaket kurang dari 100 item");
            System.out.println("Harga Persatuan jaket anda menjadi     : "+"Rp "+total2);
            System.out.println("Harga yang harus anda bayarkan sebesar : "+"Rp "+hasil2);}
            System.out.println();
        return jaketa;
    }
     public long HargajaketB(long b){
        long hasil,total,bayar,hasil2,total2;
        hasil=jaketb*4/100;
        hasil2=jaketb*b;
        total=jaketb-hasil;
        total2=jaketb;
        bayar=b*total;
       
        if(b>100){
            System.out.println("Anda mendapatkan diskon sebesar 4% dari total pembelian lebih dari 100 item jaket");
            System.out.println("Harga Persatuan jaket anda menjadi     : "+"Rp "+total);
            System.out.println("Harga yang harus anda bayarkan sebesar : "+"Rp "+bayar);
            System.out.println();
        }
        else {
            System.out.println("Anda Tidak mendapatkan diskon karena total pembelian jaket kurang dari 100 item");
            System.out.println("Harga Persatuan jaket anda menjadi     : "+"Rp "+total2);
            System.out.println("Harga yang harus anda bayarkan sebesar : "+"Rp "+hasil2);}
            System.out.println();
        return jaketb;
    }
      public long HargajaketC(long c){
        long hasil,total,bayar,hasil2,total2;
        hasil=jaketc*8/100;
        hasil2=jaketc*c;
        total=jaketc-15000;
        total2=jaketc;
        bayar=c*total;
       
        if(c>100){
            System.out.println("Anda mendapatkan diskon sebesar 8% dari total pembelian lebih dari 100 item jaket");
            System.out.println("Harga Persatuan jaket anda menjadi     : "+"Rp "+total);
            System.out.println("Harga yang harus anda bayarkan sebesar : "+"Rp "+bayar);
            System.out.println();
        }
        else {
            System.out.println("Anda Tidak mendapatkan diskon karena total pembelian jaket kurang dari 100 item");
            System.out.println("Harga Persatuan jaket anda menjadi     : "+"Rp "+total2);
            System.out.println("Harga yang harus anda bayarkan sebesar : "+"Rp "+hasil2);}
            System.out.println();
        return jaketc;
    }
    
}
