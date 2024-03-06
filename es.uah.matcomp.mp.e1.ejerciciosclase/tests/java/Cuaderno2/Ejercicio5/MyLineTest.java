package Cuaderno2.Ejercicio5;

import Cuaderno2.Ejercicio4.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {

    @Test
    void getBegin() {
        MyPoint b = new MyPoint();
        MyPoint c = new MyPoint(3, 4);
        MyLine a = new MyLine(b, c);
        assertDoesNotThrow(()-> a.getBegin());
        assertEquals(0, b.getX());
        assertEquals(0, b.getY());
    }

    @Test
    void setBegin() {
        MyPoint b = new MyPoint();
        MyPoint c = new MyPoint(3, 4);
        MyLine a = new MyLine(b, c);
        assertDoesNotThrow(()-> a.setBegin(b));
        assertEquals(0, b.getX());
        assertEquals(0, b.getY());
    }

    @Test
    void getEnd() {
        MyPoint b = new MyPoint();
        MyPoint c = new MyPoint(3, 4);
        MyLine a = new MyLine(b, c);
        assertDoesNotThrow(()-> a.getEnd());
        assertEquals(3, c.getX());
        assertEquals(4, c.getY());
    }

    @Test
    void setEnd() {
        MyPoint b = new MyPoint();
        MyPoint c = new MyPoint(3, 4);
        MyLine a = new MyLine(b, c);
        assertDoesNotThrow(()-> a.setEnd(c));
        assertEquals(3, c.getX());
        assertEquals(4, c.getY());
    }

    @Test
    void getBeginX() {
        MyLine a = new MyLine(1, 1, 3, 4);
        assertEquals(1, a.getBeginX());
    }

    @Test
    void setBeginX() {
        MyLine a = new MyLine(1, 1, 3, 4);
        assertDoesNotThrow(()-> a.setBeginX(1));
        assertEquals(1, a.getBeginX());
    }

    @Test
    void getBeginY() {
        MyLine a = new MyLine(1, 1, 3, 4);
        assertEquals(1, a.getBeginY());
    }

    @Test
    void setBeginY() {
        MyLine a = new MyLine(1, 1, 3, 4);
        assertDoesNotThrow(()-> a.setBeginY(1));
        assertEquals(1, a.getBeginY());
    }

    @Test
    void getEndX() {
        MyLine a = new MyLine(1, 1, 3, 4);
        assertEquals(3, a.getEndX());
    }

    @Test
    void setEndX() {
        MyLine a = new MyLine(1, 1, 3, 4);
        assertDoesNotThrow(()-> a.setEndX(3));
        assertEquals(3, a.getEndX());
    }

    @Test
    void getEndY() {
        MyLine a = new MyLine(1, 1, 3, 4);
        assertEquals(4, a.getEndY());
    }

    @Test
    void setEndY() {
        MyLine a = new MyLine(1, 1, 3, 4);
        assertDoesNotThrow(()-> a.setEndY(4));
        assertEquals(4, a.getEndY());
    }

    @Test
    void getBeginXY() {
        MyLine a = new MyLine(1, 1, 3, 4);
        assertDoesNotThrow(()-> a.getBeginXY());
        assertEquals(1, a.getBeginX());
        assertEquals(1, a.getBeginY());
    }

    @Test
    void setBeginXY() {
        MyLine a = new MyLine(1, 1, 3, 4);
        assertDoesNotThrow(()-> a.setBeginXY(1, 1));
        assertEquals(1, a.getBeginX());
        assertEquals(1, a.getBeginY());
    }

    @Test
    void getEndXY() {
        MyLine a = new MyLine(1, 1, 3, 4);
        assertDoesNotThrow(()-> a.getEndXY());
        assertEquals(3, a.getEndX());
        assertEquals(4, a.getEndY());
    }

    @Test
    void setEndXY() {
        MyLine a = new MyLine(1, 1, 3, 4);
        assertDoesNotThrow(()-> a.setEndXY(3, 4));
        assertEquals(3, a.getEndX());
        assertEquals(4, a.getEndY());
    }

    @Test
    void getLength() {
        MyLine a = new MyLine(3, 4, 1, 1);
        assertDoesNotThrow(()-> a.setBeginXY(3, 4));
        assertEquals(5, a.getLength());
    }

    @Test
    void getGradient() {
        MyLine a = new MyLine(3, 4, 1, 1);
        assertEquals(-1.5707963267948966, a.getGradient());
    }

    @Test
    void testToString() {
        MyLine a = new MyLine(3, 4, 1, 1);
        assertEquals("MyLine[begin=((3,4)),end=((1,1))]", a.toString());
    }
}