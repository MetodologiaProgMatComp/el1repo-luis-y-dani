package Cuaderno4.Ejercicio2.Interfaz_GeometricObject;

public class MainGeometricObject {
    public static void main(String[] args){
        GeometricObject c1 = new Circle(2.0);
        System.out.println(c1);
        System.out.println("Area= "+c1.getArea());
        System.out.println("Perimeter= "+c1.getPerimeter());
        GeometricObject s1 = new Rectangle(4.0, 2.0);
        System.out.println(s1);
        System.out.println("Area =" + s1.getArea());
        System.out.println("Perimeter ="+s1.getPerimeter());
    }

}
