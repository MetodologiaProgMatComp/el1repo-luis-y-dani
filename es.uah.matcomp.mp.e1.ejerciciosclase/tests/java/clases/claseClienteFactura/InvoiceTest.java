package clases.claseClienteFactura;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    @Test
    void getId() {
        Customer a = new Customer(2, "Dani", 4);
        Invoice e = new Invoice(5, a, 4.9);
        assertEquals(5, e.getId(), "Este no era el ID esperado");
    }

    @Test
    void getCustomer() {
        Customer a = new Customer(2, "Dani", 4);
        Invoice e = new Invoice(5, a, 4.9);
        assertEquals(2, e.getCustomerId(), "Este no es el ID que esperaba");
        assertEquals("Dani", e.getCustomerName(), "Este no es el nombre que esperaba");
        assertEquals(4, e.getCustomerDiscount(), "Este no es el descuento que esperaba");
    }

    @Test
    void setCustomer() {
        Customer a = new Customer(2, "Dani", 4);
        Invoice e = new Invoice(5, a, 4.9);
        assertDoesNotThrow(()-> e.setCustomer(a));
        assertEquals(2, e.getCustomerId(), 2);
        assertEquals("Dani", e.getCustomerName(), "Este no era el nombre que se esperaba");
        assertEquals(4, e.getCustomerDiscount(), 4);

    }

    @Test
    void getAmount() {
        Customer a = new Customer(2, "Dani", 4);
        Invoice e = new Invoice(5, a, 4.9);
        assertEquals(4.9, e.getAmount(), "Esta no es la cantidad que esperaba");
    }

    @Test
    void setAmount() {
        Customer a = new Customer(2, "Dani", 4);
        Invoice e = new Invoice(5, a, 4.9);
        assertDoesNotThrow(()-> e.setAmount(4.9));
        assertEquals(4.9, e.getAmount(), 4.9);
    }

    @Test
    void getCustomerId() {
        Customer a = new Customer(2, "Dani", 4);
        Invoice e = new Invoice(5, a, 4.9);
        assertEquals(2, e.getCustomerId(), "Este no es el ID que esperaba");
    }

    @Test
    void getCustomerName() {
        Customer a = new Customer(2, "Dani", 4);
        Invoice e = new Invoice(5, a, 4.9);
        assertEquals("Dani", e.getCustomerName(), "Este no es el nombre que esperaba");
    }

    @Test
    void getCustomerDiscount() {
        Customer a = new Customer(2, "Dani", 4);
        Invoice e = new Invoice(5, a, 4.9);
        assertEquals(4, e.getCustomerDiscount(), "Este no es el descuento que esperaba");
    }

    @Test
    void getAmountAfterDiscount() {
        Customer a = new Customer(2, "Dani", 4);
        Invoice e = new Invoice(5, a, 4.9);
        assertEquals(4.704000000000001, e.getAmountAfterDiscount(), "Este no es el resultado que se esperaba");
    }

    @Test
    void testToString() {
        Customer a = new Customer(2, "Dani", 4);
        Invoice e = new Invoice(5, a, 4.9);
        assertEquals("Invoice[id=5,customer=Dani(2)(4%),amount=4.9]", e.toString(), "Este no es el mensaje que esperaba");
    }
}