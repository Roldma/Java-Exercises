
import nhlstats.NHLStatistics;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Operation> ops = new ArrayList<Operation>();

        ops.add(new Operation("goals", 10, "", ""));
        ops.add(new Operation("penalty", 25, "", ""));
        ops.add(new Operation("", 0, "Sidney Crosby", ""));
        ops.add(new Operation("", 0, "", "PHI"));
        ops.add(new Operation("points", 0, "", "ANA"));

        for (int i = 0; i < ops.size(); i += 1) {
            Operation currOp = ops.get(i);

            String sortOption = currOp.sortOption;
            String playerName = currOp.playerName;
            String teamName = currOp.teamName;
            int printNum = currOp.printNum;

            if (sortOption.length() > 0) {
                sortBy(sortOption);
            }

            if (printNum > 0) {
                printTop(printNum);
            }

            if (playerName.length() > 0) {
                NHLStatistics.searchByPlayer(playerName);
            }
            
            if (teamName.length() > 0) {
                NHLStatistics.teamStatistics(teamName);
            }
            
        }

    }

    public static void printTop(int num) {
        NHLStatistics.top(num);
    }

    public static void sortBy(String word) {

        if (word.contentEquals("goals")) {
            NHLStatistics.sortByGoals();
        } 
        
        else if (word.contentEquals("penalty")) {
            NHLStatistics.sortByPenalties();
        } 
        
        else if (word.contentEquals("points")) {
            NHLStatistics.sortByPoints();
        }

    }
}
