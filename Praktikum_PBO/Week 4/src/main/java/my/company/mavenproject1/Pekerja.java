/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.company.mavenproject1;

/**
 *
 * @author ASUS
 */
public class Pekerja extends Manusia {
    private double gaji; 
    
    public Pekerja(String nama, int usia, String pekerjaan, double gaji) {
       super(nama, usia, pekerjaan);
       this.gaji = gaji;
    }

    //Metode getter untuk gaji
    public double getGaji() {
        return gaji;
    }

    //Metode setter untuk gaji
    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    @Override
    public String toString() {
        return "\nUsia:" + usia + "\nNama: "+  getNama() + "\nPekerjaan: " + pekerjaan + "\nGaji: " + gaji;
    }

}
