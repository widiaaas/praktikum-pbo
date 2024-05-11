package Tugas;


class kupu{
    public void gerak (){

    }
}

class Ulat extends kupu{
    public void gerak() {
        System.out.println("ulat merayap");
    }
}

class Data<T> {
    private T isi;

    public T getIsi() {
        return isi;
    }

    public void setIsi(T x) {
        this.isi = x;
    }
}
public class Main {
    public static void main(String[]args){
        //kamus
        Ulat k = new Ulat();
        Data<kupu> anu;

        //Algoritma
        anu = new Data<>();
        anu.setIsi(k);
        anu.getIsi().gerak();
    }
}
