# Belajar Automated Testing

Project latihan automated testing menggunakan JUnit 5 pada aplikasi Spring Boot.

## Deskripsi

Project ini mendemonstrasikan perbedaan antara **manual testing** dan **automated testing** menggunakan class `Terbilang` — utility untuk mengkonversi angka menjadi kata-kata dalam Bahasa Indonesia.

Contoh:
- `1001` → `seribu satu`
- `3456` → `tiga ribu empat ratus lima puluh enam`
- `1020300000` → `satu miliar dua puluh juta tiga ratus ribu`

Fitur class `Terbilang`:
- Konversi angka 0 sampai triliun
- Support angka negatif (prefix `minus`)
- Input menggunakan `BigDecimal`

## Tech Stack

- Java 25
- Spring Boot 4.0.3
- JUnit 5 (Jupiter)
- Maven

## Struktur Project

```
src/
├── main/java/.../helper/
│   └── Terbilang.java              # Class utility konversi angka ke terbilang
└── test/java/.../helper/
    ├── TerbilangManualTest.java     # Contoh testing manual (pakai main method + println)
    └── TerbilangAutomatedTest.java  # Contoh automated test (pakai JUnit 5 + Assertions)
```

## Cara Menjalankan

### Build project

```bash
./mvnw compile
```

### Menjalankan manual test

```bash
./mvnw exec:java -Dexec.mainClass="com.muhardin.endy.belajar.automated.testing.helper.TerbilangManualTest"
```

### Menjalankan automated test

Semua test:

```bash
./mvnw test
```

Satu test class saja:

```bash
./mvnw test -Dtest=TerbilangAutomatedTest
```

Satu test method saja:

```bash
./mvnw test -Dtest=TerbilangAutomatedTest#testBanyakRibu
```

## Perbandingan Manual vs Automated Testing

### Manual Test (`TerbilangManualTest.java`)

- Menggunakan `main` method biasa
- Verifikasi dilakukan dengan membaca output `System.out.println` secara visual
- Tidak ada mekanisme pass/fail otomatis

### Automated Test (`TerbilangAutomatedTest.java`)

- Menggunakan annotation `@Test` dari JUnit 5
- Verifikasi menggunakan `Assertions.assertEquals()` — otomatis menentukan pass/fail
- Bisa dijalankan sekaligus banyak test case dalam satu kali `mvn test`
- Hasil test tercatat di `target/surefire-reports/`
