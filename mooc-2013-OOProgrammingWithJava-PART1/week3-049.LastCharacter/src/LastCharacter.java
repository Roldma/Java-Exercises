import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name = reader.nextLine();
        System.out.println("last Character: "+lastCharacter(name));
    }
    
    public static char lastCharacter(String name) {
        return name.charAt(name.length() - 1);
    }
}
