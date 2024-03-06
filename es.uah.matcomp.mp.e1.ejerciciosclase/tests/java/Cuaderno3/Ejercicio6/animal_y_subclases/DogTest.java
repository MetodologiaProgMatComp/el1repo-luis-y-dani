package Cuaderno3.Ejercicio6.animal_y_subclases;

import Cuaderno3.Ejercicio6.animal_y_subclases.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void greets() {
    }

    @Test
    void testGreets() {
    }

    @Test
    void testToString() {
        Dog a = new Dog("Daisy");
        assertEquals("Dog[Mammal[Animal[name=Daisy]]]", a.toString(), "Este no es el texto que esperaba");
    }
}