package Cuaderno3.Ejercicio6.animal_y_subclases;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Animal[name=" + name + "]";
    }
}
