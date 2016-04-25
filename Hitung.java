public class Hitung {
static int pembilang, penyebut;
public void Sederhana() {
       int temp, A, B;
        if (penyebut == 0) {
            return;
        }
        A = (pembilang < penyebut) ? penyebut : pembilang;
        B = (pembilang < penyebut) ? pembilang : penyebut;
        if (B == 0) {
            System.out.println("Bentuk Sederhana : 0");
        } else {
            for (int x = 0; x < x + 1; x++) {
                if (B == 0) {
                    break;
                }
                temp = A % B;
                A = B;
                B = temp;
            }
            pembilang /= A;
            penyebut /= A;
            if (penyebut == 1) {
                System.out.println("Bentuk Sederhana : " + pembilang);
            } else {
                System.out.println("Bentuk Sederhana : " + pembilang + "/" + penyebut);
            }
        }
    }
public void Pembagian(int pbl1, int pyb1, int pbl2, int pyb2){
       pembilang = pbl1*pyb2;
       penyebut = pyb1*pbl2;
       System.out.println("   PEMBAGIAN   ");
       System.out.println("= " + pbl1 + "/" + pyb1 + " : " + pbl2 + "/" +pyb2);
       System.out.println("= " + pembilang + "/" + penyebut);
}    
public void Perkalian (int pbl1, int pyb1, int pbl2 , int pyb2){
        pembilang = pbl1 * pbl2;
        penyebut = pyb1*pyb2;
        System.out.println("  PERKALIAN   ");
           System.out.println("= " + pbl1 + "/" + pyb1 + " x " + pbl2 + "/" +pyb2);
       System.out.println("= " + pembilang + "/" + penyebut);
}
public static void Penjumlahan (int pbl1, int pyb1, int pbl2, int pyb2){
        penyebut = pyb1 * pyb2;
        pembilang = (pbl1 * penyebut / pyb1) + (pbl2 * penyebut / pyb2);
        System.out.println("      PENJUMLAHAN      ");
        System.out.println("= " + pbl1 + "/" + pyb1 + " + " + pbl2 + "/" + pyb2);
        System.out.println("= " + pembilang + "/" + penyebut);
}
public static void Pengurangan (int pbl1, int pyb1, int pbl2, int pyb2){
        penyebut = pyb1 * pyb2;
        pembilang = (pbl1 * penyebut / pyb1) - (pbl2 * penyebut / pyb2);
        System.out.println("PENGURANGAN");
        System.out.println("= " + pbl1 + "/" + pyb1 + " - " + pbl2 + "/" + pyb2);
        System.out.println("= " + pembilang + "/" + penyebut);
     
}
}
