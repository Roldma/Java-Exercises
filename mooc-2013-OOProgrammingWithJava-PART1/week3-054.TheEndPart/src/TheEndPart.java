import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        int endPart = reader.nextInt();
        int len = word.length();
        System.out.println("Result: " + word.substring(len - endPart, len));
    }
}
