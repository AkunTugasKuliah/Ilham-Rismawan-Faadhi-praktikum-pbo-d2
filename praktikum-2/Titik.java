//File : Titik.java          21/02/24
//Penulis : Ilham Rismawan Faadhi
//NIM     : 24060122140182
//Deskripsi : melakukan inisialisasi dan algoritma pada titik
public class Titik {
    private double absis;
    private double ordinat;
    static int counterTitik;

    // Konstruktor
    // membuat objek titik dengan inisialisasi nilai abis dan koordinat
    public Titik(double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
    }

    public Titik(){
        this(0,0);
    }

    public double getOrdinat(){
        return this.ordinat;
    }

    public double getAbsis(){
        return this.absis;
    }

    public void setAbsis(double absis){
        this.absis = absis;
    }

    public void setOrdinat(double ordinat){
        this.ordinat = ordinat;
    }

    public double getJarakPusat(){
        //getJarakPusat() untuk menghitung jarak sebuah titik dengan titi pusat (0,0)
        double jarakPusat = Math.sqrt(Math.pow(this.absis,2) + Math.pow(this.ordinat,2));
        return jarakPusat;
    }

    public void refleksiX(){
        // melakukan pencerminan titik terhadap sumbu X
        this.absis = -this.absis;
    }

    public void refleksiY(){
        // melakukan pencerminan titik terhadap sumbu Y
        this.ordinat = -this.ordinat; 
    }

    public Titik getRefleksiX(){
        // menghasilkan titik baru yang merupakan hasil pencerminan terhadap sumbu X
        return new Titik(-this.absis, this.ordinat);
    }

    public Titik getRefleksiY(){
        // menghasilkan titik baru yang merupakan hasil pencerminan terhadap sumbu Y
        return new Titik(this.absis, -this.ordinat);
    }
}
