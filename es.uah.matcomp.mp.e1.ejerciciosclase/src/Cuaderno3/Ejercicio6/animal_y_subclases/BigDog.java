package Cuaderno3.Ejercicio6.animal_y_subclases;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override

    public void greets() {
        System.out.println("Wooow");
    }

    @Override

    public void greets(Dog another) {
        System.out.println("Woooooow");
    }

    public void greets(BigDog another) {
        System.out.println("Wooooooooooooow");
    }
}
