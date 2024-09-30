/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package darmawan_uts._darmawannurhudha_uts;

/**
 *
 * @author 100e
 */
public class PegawaiTetap extends Pegawai {
    private final double tunjangan;

    public PegawaiTetap(String namaPegawai, double gaji, double tunjangan) { 
        super(namaPegawai, gaji);
        this.tunjangan = tunjangan;
    }


    @Override
    public void tampilkanInfo() { 
        super.tampilkanInfo(); 
        System.out.println("Tunjangan: " + tunjangan);
    }
}
    
