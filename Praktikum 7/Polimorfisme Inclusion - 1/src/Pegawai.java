public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public void Pegawai (String nama, int gajiPokok){
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void tampilData(){
        System.out.println("Nama: " + nama + ", Gaji Pokok: " + gajiPokok);
    }
}
