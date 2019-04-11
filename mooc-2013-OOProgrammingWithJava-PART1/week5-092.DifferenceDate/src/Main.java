
public class Main {

    public static void main(String[] args) {
        // write testcode here
        MyDate a = new MyDate(10,2,2012);
        MyDate b = new MyDate(9,5,2011);
        
        System.out.println(a.differenceInYears(b));
    }
}
