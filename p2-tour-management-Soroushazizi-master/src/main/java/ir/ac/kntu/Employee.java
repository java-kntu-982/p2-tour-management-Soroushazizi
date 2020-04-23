package ir.ac.kntu;

import java.util.Objects;

public class Employee extends Users {
    private int salary;
    private int year,month,day;
    public Employee(String userName, String password, String email, String phoneNumber,int salary, int year, int month, int day) {
        super(userName, password, email, phoneNumber);
        setAccess(2);
        setSalary(salary);
        setRec(year,month,day);
    }
    public void setRec(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return getSalary() == employee.getSalary() &&
                year == employee.year &&
                month == employee.month &&
                day == employee.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSalary(), year, month, day);
    }

    @Override
    public String toString() {
        return "Salary = " + salary + '\n' +
                "Date of Recruitment = " + year + '/' + month + '/' + day;
    }
}
