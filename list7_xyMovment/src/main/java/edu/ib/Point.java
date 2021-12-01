package edu.ib;

public class Point {
    private int x;
    private int y;
    private int i; //iteration after length = 100

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public double getLength(){
        return Math.sqrt(Math.abs(x+x) * Math.abs(y+y));
    }

    @Override
    public String toString() {
        return "[" + x + ", " + y + "]";
    }

    public void randomMovment2D(){
        int getDirection = (int) (Math.random()* (4 - 1 + 1) +1);
        if (getDirection == 1) this.y += 1;
        if (getDirection == 2) this.x += 1;
        if (getDirection == 3) this.y -= 1;
        if (getDirection == 4) this.x -= 1;
    }

    public void setI(int i){
        this.i = i;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getI() {
        return i;
    }
}
