package ir.ac.kntu;

import java.util.Arrays;

public class Tour {
    private int duration,price,minPart,maxPart,year,month,day;
    private String region,begining,ending,transport,tourName,tourLeader;
    private String [] tourPlans;

    public Tour(int duration, int price, int minPart, int maxPart, String region, String begining, String ending, String transport, String tourName, String[] tourPlans,int year,int month, int day,String tourLeader) {
        setTourPlans(tourPlans);
        setTourLeader(tourLeader);
        setDate(year,month,day);
        setDuration(duration);
        setPrice(price);
        setMinPart(minPart);
        setMaxPart(maxPart);
        setRegion(region);
        setBegining(begining);
        setEnding(ending);
        setTransport(transport);
        setTourName(tourName);
    }

    public String gettourLeader() {
        return tourLeader;
    }

    public void setTourLeader(String tourLeader) {
        this.tourLeader = tourLeader;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String[] getTourPlans() {
        return tourPlans;
    }

    public void setTourPlans(String[] tourPlans) {
        this.tourPlans = tourPlans;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMinPart() {
        return minPart;
    }

    public void setMinPart(int minPart) {
        this.minPart = minPart;
    }

    public int getMaxPart() {
        return maxPart;
    }

    public void setMaxPart(int maxPart) {
        this.maxPart = maxPart;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getBegining() {
        return begining;
    }

    public void setBegining(String begining) {
        this.begining = begining;
    }

    public String getEnding() {
        return ending;
    }

    public void setEnding(String ending) {
        this.ending = ending;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return
                "Tour Name = " + tourName + '\n' +
                        "Tour Leader = " + tourLeader + '\n'+
                        "Region = " + region + '\n' +
                        "The Tour Starts at " + year + '/' + month + '/' + day+
                        "duration=" + duration + '\n' +
                "Price = " + price + '\n' +
                "Minimum Participators = " + minPart + '\n' +
                "Maximum Participators = " + maxPart + '\n' +
                "The Tour Begins at = " + begining + '\n' +
                "And The Tour Ends at = " + ending + '\n' +
                "Way of Transportation = " + transport + '\n' +
                "Tour Plan = " + Arrays.toString(tourPlans);
    }
}
