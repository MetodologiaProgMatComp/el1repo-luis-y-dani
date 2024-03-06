package Cuaderno4.Ejercicio2.Interfaz_GeometricObject;

import Cuaderno4.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testToString() {
        Rectangle a = new Rectangle(32, 40);
        assertEquals("Rectangle[width=32,length=40]", a.toString(), "Este no es el texto que esperaba");
    }

    @Test
    void getArea() {
        Rectangle a = new Rectangle(32, 40);
        assertEquals(1280, a.getArea(), 1280);
    }

    @Test
    void getPerimeter() {
        Rectangle a = new Rectangle(32, 40);
        assertEquals(144, a.getPerimeter(), 144);
    }
}