package clases.point_y_movablepoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void getxSpeed() {
        MovablePoint a = new MovablePoint(23, 46);
        assertEquals(23, a.getxSpeed(), 23);
    }

    @Test
    void setxSpeed() {
        MovablePoint a = new MovablePoint(23, 46);
        assertDoesNotThrow(()-> a.setxSpeed(23));
        assertEquals(23, a.getxSpeed(), "Este no es el valor que esperaba");
    }

    @Test
    void getySpeed() {
        MovablePoint a = new MovablePoint(23, 46);
        assertEquals(46, a.getySpeed(), 46);
    }

    @Test
    void setySpeed() {
        MovablePoint a = new MovablePoint(23, 46);
        assertDoesNotThrow(()-> a.setySpeed(46));
        assertEquals(46, a.getySpeed(), "Este no es el valor que esperaba");
    }

    @Test
    void getSpeed() {
        MovablePoint a = new MovablePoint(23, 46);
        assertDoesNotThrow(()-> a.getSpeed());
        assertEquals(23, a.getxSpeed(), 23);
        assertEquals(46, a.getySpeed(), 46);
    }

    @Test
    void setSpeed() {
        MovablePoint a = new MovablePoint(23, 46);
        assertDoesNotThrow(()-> a.setSpeed(23, 46));
        assertEquals(23, a.getxSpeed(), "Este no es el valor que esperaba");
        assertEquals(46, a.getySpeed(), "Este no es el valor que esperaba");
    }

    @Test
    void testToString() {
        MovablePoint a = new MovablePoint(34, 54, 23, 46);
        assertEquals("(34,54),speed=(23,46)", a.toString(), "Este no es el texto que esperaba");
    }

    @Test
    void move() {
        MovablePoint a = new MovablePoint(34, 54,23, 46);
        assertDoesNotThrow(()-> a.move());
        assertEquals(57, a.getX(), "Este no es el valor que esperaba");
        assertEquals(100, a.getY(), "Este no es el valor que esperaba");
    }
}