package es.uah.matcomp.mp.e1.ejerciciosclase.src.clases.claseClientePrueba;

public class Account {
    private int id;
    private Customer customer;
    private double balance = 0.0;
    public Account(int id, Customer customer, double balance){
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }
    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }
    public int getId(){
        return id;
    }
    public Customer getCustomer(){
        return customer;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public String toString(){
        return customer.toString() + "balance = $"+balance;
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public Account Deposit(double amount){
        balance += amount;
    }
    public Account Withdraw(double amount){
        if (balance <= amount){
            balance = balance - amount;
        }
        else{
            System.out.print("Amount withdrawn exceeds the current balance!");

        }
    }
}
