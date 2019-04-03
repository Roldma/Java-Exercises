
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int lower = reader.nextInt();
        int upper = reader.nextInt();
        
        for (int i = lower; i <= upper; i++) {
            System.out.println(i);
        }
        // write your code here

    }
}
