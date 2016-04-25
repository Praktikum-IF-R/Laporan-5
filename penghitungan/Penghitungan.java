package penghitungan;

public class Penghitungan {

    public static int hasil = 0;
    public static int nilai[] = new int[10];
    public double banyaknilai[] = new double[10];
    public double banyaknilai2[] = new double[10];
    //  public double nilaikali;
    // public double nilaibagi;
    public static int hasilkalibagi = 1;

    public void setNilai(double banyak) {
        for (int a = 0; a <= banyak; a++) {

        }
    }

    public static void Penjumlahan(int banyak, int y, int a) {
        nilai[y] = a;

        hasil += nilai[y];
        if (banyak == 1) {
            System.out.println("-------------------------------");
            System.out.println("HASILNYA ADALAH: \t" + a);
        } else if (y == banyak - 1) {
            System.out.println("----------------------------- +");
            System.out.println("HASILNYA ADALAH: \t" + hasil);
            hasil -= hasil;
        }

    }

    public static void Pengurangan(int banyak, int y, int a) {
        nilai[y] = a;
        hasil = nilai[0] - a;
        if (banyak == 1) {
            System.out.println("-------------------------------");
            System.out.println("HASILNYA ADALAH: \t" + a);
        } else if (y == banyak - 1) {
            System.out.println("----------------------------- -");
            System.out.println("HASILNYA ADALAH: \t" + hasil);
            hasil += hasil;
        }
    }

    public void Perkalian(int banyak, int y, double nilaikali) {
        banyaknilai[y] = nilaikali;
        hasilkalibagi *= banyaknilai[y];

        if (banyak == 1) {
            System.out.println("-------------------------------");
            System.out.println("HASILNYA ADALAH: \t" + nilaikali);
        } else if (y == banyak - 1) {
            System.out.println("----------------------------- x");
            System.out.println("HASILNYA ADALAH: \t" + hasilkalibagi);
            hasilkalibagi /= hasilkalibagi;
        }
    }

    public void Pembagian(int nilaikali, int nilaibagi) {

        System.out.println("Hasil Pembagiannya\t      :  " + nilaikali + "/" + nilaibagi);

    }

    public void Sederhana(int nilaikali, int nilaibagi) {
        if (nilaikali > nilaibagi) {
            if ((nilaikali == 2 * nilaibagi)) {
                hasilkalibagi = nilaikali / nilaibagi;
                System.out.println("Hasil Pembagiannya\t      :  " + hasilkalibagi);
            } else if (nilaikali % 2 == 0 && nilaibagi % 2 == 0) {
                for (int x = 0; x <= 10; x++) {
                    nilaikali /= 2;
                    nilaibagi /= 2;
                    if (nilaikali <= 1 || nilaibagi <= 1) {
                        break;
                    } else if (nilaikali % 2 != 0 || nilaibagi % 2 != 0) {
                        break;
                    }
                }
                if (nilaibagi == 1 && nilaikali > 1) {
                    System.out.println("Hasil Pembagiannya\t      :  " + nilaikali);
                } else if (nilaibagi != 1 && nilaikali > 1) {
                    System.out.println("Hasil Pembagiannya\t      :  " + nilaikali + "/" + nilaibagi);
                }
            } else if (nilaikali % 3 == 0 && nilaibagi % 3 == 0) {
                for (int z = 0; z <= 10; z++) {
                    nilaikali /= 3;
                    nilaibagi /= 3;
                    if (nilaikali <= 1 || nilaibagi <= 1) {
                        break;
                    } else if (nilaikali % 3 != 0 || nilaibagi % 3 != 0) {
                        break;
                    }
                }
                if (nilaibagi == 1 && nilaikali > 1) {
                    System.out.println("Hasil Pembagiannya\t      :  " + nilaikali);
                } else {
                    System.out.println("Hasil Pembagiannya\t      :  " + nilaikali + "/" + nilaibagi);
                }
            } else if (nilaikali > 1 && nilaibagi == 1) {
                System.out.println("Hasil Pembagiannya\t      :  " + nilaikali);
            } else {
                System.out.println("Hasil Pembagiannya\t      :  " + nilaikali + "/" + nilaibagi);
            }

        } else if (nilaikali < nilaibagi) {
            if (nilaikali % 2 == 0 && nilaibagi % 2 == 0) {
                for (int c = 0; c <= 10; c++) {
                    nilaikali /= 2;
                    nilaibagi /= 2;
                    if (nilaikali <= 1 || nilaibagi <= 1) {
                        break;
                    } else if (nilaikali % 2 != 0 || nilaibagi % 2 != 0) {
                        break;
                    }
                }
                System.out.println("Hasil Pembagiannya\t      :  " + nilaikali + "/" + nilaibagi);
            } else if (nilaikali % 3 == 0 && nilaibagi % 3 == 0) {
                for (int c = 0; c <= 10; c++) {
                    nilaikali /= 3;
                    nilaibagi /= 3;
                    if (nilaikali <= 1 || nilaibagi <= 1) {
                        break;
                    } else if (nilaikali % 2 != 0 || nilaibagi % 2 != 0) {
                        break;
                    }
                }
                System.out.println("Hasil Pembagiannya\t      :  " + nilaikali + "/" + nilaibagi);
            } else {
                System.out.println("Hasil Pembagiannya\t      :  " + nilaikali + "/" + nilaibagi);
            }

        } else if (nilaikali == nilaibagi) {
            System.out.println("Hasil Pembagiannya\t      :  1");
        } else if (nilaikali < nilaibagi && nilaikali % 2 != 0 || nilaibagi % 2 != 0 && nilaikali % 3 != 0 || nilaibagi % 3 != 0) {
            System.out.println("Hasil Pembagiannya\t      :  " + nilaikali + "/" + nilaibagi);
        } else if (nilaibagi == 0 && nilaikali <= 1) {
            System.out.println("NILAI TAK TERDEFINISI");
        } else {
            System.out.println("Hasil Pembagiannya\t      :  " + nilaikali + "/" + nilaibagi);
        }
    }
}
