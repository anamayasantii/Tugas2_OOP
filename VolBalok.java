/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author Anamaya Santi
 * 2201010156
 */
public class VolBalok {
    private double panjang, lebar, tinggi, vol;
    
    public VolBalok(double Pj, double Lb, double Tg){
        panjang = Pj;
        lebar = Lb;
        tinggi = Tg;
    }

    VolBalok(double nvol) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void setPANJANG (double nVAL){
        this.panjang = nVAL;
        panjang = nVAL;
    }
    public double getPANJANG(){
        return panjang;
    }
    public void setLEBAR (double nVAL){
        this.lebar = nVAL;
        lebar = nVAL;
    }
    public double getLEBAR(){
        return lebar;
    }
    public void setTINGGI (double nVAL){
        this.tinggi = nVAL;
        tinggi = nVAL;
    }
    public double getTINGGI(){
        return tinggi;
    }
    void VolBalok(){
        vol = (this.panjang*this.lebar*this.tinggi);
    }
    public double getVOL(){
        return vol;
    }
}
