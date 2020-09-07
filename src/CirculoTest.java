import org.junit.Test;

import static org.junit.Assert.*;

public class CirculoTest {
    @Test
    public void hallarArea() {
        Circulo c = new Circulo(1, new Punto(0, 0));
        assertEquals(9.86, Math.pow(Math.PI*c.radio, 2),0.01);
    }

    @Test
    public void hallarPerimetro() {
        Circulo c = new Circulo(1, null);
        assertEquals(6.28,2*Math.PI*c.radio,0.01);
    }
}