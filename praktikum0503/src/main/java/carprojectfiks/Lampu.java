/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carprojectfiks;

/**
 *
 * @author arsit
 */
public class Lampu {
    String jenis;

    public Lampu(String jenis) {
        this.jenis = jenis;
    }

    public void nyalakan() {
        System.out.println("Lampu " + jenis + " dinyalakan.");
    }
}
