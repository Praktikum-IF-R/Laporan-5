package cvlabkomdas;

public class CVLabkomdas {
    private final int hargaBahanA, hargaBahanB, hargaBahanC;
    private int banyakJaketA, banyakJaketB, banyakJaketC;
    private static int totalA, totalB, totalC;
    
    public CVLabkomdas(int a, int b, int c){
        banyakJaketA = a;
        banyakJaketB = b;
        banyakJaketC = c;
        
        if(banyakJaketA > 100)
            hargaBahanA = 95000;
        else
            hargaBahanA = 100000;
        
        if(banyakJaketB > 100)
            hargaBahanB = 120000;
        else
            hargaBahanB = 125000;
        
        if(banyakJaketC > 100)
            hargaBahanC = 160000;
        else
            hargaBahanC = 175000;
    }
    
    public int totalHargaA(){
      
        if(banyakJaketA > 100){
            System.out.println("\nHarga Jaket A          :Rp100000");
            System.out.println("Mendapat Diskon Menjadi:RP"+hargaBahanA);
        }
        else{
            System.out.println("\nHarga Jaket A :Rp"+hargaBahanA);
        }
        totalA = banyakJaketA * hargaBahanA;
        System.out.println(banyakJaketA+"   X   RP"+hargaBahanA+"   =   RP"+totalA);
        return totalA;
    }
    
    public int totalHargaB(){
        if(banyakJaketB > 100){
            System.out.println("\nHarga Jaket B          :Rp125000");
            System.out.println("Mendapat Diskon Menjadi:RP"+hargaBahanB);
        }
        else{
            System.out.println("\nHarga Jaket B :Rp"+hargaBahanA);
        }
        totalB = banyakJaketB * hargaBahanB;
        System.out.println(banyakJaketB+"   X   RP"+hargaBahanB+"   =   RP"+totalB);
        return totalB;
    }
    
    public int totalHargaC(){
        if(banyakJaketC > 100){
            System.out.println("\nHarga Jaket C          :Rp175000");
            System.out.println("Mendapat Diskon Menjadi:RP"+hargaBahanC);
        }
        else{
            System.out.println("\nHarga Jaket B :Rp"+hargaBahanC);
        }
        totalC = banyakJaketC * hargaBahanC;
        System.out.println(banyakJaketC+"   X   RP"+hargaBahanC+"   =   RP"+totalC);
        return totalC;
    }
    
    public static void totalBayar(){
        System.out.println("\nTotal Bayar Bahan A =  Rp"+totalA);
        System.out.println("Total Bayar Bahan B =  Rp"+totalB);
        System.out.println("Total Bayar Bahan C =  Rp"+totalC);
        System.out.println("Total Bayar         =  Rp"+(totalA+totalB+totalC));
    }
    
    
    
    
    
    
}
