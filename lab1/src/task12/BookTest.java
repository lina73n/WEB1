package task12;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class BookTest {
    private Book book1;
    private Book book2;
    private Book book3;

    public void setUp() {
        book1 = new Book("Title 1", "Author 1", 10, 1,"12vt");
        book2 = new Book("Title 2", "Author 1", 10, 1,"12vt");
        book3 = new Book("Title 2", "Author 1", 10, 1,"12vt");
    }

    @Test
    public void testToString() {
        setUp();
        String expectedString = "\"Title 1\", Author 1, 1, 10";
        assertEquals(expectedString, book1.toString());
    }

    @Test
    public void testEquals() {
        setUp();
        assertEquals(book2, book3);
        assertNotEquals(book1, book2);
    }

    @Test
    public void testHashCode() {
        setUp();
        assertEquals(book2.hashCode(),book3.hashCode());
        assertNotEquals(book1.hashCode(),book2.hashCode());
    }



    @Test
    public void sortTest(){
        List<Book> testListOfBooks = new ArrayList<>();
        testListOfBooks.add(new Book("Title 1", "Author 1", 10, 1,"12vt"));
        testListOfBooks.add(new Book("Title 1", "Author 1", 10, 1,"42vt"));
        testListOfBooks.add(new Book("Title 1", "Author 1", 10, 1,"12at"));

        Collections.sort(testListOfBooks);

        assertEquals(testListOfBooks.get(0).getIsbn(),"12at");
        assertEquals(testListOfBooks.get(1).getIsbn(),"12vt");
        assertEquals(testListOfBooks.get(2).getIsbn(),"42vt");

    }
}