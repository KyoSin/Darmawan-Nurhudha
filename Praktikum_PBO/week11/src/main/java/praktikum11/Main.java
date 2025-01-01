package praktikum11;

public class Main {
    public static void main(String[] args) {
        Pengarang pengarang1 = new Pengarang("Darmawan");
        Pengarang pengarang2 = new Pengarang("Musa");

        Buku buku1 = new Buku("Pemrograman Java", pengarang1);
        Buku buku2 = new Buku("Algoritma dan Struktur Data", pengarang2);

        Perpustakaan perpustakaan = new Perpustakaan(5);
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        perpustakaan.tampilkanInfoBuku();

        // Menghapus perpustakaan beserta buku di dalamnya
        perpustakaan.hapusPerpustakaan();
    }
}
