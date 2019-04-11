
public class Clock {

    private final BoundedCounter hours;
    private final BoundedCounter minutes;
    private final BoundedCounter seconds;

    public Clock(int hBeginning, int mBeginning, int sBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        hours = new BoundedCounter(23);
        minutes = new BoundedCounter(59);
        seconds = new BoundedCounter(59);

        hours.setValue(hBeginning);
        minutes.setValue(mBeginning);
        seconds.setValue(sBeginning);
    }

    public void tick() {
        // Clock advances by one second
        seconds.next();
        if (seconds.getValue() == 0) {
            minutes.next();
            if (minutes.getValue() == 0) {
                hours.next();
            }
        }

    }

    @Override
    public String toString() {
        // returns the string representation
        String h = hours.toString();
        String m = minutes.toString();
        String s = seconds.toString();
        return String.format("%s:%s:%s", h, m, s);
    }
}
