package Cuaderno2.Ejercicio6;

import Cuaderno2.Ejercicio4.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {
    @Test
    void getRadius() {
        MyPoint e = new MyPoint(3, 4);
        MyCircle a = new MyCircle(e, 2);
        assertEquals(2, a.getRadius(), 2);
    }

    @Test
    void setRadius() {
        MyPoint e = new MyPoint(3, 4);
        MyCircle a = new MyCircle(e, 2);
        assertDoesNotThrow(() -> a.setRadius(2));
        assertEquals(2, a.getRadius(), "Estos no son los radianes que esperaba");
    }

    @Test
    void getCenter() {
        MyPoint e = new MyPoint(3, 4);
        MyCircle a = new MyCircle(e, 2);
        assertEquals(e, a.getCenter(), "Este no es el centro que esperaba");
    }

    @Test
    void setCenter() {
        MyPoint e = new MyPoint(3, 4);
        MyCircle a = new MyCircle(e, 2);
        assertDoesNotThrow(() -> a.setCenter(e));
        assertEquals(e, a.getCenter(), "Este no es el centro que esperaba");
    }

    @Test
    void getCenterX() {
        MyPoint e = new MyPoint(3, 4);
        MyCircle a = new MyCircle(e, 2);
        assertEquals(3, a.getCenterX(), 3);
    }

    @Test
    void setCenterX() {
        MyPoint e = new MyPoint(3, 4);
        MyCircle a = new MyCircle(e, 2);
        assertDoesNotThrow(() -> a.setCenterX(3));
        assertEquals(3, a.getCenterX(), "Esta no es la coordenada X del centro que esperaba");
    }

    @Test
    void getCenterY() {
        MyPoint e = new MyPoint(3, 4);
        MyCircle a = new MyCircle(e, 2);
        assertEquals(4, a.getCenterY(), 4);
    }

    @Test
    void setCenterY() {
        MyPoint e = new MyPoint(3, 4);
        MyCircle a = new MyCircle(e, 2);
        assertDoesNotThrow(() -> a.setCenterY(4));
        assertEquals(4, a.getCenterY(), "Esta no es la coordenada Y del centro que esperaba");
    }

    @Test
    void getCenterXY() {
        MyPoint e = new MyPoint(3, 4);
        MyCircle a = new MyCircle(e, 2);
        assertEquals(34, a.getCenterXY(), "Estas no son las coordenadas del centro que esperaba");
    }

    @Test
    void setCenterXY() {
        MyPoint e = new MyPoint(3, 4);
        MyCircle a = new MyCircle(e, 2);
        assertDoesNotThrow(() -> a.setCenterXY(3, 4));
        assertEquals(34, a.getCenterXY(), "Estas no son las coordenadas del centro que esperaba");
    }

    @Test
    void testToString() {
        MyPoint e = new MyPoint(3, 4);
        MyCircle a = new MyCircle(e, 2);
        assertEquals("MyCircle[radius=2, center=(3,4)]", a.toString(), "Este no es el mensaje que esperaba");
    }

    @Test
    void getArea() {
        MyPoint e = new MyPoint(3, 4);
        MyCircle a = new MyCircle(e, 2);
        assertEquals(12.566370614359172953850573533118, a.getArea(), "Este no es el area que esperaba");
    }

    @Test
    void getCircumference() {
        MyPoint e = new MyPoint(3, 4);
        MyCircle a = new MyCircle(e, 2);
        assertEquals(12.566370614359172953850573533118, a.getCircumference(), "Esta no es la circunferencia que esperaba");
    }

    @Test
    void distance() {
        MyPoint e = new MyPoint(3, 4);
        MyCircle a = new MyCircle(e, 2);
        // terminar

    }
}