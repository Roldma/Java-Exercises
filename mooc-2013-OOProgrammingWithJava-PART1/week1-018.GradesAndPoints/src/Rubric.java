
import java.util.HashMap;

public class Rubric {

    public HashMap gradeRubric;

    public Rubric() {
        gradeRubric = getGradeRubric();
    }

    private HashMap getGradeRubric() {
        HashMap rubric = new HashMap<String, int[]>();

        int[] gradeRanges = {0, 29, 30, 34, 35, 39, 40, 44, 45, 49, 50, 60};

        for (int i = 0; i < gradeRanges.length; i += 2) {
            int[] currRange = new int[2];
            currRange[0] = gradeRanges[i];
            currRange[1] = gradeRanges[i + 1];

            if (i == 0) {
                rubric.put("failed", currRange);
            } else if (i % 2 == 0) {
                rubric.put(Integer.toString(i / 2), currRange);
            }

        }
        
        return rubric;
    }
}
