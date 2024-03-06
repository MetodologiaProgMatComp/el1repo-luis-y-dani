package Cuaderno2.Ejercicio2.claseClienteFactura;

import Cuaderno2.Ejercicio2.claseClienteFactura.Customer;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @org.junit.jupiter.api.Test
    void getId() {
        Customer a = new Customer(2, "Dani", 4);
        assertEquals(2, a.getId(), "Este no era el ID que esperaba");
    }

    @org.junit.jupiter.api.Test
    void getName() {
        Customer a = new Customer(2, "Dani", 4);
        assertEquals("Dani", a.getName(), "Este no es el nombre que esperaba");
    }

    @org.junit.jupiter.api.Test
    void getDiscount() {
        Customer a = new Customer(2, "Dani", 4);
        assertEquals(4, a.getDiscount(), "Este no es el descuento que esperaba");
    }

    @org.junit.jupiter.api.Test
    void setDiscount() {
        Customer a = new Customer(2, "Dani", 50);
        assertDoesNotThrow(()-> a.setDiscount(50));
        assertEquals(50, a.getDiscount(), "Este no era el descuento que esperaba");
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Customer a = new Customer(2, "Dani", 4);
        assertEquals("Dani(2)(4%)", a.toString(), "Este no es el mensaje que esperaba");
    }
}