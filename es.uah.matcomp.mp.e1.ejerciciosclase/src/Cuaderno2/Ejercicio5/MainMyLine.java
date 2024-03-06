package Cuaderno2.Ejercicio5;
import Cuaderno2.Ejercicio4.MyPoint;
public class MainMyLine {
    public static void main(String[] args) {
        MyLine l1 = new MyLine(0, 0, 3, 3);
        System.out.println(l1);
        MyPoint p1 = new MyPoint(1, 2);
        System.out.println(p1);
        MyPoint p2 = new MyPoint(3, 4);
        MyLine l2 = new MyLine(p1, p2);
        System.out.println(l2);
        MyPoint p3 = new MyPoint(10, 20);
        MyPoint p4 = new MyPoint(30, 40);
        l1.setBegin(p3);
        l1.setEnd(p4);
        System.out.println("Begin is: "+l1.getBegin());
        System.out.println("End is: "+ l1.getEnd());
        l1.setBeginX(10);
        l2.setEndX(20);
        l1.setBeginY(30);
        l1.setEndY(40);
        System.out.println("Begin is: x="+l1.getBeginX()+", end="+l1.getEndX());
        System.out.println("End is: x="+ l1.getEndX()+", end="+l1.getEndY());
        l1.setBeginXY(100, 200);
        l1.setEndXY(300, 400);
        System.out.println(("Begin is"+l1.getBeginXY()+"End is:"+l1.getEndXY()));
        System.out.println("Length is: "+l1.getLength());
        System.out.println("Gradient is: "+l1.getGradient());
    }
}
