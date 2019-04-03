
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int input = Integer.parseInt(reader.nextLine());
        
        String result = input > 0 ? "The number is positive" : "The number is not positive";
        
        System.out.println(result);
                
    }
}
