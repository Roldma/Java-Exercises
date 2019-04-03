import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type the first number: ");
        int a = Integer.parseInt(reader.nextLine());
        
        System.out.print("Type the second number: ");
        int b = Integer.parseInt(reader.nextLine());
        
        String c = Integer.toString(Math.max(a, b));
        
        String result;
        
        if (a == b) {
            result = "The numbers are equal!";
            System.out.println(result);
        } else {
            result = String.format("greater number: %s", c);
            System.out.println(result);
        }
        
        
    }
}
