
public class LyyraCard {

    private double balance;

    public LyyraCard(double startBal) {
        this.balance = startBal;
    }

    @Override
    public String toString() {
        return String.format("The card has %.1f euros", this.balance);
    }

    public void payEconomical() {
        if (this.balance >= 2.5) {
            this.balance -= 2.5;
        }
    }

    public void payGourmet() {
        if (this.balance >= 4.00) {
            this.balance -= 4.00;
        }
    }

    public void loadMoney(double a) {
       double newBalance = this.balance;
        
        if (a > 0 && a <= 150) {
            if (this.balance < 150) {
                newBalance += a;
                
                if (newBalance >= 150) {
                    this.balance += (newBalance - 150);
                } else {
                    this.balance += a;
                }
            }
        }
        
        
    }
}
