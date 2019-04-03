
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // call your method from here
        
        int len = calculateCharacters(reader.nextLine());
        System.out.println(len);
    }
    
    // do here the method
    public static int calculateCharacters(String txt) {
        return txt.length();
    }
    
}
