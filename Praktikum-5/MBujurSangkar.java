/*
 * MBujurSangkar.java 20/03/2024
 * Penulis: Ilham Rismawan Faadhi
 * Deskripsi:   Kelas yag mengimplementasikan cara
 *              menghitung luas bujur sangkar
 */
import java.util.Scanner;
public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.println("Masukan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("luas bujur sangkar dengan sisi " + sisi+ "satuan adalah"+bs.hitungLuas(sisi));

    }
}
