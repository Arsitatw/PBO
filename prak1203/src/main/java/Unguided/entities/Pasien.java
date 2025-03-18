/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author arsit
 */
public class Pasien {
   private int idPasien;
    private String nama;

    public Pasien(int idPasien, String nama) {
        this.idPasien = idPasien;
        this.nama = nama;
    }

    public int getIdPasien() {
        return idPasien;
    }

    public String getNama() {
        return nama;
    } 
}
