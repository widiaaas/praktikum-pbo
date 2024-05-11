package latihanMedium;

public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata s){
        this.senjata = s;
    }

    public boolean isAdaPeluru(){
        return senjata.getPeluru() != 0;
    }

    public int isiPeluru(int jumPeluru){
        senjata.setPeluru(jumPeluru);
        System.out.println("Peluru berhasil ditambah : " + jumPeluru);
        return senjata.getPeluru();
    }

    public void menembak(int jumlah) {
        System.out.println("Siap menembak " + jumlah + " kali");
        for (int i = 0; i < jumlah; i++) {
            if (senjata.getPeluru() > 0) {
                senjata.menembak();
            } else {
                System.out.println("Gagal tembak, Peluru Habis");
            }
        }
        System.out.println("Peluru sisa: " + senjata.getPeluru());
    }

    public void menusuk(){
        senjata.menusuk();
    }

    public void pasangBayonet() {
        senjata.pasangBayonet();
    }

}
