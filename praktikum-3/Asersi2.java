/*
 * file     : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan
 *            menolak input jari-jari lingkaran bernilai nol
 * 
 * nama     : Ilham Rismawan Faadhi
 * nim      : 24060122140182
 */

// class Lingkaran
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;

        // Memastikan jariJari tidak nol atau kurang dari nol
        if (jariJari <= 0) {
            throw new IllegalArgumentException("Jari-jari lingkaran tidak boleh nol atau kurang dari nol");
        }

        Lingkaran lingkaran1 = new Lingkaran(jariJari);
        double kelilingLingkaran = lingkaran1.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}