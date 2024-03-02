import clases.claseClientePrueba.*;
public class MainClientePrueba {
    public static void main(String[] args) {
        //Test de Customer class
        Customer c1 = new Customer(12345, "Luis Avila",'m' );
        System.out.println(c1);
        System.out.println("id is:" + c1.getId());
        System.out.println("name is:" + c1.getName());
        System.out.println("gender is:" + c1.getGender());
        //Test de Account class
        Account a1 = new Account(12345, c1);
        System.out.println(a1);
        Account a2 = new Account(54321, c1, 800);
        System.out.println(a2);
        System.out.println("id is:" + a2.getId());
        System.out.println("Customer is:" + a2.getCustomer());
        System.out.println("Balance is:" + a2.getBalance());
        a1.setBalance(1200);
        System.out.println(a2);
        System.out.println(a2.getCustomerName());
        System.out.println(a2.Deposit(200));
        System.out.println(a2.Withdraw(400));
        System.out.println(a2.Withdraw(2000));
    }
}
