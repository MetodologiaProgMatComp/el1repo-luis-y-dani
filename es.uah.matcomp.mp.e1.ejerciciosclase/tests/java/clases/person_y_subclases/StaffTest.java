package clases.person_y_subclases;

import Cuaderno3.Ejercicio2.person_y_subclases.Staff;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    @Test
    void getSchool() {
        Staff a = new Staff("Dani", "Calle jsdhhs", "Colegio 2", 3.4);
        assertEquals("Colegio 2", a.getSchool(), "Este no es el colegio que esperaba");
    }

    @Test
    void setSchool() {
        Staff a = new Staff("Dani", "Calle jsdhhs", "Colegio 2", 3.4);
        assertDoesNotThrow(()-> a.setSchool("Colegio 2"));
        assertEquals("Colegio 2", a.getSchool(), "Este no es el colegio que esperaba");
    }

    @Test
    void getPay() {
        Staff a = new Staff("Dani", "Calle jsdhhs", "Colegio 2", 3.4);
        assertEquals(3.4, a.getPay(), 3.4);
    }

    @Test
    void setPay() {
        Staff a = new Staff("Dani", "Calle jsdhhs", "Colegio 2", 3.4);
        assertDoesNotThrow(()-> a.setPay(3.4));
        assertEquals(3.4, a.getPay(), "Este no es el valor que esperaba");
    }

    @Test
    void testToString() {
        Staff a = new Staff("Dani", "Calle jsdhhs", "Colegio 2", 3.4);
        assertEquals("Staff[Person[name=Dani,address=Calle jsdhhs],school=Colegio 2,pay=3.4]", a.toString(), "Este no es el texto que esperaba");
    }
}