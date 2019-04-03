
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int lower = reader.nextInt();
        int upper = reader.nextInt();
        
        int iterations = lower;
        int sum = 0;
        
        while (iterations != upper + 1) {
            sum += iterations;
            iterations += 1;
        }
        System.out.println("The sum is "+sum);
    }
}
