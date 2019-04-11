
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        if (month == 12 && day == 30) {
            year += 1;
            month = 1;
            day = 1;
        } else if (day == 30) {
            month += 1;
            day = 1;
        } else {
            day += 1;
        }
    }

    public void advance(int numberOfDays) {
        for (int i = 0; i < numberOfDays; i++) {
            this.advance();
        }
    }

    public MyDate afterNumberOfDays(int days) {
        MyDate n = new MyDate(day,month,year);
        
        for (int i = 0; i < days; i++) {
            n.advance();
        }

        return n;
    }
}
