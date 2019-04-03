
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int upTo = reader.nextInt();
        int accum = 0;
        
        for (int i = 0; i <= upTo; i++) {
            accum += i;
        }
        System.out.println("Sum is" + accum);
    }
}
