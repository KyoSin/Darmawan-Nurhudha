package com.example;

public class Kendaraan {
protected String merk;

    public Kendaraan(String merk) {
        this.merk = merk;
    }

    public void tampilkanInfo() {
        System.out.println("Merk Kendaraan: " + merk);
    }
}
