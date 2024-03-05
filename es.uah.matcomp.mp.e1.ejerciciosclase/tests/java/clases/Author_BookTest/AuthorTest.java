package es.uah.matcomp.mp.e1.ejerciciosclase.tests.java.clases.Author_BookTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AuthorTest {
    Author a1 = new clases.AuthorBook.Author("Luis", "luis@gmail.com");
    @Test
    void getName(){
        assertEquals(a1.getName(), "Luis");
    }
    @Test
    void getEmail(){
        assertEquals(a1.getEmail(), "luis@gmail.com");
    }
    @Test
    void setEmail(){
        a1.setEmail("luis@hotmail.com");
        assertEquals(a1.getEmail(), "luis@hotmail.com");
    }
    @Test
    void testToString(){
        Author a2 = new clases.AuthorBook.Author("Avila", "avila@gmail.com");
        assertEquals(a2.toString(), "Author[name=Avila, email=avila@gmail.com]");
    }
}
