package clases.animal_y_subclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void greets() {

    }

    @Test
    void testToString() {
        Cat a = new Cat("Daisy");
        assertEquals("Cat[Mammal[Animal[name=Daisy]]]", a.toString(), "Este no es el texto que esperaba");
    }
}