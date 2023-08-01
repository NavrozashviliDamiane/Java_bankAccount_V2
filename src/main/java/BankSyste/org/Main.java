package BankSyste.org;

public class Main {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();

        // Creating bank accounts
        BankAccount account1 = new BankAccount("1234567890", 1000.0);
        BankAccount account2 = new BankAccount("9876543210", 500.0);

        // Adding accounts to the account manager
        accountManager.addAccount(account1);
        accountManager.addAccount(account2);

        // Performing operations on accounts
        account1.deposit(500.0);
        account2.withdraw(200.0);

        // Finding an account by account number
        String searchAccountNumber = "1234567890";
        BankAccount foundAccount = accountManager.findAccount(searchAccountNumber);
        if (foundAccount != null) {
            System.out.println("Account found: " + foundAccount.getAccountNumber() +
                    ", Balance: " + foundAccount.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
}

