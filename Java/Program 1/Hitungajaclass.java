package hitungaja;
public class Hitungajaclass {
    
    public static void tambah(int a , int b){
        int c = a + b;
        System.out.println("Hasil Pertambahan : "+c);
    }
    
    public static void kurang(int a , int b){
        int c = a - b;
        System.out.println("Hasil Pengurangan : "+c);
    }
    
    public void kali(int a , int b){
        int c = a * b;
        System.out.println("Hasil Perkalian : "+c);
    }
    
    public void bagi(int a , int b){
        int c = a / b;
        System.out.println("Hasil Pembagian : "+c);
    }
    
    public void sederhana(int x , int y){
        int temp, X, Y;
        X = (x < y) ? y : x;
        Y = (x < y) ? x : y;
            for (int i = 0; Y != 0; i++) {
            temp = X % Y;
            X = Y;
            Y = temp;
            }
        x /= X;
        y /= X;
        
        System.out.println("Hasil Penyederhanaan : "+ x + "/" + y);
  
    }
}
