
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
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

    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int differenceInYears(MyDate c) {
        
        int y = c.getYear();
        
        if (y == year) {
            return 0;
        }
        
        int laterDay = day;
        int laterMonth = month;
        
        int diff = Math.abs(y - year);
        
        if (y > year) {
            laterDay = c.getDay();
            laterMonth = c.getMonth();
            
            if (!checkDayMonth(laterDay, day, laterMonth, month)) {
                diff -= 1;
            }
        } else {
            
            if (!checkDayMonth(day, c.getDay(), month, c.getMonth())) {
                diff -= 1;
            }
        }
        
        return diff;
    }
    
    private boolean checkDayMonth(int laterD,int earlyD, int laterM, int earlyM) {
        boolean dayCheck = false;
        boolean monthCheck = false; // fails if later year month is less
       
        if (laterM == earlyM) {
           monthCheck = true;
           dayCheck = laterD >= earlyD;
        } else if (laterM > earlyM){
            monthCheck = true;
            dayCheck = true;
        }
        
        return dayCheck && monthCheck;
    }


}
