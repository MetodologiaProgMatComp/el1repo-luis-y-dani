package clases;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    private double salaryWithPercent;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getName(){
        this.firstName = firstName;
        this.lastName = lastName;
        return (firstName + " " + lastName);
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public int getAnnualSalary(){
        this.salary = salary;
        return salary * 12;
    }
    public int raiseSalary(int percent){
        this.salaryWithPercent = salaryWithPercent;
        salaryWithPercent = (double) percent/100;
        return (int) (salary + (salary * salaryWithPercent));
    }
    public String toString(){
        return "clases.Employee[id=" + id + ",name=" + firstName + " " + lastName + ", salary=" + salary + "]";
    }
}
