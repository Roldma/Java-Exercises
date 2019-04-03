
import java.util.Scanner;

public class Usernames {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String[] userNames = new String[] {"alex", "emily"};
        String[] passwords = new String[] {"mightyducks", "cat"};
        
        String uPrompt = "username";
        String pPrompt = "password";
        String success = "Your are now logged into the system!";
        String fail = "Your username or password was invalid!";
        String prompt = "Type your ";
        
        String[] entries = new String[2];
        
        System.out.print(String.format(prompt + "%s: ",uPrompt ));
        entries[0] = reader.nextLine();
        System.out.print(String.format(prompt + "%s: ", pPrompt));
        entries[1] = reader.nextLine();
        
        if (entries[0].equals(userNames[0]) && entries[1].equals(passwords[0])) {
            System.out.println(success);
        } else if (entries[0].equals(userNames[1]) && entries[1].equals(passwords[1])) {
            System.out.println(success);
        } else {
            System.out.println(fail);
        }
    }
}
