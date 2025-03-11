/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package carprojectfiks;

/**
 *
 * @author arsit
 */
public class Main {

    public static void main(String[] args) {
        Engine engine = new Engine("AR20", 2025);
        Roda[] roda = { new Roda(20), new Roda(20), new Roda(20), new Roda(20) };
        Transmission transmission = new Transmission("Otomatis");
        Lampu lampu = new Lampu("LED");
        Car car = new Car(engine, roda, transmission, lampu);
        car.startCar();
    }
}
