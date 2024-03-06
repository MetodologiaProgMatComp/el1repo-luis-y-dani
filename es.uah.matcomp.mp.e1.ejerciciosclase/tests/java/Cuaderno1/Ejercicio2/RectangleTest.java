package Cuaderno1.Ejercicio2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test
    void getWidth(){
        Rectangle rectangle = new Rectangle();
        float w = (float) rectangle.getWidth();
        assertNotEquals(w, 0L);
        assertTrue(w>0L);
    }
    @Test
    void getLength(){
        Rectangle rectangle = new Rectangle();
        float l = (float) rectangle.getLength();
        assertNotEquals(l, 0L);
        assertTrue(l>0L);
    }
    @Test
    void setWidth(){
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(10.0f);
        float a = (float) rectangle.getWidth();
        assertEquals(a, 10.0f);
        assertDoesNotThrow(() -> rectangle.setWidth(10.0f));
    }
    @Test
    void setLength(){
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20.0f);
        float b = (float) rectangle.getLength();
        assertEquals(b, 20.0f);
        assertDoesNotThrow(() -> rectangle.setLength(20.0f));
    }
    @Test
    void getArea(){
        Rectangle rectangle = new Rectangle(1.0f, 2.0f);
        assertEquals(rectangle.getArea(), 2.0f);
        assertTrue(rectangle.getArea()>0);
        assertDoesNotThrow(() -> rectangle.getArea());
    }
    @Test
    void getPerimeter(){
        Rectangle rectangle = new Rectangle(5.0f, 10.0f);
        assertEquals(30.0f, rectangle.getPerimeter());
        assertDoesNotThrow(() -> rectangle.getPerimeter());
    }
    @Test
    void testToString(){
        Rectangle rectangle = new Rectangle(5.0f, 10.0f);
        assertEquals("Rectangle[length=5.0,width=10.0]", rectangle.toString());
    }

}