package Cuaderno2.Ejercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {
    @Test
    void getX() {
        MyPoint s = new MyPoint();
        assertEquals(0, s.getX(), 0);
    }

    @Test
    void getY() {
        MyPoint s = new MyPoint(3, 4);
        assertEquals(4, s.getY(), 4);
    }

    @Test
    void setX() {
        MyPoint s = new MyPoint(3, 4);
        assertDoesNotThrow(()-> s.setX(3));
        assertEquals(3, s.getX(), "Este no es el valor de X que esperaba");
    }

    @Test
    void setY() {
        MyPoint s = new MyPoint(3, 4);
        assertDoesNotThrow(()-> s.setY(4));
        assertEquals(4, s.getY(), "Este no es el valor de Y que esperaba");
    }

    @Test
    void getXY() {
        MyPoint s = new MyPoint(3, 4);
        assertDoesNotThrow(()-> s.getXY());
        assertEquals(3, s.getX(),"Esta no es la coordenada X que esperaba");
        assertEquals(4, s.getY(), "Esta no es la coordenada Y que esperaba");
    }

    @Test
    void setXY() {
        MyPoint s = new MyPoint(3, 4);
        assertDoesNotThrow(()-> s.setXY(3, 4));
        assertEquals(3, s.getX(), "Esta no es la coordenada X que se esperaba");
        assertEquals(4, s.getY(), "Esta no es la coordenada Y que se esperaba");
    }

    @Test
    void testToString() {
        MyPoint s = new MyPoint(3, 4);
        assertEquals("(3,4)", s.toString(), "Esta no era la salida por pantalla que se esperaba");
    }

    @Test
    void distance() {
        MyPoint s = new MyPoint(3, 4);
        assertDoesNotThrow(()-> s.setXY(3, 4));
        assertEquals(5, s.distance(3, 4), "Esta no era la distancia que esperaba encontrar");
    }

    @Test
    void testDistance() {
        MyPoint s = new MyPoint(3, 4);
        assertDoesNotThrow(()-> s.setXY(3, 4));
        assertEquals(5, s.distance(s), "Esta no era la distancia que esperaba encontrar");
    }

    @Test
    void testDistance1() {
        MyPoint s = new MyPoint(3, 4);
        assertDoesNotThrow(()-> s.setXY(3, 4));
        assertEquals(5, s.distance(), "Esta no era la distancia que esperaba encontrar");
    }

}