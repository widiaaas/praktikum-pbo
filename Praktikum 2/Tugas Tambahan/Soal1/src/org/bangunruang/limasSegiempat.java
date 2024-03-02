// Nama : Widiawati SIhaloho
// NIM : 24060122120037

package org.bangunruang;
import org.bangundatar.BujurSangkar;
import org.bangundatar.SegitigaSamaSisi;

import static java.lang.Math.sqrt;

public class limasSegiempat {
    private BujurSangkar alas;
    private SegitigaSamaSisi selimut;
    private double tinggi;

    public limasSegiempat(BujurSangkar alas,SegitigaSamaSisi selimut) {
        this.alas = alas;
        this. selimut = selimut;
        this.tinggi = sqrt((selimut.getTinggiSegitiga()*selimut.getTinggiSegitiga())-(0.25 * selimut.getPanjangSisi()* selimut.getPanjangSisi()));
    }

    public double hitungVolume() {
        return (1.0/3.0) * alas.hitungLuas() * tinggi;
    }

    public double hitungLuasPermukaan() {
        double luasAlas = alas.hitungLuas();
        double luasSelimut = selimut.luasSegitiga();
        return luasAlas + 4*luasSelimut;
    }
}
