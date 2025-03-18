# <h1 align="center">Clinic Management System</h1>
<p align="center">Arsita Wiwit Tiyaswening</p>
<p align="center">2311110028</p>

# Penjelasan
Clinic Management System ini bertujuan untuk mengelola data dokter, pasien, dan janji temu secara terstruktur menggunakan konsep Object-Oriented Programming (OOP) dalam Java. Sistem ini mencakup fitur untuk:
1. Menyimpan daftar dokter beserta spesialisasi mereka.
2. Menyimpan daftar pasien.
3. Membuat janji temu antara dokter dan pasien.
4. Validasi data menggunakan DataChecker.
5. Menghitung statistik diagnosis dengan DiagnosisCounter.

# Struktur Proyek

```
prak1203/
├── src/
│   └── guided/
│       └── guided.Drive/
│           ├── TestPackages.java
│       └── guided.HargaBuku/
│           ├── KelasHarga.java
│       └── guided.HargaToken/
│           ├── KelasToken.java
│       └── Animal.java
│       └── Cat.java
│       └── Driver.java
│       └── LibraryBook.java
│   └── Unguided/
│       ├── ClinicManagemet.java  # Main program
│       ├── entities/
│       │   ├── Dokter.java
│       │   ├── Pasien.java
│       │   ├── JanjiTemu.java
│       ├── utilities/
│       │   ├── DataChecker.java
│       │   ├── DiagnosisCounter.java
└── Readme.md  # Dokumentasi proyek
```
# Penjelasan Kelas

## 1️. Class Dokter (entities.Dokter)
### Atribut:
- idDokter (int) → ID unik dokter.
- nama (String) → Nama dokter.
- spesialisasi (String) → Spesialisasi dokter.
### Method:
- Konstruktor untuk inisialisasi dokter.
- Getter dan setter untuk mengakses atribut dokter.
### Contoh penggunaan:
```
Dokter dokter1 = new Dokter(101, "Dr. Arsita", "Tulang");
```

## 2️. Class Pasien (entities.Pasien)
### Atribut:
- idPasien (int) → ID unik pasien.
- nama (String) → Nama pasien.
### Method:
- Konstruktor untuk inisialisasi pasien.
- Getter dan setter untuk mengakses atribut pasien.
  
### Contoh penggunaan:

```
Pasien pasien1 = new Pasien(201, "Dimas");
```

## 3️. Class JanjiTemu (entities.JanjiTemu)

### Atribut:
- idJanjiTemu (int) → ID unik janji temu.
- dokter (Dokter) → Dokter yang bertanggung jawab.
- pasien (Pasien) → Pasien yang membuat janji temu.
- tanggal (String) → Tanggal janji temu.
- diagnosis (String) → Diagnosis yang diberikan oleh dokter.
### Method:
- Konstruktor untuk membuat janji temu.
- Getter dan setter untuk mengakses data janji temu.
- Method cetakDetail() untuk menampilkan informasi janji temu.

### Contoh penggunaan:

```
JanjiTemu janji1 = new JanjiTemu(301, dokter1, pasien1, "2025-03-20", "Patah Tulang");
```

## 4️. Class DataChecker (utilities.DataChecker)
### Method:
isValidDate(String date) → Memvalidasi apakah format tanggal benar (YYYY-MM-DD).

### Contoh penggunaan:
```
if (DataChecker.isValidDate("2025-03-20")) {
    System.out.println("Tanggal valid.");
} else {
    System.out.println("Format tanggal tidak valid.");
}
```

## 5️. Class DiagnosisCounter (utilities.DiagnosisCounter)

### Atribut:

diagnosisMap (HashMap<String, Integer>) → Menyimpan jumlah diagnosis berdasarkan jenisnya.

### Method:
addDiagnosis(String diagnosis) → Menambahkan jumlah diagnosis.
printDiagnosisSummary() → Menampilkan statistik diagnosis.

### Contoh penggunaan:
```
DiagnosisCounter counter = new DiagnosisCounter();
counter.addDiagnosis("Patah Tulang");
counter.printDiagnosisSummary();
```

## Class SistemKlinik (Main Program)
### Fungsi:
- Membuat daftar dokter.
- Membuat daftar pasien.
- Menampilkan daftar dokter dan pasien.
- Membuat janji temu antara dokter dan pasien.
- Memvalidasi format tanggal janji temu.
- Menghitung dan menampilkan statistik diagnosis.

### Kode utama:
'''
public class SistemKlinik {
    public static void main(String[] args) {
        // Data Dokter
        Dokter[] dokterList = {
            new Dokter(101, "Dr. Arsita", "Tulang"),
            new Dokter(102, "Dr. Budi", "Jantung"),
            new Dokter(103, "Dr. Citra", "Saraf"),
            new Dokter(104, "Dr. Dedi", "Mata"),
            new Dokter(105, "Dr. Erika", "Kulit")
        };

        // Data Pasien
        Pasien[] pasienList = {
            new Pasien(201, "Dimas"),
            new Pasien(202, "Rina"),
            new Pasien(203, "Ali"),
            new Pasien(204, "Siti"),
            new Pasien(205, "Budi"),
            new Pasien(206, "Tina"),
            new Pasien(207, "Faisal")
        };

        // Menampilkan Data Dokter
        System.out.println("=== Data Dokter ===");
        for (Dokter dokter : dokterList) {
            System.out.println("ID: " + dokter.getIdDokter() + " | Nama: " + dokter.getNama() + " | Spesialisasi: " + dokter.getSpesialisasi());
        }

        // Inisialisasi Diagnosis Counter
        DiagnosisCounter diagnosisCounter = new DiagnosisCounter();

        // Data Janji Temu
        JanjiTemu[] janjiList = {
            new JanjiTemu(301, dokterList[0], pasienList[0], "2025-03-20", "Patah Tulang"),
            new JanjiTemu(302, dokterList[1], pasienList[1], "2025-03-21", "Nyeri Dada"),
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
'''
### OUTPUT PROGRAM
![image](https://github.com/user-attachments/assets/e0bb5a39-0e12-49d3-b42c-5195c0b4d912)
![image](https://github.com/user-attachments/assets/ab4ac5e1-db8f-4e36-b460-dd96edf15bd5)
![image](https://github.com/user-attachments/assets/ceb6c6d9-78af-4b4f-9d73-b074e2b85af6)


🔍 Kesimpulan

Clinic Management ini menerapkan konsep OOP dalam Java dengan menerapkan enkapsulasi, struktur paket yang terorganisir, dan hubungan antar kelas untuk mengelola data dokter, pasien, serta janji temu secara efisien. Data dokter dan pasien disimpan dalam array, sementara janji temu menghubungkan keduanya dengan informasi diagnosis yang divalidasi menggunakan kelas DataChecker. Selain itu, DiagnosisCounter digunakan untuk menghitung dan menampilkan statistik diagnosis yang telah diberikan. Struktur paket Unguided.entities digunakan untuk menyimpan kelas entitas utama, sedangkan Unguided.utilities berisi kelas pendukung untuk validasi dan penghitungan data. Dengan implementasi ini, sistem menjadi modular, mudah diperbarui, serta memastikan keamanan dan integritas data pasien dan dokter.














