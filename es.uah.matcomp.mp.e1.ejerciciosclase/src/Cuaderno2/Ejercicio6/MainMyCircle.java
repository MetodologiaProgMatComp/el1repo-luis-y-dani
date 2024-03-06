package Cuaderno2.Ejercicio6;

import Cuaderno2.Ejercicio4.MyPoint;

import java.util.Arrays;

public class MainMyCircle {
    public static void main(String[] args){
    MyCircle c1 = new MyCircle();
    System.out.println(c1);
    MyCircle c2 = new MyCircle(1, 2, 3);
    System.out.println(c2);
    MyPoint p1 = new MyPoint(1,2);
    MyCircle c3 = new MyCircle(p1, 2);
    System.out.println(c3);
    c3.setRadius(4);
    System.out.println("Radius= " +c3.getRadius());
    MyPoint p2 = new MyPoint(2, 5);
    c3.setCenter(p2);
    System.out.println("Center= "+c3.getCenter());
    c3.setCenterX(10);
    c3.setCenterY(20);
    System.out.println("Center is: x= "+c3.getCenterX() +", y= "+ c3.getCenterY());
    c3.setCenterXY(30, 40);
    System.out.println("Center= "+ Arrays.toString(c3.getCenterXY()));
    System.out.println("Area= "+c3.getArea());
    System.out.println("Circumference= "+c3.getCircumference());
    System.out.println("Distance to other circle = "+c3.distance(c2));



}
}