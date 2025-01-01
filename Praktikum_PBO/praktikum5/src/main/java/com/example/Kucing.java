package com.example;

public class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama, "Kucing");
    }               

    public void suaraKhas() {
        System.out.println("Meong!");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        suaraKhas();
    }
}