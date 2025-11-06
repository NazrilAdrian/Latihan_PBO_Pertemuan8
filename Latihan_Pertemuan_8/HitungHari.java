package Latihan_Pertemuan_8;

public class HitungHari {
    public int hitung(int tahun, int bulan) {
        if (bulan < 1 || bulan > 12) return -1;

        switch (bulan) {
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                return 31;

            case 4: case 6: case 9: case 11:
                return 30;

            case 2:
                // cek tahun kabisat
                if ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0))
                    return 29;
                else
                    return 28;

            default:
                return -1;
        }
    }
}
