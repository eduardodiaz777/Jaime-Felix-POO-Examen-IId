package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static Producto p;

    @BeforeAll public static void setUp() {
        p = new Producto("Manzana", 2.5, 1.2);
    }

    @Test public void testDescripcion() {
        assertTrue(p.getDescripcion().equals("Manzana"));
    }

    @Test public void testPesoKilo() {
        assertTrue(p.getPesoKilo() == 2.5);
    }

    @Test public void testPrecioKilo() {
        assertTrue(p.getPrecioKilo() == 1.2);
    }

    @Test public void testPrecioProducto() {
        assertTrue(p.calcularPrecioProducto() == 3.0);
    }
}