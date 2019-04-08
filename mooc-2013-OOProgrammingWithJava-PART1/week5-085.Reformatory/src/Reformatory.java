public class Reformatory {
    
    private int weights;
    
    public Reformatory() {
        this.weights = 0;
    }
    
    public int weight(Person person) {
        // return the weight of the person
        this.weights += 1;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    
    public int totalWeightsMeasured() {
        return this.weights;
    }
}
