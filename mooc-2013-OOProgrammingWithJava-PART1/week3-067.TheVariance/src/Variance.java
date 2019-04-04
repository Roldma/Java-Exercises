
import java.util.ArrayList;

public class Variance {

    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;

        for (Integer num : list) {
            sum += num;
        }

        return sum;
    }

    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double numSum = Double.valueOf(sum(list));

        return numSum / list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double avg = average(list);
        double sumX2 = 0;
        double totalNums = list.size() - 1;
        
        for (Integer integer : list) {
            sumX2 += Math.pow((integer - avg),2);
        }
     
        return sumX2 / totalNums;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }

}
