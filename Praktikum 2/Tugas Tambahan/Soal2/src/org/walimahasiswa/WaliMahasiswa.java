// Nama : Widiawati SIhaloho
// NIM : 24060122120037

package org.walimahasiswa;

public class WaliMahasiswa {
    private String noHp;
    private String alamat;
    String nama;
    String nik;

    public WaliMahasiswa(String nama, String nik, String nomorHp, String alamat){
        this.nama = nama;
        this.nik = nik;
        this.noHp = nomorHp;
        this.alamat = alamat;
    }

    public String getNoHp() {
        return noHp;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    public void SetNomorHp(String nomorHp){
        this.noHp = nomorHp ;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }
}
