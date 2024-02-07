package clase;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @org.junit.jupiter.api.Test
    void getRadius() {
    }

    @org.junit.jupiter.api.Test
    void setRadius() {
        Circle j = new Circle();
        assertDoesNotThrow(() -> j.modificaciones());
        assertEquals( 1.0, j.getRadius(), "Este dato no es el que esperaba encontrar." );
    }

    @org.junit.jupiter.api.Test
    void getArea() {
        Circle j = new Circle();
        assertTrue((j.getArea()>=0), "El área da un número negativo.");
    }

    @org.junit.jupiter.api.Test
    void getCircumference() {
        Circle j = new Circle();
        assertTrue((j.getCircumference()>=0), "El área de su circunferencia es negativa.");
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Circle j = new Circle();
        assertEquals("Circle[radious=" + "1.0" + "]", j.toString(), "El texto que aparece no es el que le corresponde.");
    }
}