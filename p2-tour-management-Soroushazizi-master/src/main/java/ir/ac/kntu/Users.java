package ir.ac.kntu;

import java.util.Objects;

public class Users {
    private String userName, password, email , phoneNumber;
    private int access;
    public Users(String userName, String password, String email, String phoneNumber) {
        setUserName(userName);
        setPassword(password);
        setEmail(email);
        setPhoneNumber(phoneNumber);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccess() {
        return access;
    }

    public void setAccess(int access) {
        this.access = access;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Users)) return false;
        Users users = (Users) o;
        return getAccess() == users.getAccess() &&
                getUserName().equals(users.getUserName()) &&
                getPassword().equals(users.getPassword()) &&
                getEmail().equals(users.getEmail()) &&
                getPhoneNumber().equals(users.getPhoneNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserName(), getPassword(), getEmail(), getPhoneNumber(), getAccess());
    }

    @Override
    public String toString() {
        return "UserName = " + userName + '\n' +
                "Password = " + password + '\n' +
                "Email = " + email + '\n' +
                "PhoneNumber=" + phoneNumber ;
    }
}
