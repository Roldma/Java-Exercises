
import java.util.Scanner;

public class AgeCheck {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String prompt = "How old are you?";
        
        System.out.println(prompt);
        int username = reader.nextInt();
        
        String output = (username >= 0 && username <= 120) ? "OK" : "Impossible!";
        
        System.out.println(output);
    }
}
