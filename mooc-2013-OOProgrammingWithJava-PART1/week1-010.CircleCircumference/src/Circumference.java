
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Program your solution here 
        System.out.println("Type the radius: ");
        double rad = Double.parseDouble(reader.nextLine());
        double circumference = circum(rad);
        
        System.out.print("Circumference of the circle: " + circumference);
        
    }
    
    public static double circum(double rad) {
        double circumference = 2 * Math.PI * rad;
        return circumference;
    }
}
