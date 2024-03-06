package Cuaderno3.Ejercicio4.point_y_movablepoint;

import Cuaderno3.Ejercicio4.point_y_movablepoint.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void getX() {
        Point a = new Point();
        assertEquals(0, a.getX(), 0);
    }

    @Test
    void setX() {
        Point a = new Point(34, 54);
        assertDoesNotThrow(()-> a.setX(34));
        assertEquals(34, a.getX(), "Esta no era la coordenada X que esperaba");
    }

    @Test
    void getY() {
        Point a = new Point(34, 54);
        assertEquals(54, a.getY(), 54);
    }

    @Test
    void setY() {
        Point a = new Point(34, 54);
        assertDoesNotThrow(()-> a.setY(54));
        assertEquals(54, a.getY(), "Esta no era la coordenada Y que esperaba");
    }

    @Test
    void getXY() {
        Point a = new Point(34, 54);
        assertDoesNotThrow(()-> a.getXY());
        assertEquals(34, a.getX(), 34);
        assertEquals(54, a.getY(), 54);
    }

    @Test
    void setXY() {
        Point a = new Point(34, 54);
        assertDoesNotThrow(()-> a.setXY(34, 54));
        assertEquals(34, a.getX(), "Esta no es la coordenada X que esperaba");
        assertEquals(54, a.getY(), "Esta no es la coordenada Y que esperaba");
    }

    @Test
    void testToString() {
        Point a = new Point(34, 54);
        assertEquals("(34.0,54.0)", a.toString(), "Este texto no era el que esperaba");
    }
}