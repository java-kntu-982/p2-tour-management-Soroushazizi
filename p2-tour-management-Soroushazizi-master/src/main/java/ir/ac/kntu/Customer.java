package ir.ac.kntu;

public class Customer extends Users {
    public Customer(String userName, String password, String email,String phoneNumber) {
        super(userName, password, email,phoneNumber);
        setAccess(3);
    }
}
