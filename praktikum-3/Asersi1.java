/*
 * file     : Asersi1.jawa
 * Dekribsi : Program untuk menunjukan asersi
 * 
 * nama     : Ilham Rismawan Faadhi
 * nim      : 24060122140182
 */

 public class Asersi1{
    public static void main(String[] args) {
        int x = 0;
        if (x>0){
            System.out.println("x bilangan positif");

        }
        else{
            assert(x<0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
 }