/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package darmawan_uts._darmawannurhudha_uts;

/**
 *
 * @author 100e
 */
public class PegawaiKontrak extends Pegawai {
    private final int lamaKontrak;

    public PegawaiKontrak(String namaPegawai, double gaji, int lamaKontrak) { 
        super(namaPegawai, gaji);
        this.lamaKontrak = lamaKontrak;
    }


    @Override
    public void tampilkanInfo() { 
        super.tampilkanInfo();
        System.out.println("Lama Kontrak: " + lamaKontrak + " bulan");
    }
}

