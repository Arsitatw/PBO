/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carprojectfiks;

/**
 *
 * @author arsit
 */
public class Car {
    Engine engine;
    Roda[] roda;
    Transmission transmission;
    Lampu lampu;

    public Car(Engine engine, Roda[] roda, Transmission transmission, Lampu lampu) {
        this.engine = engine;
        this.roda = roda;
        this.transmission = transmission;
        this.lampu = lampu;
    }

    public void startCar() {
        engine.start();
        for (Roda r : roda) {
            r.berputar();
        }
        transmission.shiftGear();
        lampu.nyalakan();
        System.out.println("Mobil mulai berjalan.");
    }
}
