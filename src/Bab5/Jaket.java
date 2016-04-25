package Bab5;

public class Jaket {

    private static final int A = 100000;
    private static final int B = 125000;
    private static final int C = 175000;
    private static int dis = 5000;
    private static int hd = 0;
    private static int total = 0;
    private static String stat = "";

    public static void pesan(String p, int a) {
        if (a <= 100) {
            if (p.equalsIgnoreCase("a")) {
                total = A * a;
                hd = A;
            } else if (p.equalsIgnoreCase("b")) {
                total = B * a;
                hd = B;
            } else if (p.equalsIgnoreCase("c")) {
                total = C * a;
                hd = C;
            }
            stat = "Tidak";
        } else {
            if (p.equalsIgnoreCase("a")) {
                hd = A - dis;
                total = hd * a;
            } else if (p.equalsIgnoreCase("b")) {
                hd = B - dis;
                total = hd * a;
            } else if (p.equalsIgnoreCase("c")) {
                hd = C - (dis * 3);
                total = hd * a;
            } 
            stat = "Ya";
        }
    }

    public int getTotal() {
        return total;
    }

    public int getHargaAkhir() {
        return hd;
    }

    public String getStat() {
        return stat;
    }
}
