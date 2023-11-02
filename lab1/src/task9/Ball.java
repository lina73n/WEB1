package task9;

import java.awt.*;

public class Ball {
    private Color color;
    private int weight;

    Ball(Color color, int weight){
        setColor(color);
        setWeight(weight);
    }
    Ball(int color, int weight){
        switch (color) {
            case 1 -> setColor(Color.BLUE);
            case 2 -> setColor(Color.RED);
            case 3 -> setColor(Color.YELLOW);
            default -> setColor(Color.GREEN);
        }
        setWeight(weight);
    }
    void setColor(Color color){
        this.color = color;
    }
    Color getColor(){
        return this.color;
    }
    void setWeight(int weight){
        this.weight = weight;
    }
    int getWeight(){
        return this.weight;
    }

}
