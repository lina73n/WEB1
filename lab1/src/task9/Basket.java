package task9;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Ball> balls;
    Basket(int num){
        balls = new ArrayList<>();
        for (int i = 0; i < num; i++){
            addBall(new Ball((int) (Math.random() * 3) + 1,(int) (Math.random() * 6) + 1));
        }
    }
    Basket(){
        balls = new ArrayList<>();
    }
    public void addBall(Ball ball){
        balls.add(ball);
    }
    int getWeight(){
        int res = 0;
        for (Ball ball:balls) {
            res += ball.getWeight();
        }
        return res;
    }
    int getNumOfBlue(){
        int res = 0;
        for (Ball ball:balls) {
            if(ball.getColor().equals(Color.BLUE))
                res++;
        }
        return res;
    }
}
