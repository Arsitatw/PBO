/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided;

import Unguided.entities.*;
import Unguided.utilities.*;

/**
 *
 * @author arsit
 */
public class ClinicManagement {
   public static void main(String[] args) {
        // Data Dokter
        Dokter[] dokterList = {
            new Dokter(101, "Dr. Arsita", "Tulang"),
            new Dokter(102, "Dr. Widya", "THT"),
            new Dokter(103, "Dr. Dhanti", "Gigi"),
            new Dokter(104, "Dr. Alfia", "Mata"),
            new Dokter(105, "Dr. Fauziah", "Kulit")
        };

        // Data Pasien
        Pasien[] pasienList = {
            new Pasien(201, "Dimas"),
            new Pasien(202, "Desti"),
            new Pasien(203, "Nur"),
            new Pasien(204, "Isna"),
            new Pasien(205, "Setya"),
            new Pasien(206, "Rezky"),
            new Pasien(207, "Qeyza")
        };

        // Menampilkan Data Dokter
        System.out.println("=== Data Dokter ===");
        for (Dokter dokter : dokterList) {
            System.out.println("ID: " + dokter.getIdDokter() + " | Nama: " + dokter.getNama() + " | Spesialisasi: " + dokter.getSpesialisasi());
        }

        // Menampilkan Data Pasien
        System.out.println("\n=== Data Pasien ===");
        for (Pasien pasien : pasienList) {
            System.out.println("ID: " + pasien.getIdPasien() + " | Nama: " + pasien.getNama());
        }

        // Inisialisasi Diagnosis Counter
        DiagnosisCounter diagnosisCounter = new DiagnosisCounter();

        // Data Janji Temu
        JanjiTemu[] janjiList = {
            new JanjiTemu(301, dokterList[0], pasienList[0], "2025-03-20", "Patah Tulang"),
            new JanjiTemu(302, dokterList[1], pasienList[1], "2025-03-21", "Sinus"),
            new JanjiTemu(303, dokterList[2], pasienList[2], "2025-03-22", "Cabut gigi"),
            new JanjiTemu(304, dokterList[3], pasienList[3], "2025-03-23", "Silinder"),
            new JanjiTemu(305, dokterList[4], pasienList[4], "2025-03-24", "Panu"),
            new JanjiTemu(306, dokterList[0], pasienList[5], "2025-03-25", "Patah Tulang"),
            new JanjiTemu(307, dokterList[1], pasienList[6], "2025-03-26", "Gangguan Pendengaran")
        };

        System.out.println("\n=== Data Janji Temu ===");
        for (JanjiTemu janji : janjiList) {
            if (DataChecker.isValidDate(janji.getTanggal())) {
                janji.cetakDetail();
                diagnosisCounter.addDiagnosis(janji.getDiagnosis());
            } else {
                System.out.println("Format tanggal tidak valid untuk Janji Temu ID " + janji.getIdJanjiTemu());
            }
        }

        // Menampilkan Statistik Diagnosis
        diagnosisCounter.printDiagnosisSummary();
    } 
}
