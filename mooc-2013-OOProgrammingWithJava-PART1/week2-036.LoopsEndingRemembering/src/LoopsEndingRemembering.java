import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        double numInput = reader.nextDouble();
        double sum = 0;
        double count = 0;
        double evens = 0;
        double odds = 0;
        
        while (numInput != -1) {
            System.out.println(numInput);
            sum += numInput;
            
            if (numInput % 2 == 0) {
                evens += 1;
            } else {
                odds += 1;
            }
            count += 1;
            
            numInput = reader.nextDouble();
        }
        
        double aver = sum / count;
        
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + Math.round(sum));
        System.out.println("How many numbers: " + Math.round(count));
        System.out.println("Average: " + aver);
        System.out.println("Even numbers: " + Math.round(evens));
        System.out.println("Odd numbers: "+ Math.round(odds));
    }
}
