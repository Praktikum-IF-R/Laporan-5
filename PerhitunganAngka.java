package perhitunganangka;

public class PerhitunganAngka {
    private static double angka1, angka2;
    private int penyebut, pembilang;
    
    public PerhitunganAngka(){
        angka1 = 0;
        angka2 = 0;
    }
    
    public PerhitunganAngka(double a, double b){
        angka1 = a;
        angka2 = b;
    }
    
    public void setAngka(double a, double b, int c, int d){
        angka1 = a;
        angka2 = b;
        pembilang = c;
        penyebut = d;
    }
    
    public static double penjumlahan(){
        double hasil;
        hasil = angka1 + angka2;
        return hasil;
    }
    
    public static double pengurangan(){
        double hasil;
        hasil = angka1 - angka2;
        return hasil;
    }
    
    public double perkalian(){
        double hasil;
        hasil = angka1 * angka2;
        return hasil;
    }
    
    public double pembagian(){
        double hasil;
        hasil = angka1 / angka2;
        return hasil;
    }
    
    public void Sederhana(){
         double temp, A, B;
             if (pembilang ==0){            
               return;  
             }   
             
             A = (pembilang<penyebut) ? penyebut:pembilang; 
             B = (pembilang<penyebut) ? pembilang:penyebut; 
             
           
             for (;B>0;){            
               temp= A % B;           
               A = B;          
               B = temp;  
             }  
             
             pembilang /=A;  
             penyebut /=A;     
    }
    
    public void cetak(){
        System.out.println(pembilang+"/"+penyebut);
    }
    
}
