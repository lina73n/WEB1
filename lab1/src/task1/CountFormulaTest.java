package task1;

import junit.framework.Assert;
import org.junit.Test;

public class CountFormulaTest {

    @Test
    public void count() {
        CountFormula formula = new CountFormula(0,0);
        double actual = formula.count();
        double expected = 0.5;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void count1() {
        CountFormula formula = new CountFormula(-1,1);
        double actual = formula.count();
        double expected = -0.5;
        Assert.assertEquals(expected,actual);
    }
}