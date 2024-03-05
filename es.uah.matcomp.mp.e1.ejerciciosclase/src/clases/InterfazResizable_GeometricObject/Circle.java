package clases.InterfazResizable_GeometricObject.*;

public class Circle implements es.uah.matcomp.mp.e1.ejerciciosclase.src.clases.InterfazResizable_GeometricObject.GeometricObject {
    protected double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public String toString(){
        return "Circle[radius= "+ radius+"]";
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
