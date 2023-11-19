/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPolimorfismeDinamis;

/**
 *
 * @author WINDOWS 10
 */
public class main {
    public static void main(String[] args) {
        Kendaraan kendaraan = new Kendaraan();
        
        kendaraan.go("Kuda");
        
        Sepeda sepeda = new Sepeda();
        sepeda.go("Polygon");
        
        Kapal kapal = new Kapal();
        kapal.go("veri");
        
        Mobil mobil = new Mobil();
        mobil.go("Fortuner");
    }
}
