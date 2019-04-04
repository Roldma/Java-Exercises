
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        Account mattsAcc = new Account("Matt's account", 1000.0);
        Account myAcct = new Account("My account", 0);
        
        mattsAcc.withdrawal(100.0);
        myAcct.deposit(100.0);
        System.out.println(mattsAcc);
        System.out.println(myAcct);
    }

}
