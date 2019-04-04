
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // add here code that tests LyraCard. However before doing 77.6 remove the
        // other code 
        LyyraCard a = new LyyraCard(20);
        LyyraCard b = new LyyraCard(30);
        a.payGourmet();
        b.payEconomical();

        System.out.println("Pekka:" + a.toString());
        System.out.println("Brian:" + b.toString());

        a.loadMoney(20);
        b.payGourmet();

        System.out.println("Pekka:" + a.toString());
        System.out.println("Brian:" + b.toString());
        
        a.payEconomical();
        a.payEconomical();
        b.loadMoney(50);
        
        System.out.println("Pekka:" + a.toString());
        System.out.println("Brian:" + b.toString());
        
        
    }
}
