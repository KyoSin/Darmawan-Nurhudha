/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package darmawan_uts._darmawannurhudha_uts;

/**
 *
 * @author 100e
 */
public class Elektronik extends Produk {
    private final int garansi;

    public Elektronik(String namaProduk, int harga, int garansi) { 
        super(namaProduk, harga);
        this.garansi = garansi;
    }

    @Override
    public void tampilkanInfo() { 
        super.tampilkanInfo();
        System.out.println("Garansi: " + garansi + " tahun");
    }
}
    
