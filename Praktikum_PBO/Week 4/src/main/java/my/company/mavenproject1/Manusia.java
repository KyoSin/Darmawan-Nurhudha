/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.company.mavenproject1;

/**
 *
 * @author ASUS
 */
public class Manusia {
    private String nama;        //Atribut nama sebagai private
    protected int usia;         //Atribut usia sebagai protected
    public String pekerjaan; 
    
    public Manusia(String nama, int usia, String pekerjaan) {
        this.nama = nama;
        this.usia = usia;
        this.pekerjaan = pekerjaan;
    }

    //Metode getter untuk nama
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
}