package Cuaderno4.Ejercicio4.InterfazMovable_point_circle;

public class MainMovableInterface {
    public static void main(String[] args){
        Movable p1 = new MovablePoint(1, 1, 3, 2);
        System.out.println(p1);
        p1.moveUp();
        p1.moveRight();
        System.out.println("P1 new position: "+p1);
        Movable p2 = new MovablePoint(4, 6, 2, 1);
        System.out.println(p2);
        p2.moveDown();
        p2.moveLeft();
        System.out.println("P2 new position: "+p2);
        Movable c1 = new MovableCircle(1, 1, 3, 2, 5);
        System.out.println(c1);
        c1.moveRight();
        c1.moveUp();
        System.out.println("C1 new position: "+c1);
        Movable c2 = new MovableCircle(7, 4, 1, 3, 2);
        System.out.println(c2);
        c2.moveLeft();
        c2.moveDown();
        System.out.println("C2 new position: "+c2);
    }
}
