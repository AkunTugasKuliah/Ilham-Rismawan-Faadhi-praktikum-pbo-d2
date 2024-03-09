/*
 * file     : AngkaSialException.java
 * Deskripsi : ekspresi buatan sendiri, menolak input angka 13
 * 
 * nama     : Ilham Rismawan Faadhi
 * nim      : 24060122140182
 */

public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("jangan memasukan angka 13 karena angka sial");
    }
}
