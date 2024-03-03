package clases.animal_y_subclases;

public class Mammal extends Animal{
    public Mammal(String name) {
        super(name);
    }
    @Override

    public String toString() {
        return "Mammal[Animal[name=" +  + "]]";
    }
}
