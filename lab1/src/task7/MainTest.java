package task7;

import org.junit.Test;

import java.util.Arrays;

import static java.util.Arrays.sort;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void sortCheckTest() {
        double[] arr = new double[] {5, -4, 0, 13, -6, 14, 2};
        double[] expected = new double[] {-6, -4, 0, 2, 5, 13, 14};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            assertEquals(arr[i], expected[i], 0.01);
        }
    }
}