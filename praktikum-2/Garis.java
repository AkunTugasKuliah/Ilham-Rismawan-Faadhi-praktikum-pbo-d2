//File : Garis.java          28/02/24
//Penulis : Ilham Rismawan Faadhi
//NIM     : 24060122140182
//Deskripsi : Menginisialisasi dan algortma terhadap garis
public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;

    // Konstruktor
    public Garis(Titik titikAwal, Titik titikAkhir) {
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }

    // Getter dan setter
    public Titik getTitikAwal() {
        return titikAwal;
    }

    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    // Menghitung panjang garis
    public double getPanjang() {
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    // Menghitung gradien garis
    public double getGradien() {
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        
        // Handle pembagian dengan nol untuk menghindari exception
        if (deltaX != 0) {
            return deltaY / deltaX;
        } else {
            // Garis vertikal, gradien tidak terdefinisi, kembalikan NaN
            return Double.NaN;
        }
    }

    // Menghasilkan garis baru hasil pencerminan dengan sumbu Y
    public Garis getRefleksiY() {
        Titik titikAwalRefleksi = new Titik(titikAwal.getAbsis(), -titikAwal.getOrdinat());
        Titik titikAkhirRefleksi = new Titik(titikAkhir.getAbsis(), -titikAkhir.getOrdinat());
        return new Garis(titikAwalRefleksi, titikAkhirRefleksi);
    }

    // Menghasilkan nilai True jika objek garis tegak lurus dengan garis G
    public boolean isTegakLurus(Garis G) {
        // Dua garis tegak lurus jika perkalian gradiennya = -1
        double gradienG1 = this.getGradien();
        double gradienG2 = G.getGradien();

        // Handle kasus gradien tidak terdefinisi (garis vertikal)
        if (Double.isNaN(gradienG1) && Double.isInfinite(gradienG2)) {
            return true;
        } else if (Double.isNaN(gradienG2) && Double.isInfinite(gradienG1)) {
            return true;
        } else {
            return gradienG1 * gradienG2 == -1;
        }
    }
}