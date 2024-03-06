package Cuaderno3.Ejercicio3.Point2D_Point3D;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {

    @Test
    void getZ() {
        Point3D a = new Point3D();
        assertEquals(0.0, a.getZ(), 0.0);
    }

    @Test
    void setZ() {
        Point3D a = new Point3D(3,4,5);
        assertDoesNotThrow(()-> a.setZ(5));
        assertEquals(5, a.getZ(), 5);
    }

    @Test
    void setXYZ() {
        Point3D a = new Point3D(3,4,5);
        assertDoesNotThrow(()-> a.setXYZ(3,4,5));
        assertEquals(3, a.getX());
        assertEquals(4, a.getY());
        assertEquals(5, a.getZ());
    }

    @Test
    void testToString() {
        Point3D a = new Point3D(3,4,5);
        assertEquals("(3.0,4.0,5.0)", a.toString());
    }
}