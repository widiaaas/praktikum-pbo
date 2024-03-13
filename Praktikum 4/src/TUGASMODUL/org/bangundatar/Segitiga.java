/**
 * File : Segitiga.java 13/13/2023
 * Penulis : Widiawati Sihaloho
 * Deskripsi : representasi dari objek segitiga, turunan kelas poligon
 **/

package TUGASMODUL.org.bangundatar;

import TUGASMODUL.org.poligon.Poligon;

public class Segitiga extends Poligon {
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi){
        this.alas =alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return 0.5 * alas * tinggi;
    }
    public void printInfo(){
        System.out.println("Bangun segitiga bersisi " + this.getJumlahSisi());
    }
}
