package clases.InterfazMovable_point_circle;

import Cuaderno4.Ejercicio4.InterfazMovable_point_circle.MovablePoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void testToString() {
        MovablePoint a = new MovablePoint(2, 3, 4, 5);
        assertEquals("(2,3),speed=(4,5)", a.toString(), "Este no es el texto que esperaba");
    }

    @Test
    void moveUp() {
        MovablePoint a = new MovablePoint(2, 3, 4, 5);
        assertDoesNotThrow(()-> a.moveUp());
    }

    @Test
    void moveDown() {
    }

    @Test
    void moveLeft() {
    }

    @Test
    void moveRight() {
    }
}