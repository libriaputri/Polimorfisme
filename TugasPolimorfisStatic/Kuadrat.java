/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPolimorfisStatic;

/**
 *
 * @author WINDOWS 10
 */
public class Kuadrat {
    public int Kuadrat(int bilangan){
        return bilangan * bilangan;
    }
    
    public double Kuadrat(double bilangan){
        return bilangan * bilangan;
    }
    
    public static void main(String[] args) {
        Kuadrat K = new Kuadrat();
        
        System.out.println("Kuadrat int Bilangan 5 = " + K.Kuadrat(5));
        System.out.println("Kuadrat Double Bilangan 6.5 = " + K.Kuadrat(6.5));
    }
}
