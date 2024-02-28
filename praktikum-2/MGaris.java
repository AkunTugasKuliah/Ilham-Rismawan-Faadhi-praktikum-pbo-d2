//File : MGaris.java          21/02/24
//Penulis : Ilham Rismawan Faadhi
//NIM     : 24060122140182
//Deskripsi : Menjalankan dan melakukan instansi garis
public class MGaris {
    public static void main(String[] args) {
        // Membuat objek titik untuk digunakan sebagai titik awal dan akhir garis
        Titik titik1 = new Titik(1, 2);
        Titik titik2 = new Titik(4, 6);
        Titik titik3 = new Titik(3, 1);

        // Membuat objek garis dengan menggunakan objek titik
        Garis garis1 = new Garis(titik1, titik2);
        Garis garis2 = new Garis(titik2, titik3);

        // Menampilkan informasi mengenai garis
        System.out.println("Garis 1: Titik Awal = (" + garis1.getTitikAwal().getAbsis() + ", " +
                           garis1.getTitikAwal().getOrdinat() + "), Titik Akhir = (" +
                           garis1.getTitikAkhir().getAbsis() + ", " +
                           garis1.getTitikAkhir().getOrdinat() + ")");
        System.out.println("Panjang Garis 1: " + garis1.getPanjang());
        System.out.println("Gradien Garis 1: " + garis1.getGradien());

        System.out.println("\nGaris 2: Titik Awal = (" + garis2.getTitikAwal().getAbsis() + ", " +
                           garis2.getTitikAwal().getOrdinat() + "), Titik Akhir = (" +
                           garis2.getTitikAkhir().getAbsis() + ", " +
                           garis2.getTitikAkhir().getOrdinat() + ")");
        System.out.println("Panjang Garis 2: " + garis2.getPanjang());
        System.out.println("Gradien Garis 2: " + garis2.getGradien());

        // Membuat garis baru hasil pencerminan dengan sumbu Y dari Garis 1
        Garis garis1RefleksiY = garis1.getRefleksiY();
        System.out.println("\nGaris 1 setelah pencerminan Y: Titik Awal = (" +
                           garis1RefleksiY.getTitikAwal().getAbsis() + ", " +
                           garis1RefleksiY.getTitikAwal().getOrdinat() + "), Titik Akhir = (" +
                           garis1RefleksiY.getTitikAkhir().getAbsis() + ", " +
                           garis1RefleksiY.getTitikAkhir().getOrdinat() + ")");

        // Menentukan apakah Garis 2 tegak lurus dengan Garis 1
        boolean tegakLurus = garis2.isTegakLurus(garis1);
        System.out.println("\nGaris 2 tegak lurus dengan Garis 1: " + tegakLurus);
    }
}

