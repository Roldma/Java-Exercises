
public class NumberStatistics {

    private int amountOfNums;
    private int sum;

    public NumberStatistics() {
        this.amountOfNums = 0;
        this.sum = 0;
    }

    public void addNumber(int num) {
        amountOfNums += 1;
        sum += num;
    }

    public int amountOfNumbers() {
        return amountOfNums;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        double a = (double) this.sum;
        double b = (double) this.amountOfNums;
        
        if (amountOfNums != 0 && this.sum != 0) {
            return a/b;
        }
        
        return 0;
    }
}
