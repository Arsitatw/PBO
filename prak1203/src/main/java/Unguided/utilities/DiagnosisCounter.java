/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unguided.utilities;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author arsit
 */
public class DiagnosisCounter {
  private Map<String, Integer> diagnosisCount;

    public DiagnosisCounter() {
        this.diagnosisCount = new HashMap<>();
    }

    public void addDiagnosis(String diagnosis) {
        diagnosisCount.put(diagnosis, diagnosisCount.getOrDefault(diagnosis, 0) + 1);
    }

    public void printDiagnosisSummary() {
        System.out.println("\n=== Statistik Diagnosis ===");
        for (Map.Entry<String, Integer> entry : diagnosisCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " pasien");
        }
    }  
}
