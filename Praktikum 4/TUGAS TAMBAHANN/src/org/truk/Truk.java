/* File : Kendaraan.java 15/3/2024
   Penulis : Widiawati Sihaloho
   Nim : 24060122120037
   Lab : C2
   Deskripsi : representasi dasar dari objek Truk, turunan dari kelas Kendaraan
*/

package org.truk;
import org.kendaraan.Kendaraan;
public class Truk extends Kendaraan{
    private int kapasitasMuatan ;
    private int beratMuatan;

    public Truk(String nama, int kapasitasMuatan) {
        super(nama);
        this.kapasitasMuatan = kapasitasMuatan;
        this.beratMuatan = 0;
    }

    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Kapasitas Muatan: " + kapasitasMuatan);
        System.out.println("Berat Muatan: " + beratMuatan);
    }

    public void muatBarang(int berat) {
        int totalBerat = beratMuatan + berat;
        if (totalBerat <= kapasitasMuatan) {
            beratMuatan = totalBerat;
            System.out.println("Barang dengan berat " + berat + " dimuat ke dalam truk.");
        } else {
            System.out.println("Kapasitas muatan truk sudah penuh, tidak dapat memuat barang lagi.");
        }
    }

    public void klakson() {
        System.out.println(getNama() + " berbunyi, Honk Honk!");
    }

}
