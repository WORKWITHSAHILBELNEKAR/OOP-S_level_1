public class BankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.performTask(2000 , 123456789);
    }
    float balance;
    int accountNumber;
    public void performTask (float initialBalance, int accNumber){
        balance = initialBalance;
        accountNumber = accNumber;
        System.out.println("account number is " + accountNumber);
        System.out.println("the total balance is " + balance);
        Depoisite(300);
        Withdraw(100);
        System.out.println("now the available balance is " + balance);
    }
    public void Depoisite(int amount){
        balance += amount;
        System.out.println("total deposited amount " + amount);
    }
    public void Withdraw(int amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("the withdrawal ammount is " + amount);
        }else {
            System.out.println("insufficent balance ");
        }
    }
}
