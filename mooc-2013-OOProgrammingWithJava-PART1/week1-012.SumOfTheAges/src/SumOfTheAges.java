
import java.util.Scanner;
import java.util.HashMap;

public class SumOfTheAges {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String nameKey = "name";
        String ageKey = "age";

        // Implement your program here
        HashMap personA = getPersonInfo(reader);
        HashMap personB = getPersonInfo(reader);
        
        String aName = String.valueOf(personA.get(nameKey));
        String bName = String.valueOf(personB.get(nameKey));
        
        int ageA = (Integer) personA.get(ageKey);
        int ageB = (Integer) personB.get(ageKey);
        int combinedAge = ageA + ageB;
        
        String outStr = String.format("%s and %s are %s years old in total.", aName, bName, combinedAge);
        System.out.println(outStr);
    }

    public static HashMap getPersonInfo(Scanner reader) {
        HashMap person;
        person = new HashMap();

        System.out.print("Type your name: ");
        String name = reader.nextLine();
        System.out.print("Type your age: ");
        int age = Integer.parseInt(reader.nextLine());

        person.put("age", age);
        person.put("name", name);
        
        return person;
    }
}
