class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}
//class Asersi2
public class Asersi2 {
    public static void main (String[]args){
        double jariJari = 0;
        assert (jariJari>0):"Jari jari tidak boleh nol!";
        Lingkaran l1 = new Lingkaran(jariJari);
        double kelilingLingkaran = l1.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);

    }
}
// PERTANYAAN
// secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
// JAWAB : Tidak karena sudah memenuhi konsep asersi yang benar, sehigga jika inputan tidak sesuai
//          dengan syarat asersi makan akan langsung mengeluarkan pesan\
//          namun jika memnuhi akan melanjutkan perintah dibawahnya