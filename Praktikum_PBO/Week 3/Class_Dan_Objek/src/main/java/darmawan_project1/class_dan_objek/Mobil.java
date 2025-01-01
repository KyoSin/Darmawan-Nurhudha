/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package darmawan_project1.class_dan_objek;

/**
 *
 * @author 100e
 */
public class Mobil {
    String merk; 
    String model;
    int tahun;
    String warna;
    
    public Mobil(String merk, String model, int tahun, String warna) {
        this.merk = merk;    
        this.model = model;  
        this.tahun = tahun;
        this.warna = warna;
    }
    
    public String getMerk() {           
    return merk;                       
    }
    public void setMerk(String merk) {    
        this.merk = merk;                 
    }
    public String getModel() {             
        return model;                      
    }
    public void setModel(String model) {   
        this.model = model;
    }
    public int getTahun() {                
        return tahun;                      
    }
    public void setTahun(int tahun) {      
        this.tahun = tahun;
    }
    public String getWarna() {
        return warna;
    }
    
    void displayInfo() {    
        System.out.println("Merk mobil: " + getMerk());          
        System.out.println("Model: " + getModel());              
        System.out.println("Tahun keluaran: " + getTahun());   
        System.out.println("Warna: " + getWarna());
    }
    
    void startEngine() {
        System.out.println("Mesin Mobil " + getMerk() + " Menyala");
    }
}
