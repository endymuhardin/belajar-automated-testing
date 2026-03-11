package com.muhardin.endy.belajar.automated.testing.helper;

import java.math.BigDecimal;

public class TerbilangManualTest {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // 1001
        BigDecimal seribuSatu = new BigDecimal("1001");
        String strSeribuSatu = Terbilang.terbilang(seribuSatu);
        System.out.println("1001 : "+strSeribuSatu);

        // 3456
        BigDecimal coba2 = new BigDecimal("3456");
        String hasil2 = Terbilang.terbilang(coba2);
        System.out.println("3456 : "+hasil2);
    }
}
