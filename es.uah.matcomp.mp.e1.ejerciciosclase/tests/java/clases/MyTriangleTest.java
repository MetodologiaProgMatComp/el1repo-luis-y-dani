package java.clases;
import clases.MyTriangle;
import clases.MyPoint;

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
        MyPoint c = new MyPoint(3,4);
        MyPoint d = new MyPoint(5, 6);
        MyPoint e = new MyPoint(7,8);
        MyTriangle a = new MyTriangle(c, d, e);
        assertEquals(, a.getPerimeter(),);
    }

    @Test
    void getType() {
        MyPoint c = new MyPoint(3,4);
        MyPoint d = new MyPoint(5, 6);
        MyPoint e = new MyPoint(7,8);
        MyTriangle a = new MyTriangle(c, d, e);
    }
}