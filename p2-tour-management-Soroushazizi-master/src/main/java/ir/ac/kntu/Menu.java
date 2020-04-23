package ir.ac.kntu;

import ir.ac.kntu.Leader;
import ir.ac.kntu.Tour;
import picocli.CommandLine;

import java.awt.desktop.AboutEvent;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void menuFunc(){
        ArrayList<Leader> tourLeader = new ArrayList<Leader>();
        ArrayList<Tour> tour = new ArrayList<>();
        ArrayList<Users> users = new ArrayList<>();

        Admin admin = new Admin("admin","admin","admin@admin.com","09355545114");
        Employee employee = new Employee("mohammad", "5648945", "mohammadmohammadiani@yahoo.com", "09124569856", 5000000, 1370,6,20);
        TourLeader tourleaders = new TourLeader("soroush", "123456", "soroushazizi@yahoo.com", "09122356878");
        Customer customer = new Customer("saba", "radmanesh", "sabaradmanesh@yahoo.com", "09111564859");
        users.add(admin);
        users.add(employee);
        users.add(tourleaders);
        users.add(customer);
        tourLeader.add(new Leader("soroush","azizi",1350,5,22,1399,12,23,9826793,56415896,"Single","Istanbul"));
        tourLeader.add(new Leader("Mamad", "mamadiani", 1375, 8,16,1395,2,26,7984561,16324598,"Married","Shiraz"));
        tour.add(new Tour(3,700,10,16,"Asia","Tehran", "Shiraz","Ground","Tehran-shiraz", new String[]{"darband", "Azadi", "hafez"} , 1399,1,1,"Mamad"));
        tour.add(new Tour(7,2000,12,15,"Asia", "Tehran","Istanbul", "Air", "Tehran-Istanbul", new String[]{"Hammam", "Museum","Club", "Yacht"}, 1399, 2, 15,"soroush"));
        boolean a = true;
        Scanner input = new Scanner(System.in);
        int choice;
        while (a){
            System.out.println("Enter Username :");
            String username = input.next();
            System.out.println("Enter Password :");
            String password = input.next();
            for(int i =0 ; i<users.size(); i++) {
                if(username.equals(users.get(i).getUserName()) && password.equals(users.get(i).getPassword())){
                    System.out.println("Welcome " + users.get(i).getUserName());
                    continue;
                }
                else {
                    a = false;
                }
            }
            if(username.equals("admin")){
                adminMenu();
                int adminChoice = input.nextInt();
                switch (adminChoice){
                    case 4:
                        System.out.println("1.Add Employee\n2.Add TourLeader\n3.Add Customer");
                        int adminAddChoice = input.nextInt();
                        switch (adminAddChoice){
                            case 1:
                                System.out.println("Enter Username");
                                String addUserName = input.next();
                                System.out.println("Enter Password");
                                String addPassword = input.next();
                                System.out.println("Enter Email");
                                String addEmail = input.next();
                                System.out.println("Enter PhoneNumber");
                                String addPhoneNumber = input.next();
                                System.out.println("Enter BaseSalary");
                                int baseSalary = input.nextInt();
                                System.out.println("Enter Date Of Birth");
                                System.out.println("Enter Year");
                                int addYear = input.nextInt();
                                System.out.println("Enter Month");
                                int addMonth = input.nextInt();
                                System.out.println("Enter Day");
                                int addDay = input.nextInt();
                                Employee employee1 = new Employee(addUserName,addPassword,addEmail,addPhoneNumber,baseSalary,addYear,addMonth,addDay);
                                users.add(employee1);
                                break;
                            case 2:
                                System.out.println("Enter Username");
                                String addUserName1 = input.next();
                                System.out.println("Enter Password");
                                String addPassword1 = input.next();
                                System.out.println("Enter Email");
                                String addEmail1 = input.next();
                                System.out.println("Enter PhoneNumber");
                                String addPhoneNumber1 = input.next();
                                TourLeader tourLeader1 = new TourLeader(addUserName1,addPassword1,addEmail1,addPhoneNumber1);
                                users.add(tourLeader1);
                                break;
                            case 3:
                                System.out.println("Enter Username");
                                String addUserName2 = input.next();
                                System.out.println("Enter Password");
                                String addPassword2 = input.next();
                                System.out.println("Enter Email");
                                String addEmail2 = input.next();
                                System.out.println("Enter PhoneNumber");
                                String addPhoneNumber2 = input.next();
                                Customer customer1 = new Customer(addUserName2,addPassword2,addEmail2,addPhoneNumber2);
                                users.add(customer1);
                                break;
                            default:
                                System.out.println("Wrong Input");
                                break;
                        }
                        break;
                    case 5:
                        System.out.println("Enter Username to Edit");
                        String editUser = input.next();
                        for(int i=0; i<users.size(); i++){
                            if(users.get(i).getUserName().equals(editUser)){
                                System.out.println("Enter Username");
                                String addUserName2 = input.next();
                                System.out.println("Enter Password");
                                String addPassword2 = input.next();
                                System.out.println("Enter Email");
                                String addEmail2 = input.next();
                                System.out.println("Enter PhoneNumber");
                                String addPhoneNumber2 = input.next();
                                Customer customer1 = new Customer(addUserName2,addPassword2,addEmail2,addPhoneNumber2);
                                users.set(i,customer1);
                            }
                        }
                        break;
                    case 6:
                        System.out.println("Enter Username to Delete");
                        String removeUser = input.next();
                        for(int i=0; i<users.size(); i++){
                            if(users.get(i).getUserName().equals(removeUser)){
                                users.remove(i);
                                System.out.println("Done!!");
                                break;
                            }
                        }
                        break;
                    case 7:
                        for(int i=0; i<users.size();i++){
                            System.out.println(users.get(i).getUserName());
                        }
                        break;
                    default:
                        break;
                }
            }
            menu();
            choice = input.nextInt();
            if(choice == 1){
                tourLeadersOption();
                choice = input.nextInt();
                switch (choice){
                    case 1:
                        for(int i=0; i<tourLeader.size();i++){
                            System.out.println(tourLeader.get(i).toString());
                            leadersOption();
                            int leaderChoice = input.nextInt();
                            if(leaderChoice == 1){
                                if(i == tourLeader.size()-1){
                                    i = -1;
                                }
                                else{
                                }
                            }
                            else if(leaderChoice == 2){
                                i = tourLeader.size()-2;
                                if(i<0){
                                    i = 0;
                                }
                            }
                            else if(leaderChoice == 3){
                                break;
                            }
                            else if(leaderChoice == 4){
                                a = false;
                            }
                        }
                        break;
                    case 2:
                        if(username.equals("admin")){
                            System.out.println("How Many TourLeaders Do You Wish to Add?!?\n");
                            int num = input.nextInt();
                            for(int i=0; i<num; i++){
                                String firstName, lastName, city,status;
                                int year,month,day,yearRec,monthRec,dayRec,id,nationalCode;
                                System.out.println("Enter FirstName\n");
                                firstName = input.next();
                                System.out.println("Enter LastName\n");
                                lastName = input.next();
                                System.out.println("Enter Date Of Birth");
                                System.out.println("Enter Year\n");
                                year = input.nextInt();
                                System.out.println("Enter Month\n");
                                month = input.nextInt();
                                System.out.println("Enter Day\n");
                                day = input.nextInt();
                                System.out.println("Enter Date Of Recruitment");
                                System.out.println("Enter Year\n");
                                yearRec = input.nextInt();
                                System.out.println("Enter Month\n");
                                monthRec = input.nextInt();
                                System.out.println("Enter Day\n");
                                dayRec = input.nextInt();
                                System.out.println("Enter NationalCode\n");
                                nationalCode = input.nextInt();
                                System.out.println("Enter ID\n");
                                id = input.nextInt();
                                System.out.println("Enter Status\n");
                                status = input.next();
                                System.out.println("Enter City\n");
                                city = input.next();
                                tourLeader.add(new Leader(firstName,lastName,year,month,day,yearRec,monthRec,dayRec,nationalCode,id,status,city));
                        }
                        }

                        break;
                    case 3:
                        if(username.equals("admin")){
                            System.out.println("Enter NationalCode to Delete");
                            int delete = input.nextInt();
                            for(int i=0; i<tourLeader.size(); i++){
                                if(delete == tourLeader.get(i).getNationalCode()){
                                    tourLeader.remove(i);
                                }
                            }
                        }
                        else {
                            System.out.println("You Dont Have Access to This part of the program");
                        }
                        break;
                    case 4:
                        if(username.equals("admin")){
                            System.out.println("Enter NationalCode to Edit\n");
                            int edit = input.nextInt();
                            for(int i=0; i<tourLeader.size(); i++){
                                if(edit == tourLeader.get(i).getNationalCode()){
                                    System.out.println("Enter FirstName\n");
                                    String firstName = input.next();
                                    System.out.println("Enter LastName\n");
                                    String lastName = input.next();
                                    System.out.println("Enter Date Of Birth");
                                    System.out.println("Enter Year\n");
                                    int year = input.nextInt();
                                    System.out.println("Enter Month\n");
                                    int month = input.nextInt();
                                    System.out.println("Enter Day\n");
                                    int day = input.nextInt();
                                    System.out.println("Enter Date Of Recruitment");
                                    System.out.println("Enter Year\n");
                                    int yearRec = input.nextInt();
                                    System.out.println("Enter Month\n");
                                    int monthRec = input.nextInt();
                                    System.out.println("Enter Day\n");
                                    int dayRec = input.nextInt();
                                    System.out.println("Enter NationalCode\n");
                                    int nationalCode = input.nextInt();
                                    System.out.println("Enter ID\n");
                                    int id = input.nextInt();
                                    System.out.println("Enter Status\n");
                                    String status = input.next();
                                    System.out.println("Enter City\n");
                                    String city = input.next();
                                    tourLeader.set(i,new Leader(firstName,lastName,year,month,day,yearRec,monthRec,dayRec,nationalCode,id,status,city));
                                }
                        }
                        }
                        else {
                            System.out.println("You Dont Have Access to This part of the program");
                        }
                        break;
                    case 5:
                        System.out.println("Search by:\n");
                        searchLeader();
                        int search = input.nextInt();
                        switch (search){
                            case 1:
                                System.out.println("Enter First Name\n");
                                String searchName = input.next();
                                int n=0;
                                for(int i=0; i<tourLeader.size(); i++){
                                    if(searchName.equals(tourLeader.get(i).getFirstName())){
                                        System.out.println(tourLeader.get(i).toString());
                                        n = 1;
                                    }
                                }
                                if(n != 1){
                                    System.out.println("Not Found!!!");
                                }
                                break;
                            case 2:
                                System.out.println("Enter Last Name\n");
                                String searchLastName = input.next();
                                int n1=0;
                                for(int i=0; i<tourLeader.size(); i++){
                                    if(searchLastName.equals(tourLeader.get(i).getLastName())){
                                        System.out.println(tourLeader.get(i).toString());
                                        n1 = 1;
                                    }
                                }
                                if(n1 != 1){
                                    System.out.println("Not Found!!!");
                                }
                                break;
                            case 3:
                                System.out.println("Enter The name of the City\n");
                                String searchCity = input.next();
                                int n2=0;
                                for(int i=0; i<tourLeader.size(); i++){
                                    if(searchCity.equals(tourLeader.get(i).getCity())){
                                        System.out.println(tourLeader.get(i).toString());
                                        n2 = 1;
                                    }
                                }
                                if(n2 != 1){
                                    System.out.println("Not Found!!!");
                                }
                                break;
                            case 4:
                                System.out.println("Enter Age\n");
                                int age = input.nextInt();
                                int n3=0;
                                for(int i=0; i<tourLeader.size(); i++){
                                    if(age == tourLeader.get(i).getAge()){
                                        System.out.println(tourLeader.get(i).toString());
                                        n3 = 1;
                                    }
                                }
                                if(n3 != 1){
                                    System.out.println("Not Found!!!");
                                }
                                break;
                            default:
                                break;
                        }
                        break;
                    case 6:
                        for(int i=0; i<tourLeader.size(); i++){
                            System.out.printf(tourLeader.get(i).getFirstName().toString());
                            System.out.printf(" ");
                            System.out.printf(tourLeader.get(i).getLastName().toString());
                            System.out.println();
                        }
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("Wrong INPUT!!!");
                        a = false;
                        break;
                }
            }
            else if(choice == 2){
                tours();
                int choiceTour = input.nextInt();
                switch (choiceTour){
                    case 1:
                        for(int i=0; i<tourLeader.size();i++){
                            System.out.println(tour.get(i).toString());
                            toursOption();
                            int leaderChoice = input.nextInt();
                            if(leaderChoice == 1){
                                if(i == tourLeader.size()-1){
                                    i = -1;
                                }
                                else{
                                }
                            }
                            else if(leaderChoice == 2){
                                i -= 2;
                                if(i<=0){
                                    i = tourLeader.size()-2;
                                }
                            }
                            else if(leaderChoice == 3){
                                break;
                            }
                            else if(leaderChoice == 4){
                                a = false;
                            }
                        }
                        break;
                    case 2:
                        for(int i=0; i<tour.size(); i++){
                            System.out.println(tour.get(i).getTourName().toString());
                        }
                        break;
                    case 3:
                        if(username.equals("admin")) {
                            System.out.println("How Many Tours Do You Wish to Add?!?\n");
                            int numTours = input.nextInt();
                            for (int i = 0; i < numTours; i++) {
                                System.out.println("Enter the Name of the Tour\n");
                                String tourName = input.next();
                                System.out.println("Enter TourLeader's FirstName\n");
                                String leaderFirstName = input.next();
                                System.out.println("Enter Region\n");
                                String region = input.next();
                                System.out.println("Enter Date\n");
                                System.out.println("Enter Year\n");
                                int year = input.nextInt();
                                System.out.println("Enter Month\n");
                                int month = input.nextInt();
                                System.out.println("Enter Day\n");
                                int day = input.nextInt();
                                System.out.println("Enter the Duration of the Tour\n");
                                int duration = input.nextInt();
                                System.out.println("Enter Price\n");
                                int price = input.nextInt();
                                System.out.println("Enter Minimum Participators\n");
                                int min = input.nextInt();
                                System.out.println("Enter Maximum Participators\n");
                                int max = input.nextInt();
                                System.out.println("Enter the Starting City\n");
                                String begining = input.next();
                                System.out.println("Where does the tour end?!\n");
                                String ending = input.next();
                                System.out.println("Transport:\n1.By Air\n2.By Ground\n");
                                int tran = input.nextInt();
                                String transport = null;
                                if (tran == 1) {
                                    transport = "Air";
                                } else if (tran == 2) {
                                    transport = "Ground";
                                } else {
                                    System.out.println("Wrong Input!!!");
                                }
                                String[] plans = new String[duration];
                                int k = 1;
                                for (int j = 0; j < duration; j++) {
                                    System.out.println("What is the plan for the Day " + k);
                                    plans[j] = input.next();
                                    k++;
                                }
                                for (int f = 0; f < tourLeader.size(); f++) {
                                    if (leaderFirstName.equals(tourLeader.get(f).getFirstName())) {
                                        if (ending.equals(tourLeader.get(f).getCity())) {
                                            tour.add(new Tour(duration, price, min, max, region, begining, ending, transport, tourName, plans, year, month, day, leaderFirstName));
                                        }
                                    }
                                }
                            }
                        }
                        else {
                            System.out.println("You Dont Have Access to This part of the program");
                        }
                        break;
                    case 4:
                        if(username.equals("admin")){
                            System.out.println("Enter Tour's Name to Delete");
                            String deleteTour = input.next();
                            for(int i=0; i< tour.size(); i++){
                                if(deleteTour.equals(tour.get(i).getTourName())){
                                    tour.remove(i);
                                }
                            }
                        }
                        break;
                    case 5:
                        if(username.equals("admin")){
                            System.out.println("Enter Tour's Name to Edit");
                            String editTour = input.next();
                            for(int i=0; i<tour.size(); i++){
                                if(editTour.equals(tour.get(i).getTourName())){
                                    System.out.println("Enter the Name of the Tour\n");
                                    String tourName = input.next();
                                    System.out.println("Enter TourLeader's FirstName\n");
                                    String leaderFirstName = input.next();
                                    System.out.println("Enter Region\n");
                                    String region = input.next();
                                    System.out.println("Enter Date\n");
                                    System.out.println("Enter Year\n");
                                    int year = input.nextInt();
                                    System.out.println("Enter Month\n");
                                    int month = input.nextInt();
                                    System.out.println("Enter Day\n");
                                    int day = input.nextInt();
                                    System.out.println("Enter the Duration of the Tour\n");
                                    int duration = input.nextInt();
                                    System.out.println("Enter Price\n");
                                    int price = input.nextInt();
                                    System.out.println("Enter Minimum Participators\n");
                                    int min = input.nextInt();
                                    System.out.println("Enter Maximum Participators\n");
                                    int max = input.nextInt();
                                    System.out.println("Enter the Starting City\n");
                                    String begining = input.next();
                                    System.out.println("Where does the tour end?!\n");
                                    String ending = input.next();
                                    System.out.println("Transport:\n1.By Air\n2.By Ground\n");
                                    int tran = input.nextInt();
                                    String transport = null;
                                    if(tran == 1){
                                        transport = "Air";
                                    }
                                    else if(tran == 2){
                                        transport = "Ground";
                                    }
                                    else {
                                        System.out.println("Wrong Input!!!");
                                    }
                                    int k=1;
                                    String [] plans = new String[duration];
                                    for(int j=0; j<duration; j++){
                                        System.out.println("What is the plan for the Day " + k);
                                        plans[j] = input.next();
                                        k++;
                                    }
                                    for(int f=0; f<tourLeader.size(); f++){
                                        if(leaderFirstName.equals(tourLeader.get(f).getFirstName())) {
                                            if (ending.equals(tourLeader.get(f).getCity())) {
                                                tour.set(i, new Tour(duration, price, min, max, region, begining, ending, transport, tourName, plans, year, month, day, leaderFirstName));
                                            }
                                        }
                                    }

                                }
                        }
                        }
                        else {
                            System.out.println("You Dont Have Access to This part of the program");
                        }
                        break;
                    case 6:
                        System.out.println("Search by:\n");
                        searchTour();
                        int tourSearch = input.nextInt();
                        switch (tourSearch){
                            case 1:
                                System.out.println("Enter TourLeaders Name\n");
                                int s=0;
                                String searchTourLeader = input.next();
                                for(int i=0 ; i<tour.size(); i++){
                                    if(searchTourLeader.equals(tour.get(i).gettourLeader())){
                                        System.out.println(tour.get(i).toString());
                                        s=0;
                                    }
                                }
                                if(s == 0){
                                    System.out.println("Wrong Input/Not Found");
                                }
                                break;
                            case 2:
                                System.out.println("Enter Date\n");
                                System.out.println("Enter Year\n");
                                int year = input.nextInt();
                                System.out.println("Enter Month\n");
                                int month = input.nextInt();
                                System.out.println("Enter Day\n");
                                int day = input.nextInt();
                                int s1=0;
                                for(int i=0; i<tour.size(); i++){
                                    if(year == tour.get(i).getYear() && month == tour.get(i).getMonth() && day == tour.get(i).getDay()){
                                        System.out.println(tour.get(i).toString());
                                        s1=1;
                                    }
                                }
                                if(s1 == 0){
                                    System.out.println("Wrong Input/Not Found");
                                }
                                break;
                            case 3:
                                System.out.println("Enter Duration\n");
                                int duration = input.nextInt();
                                int s2 = 0;
                                for(int i=0; i<tour.size(); i++){
                                    if(duration == tour.get(i).getDuration()){
                                        System.out.println(tour.get(i).toString());
                                        s2 = 1;
                                    }
                                }
                                if(s2 == 0){
                                    System.out.println("Wrong Input/Not Found");
                                }
                                break;
                            case 4:
                                System.out.println("Enter Region\n");
                                String region = input.next();
                                int s3 = 0;
                                for (int i=0; i<tour.size(); i++){
                                    if(region.equals(tour.get(i).getRegion())){
                                        System.out.println(tour.get(i).toString());
                                        s3 = 1;
                                    }
                                }
                                if(s3 == 0){
                                    System.out.println("Wrong Input/Not Found");
                                }
                                break;
                            case 5:
                                System.out.println("Enter Min\n");
                                int min = input.nextInt();
                                int s4 = 0;
                                for(int i=0;i<tour.size(); i++){
                                    if(min == tour.get(i).getMinPart()){
                                        System.out.println(tour.get(i).toString());
                                        s4 = 1;
                                    }
                                }
                                if(s4 == 0){
                                    System.out.println("Wrong Input/Not Found");
                                }
                                break;
                            case 6:
                                System.out.println("Enter Max\n");
                                int max = input.nextInt();
                                int s5 = 0;
                                for(int i=0;i<tour.size(); i++){
                                    if(max == tour.get(i).getMinPart()){
                                        System.out.println(tour.get(i).toString());
                                        s5 = 1;
                                    }
                                }
                                if(s5 == 0){
                                    System.out.println("Wrong Input/Not Found");
                                }
                                break;
                            case 7:
                                System.out.println("Price :\n1.Smaller\n2.Bigger");
                                int priceChoice = input.nextInt();
                                if(priceChoice == 1){
                                    System.out.println("Enter Price\n");
                                    int price = input.nextInt();
                                    for(int i=0;i<tour.size(); i++){
                                        if(price <= tour.get(i).getPrice()){
                                            System.out.println(tour.get(i).getTourName());
                                        }
                                    }
                                }
                                else if(priceChoice == 2){
                                    System.out.println("Enter Price\n");
                                    int price = input.nextInt();
                                    for(int i=0;i<tour.size(); i++){
                                        if(price >= tour.get(i).getPrice()){
                                            System.out.println(tour.get(i).getTourName());
                                        }
                                    }
                                }
                                else {
                                    System.out.println("Wrong Input!!!");
                                }
                                break;
                            case 8:
                                break;
                            default:
                                System.out.println("Wrong Input!!!");
                                break;
                        }
                        break;
                    case 7:
                        break;
                    default:
                        System.out.println("Wrong Input!!!");
                }
            }
            else if(choice == 3){
                a = false;
            }
            else{
                System.out.println("Wrong Input!!!");
            }
        }
    }
    public static void menu(){
        System.out.println("1.TourLeaders");
        System.out.println("2.Tours");
        System.out.println("3.Exit");
    }
    public static void adminMenu(){
        System.out.println("1.TourLeaders");
        System.out.println("2.Tours");
        System.out.println("3.Exit");
        System.out.println("4.Add");
        System.out.println("5.Edit");
        System.out.println("6.Delete");
        System.out.println("7.Users");
    }
    public static void tourLeadersOption(){
        System.out.println("1.Leaders");
        System.out.println("2.Add Leader");
        System.out.println("3.Delete Leader");
        System.out.println("4.Edit Leader");
        System.out.println("5.Search");
        System.out.println("6.TourLeaders List");
        System.out.println("7.Return to the Menu");

    }
    public static void searchTour(){
        System.out.println("1.TourLeader");
        System.out.println("2.Date");
        System.out.println("3.Duration");
        System.out.println("4.Region");
        System.out.println("5.Minimum Participators");
        System.out.println("6.Maximum Participators");
        System.out.println("7.Price");
        System.out.println("8.Return to the Menu");
    }
    public static void searchLeader(){
        System.out.println("1.Name");
        System.out.println("2.LastName");
        System.out.println("3.City");
        System.out.println("4.Age");
    }
    public static void leadersOption(){
        System.out.println("1.Next TourLeader");
        System.out.println("2.Previous TourLeader");
        System.out.println("3.Return to Menu");
        System.out.println("4.Exit");
    }
    public static void toursOption(){
        System.out.println("1.Next Tour");
        System.out.println("2.Previous Tour");
        System.out.println("3.Return to Menu");
        System.out.println("4.Exit");
    }
    public static void tours(){
        System.out.println("1.Tours");
        System.out.println("2.Tours List");
        System.out.println("3.Add Tour");
        System.out.println("4.Delete Tour");
        System.out.println("5.Edit tour");
        System.out.println("6.Search");
        System.out.println("7.Return to the Menu");
    }
}


