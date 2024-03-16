/* File : Kendaraan.java 15/3/2024
   Penulis : Widiawati Sihaloho
   Nim : 24060122120037
   Lab : C2
   Deskripsi : representasi dasar dari objek Motor, turunan dari kelas Kendaraan
*/

package org.motor;
import org.kendaraan.Kendaraan;
public class Motor extends Kendaraan{
    private int cc;
    private String nama;

    public Motor(String nama, int cc) {
        super(nama);
        this.cc = cc;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Kapasitas Mesin (cc): " + cc);
    }

    public double hitungHorsepower(int angka) {
        double horsepower = (double) cc / angka;
        return horsepower;
    }
    public void klakson() {
        System.out.println(getNama() + " berbunyi, Womp Womp!");
    }
}
