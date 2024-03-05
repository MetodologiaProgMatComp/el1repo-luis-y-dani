package es.uah.matcomp.mp.e1.ejerciciosclase.src.clases.SuperclaseAbstractaShape;

import static java.lang.Math.PI;

public class Circle extends Shape {
    protected double radius;
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

    @Override
    public double getArea() {
        return PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return 2*radius*PI;
    }

    @Override
    public String toString() {
        return "Circle["+super.toString()+", radius="+radius+"]";
    }
}

