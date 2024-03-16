/* File : Kendaraan.java 15/3/2024
   Penulis : Widiawati Sihaloho
   Nim : 24060122120037
   Lab : C2
   Deskripsi : representasi dasar dari objek Mobil, turunan dari kelas Kendaraan
*/


package org.mobil;

import org.kendaraan.Kendaraan;

public class Mobil extends Kendaraan {
    private int jumlahPintu;

    public Mobil(String nama,int jumlahPintu) {
        super(nama);
        this.jumlahPintu = jumlahPintu;
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Jumlah Pintu: " + getJumlahPintu());
    }

    public void bukaPintu(int nomorPintu) {
        System.out.println("Pintu mobil yang terbuka adalah pintu " + nomorPintu);
    }

    public void klakson() {
        System.out.println(getNama() + " berbunyi, Vroom Vroom!");
    }
}
