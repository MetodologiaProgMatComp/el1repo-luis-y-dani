package Cuaderno3.Ejercicio6.animal_y_subclases;

// public class Dog extends AbstractAnimal{}
public class Dog extends Mammal{
    public Dog(String name) {
        super(name);
    }
    @Override

    public void greets() {
        System.out.println("Woof");
    }
    public void greets(Dog another) {
        System.out.println("Woooof");
    }
    @Override

    public String toString() {
        return "Dog[Mammal[Animal[name=" + getName() + "]]]";
    }
}
