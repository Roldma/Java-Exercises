
public class Accounts {
    
    public static void transfer(Account a, Account b, double amount) {
        a.withdrawal(amount);
        b.deposit(amount);
    }

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account a = new Account("A", 100.0);
        Account b = new Account("B", 0);
        Account c = new Account("B", 0);
        
        transfer(a,b,50);
        
        
//        
//        b.withdrawal(25);
//        c.deposit(25);
        
        transfer(b,c,25);
        
    }


}
