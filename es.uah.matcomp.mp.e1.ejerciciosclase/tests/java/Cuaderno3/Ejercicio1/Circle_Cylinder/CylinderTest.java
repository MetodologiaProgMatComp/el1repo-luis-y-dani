package Cuaderno3.Ejercicio1.Circle_Cylinder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void getHeight() {
        Cylinder a = new Cylinder();
        assertEquals(1.0, a.getHeight(), 1.0);
    }

    @Test
    void setHeight() {
        Cylinder a = new Cylinder(34.5);
        assertDoesNotThrow(()-> a.setHeight(34.5));
        assertEquals(34.5, a.getHeight(), 34.5);
    }

    @Test
    void getVolume() {
        Cylinder a = new Cylinder(2, 34.5);
        assertEquals(433.53978619539146690784478689257, a.getVolume());
    }

    @Test
    void testToString() {
        Cylinder a = new Cylinder(2, 34.5, "red");
        assertEquals("Cylinder: subclass of Circle[radius=2.0, color=red]height=34.5", a.toString());
    }
}