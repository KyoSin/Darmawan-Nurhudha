package praktikumpbo10;

class Makanan implements Pembayaran {
    private String nama;
    private double harga;

    public Makanan(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    @Override
    public double hitungPajak(double harga) {
        return harga * 0.05; // Pajak 5%
    }

    public void tampilkanInfo() {
        System.out.println("Produk Makanan: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Pajak: " + hitungPajak(harga));
    }
}
