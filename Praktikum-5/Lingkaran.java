/*
 * Lingkaran.java 20/03/2024
 * Penulis:     Ilham Rismawan Faadhi
 * Deskripsi:   Kelas Implementasi IArea berupa
 *              cara menghitung luas lingkaran
 */
import static java.lang.Math.PI;
public class Lingkaran implements IArea {
    private double jejari;
    public Lingkaran (double r){
        jejari = r;
    }
    public double hitungLuas(){
        return PI*jejari*jejari;
    }
    
}
