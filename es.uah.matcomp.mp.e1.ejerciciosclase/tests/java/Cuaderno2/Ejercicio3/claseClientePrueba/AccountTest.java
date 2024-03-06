package Cuaderno2.Ejercicio3.claseClientePrueba;

import Cuaderno2.Ejercicio3.claseClientePrueba.Account;
import Cuaderno2.Ejercicio3.claseClientePrueba.Customer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getId() {
        Customer c = new Customer(23, "Dani", 'h');
        Account a = new Account(34, c);
        assertEquals(34, a.getId(), 34);
    }

    @Test
    void getCustomer() {
        Customer c = new Customer(23, "Dani", 'h');
        Account a = new Account(34, c);
        assertEquals(c, a.getCustomer(), "Este no es el valor que esperaba");
    }

    @Test
    void getBalance() {
        Customer c = new Customer(23, "Dani", 'h');
        Account a = new Account(34, c, 65.5);
        assertEquals(65.5, a.getBalance(), 65.5);
    }

    @Test
    void setBalance() {
        Customer c = new Customer(23, "Dani", 'h');
        Account a = new Account(34, c, 65.5);
        assertDoesNotThrow(()-> a.setBalance(65.5));
        assertEquals(65.5, a.getBalance(), "Este no es el valor que esperaba");
    }

    @Test
    void testToString() {
        Customer c = new Customer(23, "Dani", 'h');
        Account a = new Account(34, c, 65.5);
        assertEquals("Dani(23)balance = $65.5", a.toString(), "Este no era el texto que esperaba");
    }

    @Test
    void getCustomerName() {
        Customer c = new Customer(23, "Dani", 'h');
        Account a = new Account(34, c, 65.5);
        assertEquals("Dani", a.getCustomerName(), "Este no es el nombre del cliente que esperaba");
    }

    @Test
    void deposit() {
        Customer c = new Customer(23, "Dani", 'h');
        Account a = new Account(34, c, 65.5);
        assertDoesNotThrow(()-> a.Deposit(50));
        assertEquals(115.5, a.getBalance(), "Este no es el balance que esperaba");
    }

    @Test
    void withdraw() {
        Customer c = new Customer(23, "Dani", 'h');
        Account a = new Account(34, c, 15.5);
        Account b = new Account(12, c, 54);
        assertDoesNotThrow(()-> a.Withdraw(50));
        assertDoesNotThrow(()-> b.Withdraw(50));
        assertEquals(-34.5, a.getBalance(), "Este no es el balance que esperaba");
        assertEquals(54.0, b.getBalance(), "Este no es el balance que esperaba");
    }
}