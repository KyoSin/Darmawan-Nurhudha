package praktikumpbo10;

public class Elektronik implements Pembayaran {
    private String nama;
    private double harga;

    public Elektronik(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    @Override
    public double hitungPajak(double harga) {
        return harga * 0.1; // Pajak 10%
    }

    public void tampilkanInfo() {
        System.out.println("Produk Elektronik: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Pajak: " + hitungPajak(harga));
    }
}
