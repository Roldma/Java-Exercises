
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        
        System.out.print("name: ");
        String name = input.nextLine();
        
        while(!name.isEmpty()) {
            
            System.out.print("studentnumber: ");
            String n = input.nextLine();
            
            students.add(new Student(name, n));
            
            System.out.print("name: ");
            name = input.nextLine();
        }
        
        for (Student student : students) {
            System.out.println(student.toString());
        }
        
        System.out.println("Give search term: ");
        String searchTerm = input.nextLine();
        System.out.println("result: ");
        
        for (Student student : students) {
            String studentName = student.getName();
            if (studentName.contains(searchTerm)) {
                System.out.println(student.toString());
            }
            
        }
        
    }
}
