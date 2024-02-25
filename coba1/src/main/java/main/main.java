/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

/**
 *
 * @author Hp
 */
public class main {

    public static void main(String[] args) {
        armada.mobil mbl = new armada.mobil();
        armada.motor mtr = new armada.motor();
        
        System.out.println("Daftar Kendaraan Roda 2");
        System.out.println("Motor = \n" + mtr.motor1 + "\n");
        System.out.println("Motor = \n" + mtr.motor2 + "\n");
        System.out.println("Daftar Kendaraan Roda 4");
        System.out.println("Mobil = \n" + mbl.mobil1 + "\n");
        System.out.println("Mobil = \n" + mbl.mobil2 + "\n");
    }
}
