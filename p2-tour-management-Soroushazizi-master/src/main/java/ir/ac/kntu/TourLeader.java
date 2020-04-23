package ir.ac.kntu;

public class TourLeader extends Users {

    public TourLeader(String userName, String password, String email, String  phoneNumber) {
        super(userName, password, email, phoneNumber);
        setAccess(4);
    }
}
