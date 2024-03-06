package Cuaderno2.Ejercicio3.claseClientePrueba;

public class Customer {
    private int id;
    private String name;
    private char gender = 'f' | 'm';
    public Customer(int i, String n, char g){
        this.id = i;
        this.name = n;
        this.gender = g;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }
    public String toString(){
        return name + "("+id+")";
    }
}
