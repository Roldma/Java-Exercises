
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();
        
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        String stored = "";
        
        while (!words.contains(word)) {
            words.add(word);
            System.out.print("Type a word: ");
            word = reader.nextLine();
            stored = word;
        }
        
        System.out.println(String.format("You gave the word %s twice", stored));
    } 
}
