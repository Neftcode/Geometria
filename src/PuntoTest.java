import org.junit.Test;

import static org.junit.Assert.*;

public class PuntoTest {
    @Test
    public void hallarDistancia() {
        Punto p1 = new Punto(-1, 0);
        Punto p2 = new Punto(1, 0);
        assertEquals(2, p1.hallarDistancia(p2), 0);
    }
}