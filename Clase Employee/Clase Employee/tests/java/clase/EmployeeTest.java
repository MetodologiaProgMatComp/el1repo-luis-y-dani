package clase;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @org.junit.jupiter.api.Test
    void getId() {
        Employee e = new Employee(4, "Dani", "Luque", 1000);
        assertEquals(4, e.getId(), 4);
    }

    @org.junit.jupiter.api.Test
    void getFirstName() {
        Employee e = new Employee(4, "Dani", "Luque", 1000);
        assertEquals("Dani", e.getFirstName(), "No es el nombre por defecto");
    }

    @org.junit.jupiter.api.Test
    void getLastName() {
        Employee e = new Employee(4, "Dani", "Luque", 1000);
        assertEquals("Luque", e.getLastName(), "Este no es el apellido por defecto");
    }

    @org.junit.jupiter.api.Test
    void getName() {
        Employee e = new Employee(4, "Dani", "Luque", 1000);
        assertEquals("Dani Luque", e.getName(), "Esteno es el nombre completo por defecto");
    }

    @org.junit.jupiter.api.Test
    void getSalary() {
        Employee e = new Employee(4, "Dani", "Luque", 1000);
        assertEquals(1000, e.getSalary(), 1000);
    }

    @org.junit.jupiter.api.Test
    void setSalary() {
        Employee e = new Employee(4, "Dani", "Luque", 1000);
        assertDoesNotThrow(() -> e.setSalary(1000));
        assertEquals(1000, e.getSalary(), 1000);
    }

    @org.junit.jupiter.api.Test
    void getAnnualSalary() {
        Employee e = new Employee(4, "Dani", "Luque", 1000);
        assertEquals(11988, e.getAnnualSalary(), 11988);
    }

    @org.junit.jupiter.api.Test
    void raiseSalary() {
        Employee e = new Employee(4, "Dani", "Luque", 1000);
        assertEquals(1098, e.raiseSalary(), 1098);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Employee e = new Employee(4, "Dani", "Luque", 1000);
        assertEquals("Employee[id=8,name=Peter Tan, salary=2500]", e.toString(), "Este no es el mensaje que debería de aparecer");
    }
}