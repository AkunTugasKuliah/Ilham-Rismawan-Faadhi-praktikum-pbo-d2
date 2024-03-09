/*
 * file     : ExceptionOnArray.java
 * Deskripsi : program penggunaan eksepsi menggunakan class library java
 * 
 * nama     : Ilham Rismawan Faadhi
 * nim      : 24060122140182
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        // instansi objeck array integer
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }
        catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
        finally{
            System.out.println("clean up code ...");
        }
    }
}
