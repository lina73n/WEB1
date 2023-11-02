package task8;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
import static task8.Main.newSequence;

public class MainTest {

    @Test
    public void findIndexesTest() {
        int[] a = {2,4,6,8};
        int[] b = {1,3,7};
        List<Integer> res = newSequence(a,b,a.length,b.length);
        int[] expectedRes = new int[]{0,1,3};

        assertEquals(expectedRes.length, res.size());
        assertEquals(expectedRes[0], (int)res.get(0));
        assertEquals(expectedRes[1], (int)res.get(1));
        assertEquals(expectedRes[2], (int)res.get(2));
    }
    @Test
    public void ifArrayEmptyTest() {
        int[] a = {};
        int[] b = {3,5,7};
        List<Integer> res = newSequence(a,b,a.length,b.length);
        int[] expectedRes = new int[]{0,0,0};

        assertEquals(expectedRes.length, res.size());
        assertEquals(expectedRes[0], (int)res.get(0));
        assertEquals(expectedRes[1], (int)res.get(1));
        assertEquals(expectedRes[2], (int)res.get(2));
    }
    @Test
    public void ifArrayOutOfBoardersTest() {
        int[] a = {4,6,8};
        int[] b = {3,9};
        List<Integer> res = newSequence(a,b,a.length,b.length);
        int[] expectedRes = new int[]{0,3};

        assertEquals(expectedRes.length, res.size());
        assertEquals(expectedRes[0], (int)res.get(0));
        assertEquals(expectedRes[1], (int)res.get(1));
    }
}