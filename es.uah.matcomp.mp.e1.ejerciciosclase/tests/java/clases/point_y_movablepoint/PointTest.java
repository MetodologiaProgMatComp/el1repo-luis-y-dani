package clases.point_y_movablepoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void getX() {
        Point a = new Point(34, 54);
        assertEquals(34, a.getX(), 34);
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
        assertEquals(3454, a.getXY(), 3454);
    }

    @Test
    void setXY() {
    }

    @Test
    void testToString() {
    }
}