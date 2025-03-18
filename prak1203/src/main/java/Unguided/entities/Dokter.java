/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author arsit
 */
public class Dokter {
    private int idDokter;
    private String nama;
    private String spesialisasi;

    public Dokter(int idDokter, String nama, String spesialisasi) {
        this.idDokter = idDokter;
        this.nama = nama;
        this.spesialisasi = spesialisasi;
    }

    public int getIdDokter() {
        return idDokter;
    }

    public String getNama() {
        return nama;
    }

    public String getSpesialisasi() {
        return spesialisasi;
    }
}
