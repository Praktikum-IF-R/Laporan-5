package Laporan5;

/**
 *
 * @author wahyuridiansyah
 */
public class Jaket {

    private final int jaketA = 100000;
    private final int jaketB = 125000;
    private final int jaketC = 175000;
    private int jumlahJaket, hargaJaket;

    public void JualJaket(int pilihan, int jumlahJaket) {
        if (pilihan == 001) {
            if (jumlahJaket > 100) {
                hargaJaket = 95000 * jumlahJaket;
                System.out.println("Total harga jaket A yang harus dibayarkan Rp " + hargaJaket);
            } else {
                hargaJaket = jaketA * jumlahJaket;
                System.out.println("Total harga jaket A yang harus dibayarkan Rp " + hargaJaket);
            }
        } else if (pilihan == 002) {
            if (jumlahJaket > 100) {
                hargaJaket = 120000 * jumlahJaket;
                System.out.println("Total harga jaket B yang harus dibayarkan Rp " + hargaJaket);
            } else {
                hargaJaket = jaketB * jumlahJaket;
                System.out.println("Total harga jaket B yang harus dibayarkan Rp " + hargaJaket);
            }
        } else if (pilihan == 003) {
            if (jumlahJaket > 100) {
                hargaJaket = 175000 * jumlahJaket;
                System.out.println("Total harga jaket C yang harus dibayarkan Rp " + hargaJaket);
            } else {
                hargaJaket = jaketC * jumlahJaket;
                System.out.println("Total harga jaket C yang harus dibayarkan Rp " + hargaJaket);
            }
        } else {
            System.out.println("Maaf, pilihan Anda tidak tersedia");
        }
    }
}
