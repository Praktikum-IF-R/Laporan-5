package lap5staticnfinal;
public class jaket {
    private final static int jaketA = 100000, jaketB = 125000, jaketC = 175000;
    private static int cost, total;  
        public static void pilihan (int a, int b){
        switch (a){
            case 1 :
                if (b > 100){
                    cost = jaketA-5000; 
                    total = cost*b;
                    System.out.println("Anda memesan produk Jaket A sebanyak : "+ b +" buah");
                    System.out.println("Harga : Rp "+ cost + ",00 per buah");
                    System.out.println("Total harga yang harus anda bayar : Rp "+total+",00");
                } else{
                    cost = jaketA; 
                    total = jaketA*b;
                    System.out.println("Anda memesan produk Jaket A sebanyak : "+ b +" buah");
                    System.out.println("Harga : Rp "+ cost + ",00 per buah");
                    System.out.println("Total harga yang harus anda bayar : Rp "+total+",00");
                } break;
            case 2 : 
                if (b > 100){
                    cost = jaketB-5000; 
                    total = cost*b;
                    System.out.println("Anda memesan produk Jaket B sebanyak : "+ b +" buah");
                    System.out.println("Harga : Rp "+ cost + ",00 per buah");
                    System.out.println("Total harga yang harus anda bayar : Rp "+total+",00");
                } else{
                    cost = jaketB; 
                    total = jaketB*b;
                    System.out.println("Anda memesan produk Jaket B sebanyak : "+ b +" buah");
                    System.out.println("Harga : Rp "+ cost + ",00 per buah");
                    System.out.println("Total harga yang harus anda bayar : Rp "+total+",00");
                } break;
            case 3 :
                if (b > 100){
                    cost = jaketC-15000; 
                    total = cost*b;
                    System.out.println("Anda memesan produk Jaket C sebanyak : "+ b +" buah");
                    System.out.println("Harga : Rp "+ cost + ",00 per buah");
                    System.out.println("Total harga yang harus anda bayar : Rp "+total+",00");
                } else{
                    cost = jaketC; 
                    total = jaketC*b;
                    System.out.println("Anda memesan produk Jaket C sebanyak : "+ b +" buah");
                    System.out.println("Harga : Rp "+ cost + ",00 per buah");
                    System.out.println("Total harga yang harus anda bayar : Rp "+total+",00");
                } break; 
            default : break;
        }
    }   
}

    

