// Nama : Widiawati SIhaloho
// NIM : 24060122120037


package org.bangundatar;
import org.poligon.Poligon;
import static java.lang.Math.sqrt;

public class SegitigaSamaSisi extends Poligon {
    private double panjangSisi;
    private double tinggiSegitiga;

    public SegitigaSamaSisi(double panjangSisi){
        this.jumlahSisi = 3;
        this.panjangSisi = panjangSisi;
        this.tinggiSegitiga = (sqrt(3) / 2) * panjangSisi;
    }
    public double getPanjangSisi(){
        return this.panjangSisi;
    }
    public double getTinggiSegitiga(){
        return this.tinggiSegitiga;
    }
    public double luasSegitiga(){
        return 0.5 * panjangSisi * tinggiSegitiga;
    }
}
