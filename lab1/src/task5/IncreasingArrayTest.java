package task5;

import org.junit.Test;

import static org.junit.Assert.*;
import static task5.IncreasingArray.count;

public class IncreasingArrayTest {
    @Test
    public void resCheck1() {
        int[] arr = new int[]{13, 12, 54, 36, 48, 11, 96, 57, 1};
        int result = count(arr.length,arr);
        int expected = 5;
        assertEquals(expected, result);
    }
    @Test
    public void resCheck2() {
        int[] arr = new int[]{};
        int result = count(arr.length,arr);
        int expected = 0;
        assertEquals(expected, result);
    }
}