public class Manajer extends Pegawai{
    private int tunjangan = 700000;

    public Manajer(String nama){
        super.Pegawai(nama,5000000);
    }

    @Override
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan: " + tunjangan);
    }
}
