package Cuaderno2.Ejercicio3.claseClientePrueba;

import Cuaderno2.Ejercicio3.claseClientePrueba.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getId() {
        Customer a = new Customer(34, "Dani",'f');
        assertEquals(34, a.getId(), 34);
    }

    @Test
    void getName() {
        Customer a = new Customer(34, "Dani",'f');
        assertEquals("Dani", a.getName(), "Este no es el nombre que esperaba");
    }

    @Test
    void getGender() {
        Customer a = new Customer(34, "Dani",'f');
        assertEquals('f', a.getGender(), "Este no es el género que se esperaba");
    }

    @Test
    void testToString() {
        Customer a = new Customer(34, "Dani",'f');
        assertEquals("Dani(34)", a.toString(), "Este no es el texto que esperaba");
    }
}