package praktikum11;

public 
class Perpustakaan {
    private Buku[] daftarBuku;
    private int jumlahBuku;

    public Perpustakaan(int kapasitas) {
        this.daftarBuku = new Buku[kapasitas];
        this.jumlahBuku = 0;
    }

    public void tambahBuku(Buku buku) {
        if (jumlahBuku < daftarBuku.length) {
            daftarBuku[jumlahBuku] = buku;
            jumlahBuku++;
            System.out.println("Buku berhasil ditambahkan: " + buku);
        } else {
            System.out.println("Perpustakaan penuh, tidak dapat menambahkan buku baru.");
        }
    }

    public void tampilkanInfoBuku() {
        System.out.println("Daftar Buku di Perpustakaan:");
        for (int i = 0; i < jumlahBuku; i++) {
            daftarBuku[i].infoBuku();
            System.out.println();
        }
    }

    public void hapusPerpustakaan() {
        System.out.println("Perpustakaan dihapus beserta semua buku di dalamnya.");
        this.daftarBuku = null;
        this.jumlahBuku = 0;
    }
}
