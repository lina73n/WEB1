package task12;

import org.junit.Test;


import java.util.Arrays;
import java.util.Random;


import static org.junit.Assert.*;

public class ComparableTest {
    @Test
    public void TaskFifteenCheck() {
        Random isbnGenerator = new Random();
        Book[] booksArray = new Book[10];

        for (int i = 0; i < booksArray.length; i++) {
            booksArray[i] = new Book(isbnGenerator.toString());
        }
        Arrays.sort(booksArray);

        for (int i = 0; i < booksArray.length-1; i++) {
            assertTrue(booksArray[i + 1].getIsbn().compareTo(booksArray[i].getIsbn()) >= 0);
        }

    }
}
