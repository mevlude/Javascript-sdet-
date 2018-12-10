
public class BankEncapsulation {

	public static void main(String[] args) {
		 
		BankAccount customer1=new BankAccount("456789123456987", 5_000.00, "Hillary Brown", "hbrown@gmail.com", "7894561236");
		
		customer1.depositFunds(1200.0);
		
		customer1.withdrawFunds(4575.5);
	}

}
