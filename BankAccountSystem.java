public class BankAccountSystem {
	static String bankname = "ICICI";
	static int totalaccounts = 0;
	final String accountNumber;
	protected String accountHolderName;
	static void getTotalAccounts() {
		System.out.println("Total Accounts: " + totalaccounts);
	}
	BankAccountSystem(String accountHolderName, String accountNumber){
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		totalaccounts++;
	}
	public void getAccountDetails() {
		if( this  instanceof  BankAccountSystem) {
			System.out.println("Bank Name: " + bankname);
	        System.out.println("Account Holder: " + accountHolderName);
	        System.out.println("Account Number: " + accountNumber);
		}
        else{
            System.out.println("Taking wrong data input");
        }
	}
	public String getAccountHolderName() {
        return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
	}

	public static void main(String[] args) {
		BankAccountSystem account1 = new BankAccountSystem("Anamikarai", "ACC12345");
		BankAccountSystem account2 = new BankAccountSystem("khushi", "ACC67890");
	    System.out.println("Account1 Details:");
	    account1.getAccountDetails();
	    System.out.println();
	    System.out.println("Account2 Details:");
	    account2.getAccountDetails();
	    System.out.println();
	    System.out.println("Total Accounts: " + totalaccounts);
	}

}