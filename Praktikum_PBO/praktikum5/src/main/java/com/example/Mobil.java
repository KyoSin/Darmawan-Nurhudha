package com.example;

public class Mobil extends KendaraanDarat {
    public Mobil(String merk) {
        super(merk, 4);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Kendaraan: Mobil");
    }
}

