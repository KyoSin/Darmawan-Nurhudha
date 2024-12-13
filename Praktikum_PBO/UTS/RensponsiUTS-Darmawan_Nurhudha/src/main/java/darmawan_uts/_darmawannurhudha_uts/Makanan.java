/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package darmawan_uts._darmawannurhudha_uts;

/**
 *
 * @author 100e
 */
public class Makanan extends Produk {
    private final String tanggalKadaluarsa;


    public Makanan(String namaProduk, int harga, String tanggalKadaluarsa) { 
        super(namaProduk, harga);
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }

    @Override
    public void tampilkanInfo() { 
        super.tampilkanInfo();
        System.out.println("Tanggal Kadaluarsa: " + tanggalKadaluarsa);
    }
}

    