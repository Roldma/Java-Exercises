
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.
        // The tests does not work if you do not create the objects in the correct order
        NumberStatistics n = new NumberStatistics();
        NumberStatistics o = new NumberStatistics();
        NumberStatistics p = new NumberStatistics();
        
        int summed;
        int even;
        int odd;

        System.out.println("Type numbers: ");
        int input = reader.nextInt();

        while (input != -1) {
            n.addNumber(input);
            
            if (input % 2 == 0) {
                o.addNumber(input);
            } else {
                p.addNumber(input);
            }

            input = reader.nextInt();
        }

        summed = n.sum();
        even = o.sum();
        odd = p.sum();
        System.out.println("sum: " + summed);
        System.out.println("sum of even: " + even);
        System.out.println("sum of odd:" + odd);
        
//        System.out.println(n.average());
    }
}
