package praktikum6;

public class Buku extends Produk {
    public Buku(String nama, double harga) {
        super(nama, harga);
    }

    @Override
    public double hitungDiskon() {                                                                                                          
        return harga * 0.9; // Diskon 10%
    }                                                                                                                                                        
}