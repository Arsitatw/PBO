/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carprojectfiks;

/**
 *
 * @author arsit
 */
public class Engine {
    String type;
    int horsepower;

    public Engine(String type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    public void start() {
        System.out.println("Mesin " + type + " dengan kekuatan " + horsepower + " dinyalakan.");
    }
}
