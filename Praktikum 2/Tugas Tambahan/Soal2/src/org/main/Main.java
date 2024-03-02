// Nama : Widiawati SIhaloho
// NIM : 24060122120037

package org.main;
import org.mahasiswa.Mahasiswa;
import org.walimahasiswa.WaliMahasiswa;

public class Main {
    public static void main(String[]args){
        WaliMahasiswa waliMhs = new WaliMahasiswa("Hariyadi", "1275937593","082145638754","Jln. Wahidin no 6");
        Mahasiswa mahasiswa = new Mahasiswa("Andi","124739604353","240601234567","Informatika",waliMhs);

        System.out.println(mahasiswa.cetak());


    }
}
