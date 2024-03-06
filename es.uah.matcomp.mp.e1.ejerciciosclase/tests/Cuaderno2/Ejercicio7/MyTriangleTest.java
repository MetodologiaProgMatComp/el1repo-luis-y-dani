package Cuaderno2.Ejercicio7;

import Cuaderno2.Ejercicio4.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {
    @Test
    void testToString() {
        MyPoint c = new MyPoint(3,4);
        MyPoint d = new MyPoint(5, 6);
        MyPoint e = new MyPoint(7,8);
        MyTriangle a = new MyTriangle(c, d, e);
        assertEquals("MyTriangle[v1=(3,4), v2=(5,6), v3=(7,8)]", a.toString(), "Este no es el texto que esperaba");
    }

    @Test
    void getPerimeter() {
        MyPoint c = new MyPoint(1,1);
        MyPoint d = new MyPoint(7, 1);
        MyPoint e = new MyPoint(5,5);
        MyPoint h = new MyPoint(2, 3);
        MyTriangle a = new MyTriangle(c, d, e);
        MyTriangle b = new MyTriangle(e, c, h);
        assertEquals(23, a.getPerimeter(),23);
    }

    @Test
    void getType() {
        MyPoint c = new MyPoint(3,4);
        MyPoint d = new MyPoint(5, 6);
        MyPoint e = new MyPoint(7,8);
        MyPoint h = new MyPoint(2, 3);
        MyTriangle a = new MyTriangle(c, d, e);
        MyTriangle b = new MyTriangle(e, c, h);
        assertEquals("Equilateral", a.getType(), "Este no es el triángulo que esperaba");
        assertEquals("Scalene", b.getType(), "Este no es el triángulo que esperaba");
    }

}