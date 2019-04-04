import java.util.Random;

public class Dice {
    
    private final Random random = new Random();
    private final int numberOfSides;

    public Dice(int numberOfSides) {
        // Initialize here the number of sides
        this.numberOfSides = numberOfSides;
    }

    public int roll() {
        // create here a random number belongig to range 1-numberOfSided
        
        return random.nextInt(numberOfSides) + 1;
    }
}
