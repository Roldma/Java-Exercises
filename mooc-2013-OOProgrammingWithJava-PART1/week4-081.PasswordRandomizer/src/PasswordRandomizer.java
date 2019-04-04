
import java.util.Random;
import java.util.regex.Pattern;

public class PasswordRandomizer {

    // Define the variables
    private final Random random = new Random();
    private final int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        String pw = "";
        
        String[] letterz = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        for (int i = 0; i < this.length; i++) {
            int r = random.nextInt(letterz.length);
            pw += letterz[r];
        }
        
        return pw;
    }
}
