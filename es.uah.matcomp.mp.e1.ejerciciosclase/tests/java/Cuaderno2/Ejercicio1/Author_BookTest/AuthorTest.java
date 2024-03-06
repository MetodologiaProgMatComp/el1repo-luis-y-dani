package Cuaderno2.Ejercicio1.Author_BookTest;
import Cuaderno2.Ejercicio1.AuthorBook.Author;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AuthorTest {
    Author a1 = new Author("Luis", "luis@gmail.com");
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
        Author a2 = new Author("Avila", "avila@gmail.com");
        assertEquals( "Author[name=Avila,email=avila@gmail.com]",a2.toString());
    }
}
