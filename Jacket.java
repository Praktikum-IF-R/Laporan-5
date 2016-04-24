package praktikumbab5;

public class Jacket {

    private final int j1 = 100000, j2 = 125000, j3 = 175000;
    private int harga;

    public Jacket(int b, int a) {
        switch (b) {
            case 1:
                if (a > 1000) {
                    harga = a * 95000;

                } else {
                    harga = a * j1;
                }
                break;
            case 2:
                if (a > 100) {
                    harga = a *120000;

                }
                else{
                    harga=a*j2;
                }
                break;
            case 3:
                if(a>100){
                    harga=a*160000;
                    
                }
                else{
                    harga=a*j3;
                }

        }
        
        }
    public int getHarga(){
            return harga;
    }
}

   
