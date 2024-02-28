public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;

    public Titik getTitikAwal() {
        return titikAwal;
    }
    public void setTitikAwal(Titik titikAwal) {
        this.titikAwal = titikAwal;
    }
    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public void setTitikAkhir(Titik titikAkhir) {
        this.titikAkhir = titikAkhir;
    }

    public double getPanjang() {
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public double getGradien() {
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();

        // Handle pembagian dengan nol (garis vertikal)
        if (deltaX == 0) {
            return Double.POSITIVE_INFINITY;
        } else {
            return deltaY / deltaX;
        }



}
