package es.uah.matcomp.mp.e1.ejerciciosclase.src.clases.SuperclaseShape;
import static java.lang.Math.PI;
public class Circle extends Shape {
    private double radius;
    public Circle(){
        this.radius = 1.0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*PI*radius;
    }
    @Override
    public String toString() {
        return "Circle["+super.toString()+",radius="+radius+"]";
    }
}
