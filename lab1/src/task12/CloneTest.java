package task12;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

public class CloneTest {
    @Test
    public void testClone() throws CloneNotSupportedException {
        Book originalBook = new Book("Sample Title", "Sample Author", 20, 1, "123t");

        Book clonedBook = (Book) originalBook.clone();

        assertNotSame(originalBook, clonedBook);

        assertEquals(originalBook.getTitle(), clonedBook.getTitle());
        assertEquals(originalBook.getAuthor(), clonedBook.getAuthor());
        assertEquals(originalBook.getPrice(), clonedBook.getPrice());
        assertEquals(originalBook.getEdition(), clonedBook.getEdition());
        assertEquals(originalBook.getIsbn(), clonedBook.getIsbn());
    }
}
