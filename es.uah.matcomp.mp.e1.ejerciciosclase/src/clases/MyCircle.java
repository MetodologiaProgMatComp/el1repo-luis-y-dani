package es.uah.matcomp.mp.e1.ejerciciosclase.src.clases;

public class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle() {
        center = new MyPoint();
        radius = 1;
    }
    public MyCircle(int x, int y, int radius) {
        center = new MyPoint(x, y);
        this.radius = radius;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public int getCenterX() {
        return center.getX();
    }
    public void setCenterX(int x) {
        center.setX(x);
    }
    public int getCenterY() {
        return center.getY();
    }
    public void setCenterY(int y) {
        center.setY(y);
    }
    public int[] getCenterXY(int x, int y) {
        int[] xy = new int[2];
        xy[0] = center.getX();
        xy[1] = center.getY();
        return xy;
    }
    public void setCenterXY(int x, int y) {
        this.center.getX() = x;
        this.center.getY() = y;
    }
    public String toString() {
        return "MyCircle[radius=" + radius + ",center=" + center.toString() + "]";
    }
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
    public double distance(MyCircle another) {
        this.center = another.center;
        this.radius = another.radius;
        return
    }

}
