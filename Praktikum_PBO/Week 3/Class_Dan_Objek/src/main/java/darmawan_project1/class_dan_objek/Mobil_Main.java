package darmawan_project1.class_dan_objek;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 100e
 */
public class Mobil_Main {
    public static void main(String[] args) {
    Mobil Darmawan = new Mobil("Lamborghini", "Aventador", 2010, "Yellow"); 
    Darmawan.displayInfo();
    Darmawan.startEngine();
    System.out.println("");                                 
    Mobil Nurhudha = new Mobil("Ford", "GT", 2006, "Black");        
    Nurhudha.displayInfo();
    Nurhudha.startEngine();
    System.out.println("");
    Mobil Nurfan = new Mobil("Pagani", "Huaira", 2007, "White");        
    Nurfan.displayInfo();
    Nurfan.startEngine();
    }
}
