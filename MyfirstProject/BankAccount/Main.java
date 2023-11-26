
package oopbankaccount;

public class Main {

    public static void main(String[] args) {
       BankAccount account= new BankAccount("Catherene", 20, 932574638, 160.0);
        
        account.deposit(200.0);
       account.deposit(310.0);

        
        System.out.println(account.getSummary());
    }
}
