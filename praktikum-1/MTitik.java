//File : MTitik.java          21/02/24
//Penulis : Naufal Dzaki Imtiyaz
//NIM     : 24060122140182
//Deskripsi : Menjalankan dan melakukan instansi 3 titik
public class MTitik {
    public static void main(String[] args) {
        titik t1;
        titik t2;
        titik t3;
        t1 = new titik(1,2);
        t2 = new titik(3,4);
        t3 = new titik(5,6);
        int counterTitik = titik.getCounterTitik();

        System.out.println("jumlah objek titik : "+counterTitik);
        System.out.printf(String.format("titik t1 dengan absis : %f | Ordinat: %f\n", t1.getAbsis(), t1.getOrdinat()));
        System.out.printf(String.format("titik t2 dengan absis : %f | Ordinat: %f\n", t2.getAbsis(), t2.getOrdinat()));
        System.out.printf(String.format("titik t3 dengan absis : %f | Ordinat: %f\n", t3.getAbsis(), t3.getOrdinat()));


    }
}
