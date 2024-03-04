package clases.animal_y_subclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void getName() {
        Animal a = new Animal("Daisy");
        assertEquals("Dani", a.getName(), "Este no es el nombre que esperaba");
    }

    @Test
    void setName() {
        Animal a = new Animal("Daisy");
        assertDoesNotThrow(()-> a.setName("Daisy"));
        assertEquals("Daisy", a.getName(), "Este no es el nombre que esperaba");
    }

    @Test
    void testToString() {
        Animal a = new Animal("Daisy");
        assertEquals("Animal[name=Daisy]", a.toString(), "Este no es el texto que esperaba");
    }
}