package Cuaderno4.Ejercicio5.InterfazResizable_GeometricObject;

public class MainResizable_GeometricObject {
    public static void main(String[] args){
        GeometricObject c1 = new Circle(4);
        System.out.println(c1);
        System.out.println("Area= "+c1.getArea());
        System.out.println("Perimeter= "+c1.getPerimeter());
        Resizable c2 = new ResizableCircle(2);
        System.out.println(c2);
        c2.Resize(50);
        System.out.println("C2 new size:" + c2);
    }
}
