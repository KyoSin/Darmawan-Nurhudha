    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.company.mavenproject1;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        //Membuat objek
        Pekerja pekerja1= new Pekerja("Darmawan", 20, "Tukang Bengkel", 10000000);
        //Menampilkan nama pekerja
        System.out.println("\nNama pekerja: " + pekerja1.getNama());
        System.out.println("");
        
        System.out.println(pekerja1);
        System.out.println("\nMengubah nama pekerja");
        
        pekerja1.setNama("Musa busi");
        System.out.println(pekerja1);
    }
}