package org.bangundatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon {
    private double panjang, lebar;

    public PersegiPanjang(double panjang,double lebar,int jumplahSisi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.jumplahSisi = jumplahSisi;
    }

    public double hitungLuas(){
        return panjang*lebar;
    }

    public void printInfo(){
        System.out.println("bangunan persegi panjang berisi"+this.getJumplahSisi());
    }
}
