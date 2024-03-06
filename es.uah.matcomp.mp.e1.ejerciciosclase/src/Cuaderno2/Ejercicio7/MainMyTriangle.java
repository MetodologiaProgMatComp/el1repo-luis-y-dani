package Cuaderno2.Ejercicio7;
import Cuaderno2.Ejercicio4.MyPoint;
public class MainMyTriangle {
    public static void main(String[] args){
        MyTriangle t1 = new MyTriangle(2, 0, 4, 0, 3, 2);
        System.out.println(t1);
        MyPoint p1 = new MyPoint(1, 0);
        MyPoint p2 = new MyPoint(3, 0);
        MyPoint p3 = new MyPoint(2, 2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        MyTriangle t2 = new MyTriangle(p1, p2, p3);
        System.out.println(t2);
        System.out.println("Perimeter= "+t2.getPerimeter());
        System.out.println("Type= "+t2.getType());
    }
}
