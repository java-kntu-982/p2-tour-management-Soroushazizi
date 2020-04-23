package ir.ac.kntu;

public class Admin extends Users {

    public Admin(String userName, String password, String email, String phoneNumber) {
        super(userName, password, email, phoneNumber);
        setAccess(1);
    }

}
