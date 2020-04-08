package ir.ac.kntu;

public class Leader {
    private String firstName, lastName, city,status;

    private int year,month,day,yearRec,monthRec,dayRec,id,nationalCode,age;

    public Leader(String firstName, String lastName, int year, int month, int day, int yearRec, int monthRec, int dayRec, int nationalCode, int id, String status, String city) {

        setFirstName(firstName);
        setLastName(lastName);
        setDob(year,month,day);
        setRec(yearRec,monthRec,dayRec);
        setNationalCode(nationalCode);
        setId(id);
        setStatus(status);
        setCity(city);
        setAge(year);
    }



    public int getAge() {
        return age;
    }

    public void setAge(int year) {
        int currYear = 1399;
        this.age = currYear - year;
    }

    public void setRec(int year, int month, int day){
        this.yearRec = year;
        this.monthRec = month;
        this.dayRec = day;
    }

    public void setDob(int year, int month, int day){
        int currYear = 1399;
        this.year = year;
        this.month = month;
        this.day = day;
        age = currYear - this.year;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(int nationalCode) {
        this.nationalCode = nationalCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String isStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "FirstName = " + firstName + '\n' +
                "LastName = " + lastName + '\n' +
                "City = " + city + '\n' +
                "Date Of Birth = " + year +
                '/' + month + '/' + day + '\n'+
                "Date of Recruitment = " + yearRec + '/' +
                monthRec + '/' +
                dayRec + '\n' +
                "ID = " + id + '\n' +
                "NationalCode = " + nationalCode + '\n' +
                "Status = " + status
                ;
    }
}
