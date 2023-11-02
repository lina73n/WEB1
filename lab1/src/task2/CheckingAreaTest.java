package task2;

import static org.junit.Assert.*;
import org.junit.Test;

public class CheckingAreaTest {

    @Test
    public void inAreaTest() {
        CheckingArea areaChecker = new CheckingArea(-2,0);
        boolean actual = areaChecker.isInArea();
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    public void outOfAreaTest() {
        CheckingArea areaChecker = new CheckingArea(8,1);
        boolean actual = areaChecker.isInArea();
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    public void onBorderAreaTest() {
        CheckingArea areaChecker = new CheckingArea(1,5);
        boolean actual = areaChecker.isInArea();
        boolean expected = true;
        assertEquals(expected, actual);
    }
}