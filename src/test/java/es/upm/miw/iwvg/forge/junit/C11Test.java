package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class C11Test {
    private C11 c11;

    @Test
    void testM1(){
        this.c11 = new C11();
        assertEquals("m1", c11.m1());
    }

    @Test
    void testM2(){
        this.c11 = new C11();
        assertEquals("m2", c11.m2());
    }
}
