package Cuaderno4.Ejercicio3.InterfazMovable;

import Cuaderno4.Ejercicio3.InterfazMovable.MovablePoint;
public class MainMovable {
    public static void main(String[] args){
        MovablePoint m1 = new MovablePoint(0, 0, 3, 3);
        System.out.println(m1);
        m1.moveUp();
        m1.moveRight();
        System.out.println(m1);
        MovablePoint m2 = new MovablePoint(4, 4, 1, 1);
        System.out.println(m2);
        m2.moveDown();
        m2.moveLeft();
        System.out.println(m2);
    }
}
