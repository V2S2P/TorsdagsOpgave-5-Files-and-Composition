package Task1;

public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter = 1;

    public Customer(String firstName, String lastName, String username){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.id = counter++;
    }
    @Override
    public String toString(){
        return "Name: " + firstName + " " + lastName + "\nUsername: " + username + "\nID: " + id;
    }
}
