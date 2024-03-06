package Cuaderno3.Ejercicio2.person_y_subclases;

import Cuaderno3.Ejercicio2.person_y_subclases.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getProgram() {
        Student a = new Student("Dani", "Calle ehhd", "Programa 3", 2015, 50.5);
        assertEquals("Programa 3", a.getProgram(), "Este no es el programa que esperaba");
    }

    @Test
    void setProgram() {
        Student a = new Student("Dani", "Calle ehhd", "Programa 3", 2015, 50.5);
        assertDoesNotThrow(()-> a.setProgram("Programa 3"));
        assertEquals("Programa 3", a.getProgram(), "Este no es el programa que esperaba");
    }

    @Test
    void getYear() {
        Student a = new Student("Dani", "Calle ehhd", "Programa 3", 2015, 50.5);
        assertEquals(2015, a.getYear(), 2015);
    }

    @Test
    void setYear() {
        Student a = new Student("Dani", "Calle ehhd", "Programa 3", 2015, 50.5);
        assertDoesNotThrow(()-> a.setYear(2015));
        assertEquals(2015, a.getYear(), "Este no es el año que esperaba");
    }

    @Test
    void getFee() {
        Student a = new Student("Dani", "Calle ehhd", "Programa 3", 2015, 50.5);
        assertEquals(50.5, a.getFee(), 50.5);
    }

    @Test
    void setFee() {
        Student a = new Student("Dani", "Calle ehhd", "Programa 3", 2015, 50.5);
        assertDoesNotThrow(()-> a.setFee(50.5));
        assertEquals(50.5, a.getFee(), "Este no era el valor que esperaba");
    }

    @Test
    void testToString() {
        Student a = new Student("Dani", "Calle ehhd", "Programa 3", 2015, 50.5);
        assertEquals("Student[Person[name=Dani,address=Calle ehhd],program=Programa 3,year=2015,fee=50.5]", a.toString(), "Este no es el texto que esperaba");
    }
}