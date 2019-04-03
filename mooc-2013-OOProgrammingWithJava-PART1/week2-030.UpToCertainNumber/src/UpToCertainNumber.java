
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int upTo = reader.nextInt();
        reader.close();
        for (int i = 1; i <= upTo; i++) {
            System.out.println(i);
        }
    
        
    }
}
