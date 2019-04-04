import java.util.ArrayList;

public class TheGreatest {
    
    public static int greatest(ArrayList<Integer> list) {
        double greatestNum = Double.NEGATIVE_INFINITY;
        
        for (Integer integer : list) {
            
            if (integer > greatestNum) {
                greatestNum = integer;
            }
        }
        
        return (int) greatestNum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}
