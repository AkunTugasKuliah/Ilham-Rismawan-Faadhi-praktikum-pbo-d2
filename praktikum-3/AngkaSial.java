/*
 * file     : AngkaSialException.java
 * Deskripsi : program penggunaan exeption buatan sendiri
 *             pengenalan klausa throw dan throws
 * 
 * nama     : Ilham Rismawan Faadhi
 * nim      : 24060122140182
 */
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka+"bukan angka sial");
    }
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch(AngkaSialException ase){
            // methode getMassage() telah ada pada kelas "exeption"
            System.out.println(ase.getMessage());
            System.out.println("hati hati memasukan angka");
        }
    }
}
