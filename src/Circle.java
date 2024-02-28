import static java.lang.Math.PI;

public class Circle {

    private double radious;

    public Circle() {
        radious = 1.0;
    }

    public Circle(double radious) {
        this.radious = radious;
    }

    public double getRadius() {
        return radious;
    }

    public void setRadius(double radious) {
        this.radious = radious;
    }

    public double getArea() {
        return PI * radious * radious;
    }

    public double getCircumference() {
        return 2*PI*radious;
    }

    public String toString() {
        return "Circle[radious=" + radious + "]";
    }


}


