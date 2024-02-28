package clases.claseClienteFactura;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    public int getCustomerId(){
        this.customer = customer;
        return customer.getId();
    }
    public String getCustomerName(){
        this.customer = customer;
        return customer.getName();
    }
    public int getCustomerDiscount(){
        this.customer = customer;
        return customer.getDiscount();
    }
    public double getAmountAfterDiscount(){
        this.customer = customer;
        amount = amount - (amount * ( (double) customer.getDiscount()/100));
        return amount;
    }
    public String toString(){
        return "Invoice[id=" + id + ",customer=" + getCustomerName() + "(" + getCustomerId() + ")(" + getCustomerDiscount() + "%),amount=" + amount + "]";
    }
}
