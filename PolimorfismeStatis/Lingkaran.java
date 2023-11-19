/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PolimorfismeStatis;

/**
 *
 * @author WINDOWS 10
 */
public class Lingkaran {
    //menghitung luas menggunakan jari-jari
    float luas(float jarijari){
        return(float) (Math.PI * jarijari * jarijari);
    }

    double luas (double diameter){
        return (1/4 * Math.PI * diameter);
    }
    public static void main (String [] args){
        Lingkaran L = new Lingkaran();
        float jari2 = 10;
        double d = 20;
        
        System.out.println(" Luas Lingkarang Dengan Jari Jari = " + L.luas(jari2));
    }
}
