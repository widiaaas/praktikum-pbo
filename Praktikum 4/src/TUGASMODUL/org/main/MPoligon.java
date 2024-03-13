/**
 * File : MPoligon.java 13/13/2023
 * Penulis : Widiawati Sihaloho
 * Deskripsi : driver class untuk poligon dan persegi panjang
 **/

package TUGASMODUL.org.main;
import TUGASMODUL.org.bangundatar.*;

public class MPoligon {
    public static void main (String[]args){
        persegiPanjang persegi = new persegiPanjang(10,10,4);
        persegi.printInfo();
        System.out.println("Luas Persegi panjang :" + persegi.hitungLuas());

        Segitiga segiTiga = new Segitiga(5,3,3);
        segiTiga.printInfo();
        System.out.println("Luas Segitiga : " + segiTiga.hitungLuas());
    }
}
