
import java.util.ArrayList;

public class Menu {

    private final ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<String>();
    }

    public void printMeals() {
        for (String meal : meals) {
            System.out.println(meal);
        }
    }

    public void clearMenu() {
        this.meals.removeAll(meals);
    }

    public void addMeal(String meal) {
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }
    // add the methods here
}
