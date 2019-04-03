
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String word = reader.nextLine();
        String secondWord = reader.nextLine();
        
        if (word.contains(secondWord)){
            System.out.println(String.format("The word '%s' is found in the word '%s'.",secondWord,word));
        } else {
            System.out.println(String.format("The word '%s' is not found in the word '%s'.",secondWord,word));
        }
        
        
    }
}
