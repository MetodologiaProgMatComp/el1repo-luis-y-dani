package es.uah.matcomp.mp.e1.ejerciciosclase.tests.java.clases;
import clases.InvoiceItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceItemTest {
    @Test
    void getId() {
        InvoiceItem a = new InvoiceItem("B000", "penBlue", 1, 2);
        assertEquals("A", a.getId());
    }
    @Test
    void getDesc(){
        InvoiceItem a = new clases.InvoiceItem("B000", "penBlue", 1, 2);
        assertEquals("penBlue", a.getDesc());
    }
    @Test
    void getQty(){
        InvoiceItem a = new clases.InvoiceItem("B000", "penBlue", 1, 2);
        assertEquals(1, a.getQty());
    }
    @Test
    void getUnitPrice(){
        InvoiceItem a = new clases.InvoiceItem("B000", "penBlue", 1, 2);
        assertEquals(2, a.getUnitPrice());
    }
    @Test
    void setQty() {
        InvoiceItem a = new InvoiceItem("B000", "penBlue", 1, 2);
        assertDoesNotThrow(() -> a.setQty(10));
        int b = a.getQty();
        assertEquals(20, b);
    }
    @Test
    void setUnitPrice(){
        InvoiceItem a = new clases.InvoiceItem("B000", "penBlue", 1, 2);
        assertDoesNotThrow(() -> a.setUnitPrice(3));
        double b = a.getUnitPrice();
        assertEquals(3, b);
    }
    @Test
    void getTotal(){
        InvoiceItem a = new clases.InvoiceItem("B000", "penBlue", 1, 2);
        double b = a.getTotal();
        assertEquals(4, b);
    }
    void testToString(){
        InvoiceItem a = new clases.InvoiceItem("B000", "penBlue", 1, 2);
        assertEquals("InvoiceItem[ID=B000, desc=penBlue, qty=1, unitPrice=2]", a.toString());
    }
}




