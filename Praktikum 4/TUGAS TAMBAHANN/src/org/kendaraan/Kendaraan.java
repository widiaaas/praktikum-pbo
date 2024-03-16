/* File : Kendaraan.java 15/3/2024
   Penulis : Widiawati Sihaloho
   Nim : 24060122120037
   Lab : C2
   Deskripsi : representasi dasar dari objek Kendaraan
*/

package org.kendaraan;

public class Kendaraan {
    private String nama;
    private int kecepatan;
    private String jenis;

    public Kendaraan(String nama) {
        this.nama = nama;
        this.jenis = "kendaraan";
        this.kecepatan = 0;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void cetakInfo() {
        System.out.println("nama : " + nama);
        System.out.println("jenis : " + jenis);
        System.out.println("kecepatan : " + kecepatan);
    }

    public void gas(int kecepatan, int durasi) {
        this.kecepatan += kecepatan;
        System.out.println("kecepatan menjadi " + this.kecepatan + "selama" + durasi);
    }

    public void berhenti() {
        this.kecepatan = 0;
    }

    public void klakson() {
        System.out.println(nama + " berbunyi");
    }
}
