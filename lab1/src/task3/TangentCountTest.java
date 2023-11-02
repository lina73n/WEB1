package task3;

import org.junit.Test;

import static org.junit.Assert.*;
import static task3.TangentCount.tg;

public class TangentCountTest {
    double e = 1e-5;
    @Test
    public void testFunc1() {
        double actual = tg(0);
        double expected = 0;
        assertEquals(expected, actual, e);
    }

    @Test
    public void testFunc2() {
        double actual = tg(1);
        double expected = Math.tan(1);
        assertEquals(expected, actual, e);
    }

    @Test
    public void testFunc3() {
        double actual = tg(-1);
        double expected = Math.tan(-1);
        assertEquals(expected, actual, e);
    }
}