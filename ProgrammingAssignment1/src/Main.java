import java.util.*;
import java.time.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        HeartRates Ayan = new HeartRates();  //declare the class instance: object

        //set the values for testing
        Ayan.setFirstName("Anirban");
        Ayan.setLastName("Chandra");
        Ayan.setDay(2);
        Ayan.setMonth(1);
        Ayan.setYear(1998);

        //return the values
        System.out.println("The first name is " + Ayan.getFirstName());
        System.out.println("The last name is " + Ayan.getLastName());
        System.out.println("Date of Birth: " + Ayan.getMonth() + "/" + Ayan.getDay() + "/" + Ayan.getYear());
        System.out.println("Maximum Heart Rate based on your age is: " + Ayan.maximumHeartRate() + ".");
        Ayan.targetHeartRate();
    }
}