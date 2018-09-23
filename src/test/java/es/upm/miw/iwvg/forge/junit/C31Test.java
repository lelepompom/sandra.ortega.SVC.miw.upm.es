package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class C31Test {
    private C31 c31;

    @Test
    void testM1(){
        this.c31 = new C31();
        assertEquals("m1", c31.m1());
    }

    @Test
    void testM2(){
        this.c31 = new C31();
        assertEquals("m2", c31.m2());
    }
}
