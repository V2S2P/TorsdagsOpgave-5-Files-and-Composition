package Task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList of "Customer" objects. We declare and initialize it.
        ArrayList<Customer> customers = new ArrayList<>();
        // In our newly made "customers" Array we add new "Customer" objects.
        customers.add(new Customer("Valdemar","Poulsen","ValdemarBig"));
        customers.add(new Customer("Big","Hank","BiggieHank442"));

        // Call our printCustomers method on our "customers" Array.
        printCustomers(customers);
    }
    // A static method that takes an ArrayList of "Customer" objects as parameter. It will print out each "customers" object inside the Array you give it. The method is static so we can call it on the Main class and not on any one specific object.
    public static void printCustomers(ArrayList<Customer> cusomers){
        for (Customer customer: cusomers){
            System.out.println(customer);
        }
    }
}
