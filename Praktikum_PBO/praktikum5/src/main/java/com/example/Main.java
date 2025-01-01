package com.example;

public class Main {
    public static void main(String[] args) {
        Hewan kucing = new Kucing("Kitty");
        Hewan anjing = new Anjing("Buddy");

        System.out.println("-- Informasi Hewan --");
        kucing.tampilkanInfo();
        System.out.println();
                                                                                                                                                                                                                                                             anjing.tampilkanInfo();

        Kendaraan mobil = new Mobil("Toyota");
        Kendaraan sepedaMotor = new SepedaMotor("Honda");

        System.out.println("\n-- Informasi Kendaraan                                                                                                                                --");
        mobil.tampilkanInfo();
        System.out.println();
        sepedaMotor.tampilkanInfo();
    }
}
