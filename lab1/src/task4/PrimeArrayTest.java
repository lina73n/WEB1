package task4;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static task4.PrimeArray.findPrimeNumbers;

public class PrimeArrayTest {

    @Test
    public void findPrimeNumbersTest() {
        List<Integer> expected = List.of(1, 2, 4, 6);
        List<Integer> actual = findPrimeNumbers(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        assertEquals(expected, actual);
    }

}