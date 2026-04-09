import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date today = new Date();

        System.out.println("Today's date: " + today);

        System.out.println("Time in milliseconds since January 1, 1970: " + today.getTime());
        System.out.println("Day of the month: "+today.getDate());
        System.out.println("Year : "+ today.getYear());
    }
}