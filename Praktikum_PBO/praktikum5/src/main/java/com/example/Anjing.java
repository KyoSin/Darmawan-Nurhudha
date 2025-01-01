package com.example;

public class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama, "Anjing");
    }

    public void suaraKhas() {
        System.out.println("Guk-guk!");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        suaraKhas();
    }
} 