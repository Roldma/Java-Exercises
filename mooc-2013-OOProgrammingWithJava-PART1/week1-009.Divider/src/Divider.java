
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.print("Type a number: ");
        float a = Float.parseFloat(reader.nextLine());
        System.out.print("Type another number: ");
        float b = Float.parseFloat(reader.nextLine());
        float result = a / b;
        System.out.println("");

        System.out.println("Division: " + a + "/"+ b + "=" + result);
    }
}
