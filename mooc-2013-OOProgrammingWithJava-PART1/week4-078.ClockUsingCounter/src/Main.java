
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // write here code to ensure that BoundedCounter works as expected
        // before starting 78.3 remove the extra code and use the skeleton shown
        // in the assignment

        BoundedCounter hours = new BoundedCounter(23);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter seconds = new BoundedCounter(59);

        System.out.println("Seconds: ");
        int s = reader.nextInt();
        System.out.println("minutes: ");
        int m = reader.nextInt();
        System.out.println("hours: ");
        int h = reader.nextInt();

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while (i < 121) {
            System.out.println(hours.toString() + ":" + minutes.toString() + ":" + seconds.toString());
            
            if (hours.getValue() == 23 && minutes.getValue() == 59 && seconds.getValue() == 59) {
                hours.next();
                minutes.next();
            } else if (seconds.getValue() == 59) {
                minutes.next();
            } else if (minutes.getValue() == 59 && seconds.getValue() == 59 ) {
                hours.next();
            }
            seconds.next();
            i += 1;
        }
    }
}
