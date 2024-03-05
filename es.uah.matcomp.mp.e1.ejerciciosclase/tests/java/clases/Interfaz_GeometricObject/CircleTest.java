package clases.Interfaz_GeometricObject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void testToString() {
        Circle a = new Circle(45);
        assertEquals("Circle[radius=45]", a.toString(), "Este no es el texto que esperaba");
    }

    @Test
    void getArea() {
        Circle a = new Circle(45);
        assertEquals(6361.725123519331307886852851141, a.getArea(), 6361.725123519331307886852851141);
    }

    @Test
    void getPerimeter() {
        Circle a = new Circle(45);
        assertEquals(282.74333882308139146163790449516, a.getPerimeter(), 282.74333882308139146163790449516);
    }
}