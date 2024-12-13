import java.util.ArrayList;
import java.util.LinkedList;

class Latihan {
  @SuppressWarnings({ "rawtypes", "unchecked" })
  public static void main(String[] args) {
    // Latihan - 1
    LinkedList linkedList = new LinkedList<>();
    linkedList.add(1);
    linkedList.add("Hello, World!");
    linkedList.add(1234567890123456789L);

    for (int i = 0; i < linkedList.size(); i++) {
      System.out.println(linkedList.get(i));
    }

    // Latihan - 2
    ArrayList daftarMahasiswa = new ArrayList<>();
    daftarMahasiswa.add("Agungbp");
    daftarMahasiswa.add("Bambang");
    daftarMahasiswa.add("Cucuk");
    daftarMahasiswa.add("Dion");
    daftarMahasiswa.add("Ending");
    daftarMahasiswa.add("Fifin");
    daftarMahasiswa.add("Gesit");
    daftarMahasiswa.add("Heru");
    daftarMahasiswa.add("Irma");
    daftarMahasiswa.add("Janti");
    for (int i = 0; i < daftarMahasiswa.size(); i++) {
      System.out.println(daftarMahasiswa.get(i));
    }
  }
}
