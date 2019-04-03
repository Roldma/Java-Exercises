
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a year: ");
        int year = reader.nextInt();
        reader.close();
        
        boolean leapYear = false;
        String success = "The year is a leap year";
        String fail = "The year is not a leap year";
        
        if (year % 4 == 0 && year % 100 != 0) {
            leapYear = true;
        } else if (year % 100 == 0 && year % 400 == 0) {
            leapYear = true;
        }

        String result = leapYear ? success : fail;
        System.out.println(result);
    }
}
