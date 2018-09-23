package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C12Test {
    private C12 c12;

    @Test
    void testMA(){
        this.c12 = new C12();
        assertEquals("mA", c12.mA());
    }
}
