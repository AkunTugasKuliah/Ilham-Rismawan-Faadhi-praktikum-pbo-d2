package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon {

    private double alas, tinggi;

    public Segitiga(double alas,double tinggi,int jumplahSisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumplahSisi = jumplahSisi;
    }

    public double hitungLuasSegitiga(){
        return 0.5*alas*tinggi;
    }
    public void printInfoSegitiga(){
        System.out.println("luas segitiga adalah = "+ this.hitungLuasSegitiga());
    }
}