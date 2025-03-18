/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.entities;

/**
 *
 * @author arsit
 */
public class JanjiTemu {
    private int idJanjiTemu;
    private Dokter dokter;
    private Pasien pasien;
    private String tanggal;
    private String diagnosis;

    public JanjiTemu(int idJanjiTemu, Dokter dokter, Pasien pasien, String tanggal, String diagnosis) {
        this.idJanjiTemu = idJanjiTemu;
        this.dokter = dokter;
        this.pasien = pasien;
        this.tanggal = tanggal;
        this.diagnosis = diagnosis;
    }

    public int getIdJanjiTemu() {
        return idJanjiTemu;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void cetakDetail() {
        System.out.println("ID Janji Temu: " + idJanjiTemu);
        System.out.println("Tanggal Janji Temu: " + tanggal);
        System.out.println("Dokter: " + dokter.getNama() + " (Spesialis " + dokter.getSpesialisasi() + ") - ID: " + dokter.getIdDokter());
        System.out.println("Pasien: " + pasien.getNama() + " - ID: " + pasien.getIdPasien());
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("--------------------------------");
    }
}
