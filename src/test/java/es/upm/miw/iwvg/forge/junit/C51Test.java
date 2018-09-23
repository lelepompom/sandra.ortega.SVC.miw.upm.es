package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class C51Test {
    private C51 c51;

    @Test
    void testM1(){
        this.c51 = new C51();
        assertEquals("m1", c51.m1());
    }

    @Test
    void testM2(){
        this.c51 = new C51();
        assertEquals("m2", c51.m2());
    }
}
