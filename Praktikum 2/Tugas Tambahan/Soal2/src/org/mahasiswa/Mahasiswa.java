// Nama : Widiawati SIhaloho
// NIM : 24060122120037

package org.mahasiswa;
import org.walimahasiswa.WaliMahasiswa;

public class Mahasiswa {
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali;
    private String nama;
    private String nik;


    public Mahasiswa(String nama, String nik, String nim, String jurusan, WaliMahasiswa wali){
        this.nama = nama;
        this.nik = nik;
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
    }

    public String getNim(){
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public WaliMahasiswa getWali() {
        return wali;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setWali(WaliMahasiswa wali) {
        this.wali = wali;
    }

    public String cetak() {
        String DataMahasiswa = "Nama: " + nama + "\n" +
                "NIK: " + nik + "\n" +
                "NIM: " + nim + "\n" +
                "Jurusan: " + jurusan + "\n";

        String DataWaliMahasiswa = "Wali Mahasiswa: " + wali.getNama() + "\n" +
                "NIK Wali: " + wali.getNik() + "\n" +
                "Nomor HP Wali: " + wali.getNoHp() + "\n" +
                "Alamat Wali: " + wali.getAlamat() + "\n";

        return " ----Data Mahasiswa----\n" + DataMahasiswa + "\n----Data WaliMahasiswa----\n" + DataWaliMahasiswa;
    }
}
