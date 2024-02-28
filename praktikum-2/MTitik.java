//File : MTitik.java          21/02/24
//Penulis : Ilham Rismawan Faadhi
//NIM     : 24060122140182
//Deskripsi : Menjalankan dan melakukan instansi 3 titik
public class MTitik {
    public static void main(String[] args) {
        // Membuat objek titik dengan konstruktor default
        Titik titik1 = new Titik();
        
        // Membuat objek titik dengan konstruktor parameter
        Titik titik2 = new Titik(3, 4);
        
        // Mengakses dan menampilkan atribut absis dan ordinat
        System.out.println("Titik 1: Absis = " + titik1.getAbsis() + ", Ordinat = " + titik1.getOrdinat());
        System.out.println("Titik 2: Absis = " + titik2.getAbsis() + ", Ordinat = " + titik2.getOrdinat());
        
        // Mengakses dan menampilkan jarak ke pusat
        System.out.println("Jarak Titik 1 ke Pusat: " + titik1.getJarakPusat());
        System.out.println("Jarak Titik 2 ke Pusat: " + titik2.getJarakPusat());
        
        // Melakukan pencerminan terhadap sumbu X dan Y pada Titik 1
        titik1.refleksiX();
        titik1.refleksiY();
        
        // Menampilkan hasil pencerminan Titik 1
        System.out.println("Titik 1 setelah pencerminan X dan Y: Absis = " + titik1.getAbsis() + ", Ordinat = " + titik1.getOrdinat());
        
        // Membuat objek baru hasil pencerminan terhadap sumbu X dari Titik 2
        Titik titik3 = titik2.getRefleksiX();
        
        // Menampilkan hasil pencerminan Titik 2
        System.out.println("Titik 2 setelah pencerminan X: Absis = " + titik2.getAbsis() + ", Ordinat = " + titik2.getOrdinat());
        System.out.println("Titik 3 (hasil pencerminan X dari Titik 2): Absis = " + titik3.getAbsis() + ", Ordinat = " + titik3.getOrdinat());
    }
}