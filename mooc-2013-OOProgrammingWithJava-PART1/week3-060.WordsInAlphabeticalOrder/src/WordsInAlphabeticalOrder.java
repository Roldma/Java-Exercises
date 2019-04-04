
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        String word = reader.nextLine();
        
        while(!word.isEmpty()) {
            words.add(word);
            word = reader.nextLine();
        }
        
        Collections.sort(words);
        
        for (String word1 : words) {
            System.out.println(word1);
        }
        
    }
}
