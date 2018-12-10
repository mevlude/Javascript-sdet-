/*
 * TASK
:black_small_square: Create a new class for a bank account.
:black_small_square: Create fields for the account number, balance, customer name, email and phone number. 
:black_small_square: Create getters and setters for each field.
:black_small_square: Create two additional methods:
:black_small_square: To allow the customer to deposit funds(this should increment the balance field)
:black_small_square: To allow the customer to withdraw funds. This should deduct from the balance field, 
but not allow the withdrawal to complete if there are insufficient funds.
 */
public class BankAccount {

	private String accountNumber;
	private double balance;
	private String name;
	private String email;
	private String phone;
	
	
	public void depositFunds(double depositAmount){
		if(depositAmount>0) {
        this.balance=this.balance + depositAmount;
        System.out.println(depositAmount+" $ is deposited and your new balance is "+this.balance+"$");
		}
    }
    
	public void withdrawFunds(double withdrawAmount){
        if(this.balance-withdrawAmount>0){
            this.balance=this.balance-withdrawAmount;
            System.out.println(withdrawAmount+" $ is withdrawed and your new balance is "+this.balance+"$");

        }else{
            System.out.println("You do not have enough balance in your account");
        }

    }
	public BankAccount(String accountNumber, double balance, String name, String email, String phone) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.name = name;
		this.email = email;
		this.phone = phone;
		
		
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
