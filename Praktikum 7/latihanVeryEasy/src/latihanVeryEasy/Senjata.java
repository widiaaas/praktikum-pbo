package latihanVeryEasy;

public class Senjata {
    private String bunyi;

    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = peluru;
    }

    private void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    private String getBunyi() {
        return bunyi;
    }

    public void menembak() {
        if (peluru > 0) {
            System.out.println(getBunyi());
            peluru--;
            System.out.println("Sisa peluru: " + peluru);
        } else {
            System.out.println("Senjata tidak memiliki peluru.");
        }
    }

    public int getPeluru() {
        return peluru;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
}
