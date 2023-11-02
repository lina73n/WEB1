package task2;

public class CheckingArea {
    private int x;
    private int y;
    CheckingArea(int x, int y){
        this.x = x;
        this.y = y;
    }
    public boolean isInArea(){
        return (x <= 4 && x >= -4 && y >= 0 && y <= 5)||(x <= 6 && x >= -6 && y >= -3 && y <= 0);
    }
}
