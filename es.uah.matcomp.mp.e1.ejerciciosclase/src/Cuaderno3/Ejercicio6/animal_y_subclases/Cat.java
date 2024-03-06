package Cuaderno3.Ejercicio6.animal_y_subclases;

// public class Cat extends AbstractAnimal{}
public class Cat extends Mammal{
    public Cat(String name) {
        super(name);
    }
    @Override

    public void greets() {
        System.out.println("Meow");
    }
    @Override

    public String toString() {
        return "Cat[Mammal[Animal[name=" + getName() + "]]]";
    }
}
