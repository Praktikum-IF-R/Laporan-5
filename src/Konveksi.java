package Tugas;
public class Konveksi {
    private final double a = 100000;
    private final double b = 125000;
    private final double c = 175000;
    private final Object[][] harga = {{100000,125000,175000},{0,0,0}};
    private int disc;
    private double total = 0;
    
    public void Disc(int a, int b){
        if(0<a && a<3){
            disc = 5000*b;
        }
        else{
            disc = 15000*b;
        }
    }
    public void beli(int t, int u){
        if(t<4){
        switch (t){
            case 1  :   if(u<100){
                            total += (int) harga[0][0]*u;
                            harga[1][0] = u;
                        }else{
                            total += ((int) harga[0][0]*u)-disc;
                            harga[1][0] = u;
                        }break;
            case 2  :   if(u<100){
                            total += (int) harga[0][1]*u;
                            harga[1][1] = u;
                        }else{
                            total += ((int) harga[0][1]*u)-disc;
                            harga[1][1] = u;
                        }break;
            case 3  :   if(u<100){
                            total += (int) harga[0][2]*u;
                            harga[1][2] = u;
                        }else{
                            total += ((int) harga[0][2]*u)-disc;
                            harga[1][2] = u;
                        }break;
            default :   break;
        }
    }else{
        }
    }
    public void daftarBelanja(){
        System.out.println("Barang yang anda pesan:");
        System.out.println("Jaket Tipe A sebanyak: "+harga[1][0]);
        System.out.println("Jaket Tipe B sebanyak: "+harga[1][1]);
        System.out.println("Jaket Tipe C sebanyak: "+harga[1][2]);
        System.out.println("Total Bayar: Rp "+total);
    }
}
