import java.util.Scanner;

public class MLingkaran {
    public static  void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan panjang jejari lingkaran: ");
        double jejari = scan.nextDouble();
        Lingkaran l = new Lingkaran(jejari);
        System.out.println("Luas lingkaran dengan jejari " + jejari + " satuan adalah " + l.hitungLuas());
    }
}
/*PERTANYAAN
* apa yang terjadi apablia kelas BujurSangkar tidak membuat implementasi
metode abstrak yang ada pada kelas BangunDatar ? jelaskan !
* jAWABAN : Kompilasi akan eror karena jika tidak ada implementasi hitungluas maka atribut luas nya tidak
*           terpakai sehingga dalam pemanngilan ketika di main ketika menginstansiasi bujursangkar tidak akan bisa */
