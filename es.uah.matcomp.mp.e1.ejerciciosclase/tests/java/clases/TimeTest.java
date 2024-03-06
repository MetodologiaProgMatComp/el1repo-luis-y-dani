package java.clases;
import Cuaderno1.Ejercicio7.Time;

import static org.junit.jupiter.api.Assertions.*;

class TimeTest {

    @org.junit.jupiter.api.Test
    void getHour() {
        Time a = new Time(04, 04, 04);
        assertEquals(04, a.getHour(), "Esta no era la hora esperada");
    }

    @org.junit.jupiter.api.Test
    void getMinute() {
        Time a = new Time(23, 23, 23);
        assertEquals(23, a.getMinute(), "Este no era el minuot esperado");
    }

    @org.junit.jupiter.api.Test
    void getSecond() {
        Time a = new Time(23, 23, 23);
        assertEquals(23, a.getSecond(), "Este no era el segundo esperado");
    }

    @org.junit.jupiter.api.Test
    void setHour() {
        Time a = new Time(23, 23, 23);
        assertDoesNotThrow(() -> a.setHour(23));
        assertEquals(23, a.getHour(), 23);
    }

    @org.junit.jupiter.api.Test
    void setMinute() {
        Time a = new Time(23, 23, 23);
        assertDoesNotThrow(() -> a.setMinute(23));
        assertEquals(23, a.getMinute(), 23);
    }

    @org.junit.jupiter.api.Test
    void setSecond() {
        Time a = new Time(23, 23, 23);
        assertDoesNotThrow(() -> a.setSecond(23));
        assertEquals(23, a.getSecond(), 23);
    }

    @org.junit.jupiter.api.Test
    void setTime() {
        Time a = new Time(23, 23, 23);
        assertDoesNotThrow(() -> a.setTime(23, 23, 23));
        assertEquals(23, a.getHour(), 23);
        assertEquals(23, a.getMinute(), 23);
        assertEquals(23, a.getSecond(), 23);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Time a = new Time(04, 04, 04);
        assertEquals("04:04:04", a.toString(), "No es el mensaje esperado");
    }

    @org.junit.jupiter.api.Test
    void nextSecond() {
        Time a = new Time(23, 23, 23);
        Time b = new Time(23, 23, 59);
        Time c = new Time(23, 59, 59);
        assertDoesNotThrow(() -> a.nextSecond());
        assertEquals("23:23:25", a.nextSecond().toString(), "No es el segundo esperado");
        assertDoesNotThrow(() -> b.nextSecond());
        assertEquals("23:24:1", b.nextSecond().toString(), "No es el segundo esperado");
        assertDoesNotThrow(() -> c.nextSecond());
        assertEquals("00:00:01", c.nextSecond().toString(), "No es el segundo esperado");
    }

    @org.junit.jupiter.api.Test
    void previousSecond() {
        Time a = new Time(23, 23, 23);
        Time b = new Time(23, 23, 0);
        Time c = new Time(23, 0, 0);
        Time d = new Time(0, 0, 0);
        assertDoesNotThrow(() -> a.previousSecond());
        assertEquals("23:23:21", a.previousSecond().toString(), "No es el segundo esperado");
        assertDoesNotThrow(() -> b.previousSecond());
        assertEquals("23:22:58", b.previousSecond().toString(), "No es el segundo esperado");
        assertDoesNotThrow(() -> c.previousSecond());
        assertEquals("22:59:58", c.previousSecond().toString(), "No es el segundo esperado");
        assertDoesNotThrow(() -> d.previousSecond());
        assertEquals("23:59:58", d.previousSecond().toString(), "No es el segundo esperado");
    }
}