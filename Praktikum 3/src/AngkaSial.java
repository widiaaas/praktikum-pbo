public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch(AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Excption"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

// PERTANYAAN
// 1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
// JAWAB : Ya, karena pada saat as.cobaAngka(10) akan dijalankan karena tidak masuk ke if (angka==13)
//          sehingga akan menjalankan program pada baris 12 dan mecetak pesan 10 bukan angka sial
//          tetapi saat menjalankan as.cobaAngka(13) tidak akan menjalankan baris 12 karena memenuhi kriteria pada baris 9
//          dan akan masuk ke exception

// 2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
// JAWAB : Ya akan dijalankan ketika memasuki baris 19 dan memnuhi baris 9 sehingga akan masuk ke blok catch
//          dan akan mengeluarkan pesan bahwa "jangan memasukkan angka 13 karena angka sial" dan "hati-hati memasukkan angka"