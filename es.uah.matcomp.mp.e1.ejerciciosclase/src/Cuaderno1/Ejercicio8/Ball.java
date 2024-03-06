package Cuaderno1.Ejercicio8;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x1, float y1, int radius1, float xDelta1, float yDelta1) {
        x=x1;
        y=y1;
        radius=radius1;
        xDelta=xDelta1;
        yDelta=yDelta1;
    }
    public String toString(){
        return "Ball [("+x+","+y+"), speed=("+xDelta+","+yDelta+")]";
    }
    public float setX(float x) {
        this.x = x;
        return x;
    }

    public float setY(float y) {
        this.y = y;
        return y;
    }

    public int setRadius(int radius) {
        this.radius = radius;
        return radius;
    }

    public float setXDelta(float xDelta) {
        this.xDelta = xDelta;
        return xDelta;
    }

    public float setYDelta(float yDelta) {
        this.yDelta = yDelta;
        return yDelta;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }

    public float getXDelta() {
        return xDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void move() {
        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal() {
        xDelta = -xDelta;

    }

    public void reflectVertical() {
        yDelta = -yDelta;
    }
}
