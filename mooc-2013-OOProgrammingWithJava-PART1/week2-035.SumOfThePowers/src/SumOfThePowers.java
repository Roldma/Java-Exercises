
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double upTo = (reader.nextDouble() + 1);
        int n = 2;
        
        double accum = 0;
        double counter = 0;
        
        while (counter != upTo) {
            accum += Math.pow(Double.valueOf(n), counter);
            counter += 1;
        }
        System.out.println(Math.round(accum));
    }
}
