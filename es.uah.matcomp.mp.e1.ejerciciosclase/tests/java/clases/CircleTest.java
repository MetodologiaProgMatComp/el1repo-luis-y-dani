package java.clases;

import org.junit.jupiter.api.Test;
import clases.Circle;
import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @org.junit.jupiter.api.Test
    void getRadius() {
        Circle j = new Circle(1.1);
        assertEquals(1.1, j.getRadius(), 1.1);
    }

    @org.junit.jupiter.api.Test
    void setRadius() {
        Circle j = new Circle();
        assertDoesNotThrow(() -> j.setRadius(1.1));
        assertEquals( 1.1, j.getRadius(), 1.1);
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        Circle j = new Circle();
        assertEquals(20, j.getArea(), 20);
    }

    @org.junit.jupiter.api.Test
    void getCircumference() {
        Circle j = new Circle();
        assertEquals(20, j.getCircumference(), 20);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Circle j = new Circle();
        assertEquals("Circle[radious=1.0]", j.toString(), "Este no era el mensaje esperado");
    }
}
