package task13;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProgrammerBookTest {

    @Test
    public void testEquals() {
        ProgrammerBook book1 = new ProgrammerBook("Java Programming","John Doe",10,1,"12vt","Java",2);

        ProgrammerBook book2 = new ProgrammerBook("Python Programming","Jane Smith",10,1,"12vt","Java",2);

        ProgrammerBook book3 = new ProgrammerBook("Java Programming","John Doe",10,1,"12vt","Java",2);

        assertEquals(book1, book3);
        assertNotEquals(book1, book2);
    }

    @Test
    public void testToString() {
        ProgrammerBook book = new ProgrammerBook("Java Programming","John Doe",10,1,"12vt","Java",2);

        String expected = "\"Java Programming\", John Doe, 1, 10 (Java, 2) ";
        assertEquals(expected, book.toString());
    }

    @Test
    public void testHashCode() {
        ProgrammerBook book1 = new ProgrammerBook("Java Programming","John Doe",10,1,"12vt","Java",2);

        ProgrammerBook book2 = new ProgrammerBook("Java Programming","John Doe",10,1,"12vt","Java",2);

        assertEquals(book1.hashCode(), book2.hashCode());
    }
}