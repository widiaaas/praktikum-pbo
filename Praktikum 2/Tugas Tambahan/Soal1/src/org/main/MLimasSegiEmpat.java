// Nama : Widiawati SIhaloho
// NIM : 24060122120037

// Nama : Widiawati SIhaloho
// NIM : 24060122120037

package org.main;
import org.bangundatar.*;
import org.bangunruang.*;


public class MLimasSegiEmpat {
    public static void main (String[]args){
        double panjangSisi = 6.0;

        SegitigaSamaSisi selimutLimas = new SegitigaSamaSisi(panjangSisi);
        BujurSangkar alasLimas = new BujurSangkar(panjangSisi);

        limasSegiempat limas = new limasSegiempat(alasLimas,selimutLimas);

        double volume = limas.hitungVolume();
        double luasPermukaan = limas.hitungLuasPermukaan();

        System.out.println("Volume limas segi empat: " + volume);
        System.out.println("Luas permukaan limas segi empat: " + luasPermukaan);
    }
}
