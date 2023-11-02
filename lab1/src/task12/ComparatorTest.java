package task12;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class ComparatorTest {
    @Test
    public void testTitleComparator() {
        List<Book> books = new ArrayList<Book>();

        books.add(new Book("3", "3", 10, 1, "12vt"));
        books.add(new Book("1", "1", 10, 1, "12vt"));
        books.add(new Book("2", "2", 10, 1, "12vt"));

        books.sort(new BookTitleComparator());

        assertEquals("1", books.get(0).getTitle());
        assertEquals("2", books.get(1).getTitle());
        assertEquals("3", books.get(2).getTitle());
    }

    @Test
    public void testTitleAuthorComparator() {
        List<Book> books = new ArrayList<Book>();

        books.add(new Book("3", "3", 10, 1, "12vt"));
        books.add(new Book("1", "1", 10, 1, "12vt"));
        books.add(new Book("2", "2", 10, 1, "12vt"));
        books.add(new Book("3", "2", 10, 1, "12vt"));

        books.sort(new BookTitleThenAuthorComparator());

        assertEquals("1", books.get(0).getTitle());
        assertEquals("1", books.get(0).getAuthor());

        assertEquals("2", books.get(1).getTitle());
        assertEquals("2", books.get(1).getAuthor());

        assertEquals("3", books.get(2).getTitle());
        assertEquals("2", books.get(2).getAuthor());

        assertEquals("3", books.get(3).getTitle());
        assertEquals("3", books.get(3).getAuthor());

    }

    @Test
    public void testAuthorTitleComparator() {
        List<Book> books = new ArrayList<Book>();

        books.add(new Book("3", "3", 10, 1, "12vt"));
        books.add(new Book("1", "1", 10, 1, "12vt"));
        books.add(new Book("2", "1", 10, 1, "12vt"));
        books.add(new Book("3", "2", 10, 1, "12vt"));

        books.sort(new BookAuthorThenTitleComparator());

        assertEquals("1", books.get(0).getAuthor());
        assertEquals("1", books.get(0).getTitle());

        assertEquals("1", books.get(1).getAuthor());
        assertEquals("2", books.get(1).getTitle());

        assertEquals("2", books.get(2).getAuthor());
        assertEquals("3", books.get(2).getTitle());

        assertEquals("3", books.get(3).getAuthor());
        assertEquals("3", books.get(3).getTitle());
    }

    @Test
    public void testAuthorTitlePriceComparator() {
        List<Book> books = new ArrayList<Book>();

        books.add(new Book("2", "1", 30, 1, "12vt"));
        books.add(new Book("1", "1", 10, 1, "12vt"));
        books.add(new Book("2", "1", 20, 1, "12vt"));
        books.add(new Book("3", "2", 10, 1, "12vt"));

        books.sort(new BookAuthorTitlePriceComparator());

        assertEquals("1", books.get(0).getAuthor());
        assertEquals("1", books.get(0).getTitle());
        assertEquals(10, books.get(0).getPrice());

        assertEquals("1", books.get(1).getAuthor());
        assertEquals("2", books.get(1).getTitle());
        assertEquals(20, books.get(1).getPrice());

        assertEquals("1", books.get(2).getAuthor());
        assertEquals("2", books.get(2).getTitle());
        assertEquals(30, books.get(2).getPrice());

        assertEquals("2", books.get(3).getAuthor());
        assertEquals("3", books.get(3).getTitle());
        assertEquals(10, books.get(3).getPrice());

    }
}
