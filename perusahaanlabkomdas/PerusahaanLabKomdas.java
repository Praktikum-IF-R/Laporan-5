package perusahaanlabkomdas;

public class PerusahaanLabKomdas {

    private final int HargaJA = 100000;
    private final int HargaJB = 125000;
    private final int HargaJC = 175000;
    private static int HargaDiskon;

    public void BeliJaketA(int banyak) {
        if (banyak > 100) {
            HargaDiskon += banyak * (HargaJA - 5000);
        } else {
            HargaDiskon += HargaJA * banyak;
        }
    }

    public void BeliJaketB(int banyak) {
        if (banyak > 100) {
            HargaDiskon += banyak * (HargaJB - 5000);
        } else {
            HargaDiskon += HargaJC * banyak;
        }
    }

    public void BeliJaketC(int banyak) {
        if (banyak > 100) {
            HargaDiskon += banyak * (HargaJC - 5000);
        } else {
            HargaDiskon += HargaJC * banyak;
        }
    }

    public int getHargaDiskon() {
        return HargaDiskon;
    }

    public void HargaDiskon() {
        System.out.println("Yang Harus Dibayar sebesar Rp. " + HargaDiskon);
        System.out.println("Terimakasih :)");
    }
}
