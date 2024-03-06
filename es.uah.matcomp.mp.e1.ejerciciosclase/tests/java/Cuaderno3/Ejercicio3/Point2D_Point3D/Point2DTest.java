package Cuaderno3.Ejercicio3.Point2D_Point3D;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {

    @Test
    void getX() {
        Point2D a = new Point2D();
        assertEquals(0.0, a.getX(), 0.0);
    }

    @Test
    void setX() {
        Point2D a = new Point2D();
        assertDoesNotThrow(()-> a.setX(0.0f));
        assertEquals(0.0, a.getX(), 0.0);
    }

    @Test
    void getY() {
        Point2D a = new Point2D(3, 4);
        assertEquals(4, a.getY(), 4);
    }

    @Test
    void setY() {
        Point2D a = new Point2D(3, 4);
        assertDoesNotThrow(()-> a.setY(4));
        assertEquals(4, a.getY(), 4);
    }

    @Test
    void setXY() {
        Point2D a = new Point2D(3, 4);
        assertDoesNotThrow(()-> a.setXY(3, 4));
        assertEquals(3, a.getX(), 3);
        assertEquals(4, a.getY(), 4);
    }

    @Test
    void getXY() {
        Point2D a = new Point2D(3, 4);
        assertDoesNotThrow(()-> a.getXY());
        assertEquals(3, a.getX(), 3);
        assertEquals(4, a.getY(), 4);
    }

    @Test
    void testToString() {
        Point2D a = new Point2D(3, 4);
        assertEquals("(3.0,4.0)", a.toString());
    }
}