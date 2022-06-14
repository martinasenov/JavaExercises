package day31_Constructors;

public class Offer {

    /*1. Create a custom class named Offer
            Attributes:
    location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime

    Actions:
    setInfo(): sets all the instance variables
    toString(): returns the full info of the Offer Object

*/

    public String location,companyName,getJobTitle;
    public double salary;
    public boolean hasBenefit,hasPTO,isWFH,isFullTime;


    public void setInfo(String location, String companyName, String getJobTitle, double salary, boolean hasBenefit, boolean hasPTO, boolean isWFH, boolean isFullTime) {
        this.location = location;
        this.companyName = companyName;
        this.getJobTitle = getJobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", getJobTitle='" + getJobTitle + '\'' +
                ", salary= $" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }
}

