package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C52Test {
    private C52 c52;

    @Test
    void testMA(){
        this.c52 = new C52();
        assertEquals("mA", c52.mA());
    }
}
