package task9;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

public class BallTest {

    @Test
    public void getBallColorAndWeight() {
        Ball testBall = new Ball(Color.BLUE, 13);
        assertEquals(testBall.getWeight(),13);
        assertEquals(testBall.getColor(),Color.BLUE);
    }

}