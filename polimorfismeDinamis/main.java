/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polimorfismeDinamis;

/**
 *
 * @author WINDOWS 10
 */
public class main {
    public static void main(String[] args) {
        bangunDatar bangunD = new bangunDatar();
        Persegi persegi = new Persegi(5);
        Segitiga segitiga = new Segitiga (5,10);
        Lingkaran lingkaran = new Lingkaran(10);
        
        bangunD.luas();
        bangunD.keliling();
        
        System.out.println("Luas Persegi = " + persegi.luas());
        System.out.println("Keliling Persegi = " + persegi.keliling());
        System.out.println("Luas Segitiga = " + segitiga.luas());
        System.out.println("Keliling Persegi = " + segitiga.keliling());
        System.out.println("Luas Lingkaran = " + lingkaran.luas());
        System.out.println("Keliling Lingkaran = " + lingkaran.keliling());
    }
}
