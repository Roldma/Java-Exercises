import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int factorialOf = reader.nextInt() + 1;
        int counter = 1;
        int accum = 1;
        
        while (counter != factorialOf) {
            accum *= counter;
            counter += 1;
        }
        System.out.println(accum);
    }
}
