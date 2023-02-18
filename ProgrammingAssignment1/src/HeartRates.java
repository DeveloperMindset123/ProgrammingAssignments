import java.time.Year;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int month;
    private int day;
    private int year;
    //target heart range: 50-85% of maximum heart rate
    //maximum heart rate: formula: 220 - age in years

    HeartRates() {   //constructor function, initiailizes with default values that can be changed, used my own information for default values
        this.firstName = "Ayan";
        this.lastName = "Das";
        this.month = 9;
        this.day = 16;
        this.year = 2002;
    }

    //seperate getter and setter functions
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

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int maximumHeartRate() {
        int age = 2023 - getYear();
        return 220 - age;
    }

    public void targetHeartRate() {
        double lowerEnd = maximumHeartRate() * 0.50;
        double higherEnd = maximumHeartRate() * 0.85;
        //convert the double values into string so we can print it out
        String lower = String.valueOf(lowerEnd);
        String upper = String.valueOf(higherEnd);
        System.out.println("The target heart rate should be between " + lower + " and " + upper + "bpm.");
    }
}
