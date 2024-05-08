public class BangunDatarGenericTest {
    public static void main (String[] args){
        Lingkaran   L1 = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(L1);
        System.out.println("Keliling lingkaran :" + bdg.hitungKeliling());
        System.out.println("tipe generic : "+ bdg.get().getClass().getName());
    }
}
