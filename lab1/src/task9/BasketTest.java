package task9;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class BasketTest {

    @Test
    public void getWeight() {
        Basket testBasket = new Basket();
        testBasket.addBall(new Ball(Color.BLUE,12));
        testBasket.addBall(new Ball(Color.GREEN,1));
        testBasket.addBall(new Ball(Color.YELLOW,2));
        testBasket.addBall(new Ball(Color.BLUE,3));
        testBasket.addBall(new Ball(Color.BLUE,4));

        assertEquals(testBasket.getWeight(), 22);
        assertEquals(testBasket.getNumOfBlue(),3);
    }
}