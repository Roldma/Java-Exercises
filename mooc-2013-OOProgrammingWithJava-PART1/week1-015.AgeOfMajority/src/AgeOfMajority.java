
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Type your program here 
        System.out.print("How old are you?"); 
        int age = Integer.parseInt(reader.nextLine());
        
        String hasOrNot = age >= 18 ? "" : "not ";
        
        String result = String.format("You have %sreached the age of majority", hasOrNot);
        System.out.println(result);
    }
}
