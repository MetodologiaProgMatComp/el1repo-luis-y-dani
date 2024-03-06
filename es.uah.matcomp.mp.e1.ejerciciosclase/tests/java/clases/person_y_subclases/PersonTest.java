package clases.person_y_subclases;

import Cuaderno3.Ejercicio2.person_y_subclases.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void getName() {
        Person a = new Person("Dani", "Calle ujsdfs");
        assertEquals("Dani", a.getName(), "Este no era le nombre que esperaba");
    }

    @Test
    void getAddress() {
        Person a = new Person("Dani", "Calle ujsdfs");
        assertEquals("Calle ujsdfs", a.getAddress(), "Esta no era la dirección que esperaba");
    }

    @Test
    void setAddress() {
        Person a = new Person("Dani", "Calle ujsdfs");
        assertDoesNotThrow(()-> a.setAddress("Calle ujsdfs"));
        assertEquals("Calle ujsdfs", a.getAddress(), "Esta no es la dirección que esperaba");
    }

    @Test
    void testToString() {
        Person a = new Person("Dani", "Calle ujsdfs");
        assertEquals("Person[name=Dani, address=Calle ujsdfs]", a.toString(), "Este no es el texto que esperaba");
    }
}