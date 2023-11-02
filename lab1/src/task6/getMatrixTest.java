package task6;

import org.junit.Test;

import static org.junit.Assert.*;
import static task6.getMatrix.getMatrix;

public class getMatrixTest {

    @Test
    public void getMatrixTest1() {
        double[] arr = new double[]{1, 2, 3, 4};
        double[][] expectedArr = new double[][]{
                {1,2,3,4},
                {2,3,4,1},
                {3,4,1,2},
                {4,1,2,3}};
        double[][] actual = getMatrix(arr,4);
        assertArrayEquals(expectedArr,actual);
    }
    @Test
    public void getMatrixTest2() {
        double[] arr = new double[]{};
        double[][] expectedArr = new double[0][];
        double[][] actual = getMatrix(arr,0);
        assertArrayEquals(expectedArr,actual);
    }
}