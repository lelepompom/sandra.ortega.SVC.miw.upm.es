package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C22Test {
    private C22 c22;

    @Test
    void testMA(){
        this.c22 = new C22();
        assertEquals("mA", c22.mA());
    }
}
