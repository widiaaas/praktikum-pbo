public class Main {
    public static void main(String[] args) {
        // Instansiasi kelas anggota dan buku
        Anggota anggota = new Anggota("Widia");
        Buku buku1 = new Buku("Daspro");
        Buku buku2 = new Buku("Alpro");
        Buku buku3 = new Buku("Basdat");
        Buku buku4 = new Buku("PBO");

        try {
            anggota.pinjamBuku(buku1);
            anggota.pinjamBuku(buku2);
            anggota.pinjamBuku(buku3);
            anggota.pinjamBuku(buku4);
        } catch (MaksimumBukuTerpinjamException e) {
            System.out.println(e.getMessage());
        } catch (BukuTidakTersediaException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
