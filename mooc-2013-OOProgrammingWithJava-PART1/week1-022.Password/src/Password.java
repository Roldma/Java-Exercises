
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        String secret = "jryy qbar!";
        String prompt = "Type the password: ";
        String success = String.format("The secret is: ", secret);
        
        while(true) {
            System.out.println(prompt);
            String input = reader.nextLine();
            
            if (input.equals(password)) {
                System.out.println("Right!");
                System.out.println(success);
                break;
            } else {
                System.out.println("Wrong!");
            }
        }   
        
        
        // Write your code here
    }
}
