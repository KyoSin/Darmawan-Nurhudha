package com.example;

public class SepedaMotor extends KendaraanDarat {
    public SepedaMotor(String merk) {
        super(merk, 2);
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Kendaraan: Sepeda Motor");
    }
}