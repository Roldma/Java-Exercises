
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        System.out.print("Length of the first part: ");
        int firstPart = reader.nextInt();
        
        System.out.println("Result: " + word.substring(0,firstPart));
    }
}
