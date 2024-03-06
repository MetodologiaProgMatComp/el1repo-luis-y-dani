package es.uah.matcomp.mp.e1.ejerciciosclase.tests.java.clases.Author_BookTest;
import Cuaderno2.Ejercicio1.AuthorBook.Author;
import Cuaderno2.Ejercicio1.AuthorBook.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {
    @Test
    void getIsbn(){
        Author Luis = new Author("Luis", "luis@gmail.com");
        Book b1 = new Book("123", "CR7", Luis, 10.0);
        assertEquals(b1.getIsbn(), "123");
    }
    @Test
    void getName(){
        Author Luis = new Author("Luis", "luis@gmail.com");
        Book b1 = new Book("123", "CR7", Luis, 10.0);
        assertEquals(b1.getName(), "CR7");
    }
    @Test
    void getAuthor(){
        Author Luis = new Author("Luis", "luis@gmail.com");
        Book b1= new Book("123", "CR7", Luis, 10.0);
        assertEquals(b1.getAuthor(), Luis);
    }
    @Test
    void getPrice() {
        Author Luis = new Author("Luis","luis@gmail.com");
        Book b1 = new Book("123","CR7", Luis,10.0);
        assertEquals(b1.getPrice(), 10.00);
    }

    @Test
    void setPrice() {
        Author Luis = new Author("Luis","luis@gmail.com");
        Book b1 = new Book("123","CR7", Luis,10.0);
        b1.setPrice(20.0);
        assertEquals(b1.getPrice(), 20.0);
    }

    @Test
    void getQty() {
        Author Luis = new Author("Luis","luis@gmail.com");
        Book b1 = new Book("123","CR7", Luis,10.0);
        b1.setQty(10);
        assertEquals(b1.getQty(), 10);
    }

    @Test
    void setQty() {
        Author Luis = new Author("Luis","luis@gmail.com");
        Book b1 = new Book("123","CR7", Luis,10.0,20);
        b1.setQty(10);
        assertEquals(b1.getQty(), 10);
    }

    @Test
    void getAuthorName() {
        Author Luis = new Author("Luis","luis@gmail.com");
        Book b1 = new Book("123","CR7", Luis,10.0,20);
        assertEquals(b1.getAuthorName(),"Luis");
    }

    @Test
    void testToString() {
        Author Luis = new Author("Luis","luis@gmail.com");
        Book b1 = new Book("123","CR7", Luis,10.0,20);
        assertEquals(b1.toString(),"Book[isbn=123, name=CR7, Author[name=Luis, email=luis@gmail.com], price=10.0, qty=20]");
    }
}
