package praktikum6;

public class Main {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        Produk buku = new Buku("Java Programming", 150000);
        Produk elektronik = new Elektronik("Smartphone", 2500000);
        Produk pakaian = new Pakaian("Jaket Musim Dingin", 500000);

        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(elektronik);
        keranjang.tambahProduk(pakaian);

        keranjang.tampilkanKeranjang();
    }
}