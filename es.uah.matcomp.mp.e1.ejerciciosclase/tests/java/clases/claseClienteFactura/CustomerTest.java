package clases.claseClienteFactura;

import org.junit.jupiter.api.Test;

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
        assertDoesNotThrow(()-> a.getDiscount());
        assertEquals(50, a.setDiscount(50), 50);
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Customer a = new Customer(2, "Dani", 4);
        assertEquals("Dani(2)(4%)", a.toString(), "Este no es el mensaje que esperaba");
    }
}