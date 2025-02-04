class BankAccount {
    private static String bankName = "HDFC Bank";
    private static int totalAccounts = 0;
    private final int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }
    public static void getTotalAccounts() {
        System.out.println("Total Bank Accounts: " + totalAccounts);
    }
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + this.accountHolderName);
            System.out.println("Account Number: " + this.accountNumber);
            System.out.println("Balance: Rs.  " + this.balance);
        } else {
            System.out.println("Invalid Account");
        }
    }
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Ally", 1001, 5000.0);
        BankAccount acc2 = new BankAccount("Jolly", 1002, 10000.0);

        acc1.displayAccountDetails();
        //System.out.println("----------------------");
        acc2.displayAccountDetails();
        BankAccount.getTotalAccounts();
    }
}
