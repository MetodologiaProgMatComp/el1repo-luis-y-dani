package java.clases;
import Cuaderno1.Ejercicio3.Employee;

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
        assertEquals(12000, e.getAnnualSalary(), 12000);
    }

    @org.junit.jupiter.api.Test
    void raiseSalary() {
        Employee e = new Employee(4, "Dani", "Luque", 1000);
        assertDoesNotThrow(()-> e.raiseSalary(10));
        assertEquals(100, e.raiseSalary(10), "Este no era el salario que esperaba");
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Employee e = new Employee(4, "Dani", "Luque", 1000);
        assertEquals("Employee[id=4,name=Dani Luque,salary=1000]", e.toString(), "Esto no era el strign que esperaba");
    }
}