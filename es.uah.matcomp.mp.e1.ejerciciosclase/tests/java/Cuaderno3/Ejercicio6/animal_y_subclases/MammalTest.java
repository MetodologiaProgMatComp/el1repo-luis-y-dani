package Cuaderno3.Ejercicio6.animal_y_subclases;

import Cuaderno3.Ejercicio6.animal_y_subclases.Mammal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MammalTest {

    @Test
    void greets() {
    }

    @Test
    void testToString() {
        Mammal a = new Mammal("Daisy");
        assertEquals("Mammal[Animal[name=Daisy]]", a.toString(), "Este no es el texto que esperaba");
    }
}