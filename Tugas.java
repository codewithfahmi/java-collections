import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class Tugas {
    static class Praktikum {
        public int nim;
        public String matkul;
        public String praktikum;
        public int modul;
        public float nilai;
        public String komentar;

        public Praktikum(
                int nim,
                String matkul,
                String praktikum,
                int modul,
                float nilai,
                String komentar) {
            this.nim = nim;
            this.matkul = matkul;
            this.praktikum = praktikum;
            this.modul = modul;
            this.nilai = nilai;
            this.komentar = komentar;
        }

        @Override
        public String toString() {
            return "Praktikum [nim=" + nim + ", matkul=" + matkul + ", praktikum=" + praktikum + ", modul=" + modul
                    + ", nilai=" + nilai + ", komentar=" + komentar + "]";
        }
    }

    public static void main(String[] args) {
        LinkedList<Praktikum> nilai = new LinkedList<>();

        int nim = 185410006;
        String matkul = "Struktur Data";

        nilai.add(new Praktikum(nim, matkul, "Tipe data dalam Java", 1, 98, ""));
        nilai.add(new Praktikum(nim, matkul, "Struktur Penyimpanan Berbasis Record & Array of Record", 2, 95, ""));
        nilai.add(new Praktikum(nim, matkul, "Pengelolaan Data pada Array: Penambahan & Penghapusan Data", 3, 89, ""));
        nilai.add(new Praktikum(nim, matkul, "Pengelolaan Data pada Array: Pencarian Data", 4, 100, ""));
        nilai.add(new Praktikum(nim, matkul, "Pengelolaan Data pada Array: Pengurutan (Sorting)", 5, 72, ""));
        nilai.add(
                new Praktikum(nim, matkul, "Pemanfaatan Array sebagai Stack (Tumpukan) and Queue(Antrian)", 6, 90, ""));
        nilai.add(new Praktikum(nim, matkul, "Pointer Dalam Java", 7, 99, ""));
        nilai.add(new Praktikum(nim, matkul, "Single Linked List (Senarai Berantai Tunggal)", 8, 90, ""));
        nilai.add(new Praktikum(nim, matkul, "Single Linked List (Lanjutan)", 9, 90, ""));
        nilai.add(new Praktikum(nim, matkul, "Double Linked List (Senarai Berantai Ganda)", 10, 86, ""));

        Collections.sort(nilai, Comparator.comparing(p -> p.praktikum));

        for (int i = 0; i < nilai.size(); i++) {
            System.out.println(nilai.get(i));
        }

    }
}
