import java.util.LinkedList;

class App {
  public void p1() {
    @SuppressWarnings("rawtypes")
    LinkedList daftarMahasiswa = new LinkedList<>();

    if (daftarMahasiswa.isEmpty()) {
      System.out.println("daftarMahasiswa is empty");
    } else {
      System.out.println("daftarMahasiswa filled with data");
    }
  }

  @SuppressWarnings({ "rawtypes", "unchecked" })
  public void p2() {
    LinkedList daftarMahasiswa = new LinkedList<>();

    if (daftarMahasiswa.isEmpty()) {
      System.out.println("daftarMahasiswa is empty");
    } else {
      System.out.println("daftarMahasiswa filled with data");
    }

    daftarMahasiswa.add("Agung BP");
    daftarMahasiswa.add("Bambang");

    if (daftarMahasiswa.isEmpty()) {
      System.out.println("daftarMahasiswa is empty");
    } else {
      System.out.println("daftarMahasiswa filled with data");
    }
  }

  @SuppressWarnings({ "rawtypes", "unchecked" })
  public void p3() {
    LinkedList daftarMahasiswa = new LinkedList<>();

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

    System.out.println(daftarMahasiswa.get(0));
    System.out.println(daftarMahasiswa.get(1));
    System.out.println(daftarMahasiswa.get(2));
    System.out.println(daftarMahasiswa.get(3));
    System.out.println(daftarMahasiswa.get(4));
    System.out.println(daftarMahasiswa.get(5));
    System.out.println(daftarMahasiswa.get(6));
    System.out.println(daftarMahasiswa.get(7));
    System.out.println(daftarMahasiswa.get(8));
    System.out.println(daftarMahasiswa.get(9));
  }

  @SuppressWarnings({ "rawtypes", "unchecked" })
  public void p4() {
    LinkedList daftarMahasiswa = new LinkedList<>();

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

    System.out.println("daftarMahasiswa size: " + daftarMahasiswa.size());

    for (int i = 0; i <= daftarMahasiswa.size() - 1; i++)
      System.out.printf("%d %s\n", i, daftarMahasiswa.get(i));
  }

  @SuppressWarnings({ "rawtypes", "unchecked" })
  public void p5() {
    LinkedList daftarMahasiswa = new LinkedList<>();
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

    System.out.println("daftarMahasiswa size: " + daftarMahasiswa.size());

    for (int i = 0; i <= daftarMahasiswa.size() - 1; i++)
      System.out.printf("%d %s\n", i, daftarMahasiswa.get(i));

    daftarMahasiswa.addFirst("Amir");
    daftarMahasiswa.addLast("Zaenal");

    System.out.println("daftarMahasiswa size: " + daftarMahasiswa.size());

    for (int i = 0; i <= daftarMahasiswa.size() - 1; i++)
      System.out.printf("%d %s\n", i, daftarMahasiswa.get(i));

    System.out.printf("First Mahasiswa: %s\n", daftarMahasiswa.getFirst());
    System.out.printf("Last Mahasiswa: %s\n", daftarMahasiswa.getLast());
  }

  @SuppressWarnings({ "rawtypes", "unchecked" })
  public void p6() {
    LinkedList daftarMahasiswa = new LinkedList<>();

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

    System.out.println("daftarMahasiswa size: " + daftarMahasiswa.size());

    for (int i = 0; i <= daftarMahasiswa.size() - 1; i++)
      System.out.printf("%d %s\n", i, daftarMahasiswa.get(i));

    daftarMahasiswa.remove(5);

    for (int i = 0; i <= daftarMahasiswa.size() - 1; i++)
      System.out.printf("%d %s\n", i, daftarMahasiswa.get(i));

    daftarMahasiswa.removeFirst();
    daftarMahasiswa.removeLast();

    for (int i = 0; i <= daftarMahasiswa.size() - 1; i++)
      System.out.printf("%d %s\n", i, daftarMahasiswa.get(i));
  }

  @SuppressWarnings({ "rawtypes", "unchecked" })
  public void p7() {
    LinkedList daftarMahasiswa = new LinkedList<>();

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

    System.out.println("daftarMahasiswa size: " + daftarMahasiswa.size());

    for (int i = 0; i <= daftarMahasiswa.size() - 1; i++)
      System.out.printf("%d %s\n", i, daftarMahasiswa.get(i));

    daftarMahasiswa.set(0, "Parmin");

    for (int i = 0; i <= daftarMahasiswa.size() - 1; i++)
      System.out.printf("%d %s\n", i, daftarMahasiswa.get(i));
  }

  @SuppressWarnings({ "rawtypes", "unchecked" })
  public void p8() {
    LinkedList daftarMahasiswa = new LinkedList<>();

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

    System.out.println("daftarMahasiswa size: " + daftarMahasiswa.size());

    for (int i = 0; i <= daftarMahasiswa.size() - 1; i++)
      System.out.printf("%d %s\n", i, daftarMahasiswa.get(i));

    System.out.println(daftarMahasiswa.contains("Heru"));
    System.out.println("Heru berada di posisi ke = " + daftarMahasiswa.indexOf("Heru"));
  }

  @SuppressWarnings({ "rawtypes", "unchecked" })
  public void p9() {
    LinkedList daftarMahasiswa = new LinkedList<>();

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

    System.out.println("daftarMahasiswa size: " + daftarMahasiswa.size());

    for (int i = 0; i <= daftarMahasiswa.size() - 1; i++)
      System.out.printf("%d %s\n", i, daftarMahasiswa.get(i));

    daftarMahasiswa.clear();
    System.out.println("Clear selesai dijalankan... ");

    for (int i = 0; i <= daftarMahasiswa.size() - 1; i++)
      System.out.printf("%d %s\n", i, daftarMahasiswa.get(i));

    if (daftarMahasiswa.isEmpty()) {
      System.out.println("daftarMahasiswa is empty");
    } else {
      System.out.println("daftarMahasiswa filled with data");
    }
  }

  public static void main(String[] args) {

  }
}