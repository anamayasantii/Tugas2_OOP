/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2;

import java.util.Scanner;
/**
 *
 * @author Anamaya Santi
 * 2201010156
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dIN = new Scanner(System.in);
        
        System.out.print("Nilai Panjang : ");
        double nAlas = dIN.nextDouble();
        
        System.out.print("Nilai Lebar : ");
        double nLebar = dIN.nextDouble();
        
        System.out.print("Nilai Tinggi : ");
        double nTinggi = dIN.nextDouble();
        
        VolBalok VB = new VolBalok(nAlas, nLebar, nTinggi);
        
//        LS.setALAS(71);
//        LS.setTINGGI(86);
        VB.VolBalok();   
        
        System.out.println("Nilai Panjang : "+ VB.getPANJANG());
        System.out.println("Nilai Lebar : "+ VB.getLEBAR());
        System.out.println("Nilai Tinggi : "+ VB.getTINGGI());
        System.out.println("Jadi Volume Balok : ");
        System.out.println("Volume = Panjang x Lebar x Tinggi");
        System.out.println("     = "+ VB.getPANJANG() + " x "+ VB.getLEBAR()+" x "+VB.getTINGGI());
        System.out.println("     = "+ VB.getVOL());
    }
    
}
