
import java.util.Scanner;
import java.util.HashMap;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        Rubric rubric = new Rubric();
        HashMap gradeRubric = rubric.gradeRubric;
        
        System.out.print("Type the points [0-60]: ");
        int gradeInput = Integer.parseInt(reader.nextLine());
        String digitGrade;
        
        for (int i = 0; i < gradeRubric.size(); i += 1 ) {
            
            if (i == 0) {
                digitGrade = "failed";
            } else {
                digitGrade = Integer.toString(i);
            }
           
            int[] currGradeRange = (int[]) gradeRubric.get(digitGrade);
            
            
            if (gradeInput >= currGradeRange[0] && gradeInput <= currGradeRange[1]) {
                System.out.println("Grade: " + digitGrade);
                break;
            }
        }
        
        
        
    }
}
