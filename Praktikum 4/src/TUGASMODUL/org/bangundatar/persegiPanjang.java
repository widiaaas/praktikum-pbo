/**
 * File : persegiPanjang.java 13/13/2023
 * Penulis : Widiawati Sihaloho
 * Deskripsi : representasi dari objek persegi panjang, turunan kelas poligon
 **/


package TUGASMODUL.org.bangundatar;

import TUGASMODUL.org.poligon.Poligon;

public class persegiPanjang extends Poligon {
    private double panjang,lebar;

    public persegiPanjang(double panjang, double lebar, int jumlahSisi){
        this.lebar =lebar;
        this.panjang = panjang;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return panjang * lebar;
    }
    public void printInfo(){
        System.out.println("Bangun persegi panjang bersisi " + this.getJumlahSisi());
    }
}
