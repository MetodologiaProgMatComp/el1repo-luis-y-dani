package Cuaderno3.Ejercicio1.Circle_Cylinder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void getRadius() {
        Circle a = new Circle();
        assertEquals(1.0, a.getRadius(), 1.0);
    }

    @Test
    void setRadius() {
        Circle a = new Circle(34.5);
        assertDoesNotThrow(()-> a.setRadius(34.5));
        assertEquals(34.5, a.getRadius(), "Este no era el valor que me esperaba");
    }

    @Test
    void getColor() {
        Circle a = new Circle(34.5, "red");
        assertEquals("red", a.getColor(), "Este no es el color que esperaba");
    }

    @Test
    void setColor() {
        Circle a = new Circle(34.5, "red");
        assertDoesNotThrow(()-> a.setColor("red"));
        assertEquals("red", a.getColor(), "Este no es el color que esperaba");
    }

    @Test
    void getArea() {
        Circle a = new Circle(2, "red");
        assertEquals(12.566370614359172953850573533118, a.getArea(), "Este no es el area que esperaba");
    }

    @Test
    void testToString() {
        Circle a = new Circle(34.5, "red");
        assertEquals("Circle[radius=34.5, color=red]", a.toString(), "Este no es el color que esperaba");
    }
}