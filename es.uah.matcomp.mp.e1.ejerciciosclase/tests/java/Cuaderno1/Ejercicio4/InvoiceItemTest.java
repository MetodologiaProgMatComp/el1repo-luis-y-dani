package Cuaderno1.Ejercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {
    @Test
    void getId() {
        InvoiceItem a = new InvoiceItem("A101", "penBlue", 1, 2);
        assertEquals("A101", a.getId());
    }
    @Test
    void getDesc(){
        InvoiceItem a = new InvoiceItem("B000", "Pen Red", 1, 2);
        assertEquals("Pen Red", a.getDesc());
    }
    @Test
    void getQty(){
        InvoiceItem a = new InvoiceItem("B000", "penBlue", 1, 2);
        assertEquals(1, a.getQty());
    }
    @Test
    void getUnitPrice(){
        InvoiceItem a = new InvoiceItem("B000", "penBlue", 1, 2);
        assertEquals(2, a.getUnitPrice());
    }
    @Test
    void setQty() {
        InvoiceItem a = new InvoiceItem("B000", "penBlue", 10, 2);
        assertDoesNotThrow(() -> a.setQty(10));
        int b = a.getQty();
        assertEquals(10, b);
    }
    @Test
    void setUnitPrice(){
        InvoiceItem a = new InvoiceItem("B000", "penBlue", 1, 2);
        assertDoesNotThrow(() -> a.setUnitPrice(3));
        double b = a.getUnitPrice();
        assertEquals(3, b);
    }
    @Test
    void getTotal(){
        InvoiceItem a = new InvoiceItem("B000", "penBlue", 1, 2);
        double b = a.getTotal();
        assertEquals(2.0, b);
    }
    void testToString(){
        InvoiceItem a = new InvoiceItem("A101", "Pen Red", 10, 2.0);
        assertEquals("InvoiceItem[id=A101,desc=Pen Red,qty=10,unitPrice=2.0]", a.toString());
    }

}