public class Titik {
    private double absis;
    private double ordinat;

    public Titik(){
        this(0,0);
    }

    public Titik (double a, double b)
    {
        this.absis = a;
        this.ordinat = b;
    }
    public void setAbsis(double abs)
    {
        absis = abs;
    }
    public double getAbsis()
    {
        return absis;
    }
    public void setOrdinat(double ord)
    {
        ordinat = ord;
    }
    public double getOrdinat()
    {
        return ordinat;
    }

    public double getJarakPusat(){
        return Math.sqrt((absis * absis) + (ordinat * ordinat));
}
    public void refleksiX (Titik titik)
    {
        double ordinat = titik.getOrdinat();
        ordinat *= -1;
        titik.setOrdinat(ordinat);
    }
    public void refleksiY (Titik titik)
    {
        double absis = titik.getAbsis();
        absis *= -1;
        titik.setAbsis(absis);
    }

    public double getRefleksiX(){
        refleksiX((this));
        return this.getOrdinat();
    }
    public double getRefleksiY(){
        refleksiY((this));
        return this.getAbsis();
    }

}
