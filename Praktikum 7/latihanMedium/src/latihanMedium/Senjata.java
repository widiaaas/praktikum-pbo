package latihanMedium;

public class Senjata {
    private String bunyi;
    private boolean menusuk;

    private int peluru ;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
    }

    public String getBunyi() {
        return bunyi;
    }

    public int getPeluru() {
        return peluru;
    }

    public boolean isMenusuk() {
        System.out.println("Menusuk");
        return true;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }

    public void menembak() {
        if (peluru > 0) {
            System.out.println(bunyi);
            peluru--;
        } else {
            System.out.println("Peluru Habis");
        }
    }

    public void menusuk() {
        if (menusuk) {
            System.out.println("Menusuk");
        } else {
            System.out.println("Senjata tidak dilengkapi dengan bayonet");
        }
    }

    public void pasangBayonet() {
        menusuk = true;
        System.out.println("Bayonet berhasil dipasang");
    }
}
