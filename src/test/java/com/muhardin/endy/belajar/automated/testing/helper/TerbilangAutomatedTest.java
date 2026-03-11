package com.muhardin.endy.belajar.automated.testing.helper;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TerbilangAutomatedTest {

    @Test @Disabled
    public void testSeribu(){
        System.out.println("Halo JUnit");
        BigDecimal seribuSatu = new BigDecimal("1001");
        String strSeribuSatu = Terbilang.terbilang(seribuSatu);
        Assertions.assertEquals("seribu satu", strSeribuSatu);
    }

    @Test
    public void testBanyakRibu(){
        // 3456
        BigDecimal coba2 = new BigDecimal("3456");
        String hasil2 = Terbilang.terbilang(coba2);
        // System.out.println("3456 : "+hasil2); // ganti dengan versi otomatisnya
        Assertions.assertEquals("tiga ribu empat ratus lima puluh enam", hasil2);
    }

    @Test
    public void testMiliar(){
        Assertions.assertEquals(
            "satu miliar dua puluh juta tiga ratus ribu", 
            Terbilang.terbilang(new BigDecimal("1020300000"))
        );
    }
}
