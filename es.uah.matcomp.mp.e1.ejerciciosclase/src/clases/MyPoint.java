package es.uah.matcomp.mp.e1.ejerciciosclase.src.clases;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        int[] xy = new int[2];
        xy[0] = x;
        xy[1] = y;
        return xy;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "(" + x + "," + y + ")";
    }
    public double distance(int x, int y) {
        this.x = x;
        this.y = y;
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y,2));
    }
    public double distance(MyPoint another) {
        this.x = another.x;
        this.y = another.y;
        return Math.sqrt(Math.pow(another.x, 2) + Math.pow(another.y, 2));
    }
    public double distance() {
        return Math.sqrt(x*x + y*y);
    }
}
