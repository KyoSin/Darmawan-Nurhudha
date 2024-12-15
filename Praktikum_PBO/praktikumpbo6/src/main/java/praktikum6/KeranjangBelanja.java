package praktikum6;

import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<Produk> daftarProduk;

    public KeranjangBelanja() {
        daftarProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    public double hitungTotalHargaSetelahDiskon() {
        double total = 0;
        for (Produk produk : daftarProduk) {
            total += produk.hitungDiskon();
        }
        return total;
    }

    public void tampilkanKeranjang() {
        System.out.println("-- Isi Keranjang --");
        for (Produk produk : daftarProduk) {
            produk.tampilkanInfo();
            System.out.println();
        }
        System.out.println("Total Harga Setelah Diskon: " + hitungTotalHargaSetelahDiskon());
    }
}
