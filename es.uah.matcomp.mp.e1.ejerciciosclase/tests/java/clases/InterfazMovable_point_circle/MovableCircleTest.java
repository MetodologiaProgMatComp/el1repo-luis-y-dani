package clases.InterfazMovable_point_circle;

import Cuaderno4.Ejercicio4.InterfazMovable_point_circle.MovableCircle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {

    @Test
    void testToString() {
        MovableCircle a = new MovableCircle(2, 3, 4, 5, 6);
        assertEquals("(2,3),speed=(4,5),radius=6", a.toString(), "Este no es el texto que esperaba");
    }

    @Test
    void moveUp() {
        MovableCircle a = new MovableCircle(2, 3, 4, 5, 6);
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