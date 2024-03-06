package Cuaderno1.Ejercicio6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {
    @Test
    void getDay() {
        Date dat1 = new Date(22,3,2003);

        assertEquals(22, dat1.getDay());
    }

    @Test
    void getMonth() {
        Date dat1 = new Date(22,3,2003);

        assertEquals(3,dat1.getMonth());
    }

    @Test
    void getYear() {
        Date dat1 = new Date(22,3,2003);

        assertEquals(2003, dat1.getYear());
    }

    @Test
    void setDay() {
        Date dat1 = new Date(22,3,2003);
        assertDoesNotThrow(()-> dat1.setDay(22));
        assertEquals(22, dat1.getDay());
    }

    @Test
    void setYear() {
        Date dat1 = new Date(22,3,2003);
        assertDoesNotThrow(()-> dat1.setYear(2003));
        assertEquals(2003, dat1.getYear());
    }

    @Test
    void setMonth() {
        Date dat1 = new Date(22,3,2003);
        assertDoesNotThrow(()-> dat1.setMonth(3));
        assertEquals(3, dat1.getMonth());
    }

    @Test
    void setDate() {
        Date dat3 = new Date(22,3,2003);
        int newDay = 30;
        int newMonth = 1;
        int newYear = 2005;
        dat3.setDate(newDay,newMonth,newYear);
        assertEquals(30,dat3.getDay());
        assertEquals(1,dat3.getMonth());
        assertEquals(2005,dat3.getYear());
    }

    @Test
    void testToString() {
        Date datf = new Date(30,1,2003);
        Date a = new Date(2, 12, 1999);
        Date b = new Date(3, 4, 1999);
        String esperado = "30/1/2003";
        String supuesto = datf.toString();
        assertEquals(esperado,supuesto);
        assertEquals("02/12/1999", a.toString());
        assertEquals("03/04/1999", b.toString());
    }

}