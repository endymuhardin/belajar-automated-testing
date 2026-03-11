package com.muhardin.endy.belajar.automated.testing.helper;

import java.math.BigDecimal;

public class Terbilang {

    private static final String[] SATUAN = {
        "", "satu", "dua", "tiga", "empat", "lima",
        "enam", "tujuh", "delapan", "sembilan", "sepuluh",
        "sebelas"
    };

    public static String terbilang(BigDecimal angka) {
        if (angka == null) {
            throw new IllegalArgumentException("Angka tidak boleh null");
        }

        boolean negatif = angka.compareTo(BigDecimal.ZERO) < 0;
        long nilai = angka.abs().longValue();

        if (nilai == 0) {
            return "nol";
        }

        String hasil = konversi(nilai).replaceAll("\\s+", " ").trim();

        if (negatif) {
            return "minus " + hasil;
        }
        return hasil;
    }

    private static String konversi(long angka) {
        if (angka < 12) {
            return SATUAN[(int) angka];
        }
        if (angka < 20) {
            return SATUAN[(int) (angka - 10)] + " belas";
        }
        if (angka < 100) {
            return SATUAN[(int) (angka / 10)] + " puluh " + SATUAN[(int) (angka % 10)];
        }
        if (angka < 200) {
            return "seratus " + konversi(angka - 100);
        }
        if (angka < 1000) {
            return SATUAN[(int) (angka / 100)] + " ratus " + konversi(angka % 100);
        }
        if (angka < 2000) {
            return "seribu " + konversi(angka - 1000);
        }
        if (angka < 1_000_000) {
            return konversi(angka / 1000) + " ribu " + konversi(angka % 1000);
        }
        if (angka < 1_000_000_000) {
            return konversi(angka / 1_000_000) + " juta " + konversi(angka % 1_000_000);
        }
        if (angka < 1_000_000_000_000L) {
            return konversi(angka / 1_000_000_000) + " miliar " + konversi(angka % 1_000_000_000);
        }
        if (angka < 1_000_000_000_000_000L) {
            return konversi(angka / 1_000_000_000_000L) + " triliun " + konversi(angka % 1_000_000_000_000L);
        }
        throw new IllegalArgumentException("Angka terlalu besar: " + angka);
    }
}
