package clases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getID() {
        Account e = new Account("7346", "Dani", 65);
        assertEquals("7346", e.getID(), "Esta no es la identificación que debía de salir.");
    }

    @Test
    void getName() {
        Account e = new Account("7346", "Dani");
        assertEquals("Dani", e.getName(), "Este no es el nombre que debería de salir");
    }

    @Test
    void getBalance() {
        Account e = new Account("7346", "Dani", 65);
        assertEquals(65, e.getBalance(), 65);
    }

    @Test
    void credit() {
        Account e = new Account("7346", "Dani", 65);
        assertDoesNotThrow(() -> e.credit(50));
        assertEquals(115, e.credit(50), 115);
    }

    @Test
    void debit() {
        Account e = new Account("7346", "Dani", 65);

        assertDoesNotThrow(()-> e.debit(50));
        assertEquals(15, e.debit(50), 15);
    }

    @Test
    void transferTo() {
        Account e = new Account("7346", "Dani", 65);

        assertDoesNotThrow(()-> e.transferTo(e, 50));
        assertEquals(15, e.transferTo(e, 50), 15);
    }

    @Test
    void testToString() {
        Account e = new Account("7346", "Dani", 65);
        assertEquals("Account[id=7346,name=Dani,balance=65]", e.toString(), "Este no es el mensaje que debía aparecer");
    }
}
