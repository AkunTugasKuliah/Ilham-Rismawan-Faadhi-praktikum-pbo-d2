package org.main;

import org.bangundatar.*;
public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        Segitiga segi1 = new Segitiga(10, 4, 3);
        segi1.printInfoSegitiga();
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang"+ persegi.hitungLuas());
        System.out.println("Luas segitiga "+ segi1.hitungLuasSegitiga());
    }
}
